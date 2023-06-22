package com.mycompany.jogos.repositorio;

import com.mycompany.jogos.entidades.Empresa;
import java.sql.PreparedStatement;
import com.mycompany.jogos.entidades.Jogo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * <code>
 
CREATE TABLE Jogos(
id VARCHAR(15) NOT NULL,
nome VARCHAR(80),
nomeDesenvolvedor VARCHAR(80),
nomeDistribuidor VARCHAR(80),
sinopse VARCHAR(560),
classificacaoEtaria VARCHAR(2),
edicao VARCHAR(2),
dataDeLancamento TIMESTAMP,
CONSTRAINT pkJogos PRIMARY KEY (id),
CONSTRAINT fkJogosEmpresaDesenvolvedor foreign KEY (nomeDesenvolvedor)
REFERENCES Empresa (nome),
CONSTRAINT fkJogosEmpresaDistribuidor foreign KEY (nomeDistribuidor)
REFERENCES Empresa (nome)
);
*
 * </code>
 */
public class JogoDao extends Dao<Jogo> {

    public static final String TABLE = "Jogos";

    @Override
    public String getSaveStatment() {
        return "insert into " + TABLE + "(nome, nomeDesenvolvedor, nomeDistribuidor, "
                + "sinopse, classificacaoEtaria, edicao, dataDeLancamento, id)  values (?, ?, ?, ?, ?, ?, ?, ?)";
    }

    @Override
    public String getUpdateStatment() {
        return "update " + TABLE + " set nome = ?, nomeDesenvolvedor = ?, nomeDistribuidor = ?, "
                + "sinopse = ? , classificacaoEtaria = ?, edicao = ?, dataDeLancamento = ? where id = ?";
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Jogo e) {
        try {
            pstmt.setString(1, e.getNome());
            pstmt.setString(2, e.getEmpresaDesenvolvedora().getNome());
            pstmt.setString(3, e.getEmpresaDistribuidora().getNome());
            pstmt.setString(4, e.getSinopse());
            pstmt.setString(5, e.getClassificacaoEtaria());
            pstmt.setString(6, e.getEdicao());
            pstmt.setObject(7, e.getDataDeLancamento(), java.sql.Types.DATE);
            pstmt.setString(8, e.getId());

        } catch (SQLException ex) {
            Logger.getLogger(JogoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getDeleteByPkStatment() {
        return "delete from " + TABLE + " where id = ?";
    }

    @Override
    public void composeDeleteByPkStatement(PreparedStatement pstmt, Jogo e) {
        try {
            pstmt.setString(1, e.getId());

        } catch (SQLException ex) {
            Logger.getLogger(JogoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String getFindByPkStatment() {
        return "select nome, nomeDesenvolvedor, nomeDistribuidor, "
                + "sinopse, classificacaoEtaria, edicao, dataDeLancamento "
                + " from " + TABLE + " where id = ?";
    }

    @Override
    public void composeFindByPkStatement(PreparedStatement pstmt, Jogo e) {
        try {
            pstmt.setString(1, e.getId());

        } catch (SQLException ex) {
            Logger.getLogger(JogoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String getFindAllStatment() {
        return "select  nome, nomeDesenvolvedor, nomeDistribuidor, "
                + "sinopse, classificacaoEtaria, edicao, dataDeLancamento, id  "
                + " from " + TABLE;
    }

    @Override
    public Jogo extractObject(ResultSet resultSet) {

        Jogo jogo = null;

        try {
            jogo = new Jogo();
            jogo.setNome(resultSet.getString("nome"));
            EmpresaDao empresaDao = new EmpresaDao();
            Empresa empresa = new Empresa();
            empresa.setNome(resultSet.getString("nomeDesenvolvedor"));
            jogo.setEmpresaDesenvolvedora(empresaDao.findByPk(empresa));
            empresa.setNome(resultSet.getString("nomeDistribuidor"));
            jogo.setEmpresaDistribuidora(empresaDao.findByPk(empresa));
            
//            jogo.setNomeDoPresidente(resultSet.getString("nomeDesenvolvedor"));
//            jogo.setCidade(resultSet.getString("nomeDistribuidor"));
            jogo.setSinopse(resultSet.getString("sinopse"));
            jogo.setClassificacaoEtaria(resultSet.getString("classificacaoEtaria"));
            jogo.setEdicao(resultSet.getString("edicao"));
            jogo.setDataDeLancamento(
                    resultSet.getObject("dataDeLancamento", LocalDate.class));
            jogo.setId(resultSet.getString("id"));
        } catch (SQLException ex) {
            Logger.getLogger(JogoDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(JogoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return jogo;
    }

}
