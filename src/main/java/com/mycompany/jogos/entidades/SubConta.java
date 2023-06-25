/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogos.entidades;

/**
 * CREATE TABLE SubConta( loginConta VARCHAR(15) NOT NULL, loginContaPrincipal
 * VARCHAR(15), cpfUsuario VARCHAR(14), usoDoCartao INTEGER,
 * acessoConteudoImproprio INTEGER, CONSTRAINT pkSubConta PRIMARY KEY
 * (loginConta), CONSTRAINT fkSubContaConta foreign KEY (loginConta) REFERENCES
 * Conta (login), CONSTRAINT fkSubContaContaPrincipal foreign KEY
 * (loginContaPrincipal) REFERENCES ContaPrincipal (loginConta), CONSTRAINT
 * fkSubContaUsuarios foreign KEY (cpfUsuario) REFERENCES Usuarios (cpf) );
 *
 * @author Your Name &lt;francelino at ifnmg&gt;
 */
public class SubConta {

    private String loginConta;
    private Conta conta;
    private Usuario usuario;
    private ContaPrincipal contaPrincipal;
    private int usoDoCartao;
    private int acessoConteudoImproprio;

    public SubConta() {
    }

    public SubConta(Conta conta, Usuario usuario, ContaPrincipal contaPrincipal, int usoDoCartao, int acessoConteudoImproprio) {

        this();
        this.conta = conta;
        this.usuario = usuario;
        this.contaPrincipal = contaPrincipal;
        this.usoDoCartao = usoDoCartao;
        this.acessoConteudoImproprio = acessoConteudoImproprio;
    }

    //<editor-fold defaultstate="collapsed" desc="getters and setters">

    public String getLoginConta() {
        return loginConta;
    }

    public void setLoginConta(String loginConta) {
        this.loginConta = loginConta;
    }
    
    
    
    public Conta getConta() {
        return conta;
    }
    
    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public ContaPrincipal getContaPrincipal() {
        return contaPrincipal;
    }
    
    public void setContaPrincipal(ContaPrincipal contaPrincipal) {
        this.contaPrincipal = contaPrincipal;
    }
    
    public int getUsoDoCartao() {
        return usoDoCartao;
    }
    
    public void setUsoDoCartao(int usoDoCartao) {
        this.usoDoCartao = usoDoCartao;
    }
    
    public int getAcessoConteudoImproprio() {
        return acessoConteudoImproprio;
    }
    
    public void setAcessoConteudoImproprio(int acessoConteudoImproprio) {
        this.acessoConteudoImproprio = acessoConteudoImproprio;
    }
    
    
//</editor-fold>

    @Override
    public String toString() {
        return "SubConta{" + "conta=" + conta + ", usuario=" + usuario + ", contaPrincipal=" + contaPrincipal + ", usoDoCartao=" + usoDoCartao + ", acessoConteudoImproprio=" + acessoConteudoImproprio + '}';
    }
 
    
    
}
