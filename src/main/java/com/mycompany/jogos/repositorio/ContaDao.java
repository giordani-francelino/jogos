package com.mycompany.jogos.repositorio;

import com.mycompany.jogos.entidades.Empresa;
import java.sql.PreparedStatement;
import com.mycompany.jogos.entidades.Conta;
import com.mycompany.jogos.entidades.SubConta;
import com.mycompany.jogos.entidades.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * <code>
 *
 * CREATE TABLE Conta(
 * login VARCHAR(15) NOT NULL,
 * senha VARCHAR(10),
 * apelido VARCHAR(15),
 * perguntaDeSeguranca VARCHAR(150),
 * respostaDeSeguranca VARCHAR(150),
 * CONSTRAINT pkConta PRIMARY KEY (login)
 * );
 *
 * </code>
 */
public class ContaDao extends Dao<Conta> {

    public static final String TABLE = "Conta";

    @Override
    public String getSaveStatment() {
        return "insert into " + TABLE + "(cpfUsuario, senha, apelido, perguntaDeSeguranca, "
                + "respostaDeSeguranca, login)  values (?, ?, ?, ?, ?, ?)";
    }

    @Override
    public String getUpdateStatment() {
        return "update " + TABLE + " set cpfUsuario = ?, senha = ?, apelido = ?, perguntaDeSeguranca = ?, "
                + "respostaDeSeguranca = ?  where login = ?";
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Conta e) {
        try {
            Conta atualizar = new Conta();
            atualizar.setLogin(e.getLogin());
            try {
                atualizar = new ContaDao().findByPk(e);
            } catch (Exception ex) {
                Logger.getLogger(ContaDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (atualizar == null) {
                pstmt.setString(1, e.getUsuario().getCpf());
            } else {
                pstmt.setString(1, atualizar.getUsuario().getCpf());
            }

            pstmt.setString(2, e.getSenha());
            pstmt.setString(3, e.getApelido());
            pstmt.setString(4, e.getPerguntaDeSeguranca());
            pstmt.setString(5, e.getRespostaDeSeguranca());
            pstmt.setString(6, e.getLogin());

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
        return "select senha, apelido,cpfUsuario,  perguntaDeSeguranca, "
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
        return "select senha, apelido, cpfUsuario, perguntaDeSeguranca, "
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

            UsuarioDao usuarioDao = new UsuarioDao();
            Usuario usuario = new Usuario();
            usuario.setCpf(resultSet.getString("cpfUsuario"));
            try {
                conta.setUsuario(usuarioDao.findByPk(usuario));
            } catch (Exception ex) {
                Logger.getLogger(ContaDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ContaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return conta;
    }

    public List<Conta> localizarTodasContasPincipais() {

        try ( PreparedStatement preparedStatement
                = DbConnection.getConnection().prepareStatement(
                        "select conta.senha, conta.apelido, conta.cpfUsuario, conta.perguntaDeSeguranca, "
                        + "conta.respostaDeSeguranca, conta.login "
                        + " from conta inner join ContaPrincipal on conta.login = ContaPrincipal.loginConta"
                        + " order by apelido")) {
//            preparedStatement.setObject(1, venda.getId(), java.sql.Types.BIGINT);

            // Show the full sentence
            System.out.println(">> SQL: " + preparedStatement);

            // Performs the query on the database
            ResultSet resultSet = preparedStatement.executeQuery();

            // Returns the respective object
            return extractObjects(resultSet);

        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }

        return null;
    }

    public List<Conta> localizarTodasSubContas() {

        try ( PreparedStatement preparedStatement
                = DbConnection.getConnection().prepareStatement(
                        "select conta.senha, conta.apelido, conta.cpfUsuario, conta.perguntaDeSeguranca, "
                        + "conta.respostaDeSeguranca, conta.login "
                        + " from conta inner join SubConta on conta.login = SubConta.loginConta"
                        + "  order by apelido")) {
//            preparedStatement.setObject(1, venda.getId(), java.sql.Types.BIGINT);

            // Show the full sentence
            System.out.println(">> SQL: " + preparedStatement);

            // Performs the query on the database
            ResultSet resultSet = preparedStatement.executeQuery();

            // Returns the respective object
            return extractObjects(resultSet);

        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }

        return null;
    }

}
