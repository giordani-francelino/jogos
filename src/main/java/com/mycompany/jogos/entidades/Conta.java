/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogos.entidades;

/**
 *
 * @author Your Name &lt;francelino at ifnmg&gt;
 */

/*
CREATE TABLE Conta(
login VARCHAR(15) NOT NULL,
senha VARCHAR(10),
apelido VARCHAR(15),
perguntaDeSeguranca VARCHAR(150),
respostaDeSeguranca VARCHAR(150),
CONSTRAINT pkConta PRIMARY KEY (login)
);
*/


public class Conta {
 
    private String login;
    private String senha;
    private String apelido;
    private String perguntaDeSeguranca;
    private String respostaDeSeguranca;

    public Conta() {
    }

    public Conta(String login, String senha, String apelido, String perguntaDeSeguranca, String respostaDeSeguranca) {
        this();
        this.login = login;
        this.senha = senha;
        this.apelido = apelido;
        this.perguntaDeSeguranca = perguntaDeSeguranca;
        this.respostaDeSeguranca = respostaDeSeguranca;
    }

    //<editor-fold defaultstate="collapsed" desc="getters and setters">
    
    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getApelido() {
        return apelido;
    }
    
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    
    public String getPerguntaDeSeguranca() {
        return perguntaDeSeguranca;
    }
    
    public void setPerguntaDeSeguranca(String perguntaDeSeguranca) {
        this.perguntaDeSeguranca = perguntaDeSeguranca;
    }
    
    public String getRespostaDeSeguranca() {
        return respostaDeSeguranca;
    }
    
    public void setRespostaDeSeguranca(String respostaDeSeguranca) {
        this.respostaDeSeguranca = respostaDeSeguranca;
    }
    
    
//</editor-fold>

    @Override
    public String toString() {
        return "Conta{" + "login=" + login + ", senha=" + senha + ", apelido=" + apelido + ", perguntaDeSeguranca=" + perguntaDeSeguranca + ", respostaDeSeguranca=" + respostaDeSeguranca + '}';
    }
 
    
    
}
