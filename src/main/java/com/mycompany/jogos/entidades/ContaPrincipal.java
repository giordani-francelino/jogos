/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogos.entidades;

import java.util.List;

/**
 * CREATE TABLE ContaPrincipal( loginConta VARCHAR(15) NOT NULL, cpfUsuario
 * VARCHAR(14), CONSTRAINT pkContaPrincipal PRIMARY KEY (loginConta), CONSTRAINT
 * fkContaPrincipalConta foreign KEY (loginConta) REFERENCES Conta (login),
 * CONSTRAINT fkContaPrincipalUsuarios foreign KEY (cpfUsuario) REFERENCES
 * Usuarios (cpf) );
 *
 * @author Your Name &lt;francelino at ifnmg&gt;
 */
public class ContaPrincipal {
    
    private String loginConta;
    private Conta conta;
    private Usuario usuario;
    private List<SubConta> subContas;

    public ContaPrincipal() {
    }

    public ContaPrincipal(Conta conta, Usuario usuario) {
        this.conta = conta;
        this.usuario = usuario;
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

    public List<SubConta> getSubContas() {
        return subContas;
    }

    public void setSubContas(List<SubConta> subContas) {
        this.subContas = subContas;
    }

    public void setSubConta(SubConta subConta) {
        this.subContas.add(subConta);
    }

//</editor-fold>

    @Override
    public String toString() {
        return  "conta=" + conta.getLogin() + ", usuario=" + usuario.getNome();
    }



}
