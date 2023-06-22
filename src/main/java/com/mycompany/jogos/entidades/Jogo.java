package com.mycompany.jogos.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Caixa
 */
/**
 *
 * <code>
 *
 * CREATE TABLE Jogos(
 * id VARCHAR(15) NOT NULL,
 * nome VARCHAR(80),
 * nomeDesenvolvedor VARCHAR(80),
 * nomeDistribuidor VARCHAR(80),
 * sinopse VARCHAR(560),
 * classificacaoEtaria VARCHAR(2),
 * edicao VARCHAR(2),
 * dataDeLancamento TIMESTAMP,
 * CONSTRAINT pkJogos PRIMARY KEY (id),
 * CONSTRAINT fkJogosEmpresaDesenvolvedor foreign KEY (nomeDesenvolvedor)
 * REFERENCES Empresa (nome),
 * CONSTRAINT fkJogosEmpresaDistribuidor foreign KEY (nomeDistribuidor)
 * REFERENCES Empresa (nome)
 * );
 *
 * </code>
 */
public class Jogo {

    private String id;
    private String nome;
    private Empresa empresaDesenvolvedora;
    private Empresa empresaDistribuidora;
    private String sinopse;
    private String classificacaoEtaria;
    private String edicao;
    private LocalDate dataDeLancamento;

    public Jogo(String id, String nome, Empresa empresaDesenvolvedora, Empresa empresaDistribuidora, String sinopse, String classificacaoEtaria, String edicao, LocalDate dataDeLancamento) {
        this.id = id;
        this.nome = nome;
        this.empresaDesenvolvedora = empresaDesenvolvedora;
        this.empresaDistribuidora = empresaDistribuidora;
        this.sinopse = sinopse;
        this.classificacaoEtaria = classificacaoEtaria;
        this.edicao = edicao;
        this.dataDeLancamento = dataDeLancamento;
    }

    public Jogo() {
    }

    //<editor-fold defaultstate="collapsed" desc="getters and setters">
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Empresa getEmpresaDesenvolvedora() {
        return empresaDesenvolvedora;
    }

    public void setEmpresaDesenvolvedora(Empresa empresaDesenvolvedora) {
        this.empresaDesenvolvedora = empresaDesenvolvedora;
    }

    public Empresa getEmpresaDistribuidora() {
        return empresaDistribuidora;
    }

    public void setEmpresaDistribuidora(Empresa empresaDistribuidora) {
        this.empresaDistribuidora = empresaDistribuidora;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getClassificacaoEtaria() {
        return classificacaoEtaria;
    }

    public void setClassificacaoEtaria(String classificacaoEtaria) {
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public LocalDate getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(LocalDate dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

//</editor-fold>

    @Override
    public String toString() {
        return "Jogo{" + "id=" + id + ", nome=" + nome + ", empresaDesenvolvedora=" + empresaDesenvolvedora.getNome() + ", empresaDistribuidora=" + empresaDistribuidora.getNome() + ", sinopse=" + sinopse + ", classificacaoEtaria=" + classificacaoEtaria + ", edicao=" + edicao + ", dataDeLancamento=" + dataDeLancamento + '}';
    }



}
