/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import Model.Usuario;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
//import model.Usuario;
//import util.Utils;

public class UsuarioControler {

    public boolean autenticar(String usuario, String senha) {
        String sql = "SELECT * from TBUSUARIO "
                + " WHERE email = ? and senha = ?"
                + " and ativo = true";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        //declara as variaveis como nulas antes do try
        //para poder usar no finally

        PreparedStatement comando = null;
        ResultSet resultado = null;

        try {
            comando = gerenciador.prepararComando(sql);
            //define o valor decada variável(?) pela posição em que aparece no sql
            comando.setString(1, usuario);
            comando.setString(2, senha);

            resultado = comando.executeQuery();

            //resultado.next() tenta avançar para a próxima linha
            //caso consiga retornar true
            if (resultado.next()) {
                //se conseguiu avançar para a próxima linha é porque achou um usuário
                return true;
            }

        } catch (SQLException e) {
            //caso ocorra um erro relacionado ao banco de dados
            //exibe popup com erro
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            //depois de executar o try dando erro ou não executa o finally
            gerenciador.fecharConexao(comando, resultado);
        }

        return false;
    }

    public boolean inserir(Usuario usu) {
        String sql = "INSERT INTO tbusuario(nome, email, senha, datanasc, ativo) VALUES (?,?,?,?,?)";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        //declara as variaveis como nulas antes do try
        //para poder usar no finally

        PreparedStatement comando = null;
        ResultSet resultado = null;

        try {
            comando = gerenciador.prepararComando(sql);
            //define o valor decada variável(?) pela posição em que aparece no sql
            comando.setString(1, usu.getNome());
            comando.setString(2, usu.getEmail());
            comando.setString(3, usu.getSenha());
            comando.setDate(4, new java.sql.Date(usu.getDataNascimento().getTime()));
            comando.setBoolean(5, usu.isAtivo());

            //executa o comando
            comando.executeUpdate();

            return true;

        } catch (SQLException e) {
            //caso ocorra um erro relacionado ao banco de dados
            //exibe popup com erro
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            //depois de executar o try dando erro ou não executa o finally
            gerenciador.fecharConexao(comando, resultado);
        }

        return false;
    }
    
    
    
    
    
    
    public List<Usuario> consultar(int opcaoFiltro, String filtro) {
        String sql = "SELECT * from TBUSUARIO WHERE ";
        
        
        
        if(opcaoFiltro == 0){
            
            sql += "pkusuario = " + filtro;
        }else if(opcaoFiltro == 1){
            sql +="nome LIKE '%" + filtro + "%'";
        }else if(opcaoFiltro == 2){
            sql +="email LIKE '%" + filtro + "%'";
        }else if(opcaoFiltro == 3){
            sql +="ativo = " + filtro;
            
        }
            

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        //declara as variaveis como nulas antes do try
        //para poder usar no finally

        PreparedStatement comando = null;
        ResultSet resultado = null;

        //crio a lista de usuários, vazia ainda
        List<Usuario> lista = new ArrayList<>();

        try {
            comando = gerenciador.prepararComando(sql);

            resultado = comando.executeQuery();

            while (resultado.next()) {
                Usuario usu = new Usuario();

                usu.setPkUsuario(resultado.getInt("pkUsuario"));
                usu.setNome(resultado.getString("nome"));
                usu.setEmail(resultado.getString("email"));
                usu.setSenha(resultado.getString("senha")); //É O HASH
                usu.setDataNascimento(resultado.getDate("dataNasc"));
                usu.setAtivo(resultado.getBoolean("ativo"));

                lista.add(usu);

            }

        } catch (SQLException e) {
            //caso ocorra um erro relacionado ao banco de dados
            //exibe popup com erro
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            //depois de executar o try dando erro ou não executa o finally
            gerenciador.fecharConexao(comando, resultado);
        }

        return lista;
    }

}
