/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

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
    
    public boolean autenticar(String usuario, String senha){
     String sql = "SELECT * from TBUSUARIO "
     + " WHERE email = ? and senha = ?"        
     + " and ativo = true";
     
     GerenciadorConexao gerenciador = new GerenciadorConexao();
     //declara as variaveis como nulas antes do try
     //para poder usar no finally
     
     PreparedStatement comando = null;
     ResultSet resultado = null;
     
     try{
         comando = gerenciador.prepararComando(sql);
         //define o valor decada variável(?) pela posição em que aparece no sql
         comando.setString(1, usuario);
         comando.setString(2, senha);
             
         resultado = comando.executeQuery();
         
         //resultado.next() tenta avançar para a próxima linha
         //caso consiga retornar true
         if(resultado.next()){
             //se conseguiu avançar para a próxima linha é porque achou um usuário
             return true;
         }
         
     }catch(SQLException e){
         //caso ocorra um erro relacionado ao banco de dados
         //exibe popup com erro
         JOptionPane.showMessageDialog(null, e.getMessage());
     }
     
     
     finally{
         //depois de executar o try dando erro ou não executa o finally
         gerenciador.fecharConexao(comando, resultado);
     }
     
     return false;
}
    
}