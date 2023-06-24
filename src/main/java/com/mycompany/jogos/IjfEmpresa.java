/* 
 * Material didático destinado ao curso
 * de Programação Orientada a Objetos do 
 * Bacharelado em Ciência da Computação 
 * do IFNMG - Câmpus Montes Claros
 */
package com.mycompany.jogos;

import com.mycompany.jogos.entidades.Empresa;
import com.mycompany.jogos.repositorio.DbConnection;
import com.mycompany.jogos.repositorio.EmpresaDao;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
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
public class IjfEmpresa extends javax.swing.JInternalFrame {

    private static IjfEmpresa self;
    private Empresa empresa;

    /**
     * Creates new form InternaC
     */
    private IjfEmpresa() {
        empresa = new Empresa();
        initComponents();
    }

    public static IjfEmpresa getInstance() {
        // Caso a janela ainda não tenha sido instanciada
        if (self == null) {
            self = new IjfEmpresa();
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
        jtfNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfWebSite = new javax.swing.JTextField();
        jtfNomeDoPresidente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfCidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfEstado = new javax.swing.JTextField();
        jtfPais = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfNomeDoFundador = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jffDataDaFundacao = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Empresa");
        setToolTipText("");

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

        jtfNome.setToolTipText("");

        jLabel1.setText("NOME");

        jLabel2.setText("WEB SITE");

        jLabel3.setText("NOME DO PRESIDENTE");

        jLabel4.setText("DATA DA FUNDACAO");

        jLabel5.setText("CIDADE");

        jLabel6.setText("ESTADO");

        jLabel7.setText("PAÍS");

        jLabel8.setText("NOME DO FUNDADOR");

        jffDataDaFundacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addComponent(jbtListar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jtfWebSite, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jtfNomeDoPresidente, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jtfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jtfPais, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jtfNomeDoFundador, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                            .addComponent(jffDataDaFundacao)))))
        );

        jpPrincipalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbtExcluir, jbtInserir, jbtListar});

        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfWebSite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNomeDoPresidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jffDataDaFundacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNomeDoFundador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
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
                .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtInserirActionPerformed
        // TODO add your handling code here:
        getDadosTela();
        try {
            // TODO add your handling code here:
            if (new EmpresaDao().findByPk(empresa) != null) {
                JOptionPane.showMessageDialog(this, "já não cadastraado");
                return;
            }
            new EmpresaDao().saveOrUpdate(empresa, true);
            limparDadosTela();
            getDadosTela();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_jbtInserirActionPerformed

    private void jbtAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAtualizarActionPerformed
        // TODO add your handling code here:
        getDadosTela();
        try {
            // TODO add your handling code here:
            if (new EmpresaDao().findByPk(empresa) == null) {
                JOptionPane.showMessageDialog(this, "não cadastraado");
                return;
            }
            new EmpresaDao().saveOrUpdate(empresa, false);
            limparDadosTela();
            getDadosTela();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_jbtAtualizarActionPerformed

    private void jbtRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRecuperarActionPerformed
        // TODO add your handling code here:
        getDadosTela();
        try {
            // TODO add your handling code here:
            if (new EmpresaDao().findByPk(empresa) == null) {
                JOptionPane.showMessageDialog(this, "não cadastraado");
                return;
            }

            empresa = new EmpresaDao().findByPk(empresa);
            setDadosTela();
//        JOptionPane.showMessageDialog(this, "sucesso");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_jbtRecuperarActionPerformed

    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed
        // TODO add your handling code here:
        getDadosTela();
        try {
            // TODO add your handling code here:
            if (new EmpresaDao().findByPk(empresa) == null) {
                JOptionPane.showMessageDialog(this, "não cadastraado");
                return;
            }
            new EmpresaDao().deleteByPk(empresa);
            limparDadosTela();
            getDadosTela();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jbtExcluirActionPerformed

    private void jbtListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtListarActionPerformed
        // TODO add your handling code here:
         
        new Util().relatorios("/Empresa.jasper", "Listagem de Empresas");

    }//GEN-LAST:event_jbtListarActionPerformed

    private void getDadosTela() {
        if (empresa == null) {
            empresa = new Empresa();
        }
        empresa.setNome(jtfNome.getText());
        empresa.setWebsite(jtfWebSite.getText());
        empresa.setNomeDoPresidente(jtfNomeDoPresidente.getText());
        if (!jffDataDaFundacao.getText().equals("")) {
            DateTimeFormatter formatters = DateTimeFormatter.ofPattern("d/MM/uuuu");
            empresa.setDataDaFundacao(LocalDate.parse(jffDataDaFundacao.getText(), formatters));
        } else {
            empresa.setDataDaFundacao(null);
        }
        empresa.setCidade(jtfCidade.getText());
        empresa.setEstado(jtfEstado.getText());
        empresa.setPais(jtfPais.getText());
        empresa.setNomeDoFundador(jtfNomeDoFundador.getText());
    }

    private void setDadosTela() {
        if (empresa == null) {
            empresa = new Empresa();
        }
        jtfNome.setText(empresa.getNome());
        jtfWebSite.setText(empresa.getWebsite());
        jtfNomeDoPresidente.setText(empresa.getNomeDoPresidente());
        if (empresa.getDataDaFundacao() != null) {
            Date date = Date.valueOf(empresa.getDataDaFundacao());
            jffDataDaFundacao.setText(new SimpleDateFormat("dd/MM/yyyy").format(date));
        } else {
            jffDataDaFundacao.setText("");
        }
        jtfCidade.setText(empresa.getCidade());
        jtfEstado.setText(empresa.getEstado());
        jtfPais.setText(empresa.getPais());
        jtfNomeDoFundador.setText(empresa.getNomeDoFundador());
    }

    private void limparDadosTela() {
        jtfNome.setText("");
        jtfWebSite.setText("");
        jtfNomeDoPresidente.setText("");
        jffDataDaFundacao.setText("");
        jtfCidade.setText("");
        jtfEstado.setText("");
        jtfPais.setText("");
        jtfNomeDoFundador.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jbtAtualizar;
    private javax.swing.JButton jbtExcluir;
    private javax.swing.JButton jbtInserir;
    private javax.swing.JButton jbtListar;
    private javax.swing.JButton jbtRecuperar;
    private javax.swing.JFormattedTextField jffDataDaFundacao;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JTextField jtfCidade;
    private javax.swing.JTextField jtfEstado;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfNomeDoFundador;
    private javax.swing.JTextField jtfNomeDoPresidente;
    private javax.swing.JTextField jtfPais;
    private javax.swing.JTextField jtfWebSite;
    // End of variables declaration//GEN-END:variables
}