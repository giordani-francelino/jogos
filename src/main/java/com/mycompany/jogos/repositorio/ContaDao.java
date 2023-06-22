package com.mycompany.jogos.repositorio;

import com.mycompany.jogos.entidades.Empresa;
import java.sql.PreparedStatement;
import com.mycompany.jogos.entidades.Conta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * <code>
 
CREATE TABLE Conta(
login VARCHAR(15) NOT NULL,
senha VARCHAR(10),
apelido VARCHAR(15),
perguntaDeSeguranca VARCHAR(150),
respostaDeSeguranca VARCHAR(150),
CONSTRAINT pkConta PRIMARY KEY (login)
);
*
 * </code>
 */
public class ContaDao extends Dao<Conta> {

    public static final String TABLE = "Conta";

    @Override
    public String getSaveStatment() {
        return "insert into " + TABLE + "(senha, apelido, perguntaDeSeguranca, "
                + "respostaDeSeguranca, login)  values (?, ?, ?, ?, ?)";
    }

    @Override
    public String getUpdateStatment() {
        return "update " + TABLE + " set senha = ?, apelido = ?, perguntaDeSeguranca = ?, "
                + "respostaDeSeguranca = ?  where login = ?";
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Conta e) {
        try {
            pstmt.setString(1, e.getSenha());
            pstmt.setString(2, e.getApelido());
            pstmt.setString(3, e.getPerguntaDeSeguranca());
            pstmt.setString(4, e.getRespostaDeSeguranca());
            pstmt.setString(5, e.getLogin());

        } catch (SQLException ex) {
            Logger.getLogger(ContaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getDeleteByPkStatment() {
        return "delete from " + TABLE + " where login = ?";
    }

    @Override
    public void composeDeleteByPkStatement(PreparedStatement pstmt, Conta e) {
        try {
            pstmt.setString(1, e.getLogin());

        } catch (SQLException ex) {
            Logger.getLogger(ContaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String getFindByPkStatment() {
        return "select senha, apelido, perguntaDeSeguranca, "
                + "respostaDeSeguranca, login "
                + " from " + TABLE + " where login = ?";
    }

    @Override
    public void composeFindByPkStatement(PreparedStatement pstmt, Conta e) {
        try {
            pstmt.setString(1, e.getLogin());

        } catch (SQLException ex) {
            Logger.getLogger(ContaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String getFindAllStatment() {
        return "select senha, apelido, perguntaDeSeguranca, "
                + "respostaDeSeguranca, login "
                + " from " + TABLE;
    }

    @Override
    public Conta extractObject(ResultSet resultSet) {

        Conta conta = null;

        try {
            conta = new Conta();
            conta.setSenha(resultSet.getString("senha"));
            conta.setApelido(resultSet.getString("apelido"));
            conta.setPerguntaDeSeguranca(resultSet.getString("perguntaDeSeguranca"));
            conta.setRespostaDeSeguranca(resultSet.getString("respostaDeSeguranca"));
            conta.setLogin(resultSet.getString("login"));
        } catch (SQLException ex) {
            Logger.getLogger(ContaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return conta;
    }

}
