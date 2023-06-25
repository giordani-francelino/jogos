/* 
 * Material didático destinado ao curso
 * de Programação Orientada a Objetos do 
 * Bacharelado em Ciência da Computação 
 * do IFNMG - Câmpus Montes Claros
 */
package com.mycompany.jogos;

import com.mycompany.jogos.entidades.Usuario;
import com.mycompany.jogos.repositorio.DbConnection;
import com.mycompany.jogos.repositorio.UsuarioDao;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.0.1, 16/08/2021
 */
public class IjfUsuario extends javax.swing.JInternalFrame {

    private static IjfUsuario self;
    private Usuario usuario;

    /**
     * Creates new form InternaC
     */
    private IjfUsuario() {
        usuario = new Usuario();
        initComponents();
    }

    public static IjfUsuario getInstance() {
        // Caso a janela ainda não tenha sido instanciada
        if (self == null) {
            self = new IjfUsuario();
        }

        return self;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        jbtInserir = new javax.swing.JButton();
        jbtAtualizar = new javax.swing.JButton();
        jbtRecuperar = new javax.swing.JButton();
        jbtExcluir = new javax.swing.JButton();
        jbtListar = new javax.swing.JButton();
        jtfCpf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfPais = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jftDataNascimento = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Usuários");

        jbtInserir.setText("Inserir");
        jbtInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtInserirActionPerformed(evt);
            }
        });

        jbtAtualizar.setText("Atualizar");
        jbtAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAtualizarActionPerformed(evt);
            }
        });

        jbtRecuperar.setText("Recuperar");
        jbtRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRecuperarActionPerformed(evt);
            }
        });

        jbtExcluir.setText("Excluir");
        jbtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExcluirActionPerformed(evt);
            }
        });

        jbtListar.setText("Listar");
        jbtListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtListarActionPerformed(evt);
            }
        });

        jtfCpf.setToolTipText("");

        jLabel1.setText("CPF");

        jtfNome.setToolTipText("");

        jLabel2.setText("NOME");

        jtfPais.setToolTipText("");

        jLabel3.setText("PAÍS");

        jtfEmail.setToolTipText("");

        jLabel4.setText("E-MAIL");

        jLabel5.setText("NASCIMENTO (dd/mmyyyy)");

        jftDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jbtInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtRecuperar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jbtListar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jftDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                            .addComponent(jtfEmail)
                            .addComponent(jtfPais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                            .addComponent(jtfNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfCpf, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );

        jpPrincipalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbtExcluir, jbtInserir, jbtListar});

        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jftDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtRecuperar)
                        .addComponent(jbtExcluir)
                        .addComponent(jbtListar))
                    .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtInserir)
                        .addComponent(jbtAtualizar)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jbtInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtInserirActionPerformed
        getDadosTela();
        try {
            // TODO add your handling code here:
            if (new UsuarioDao().findByPk(usuario) != null) {
                JOptionPane.showMessageDialog(this, "já cadastraado");
                return;
            }
            new UsuarioDao().saveOrUpdate(usuario, true);
            limparDadosTela();
            getDadosTela();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jbtInserirActionPerformed

    private void jbtAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAtualizarActionPerformed
        getDadosTela();
        try {
            // TODO add your handling code here:
            if (new UsuarioDao().findByPk(usuario) == null) {
                JOptionPane.showMessageDialog(this, "não cadastraado");
                return;
            }
            new UsuarioDao().saveOrUpdate(usuario, false);
            limparDadosTela();
            getDadosTela();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jbtAtualizarActionPerformed

    private void jbtRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRecuperarActionPerformed
        getDadosTela();
        try {
            // TODO add your handling code here:
            if (new UsuarioDao().findByPk(usuario) == null) {
                JOptionPane.showMessageDialog(this, "não cadastraado");
                return;
            }

            usuario = new UsuarioDao().findByPk(usuario);
            setDadosTela();
//        JOptionPane.showMessageDialog(this, "sucesso");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jbtRecuperarActionPerformed

    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed
        getDadosTela();
        try {
            // TODO add your handling code here:
            if (new UsuarioDao().findByPk(usuario) == null) {
                JOptionPane.showMessageDialog(this, "não cadastraado");
                return;
            }
            new UsuarioDao().deleteByPk(usuario);
            limparDadosTela();
            getDadosTela();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_jbtExcluirActionPerformed

    private void jbtListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtListarActionPerformed
        // TODO add your handling code here:
//        try (InputStream in = getClass().getResourceAsStream("/usuarios.jasper")) {
//
//            JasperPrint jasperPrint = JasperFillManager.fillReport(
//                    in, null, DbConnection.getConnection());
//            JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
//            JDialog jDialog = new JDialog();
//            jDialog.setContentPane(jasperViewer.getContentPane());
//            jDialog.setSize(jasperViewer.getSize());
//            jDialog.setTitle("Listagem de Usuários");
//            jDialog.setModal(true);
//            jDialog.setVisible(true);
//
//        } catch (IOException ex) {
//            Logger.getLogger(IjfUsuario.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (JRException ex) {
//            Logger.getLogger(IjfUsuario.class.getName()).log(Level.SEVERE, null, ex);
//        }
            new Util().relatorios("/usuarios.jasper", "Listagem de Usuários");

    }//GEN-LAST:event_jbtListarActionPerformed

    private void getDadosTela() {
        if (usuario == null) {
            usuario = new Usuario();
        }
        usuario.setCpf(jtfCpf.getText());
        usuario.setNome(jtfNome.getText());
        usuario.setEmail(jtfEmail.getText());
        usuario.setPaís(jtfPais.getText());
        if (!jftDataNascimento.getText().equals("")) {
            DateTimeFormatter formatters = DateTimeFormatter.ofPattern("d/MM/uuuu");
            usuario.setDataNascimento(LocalDate.parse(jftDataNascimento.getText(),formatters));
        } else {
            usuario.setDataNascimento(null);
        }
    }

    private void setDadosTela() {
        if (usuario == null) {
            usuario = new Usuario();
        }
        jtfCpf.setText(usuario.getCpf());
        jtfNome.setText(usuario.getNome());
        jtfEmail.setText(usuario.getEmail());
        jtfPais.setText(usuario.getPaís());
        if (usuario.getDataNascimento() != null) {
            Date date = Date.valueOf(usuario.getDataNascimento());
            jftDataNascimento.setText(new SimpleDateFormat("dd/MM/yyyy").format(date));
        } else {
            jftDataNascimento.setText("");
        }
    }

    private void limparDadosTela() {
        jtfCpf.setText("");
        jtfNome.setText("");
        jtfEmail.setText("");
        jtfPais.setText("");
        jftDataNascimento.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbtAtualizar;
    private javax.swing.JButton jbtExcluir;
    private javax.swing.JButton jbtInserir;
    private javax.swing.JButton jbtListar;
    private javax.swing.JButton jbtRecuperar;
    private javax.swing.JFormattedTextField jftDataNascimento;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JTextField jtfCpf;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfPais;
    // End of variables declaration//GEN-END:variables

    private LocalDate LocalDate(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
