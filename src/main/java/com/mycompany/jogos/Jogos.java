/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.jogos;

import com.mycompany.jogos.entidades.Empresa;
import com.mycompany.jogos.entidades.Jogo;
import com.mycompany.jogos.repositorio.EmpresaDao;
import com.mycompany.jogos.repositorio.JogoDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

/**
 *            <systemPath>"C:/dev/bd/jogos/jasperreports-6.20.5.jar"</systemPath>

 * @author Your Name &lt;francelino at ifnmg&gt;
 */
public class Jogos {

    public static void main(String[] args) throws SQLException {
//        Connection conn1 = null;
//        Connection conn2 = null;
//        Connection conn3 = null;
//        try {
//            // registers Oracle JDBC driver - though this is no longer required
//            // since JDBC 4.0, but added here for backward compatibility
//            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
//            String dbURL2 = "jdbc:oracle:thin:jsg15509/giordani@//200.131.242.43:1521/IFNMGPDB";
//            String username = "jsg15509";
//            String password = "giordani";
//            conn2 = DriverManager.getConnection(dbURL2); //, username,  password);
//            if (conn2 != null) {
//                System.out.println("Connected with connection #2");
//            }
//            PreparedStatement prstmt = conn2.prepareStatement("insert into empresa (nome)  values (?)");
//            prstmt.setString(1, "teste");
//            prstmt.executeQuery();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        } finally {
//            try {
//                if (conn1 != null && !conn1.isClosed()) {
//                    conn1.close();
//                }
//                if (conn2 != null && !conn2.isClosed()) {
//                    conn2.close();
//                }
//                if (conn3 != null && !conn3.isClosed()) {
//                    conn3.close();
//                }
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
//        }



//        Jogo jogo1 = new Jogo();
//        jogo1.setId("123");
//        jogo1.setNome("jogo1");
//        Jogo jogo2 = new Jogo();
//        jogo2.setId("456");
//        jogo2.setNome("jogo2");
//        Empresa empresa = new Empresa();
//        empresa.setNome("Brasil");
//        jogo2.setEmpresaDesenvolvedora(empresa);
//        jogo1.setEmpresaDistribuidora(empresa);
//        empresa.setJogoDistribuido(jogo1);
//        empresa.setJogoDesenvolvido(jogo2);
//        EmpresaDao empresaDao = new EmpresaDao();
//        empresaDao.deleteByPk(empresa);
//        empresaDao.saveOrUpdate(empresa, true);
//        Empresa empr = new Empresa();
//        empresa.setNome("teste");
//        jogo1.setEmpresaDesenvolvedora(empresa);
//        jogo2.setEmpresaDistribuidora(empresa);
//        empresa.setJogoDistribuido(jogo2);
//        empresa.setJogoDesenvolvido(jogo1);
//        empresaDao.deleteByPk(empresa);
//        empresaDao.saveOrUpdate(empresa, true);
//        empr = empresaDao.findByPk(empresa);
//        empresa.setCidade("Montes Claros");
//        empresaDao.saveOrUpdate(empresa, false);
//        
//        JogoDao jogoDao = new JogoDao();
//        
//        jogoDao.saveOrUpdate(jogo1, true);
//        jogoDao.saveOrUpdate(jogo2, true);
//        
//        System.out.println(empr);
//        List<Empresa> empresas = empresaDao.findAll();
//        System.out.println(empresas);
//        List<Jogo> jogos = jogoDao.findAll();
//        System.out.println(jogos);
        Principal janelaPrincipal =  new Principal();
        janelaPrincipal.setVisible(true);
    }
}
