package com.mycompany.jogos.repositorio;

import com.mycompany.jogos.entidades.Empresa;
import java.sql.PreparedStatement;
import com.mycompany.jogos.entidades.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * <code>
 
 *CREATE TABLE Usuarios(
cpf VARCHAR(14),
nome VARCHAR(20),
pais VARCHAR(15),
email VARCHAR(15),
dataNascimento TIMESTAMP,
CONSTRAINT pkUsuarios PRIMARY KEY (cpf)
);
*
 * </code>
 */
public class UsuarioDao extends Dao<Usuario> {

    public static final String TABLE = "Usuarios";

    @Override
    public String getSaveStatment() {
        return "insert into " + TABLE + "(nome, pais, email, "
                + "dataNascimento, cpf)  values (?, ?, ?, ?, ?)";
    }

    @Override
    public String getUpdateStatment() {
        return "update " + TABLE + " set nome = ?, pais = ?, email = ?, "
                + "dataNascimento = ?  where cpf = ?";
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Usuario e) {
        try {
            pstmt.setString(1, e.getNome());
            pstmt.setString(2, e.getPaís());
            pstmt.setString(3, e.getEmail());
            pstmt.setObject(4, e.getDataNascimento(), java.sql.Types.DATE);
            pstmt.setString(5, e.getCpf());

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getDeleteByPkStatment() {
        return "delete from " + TABLE + " where cpf = ?";
    }

    @Override
    public void composeDeleteByPkStatement(PreparedStatement pstmt, Usuario e) {
        try {
            pstmt.setString(1, e.getCpf());

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String getFindByPkStatment() {
        return "select nome, pais, email, "
                + "dataNascimento, cpf "
                + " from " + TABLE + " where cpf = ?";
    }

    @Override
    public void composeFindByPkStatement(PreparedStatement pstmt, Usuario e) {
        try {
            pstmt.setString(1, e.getCpf());

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String getFindAllStatment() {
        return "select  nome, pais, email, "
                + "dataNascimento, cpf "
                + " from " + TABLE + " order by nome";
    }

    @Override
    public Usuario extractObject(ResultSet resultSet) {

        Usuario usuario = null;

        try {
            usuario = new Usuario();
            usuario.setNome(resultSet.getString("nome"));
            usuario.setPaís(resultSet.getString("pais"));
            usuario.setEmail(resultSet.getString("email"));
            usuario.setDataNascimento(
                    resultSet.getObject("dataNascimento", LocalDate.class));
            usuario.setCpf(resultSet.getString("cpf"));
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return usuario;
    }

}
