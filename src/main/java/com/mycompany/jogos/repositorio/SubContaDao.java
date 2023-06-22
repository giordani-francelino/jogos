package com.mycompany.jogos.repositorio;

import com.mycompany.jogos.entidades.Conta;
import com.mycompany.jogos.entidades.ContaPrincipal;
import com.mycompany.jogos.entidades.Empresa;
import java.sql.PreparedStatement;
import com.mycompany.jogos.entidades.SubConta;
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
 ** CREATE TABLE SubConta(
 * loginConta VARCHAR(15) NOT NULL,
 * loginContaPrincipal VARCHAR(15),
 * cpfUsuario VARCHAR(14),
 * usoDoCartao INTEGER,
 * acessoConteudoImproprio INTEGER,
 * CONSTRAINT pkSubConta PRIMARY KEY
 * (loginConta), CONSTRAINT fkSubContaConta foreign KEY (loginConta) REFERENCES
 * Conta (login), CONSTRAINT fkSubContaContaPrincipal foreign KEY
 * (loginContaPrincipal) REFERENCES ContaPrincipal (loginConta), CONSTRAINT
 * fkSubContaUsuarios foreign KEY (cpfUsuario) REFERENCES Usuarios (cpf) );
 *
 * </code>
 */
public class SubContaDao extends Dao<SubConta> {

    public static final String TABLE = "SubConta";

    @Override
    public String getSaveStatment() {
        return "insert into " + TABLE + "(loginContaPrincipal, cpfUsuario, "
                + "usoDoCartao, acessoConteudoImproprio, loginConta)  values (?, ?, ?, ?, ?)";
    }

    @Override
    public String getUpdateStatment() {
        return "update " + TABLE + " set loginContaPrincipal = ?, cpfUsuario = ?, "
                + "usoDoCartao = ?, acessoConteudoImproprio = ? where loginConta = ?";
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, SubConta e) {
        try {
            pstmt.setString(1, e.getContaPrincipal().getConta().getLogin());
            pstmt.setString(2, e.getUsuario().getCpf());
            pstmt.setInt(3, e.getUsoDoCartao());
            pstmt.setInt(4, e.getAcessoConteudoImproprio());
            pstmt.setString(5, e.getConta().getLogin());

        } catch (SQLException ex) {
            Logger.getLogger(SubContaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getDeleteByPkStatment() {
        return "delete from " + TABLE + " where loginConta = ?";
    }

    @Override
    public void composeDeleteByPkStatement(PreparedStatement pstmt, SubConta e) {
        try {
            pstmt.setString(1, e.getConta().getLogin());

        } catch (SQLException ex) {
            Logger.getLogger(SubContaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String getFindByPkStatment() {
        return "select loginContaPrincipal, cpfUsuario, "
                + "usoDoCartao, acessoConteudoImproprio, loginConta "
                + " from " + TABLE + " where loginConta = ?";
    }

    @Override
    public void composeFindByPkStatement(PreparedStatement pstmt, SubConta e) {
        try {
            pstmt.setString(1, e.getConta().getLogin());

        } catch (SQLException ex) {
            Logger.getLogger(SubContaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String getFindAllStatment() {
        return "select  loginContaPrincipal, cpfUsuario, "
                + "usoDoCartao, acessoConteudoImproprio, loginConta "
                + " from " + TABLE;
    }

    @Override
    public SubConta extractObject(ResultSet resultSet) {

        SubConta subConta = null;
//loginContaPrincipal, cpfUsuario, "
//                + "usoDoCartao, acessoConteudoImproprio, loginConta
        try {
            subConta = new SubConta();

            ContaDao contaDao = new ContaDao();
            Conta conta = new Conta();
            conta.setLogin(resultSet.getString("loginConta"));
            subConta.setConta(contaDao.findByPk(conta));

            ContaPrincipalDao contaPrincipalDao = new ContaPrincipalDao();
            ContaPrincipal contaPrincipal = new ContaPrincipal();
            conta.setLogin(resultSet.getString("loginContaPrincipal"));
            subConta.setContaPrincipal(contaPrincipalDao.findByPk(contaPrincipal));

            UsuarioDao usuarioDao = new UsuarioDao();
            Usuario usuario = new Usuario();
            usuario.setCpf(resultSet.getString("cpfUsuario"));
            subConta.setUsuario(usuarioDao.findByPk(usuario));

            subConta.setUsoDoCartao(resultSet.getInt("usoDoCartao"));
            subConta.setAcessoConteudoImproprio(resultSet.getInt("acessoConteudoImproprio"));

        } catch (SQLException ex) {
            Logger.getLogger(SubContaDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(SubContaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return subConta;
    }

}
