/* 
 * Material didático destinado ao curso
 * de Programação Orientada a Objetos do 
 * Bacharelado em Ciência da Computação 
 * do IFNMG - Câmpus Montes Claros
 */
package com.mycompany.jogos;

import com.mycompany.jogos.repositorio.DbConnection;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.0.1, 16/08/2021
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dskPrincipal = new javax.swing.JDesktopPane();
        mnuPrincipal = new javax.swing.JMenuBar();
        mnuCadastro = new javax.swing.JMenu();
        mnuCadastroUsuario = new javax.swing.JMenuItem();
        mnuCadastroContaPrincipal = new javax.swing.JMenuItem();
        mnuCadastroSubConta = new javax.swing.JMenuItem();
        mnuCadastroEmpresa = new javax.swing.JMenuItem();
        mnuCadastroJogo = new javax.swing.JMenuItem();
        mnuCadastroRelatorio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dskPrincipalLayout = new javax.swing.GroupLayout(dskPrincipal);
        dskPrincipal.setLayout(dskPrincipalLayout);
        dskPrincipalLayout.setHorizontalGroup(
            dskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
        );
        dskPrincipalLayout.setVerticalGroup(
            dskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        mnuCadastro.setText("Cadastro");

        mnuCadastroUsuario.setText("Usuários");
        mnuCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroUsuarioActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadastroUsuario);

        mnuCadastroContaPrincipal.setText("Conta Principal");
        mnuCadastroContaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroContaPrincipalActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadastroContaPrincipal);

        mnuCadastroSubConta.setText("Subcontas");
        mnuCadastroSubConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroSubContaActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadastroSubConta);

        mnuCadastroEmpresa.setText("Empresas");
        mnuCadastroEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroEmpresaActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadastroEmpresa);

        mnuCadastroJogo.setText("Jogos");
        mnuCadastroJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroJogoActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadastroJogo);

        mnuCadastroRelatorio.setText("Relatorios");
        mnuCadastroRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroRelatorioActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadastroRelatorio);

        mnuPrincipal.add(mnuCadastro);

        setJMenuBar(mnuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dskPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCadastroContaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroContaPrincipalActionPerformed
        // Recupera uma instância visível e não-iconficada da janela
        IjfContaPrincipal ijfContaPrincipal = IjfContaPrincipal.getInstance();

        // Se a janela ainda não foi adicionada à área de trabalho...
        if (!Arrays
                .asList(dskPrincipal.getAllFrames())
                .contains(ijfContaPrincipal)) {
            dskPrincipal.add(ijfContaPrincipal);
        }

        tornarVisivel(ijfContaPrincipal);

    }//GEN-LAST:event_mnuCadastroContaPrincipalActionPerformed

    private void mnuCadastroSubContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroSubContaActionPerformed
        // Recupera uma instância visível e não-iconficada da janela
        IjfSubConta ijfSubConta = IjfSubConta.getInstance();

        // Se a janela ainda não foi adicionada à área de trabalho...
        if (!Arrays
                .asList(dskPrincipal.getAllFrames())
                .contains(ijfSubConta)) {
            dskPrincipal.add(ijfSubConta);
        }

        tornarVisivel(ijfSubConta);
    }//GEN-LAST:event_mnuCadastroSubContaActionPerformed

    private void mnuCadastroEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroEmpresaActionPerformed
        // TODO add your handling code here:
        IjfEmpresa ijfEmpresa = IjfEmpresa.getInstance();

        // Se a janela ainda não foi adicionada à área de trabalho...
        if (!Arrays
                .asList(dskPrincipal.getAllFrames())
                .contains(ijfEmpresa)) {
            dskPrincipal.add(ijfEmpresa);
        }

        tornarVisivel(ijfEmpresa);
    }//GEN-LAST:event_mnuCadastroEmpresaActionPerformed

    private void mnuCadastroJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroJogoActionPerformed
        // TODO add your handling code here:      
        IjfJogo ijfJogo = IjfJogo.getInstance();

        // Se a janela ainda não foi adicionada à área de trabalho...
        if (!Arrays
                .asList(dskPrincipal.getAllFrames())
                .contains(ijfJogo)) {
            dskPrincipal.add(ijfJogo);
        }

        tornarVisivel(ijfJogo);
    }//GEN-LAST:event_mnuCadastroJogoActionPerformed

    private void mnuCadastroRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroRelatorioActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mnuCadastroRelatorioActionPerformed

    private void mnuCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroUsuarioActionPerformed
        // TODO add your handling code here:
        IjfUsuario ijfUsuario = IjfUsuario.getInstance();

        // Se a janela ainda não foi adicionada à área de trabalho...
        if (!Arrays
                .asList(dskPrincipal.getAllFrames())
                .contains(ijfUsuario)) {
            dskPrincipal.add(ijfUsuario);
        }

        tornarVisivel(ijfUsuario);
    }//GEN-LAST:event_mnuCadastroUsuarioActionPerformed

    /**
     * Reuso de funcionalidade de exibição de janela interna.
     *
     * @param janela Janela interna a ser ajustada
     */
    private void tornarVisivel(JInternalFrame janela) {
        // Verificação de janela válida
        if (janela == null) {
            return;
        }

        // Torna a janela visível
        janela.setVisible(true);

        try {
            // Restaura a janela caso esteja minimizada
            janela.setIcon(false);

            // Leva o foco para a janela
            janela.setSelected(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Traz a janela para o primeiro plano
        janela.toFront();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dskPrincipal;
    private javax.swing.JMenu mnuCadastro;
    private javax.swing.JMenuItem mnuCadastroContaPrincipal;
    private javax.swing.JMenuItem mnuCadastroEmpresa;
    private javax.swing.JMenuItem mnuCadastroJogo;
    private javax.swing.JMenuItem mnuCadastroRelatorio;
    private javax.swing.JMenuItem mnuCadastroSubConta;
    private javax.swing.JMenuItem mnuCadastroUsuario;
    private javax.swing.JMenuBar mnuPrincipal;
    // End of variables declaration//GEN-END:variables
}
