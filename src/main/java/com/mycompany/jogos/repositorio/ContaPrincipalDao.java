package com.mycompany.jogos.repositorio;

import com.mycompany.jogos.entidades.Conta;
import com.mycompany.jogos.entidades.Empresa;
import java.sql.PreparedStatement;
import com.mycompany.jogos.entidades.ContaPrincipal;
import com.mycompany.jogos.entidades.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * <code>
 *
 * CREATE TABLE ContaPrincipal( loginConta VARCHAR(15) NOT NULL, cpfUsuario
 * VARCHAR(14), CONSTRAINT pkContaPrincipal PRIMARY KEY (loginConta), CONSTRAINT
 * fkContaPrincipalConta foreign KEY (loginConta) REFERENCES Conta (login),
 * CONSTRAINT fkContaPrincipalUsuarios foreign KEY (cpfUsuario) REFERENCES
 * Usuarios (cpf) );
 *
 * </code>
 */
public class ContaPrincipalDao extends Dao<ContaPrincipal> {

    public static final String TABLE = "ContaPrincipal";

    @Override
    public String getSaveStatment() {
        return "insert into " + TABLE + "(loginConta)  values (?)";
    }

    @Override
    public String getUpdateStatment() {
        return "update " + TABLE + " set cpfUsuario = ? where loginConta = ?";
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, ContaPrincipal e) {
        try {
//            pstmt.setString(1, e.getUsuario().getCpf());
            pstmt.setString(1, e.getLoginConta());

        } catch (SQLException ex) {
            Logger.getLogger(ContaPrincipalDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getDeleteByPkStatment() {
        return "delete from " + TABLE + " where loginConta = ?";
    }

    @Override
    public void composeDeleteByPkStatement(PreparedStatement pstmt, ContaPrincipal e) {
        try {
            pstmt.setString(1, e.getLoginConta());

        } catch (SQLException ex) {
            Logger.getLogger(ContaPrincipalDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String getFindByPkStatment() {
        return "select loginConta, cpfUsuario "
                + " from " + TABLE + " where loginConta = ?";
    }

    @Override
    public void composeFindByPkStatement(PreparedStatement pstmt, ContaPrincipal e) {
        try {
            pstmt.setString(1, e.getLoginConta());


        } catch (SQLException ex) {
            Logger.getLogger(ContaPrincipalDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String getFindAllStatment() {
        return "select loginConta, cpfUsuario "
                + " from " + TABLE + " order by loginConta";
    }

    @Override
    public ContaPrincipal extractObject(ResultSet resultSet) {

        ContaPrincipal contaPrincipal = null;

        try {
            contaPrincipal = new ContaPrincipal();

            contaPrincipal.setLoginConta(resultSet.getString("loginConta"));
            ContaDao contaDao = new ContaDao();
            Conta conta = new Conta();
            conta.setLogin(resultSet.getString("loginConta"));
            contaPrincipal.setConta(contaDao.findByPk(conta));

        } catch (SQLException ex) {
            Logger.getLogger(ContaPrincipalDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ContaPrincipalDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return contaPrincipal;
    }

}
