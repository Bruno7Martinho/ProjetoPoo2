/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author aluno.saolucas
 */
public class Usuario {
    private int pkUsuario;
    private String nome;
    private String email;
    private String senha;
    private boolean ativo;

    public Usuario(){
        
    }

    public Usuario(int pkUsuario, String nome, String email, String senha, boolean ativo, Date dataNascimento) {
        this.pkUsuario = pkUsuario;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.ativo = ativo;
        this.dataNascimento = dataNascimento;
    }
    
    
    
    
    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    
    public int getPkUsuario() {
        return pkUsuario;
    }

    public void setPkUsuario(int pkUsuario) {
        this.pkUsuario = pkUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String emial) {
        this.email = emial;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    private Date dataNascimento;
    
    public String getAtivoString(){
        if(ativo){
            return "Ativo";
        }else{
            return "Inativo";
        }
    }
    
    
    
}
