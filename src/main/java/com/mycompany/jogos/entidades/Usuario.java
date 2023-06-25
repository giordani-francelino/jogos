/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogos.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *CREATE TABLE Usuarios(
cpf VARCHAR(14),
nome VARCHAR(20),
país VARCHAR(15),
email VARCHAR(15),
dataNascimento TIMESTAMP,
CONSTRAINT pkUsuarios PRIMARY KEY (cpf)
);
 * @author Your Name &lt;francelino at ifnmg&gt;
 */
public class Usuario {
    private String cpf;
    private String nome;
    private String país;
    private String email;
    private LocalDate dataNascimento;
    private ContaPrincipal contaprincipal;
    private List<SubConta> subContas;
    

    public Usuario() {
        subContas = new ArrayList();
    }

    public Usuario(String cpf, String nome, String país, String email, LocalDate dataNascimento, ContaPrincipal contaprincipal, List<SubConta> subContas) {
        this();
        this.cpf = cpf;
        this.nome = nome;
        this.país = país;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.contaprincipal = contaprincipal;
        this.subContas = subContas;
    }

    //<editor-fold defaultstate="collapsed" desc="getters and setters">
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getPaís() {
        return país;
    }
    
    public void setPaís(String país) {
        this.país = país;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public ContaPrincipal getContaprincipal() {
        return contaprincipal;
    }
    
    public void setContaprincipal(ContaPrincipal contaprincipal) {
        this.contaprincipal = contaprincipal;
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
        return nome;
    }
    
    
    
    
}
