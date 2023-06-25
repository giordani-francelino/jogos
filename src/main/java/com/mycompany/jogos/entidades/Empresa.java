package com.mycompany.jogos.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *javac -Xlint C:\dev\bd\jogos\src\main\java\com\mycompany\jogos\entidades\Empresa.java
 * @author Caixa
 */
/**
 *
 * <code>
 * CREATE TABLE Empresa(
 * nome VARCHAR(80) NOT NULL,
 * website VARCHAR(80),
 * nomeDoPresidente VARCHAR(80),
 * dataDaFundacao TIMESTAMP,
 * cidade VARCHAR(80),
 * estado VARCHAR(80),
 * pais VARCHAR(80),
 * nomeDoFundador VARCHAR(80),
 * CONSTRAINT pkEmpresa PRIMARY KEY (nome)
 * );
 *
 * </code>
 */
public class Empresa {

    private String nome;
    private String website;
    private String nomeDoPresidente;
    private LocalDate dataDaFundacao;
    private String cidade;
    private String estado;
    private String pais;
    private String nomeDoFundador;
    private List<Jogo> jogosDistribuidos;
    private List<Jogo> jogosDesenvolvidos;

    public Empresa(String nome, String website, String nomeDoPresidente, LocalDate dataDaFundacao, String cidade, String estado, String pais, String nomeDoFundador) {
        this();
        this.nome = nome;
        this.website = website;
        this.nomeDoPresidente = nomeDoPresidente;
        this.dataDaFundacao = dataDaFundacao;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.nomeDoFundador = nomeDoFundador;
    }

    public Empresa() {
        jogosDistribuidos = new ArrayList<Jogo>();
        jogosDesenvolvidos = new ArrayList<Jogo>();

    }

    //<editor-fold defaultstate="collapsed" desc="getters and setters">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getNomeDoPresidente() {
        return nomeDoPresidente;
    }

    public void setNomeDoPresidente(String nomeDoPresidente) {
        this.nomeDoPresidente = nomeDoPresidente;
    }

    public LocalDate getDataDaFundacao() {
        return dataDaFundacao;
    }

    public void setDataDaFundacao(LocalDate dataDaFundacao) {
        this.dataDaFundacao = dataDaFundacao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNomeDoFundador() {
        return nomeDoFundador;
    }

    public void setNomeDoFundador(String nomeDoFundador) {
        this.nomeDoFundador = nomeDoFundador;
    }

    public List<Jogo> getJogosDistribuidos() {
        return jogosDistribuidos;
    }

    public void setJogosDistribuidos(List<Jogo> jogosDistribuidos) {
        this.jogosDistribuidos = jogosDistribuidos;
    }
    
    public void setJogoDistribuido(Jogo jogoDistribuido) {
        this.jogosDistribuidos.add(jogoDistribuido);
    }

    public List<Jogo> getJogosDesenvolvidos() {
        return jogosDesenvolvidos;
    }

    public void setJogosDesenvolvidos(List<Jogo> jogosDesenvolvidos) {
        this.jogosDesenvolvidos = jogosDesenvolvidos;
    }

    public void setJogoDesenvolvido(Jogo jogoDesenvolvido) {
        this.jogosDesenvolvidos.add(jogoDesenvolvido);
    }

    
    
    
//</editor-fold>
    @Override
    public String toString() {
        return nome;
    }

}
