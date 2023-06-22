package com.mycompany.jogos.repositorio;

import java.sql.PreparedStatement;
import com.mycompany.jogos.entidades.Empresa;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

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
public class EmpresaDao extends Dao<Empresa> {

    public static final String TABLE = "empresa";

    @Override
    public String getSaveStatment() {
        return "insert into " + TABLE + "(website, nomeDoPresidente, dataDaFundacao, "
                + "cidade, estado, pais, nomeDoFundador, nome)  values (?, ?, ?, ?, ?, ?, ?, ?)";
    }

    @Override
    public String getUpdateStatment() {
        return "update " + TABLE + " set website = ?, nomeDoPresidente = ?, dataDaFundacao = ?, "
                + "cidade = ? , estado = ?, pais = ?, nomeDoFundador = ? where nome = ?";
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Empresa e) {
        try {
            pstmt.setString(1, e.getWebsite());
            pstmt.setString(2, e.getNomeDoPresidente());
            pstmt.setObject(3, e.getDataDaFundacao(), java.sql.Types.DATE);
            pstmt.setString(4, e.getCidade());
            pstmt.setString(5, e.getEstado());
            pstmt.setString(6, e.getPais());
            pstmt.setString(7, e.getNomeDoFundador());
            pstmt.setString(8, e.getNome());

        } catch (SQLException ex) {
            Logger.getLogger(EmpresaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getDeleteByPkStatment() {
        return "delete from " + TABLE + " where nome = ?";
    }

    @Override
    public void composeDeleteByPkStatement(PreparedStatement pstmt, Empresa e) {
        try {
            pstmt.setString(1, e.getNome());

        } catch (SQLException ex) {
            Logger.getLogger(EmpresaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String getFindByPkStatment() {
        return "select website, nomeDoPresidente, dataDaFundacao, "
                + "cidade, estado, pais, nomeDoFundador, nome "
                + " from " + TABLE + " where nome = ?";
    }

    @Override
    public void composeFindByPkStatement(PreparedStatement pstmt, Empresa e) {
        try {
            pstmt.setString(1, e.getNome());

        } catch (SQLException ex) {
            Logger.getLogger(EmpresaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String getFindAllStatment() {
        return "select website, nomeDoPresidente, dataDaFundacao, "
                + "cidade, estado, pais, nomeDoFundador, nome "
                + " from " + TABLE;
    }

    @Override
    public Empresa extractObject(ResultSet resultSet) {

        Empresa empresa = null;

        try {
            empresa = new Empresa();
            empresa.setWebsite(resultSet.getString("website"));
            empresa.setNomeDoPresidente(resultSet.getString("nomeDoPresidente"));
            empresa.setDataDaFundacao(
                    resultSet.getObject("dataDaFundacao", LocalDate.class));
            empresa.setCidade(resultSet.getString("cidade"));
            empresa.setEstado(resultSet.getString("estado"));
            empresa.setPais(resultSet.getString("pais"));
            empresa.setNomeDoFundador(resultSet.getString("nomeDoFundador"));
            empresa.setNome(resultSet.getString("nome"));
        } catch (SQLException ex) {
            Logger.getLogger(EmpresaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return empresa;
    }

}
