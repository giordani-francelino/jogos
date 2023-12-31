/* 
 * Material didático destinado ao curso
 * de Programação Orientada a Objetos do 
 * Bacharelado em Ciência da Computação 
 * do IFNMG - Câmpus Montes Claros
 */
package com.mycompany.jogos;

import com.mycompany.jogos.entidades.Empresa;
import com.mycompany.jogos.repositorio.SubContaDao;
import com.mycompany.jogos.entidades.Conta;
import com.mycompany.jogos.entidades.ContaPrincipal;
import com.mycompany.jogos.entidades.SubConta;
import com.mycompany.jogos.entidades.Usuario;
import com.mycompany.jogos.repositorio.ContaDao;
import com.mycompany.jogos.repositorio.ContaPrincipalDao;
import com.mycompany.jogos.repositorio.EmpresaDao;
import com.mycompany.jogos.repositorio.UsuarioDao;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.0.1, 16/08/2021
 */
public class IjfSubConta extends javax.swing.JInternalFrame {

    private static IjfSubConta self;
    private Conta conta;
    private ContaPrincipal contaPrincipal;
    private SubConta subConta;

    /**
     * Creates new form InternaC
     */
    private IjfSubConta() {
        conta = new Conta();
        subConta = new SubConta();
        initComponents();
        atualizarCmb();

    }

    public static IjfSubConta getInstance() {
        // Caso a janela ainda não tenha sido instanciada
        if (self == null) {
            self = new IjfSubConta();
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
        btnInserir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtfLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfApelido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfPerguntaDeSeguranca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfRspostaDeSeguranca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbUsuario = new javax.swing.JComboBox<>();
        jpfSenha = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        cmbContaPrincipal = new javax.swing.JComboBox<>();
        jtfUsuDoCartao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfAcessoConteudoImproprio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbConta = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de subcontas");

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        jLabel1.setText("LOGIN");

        jLabel2.setText("SENHA");

        jLabel3.setText("APELIDO");

        jLabel4.setText("PERGUNTA DE SEGURANÇA");

        jLabel5.setText("RESPOSTA DE SEGURANÇA");

        jLabel6.setText("USUÁRIO");

        jpfSenha.setText("jPasswordField1");

        jLabel7.setText("CONTA PRINCIPAL");

        jLabel8.setText("USO DO CARTÃO");

        jLabel9.setText("ACESSO A CONTEÚDO IMPRÓPRIO");

        cmbConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbContaActionPerformed(evt);
            }
        });

        jLabel10.setText("SELECIONAR SUBCONTA");

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpPrincipalLayout.createSequentialGroup()
                                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbContaPrincipal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbConta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(12, 12, 12))
                                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfRspostaDeSeguranca, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                    .addComponent(jtfPerguntaDeSeguranca, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                    .addComponent(jtfApelido, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                    .addComponent(jtfLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                    .addComponent(jpfSenha)
                                    .addComponent(jtfUsuDoCartao, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                    .addComponent(jtfAcessoConteudoImproprio, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))))))
                .addContainerGap())
        );

        jpPrincipalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnExcluir, btnInserir, btnListar});

        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(16, 16, 16)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(16, 16, 16)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPerguntaDeSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(16, 16, 16)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfRspostaDeSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(16, 16, 16)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfUsuDoCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(16, 16, 16)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfAcessoConteudoImproprio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbContaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmbConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLimpar)
                        .addComponent(btnExcluir)
                        .addComponent(btnListar))
                    .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnInserir)
                        .addComponent(btnAtualizar)))
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

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        // TODO add your handling code here:
        getDadosTela();
        try {
            // TODO add your handling code here:
            if (new SubContaDao().findByPk(subConta) != null) {
                JOptionPane.showMessageDialog(this, "já cadastraado");
                return;
            }
            new ContaDao().deleteByPk(conta);
            new ContaDao().saveOrUpdate(conta, true);
            new SubContaDao().saveOrUpdate(subConta, true);
            subConta.setConta(conta);
            limparDadosTela();
            getDadosTela();
            atualizarCmb();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        getDadosTela();
        try {
            // TODO add your handling code here:
            if (new SubContaDao().findByPk(subConta) == null) {
                JOptionPane.showMessageDialog(this, "não cadastraado");
                return;
            }

            new ContaDao().saveOrUpdate(conta, false);
            new SubContaDao().saveOrUpdate(subConta, false);
            limparDadosTela();
            getDadosTela();
            atualizarCmb();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        limparDadosTela();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        getDadosTela();
        try {
            // TODO add your handling code here:
            if (new SubContaDao().findByPk(subConta) == null) {
                JOptionPane.showMessageDialog(this, "não cadastraado");
                return;
            }
            new SubContaDao().deleteByPk(subConta);
            new ContaDao().deleteByPk(conta);
            limparDadosTela();
            getDadosTela();
            atualizarCmb();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        new Util().relatorios("/SubConta.jasper", "Listagem de SubContas");
    }//GEN-LAST:event_btnListarActionPerformed

    private void cmbContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbContaActionPerformed
        try {
            // TODO add your handling code here:
            conta = (Conta) cmbConta.getModel().getSelectedItem();
            subConta.setLoginConta(conta.getLogin());
            subConta = new SubContaDao().findByPk(subConta);
            setDadosTela();
        } catch (Exception ex) {
            Logger.getLogger(IjfSubConta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_cmbContaActionPerformed

    private void getDadosTela() {
        if (subConta == null) {
            subConta = new SubConta();
        }
        conta.setLogin(jtfLogin.getText());
        conta.setSenha(new String(jpfSenha.getPassword()));
        conta.setApelido(jtfApelido.getText());
        conta.setPerguntaDeSeguranca(jtfPerguntaDeSeguranca.getText());
        conta.setRespostaDeSeguranca(jtfRspostaDeSeguranca.getText());
        subConta.setLoginConta(jtfLogin.getText());
        if (!jtfUsuDoCartao.getText().equals("")) {
            subConta.setUsoDoCartao(Integer.parseInt(jtfUsuDoCartao.getText()));
        }
        if (!jtfAcessoConteudoImproprio.getText().equals("")) {
            subConta.setAcessoConteudoImproprio(Integer.parseInt(jtfAcessoConteudoImproprio.getText()));
        }
        conta.setUsuario((Usuario) cmbUsuario.getSelectedItem());
        subConta.setConta(conta);
        subConta.setContaPrincipal((ContaPrincipal) cmbContaPrincipal.getSelectedItem());

    }

    private void setDadosTela() {
        if (subConta == null) {
            subConta = new SubConta();
        }
        jtfLogin.setText(conta.getLogin());
        jpfSenha.setText(conta.getSenha());
        jtfApelido.setText(conta.getApelido());
        jtfPerguntaDeSeguranca.setText(conta.getPerguntaDeSeguranca());
        jtfRspostaDeSeguranca.setText(conta.getRespostaDeSeguranca());
        cmbContaPrincipal.getModel().setSelectedItem(subConta.getContaPrincipal());
        jtfUsuDoCartao.setText(String.valueOf(subConta.getUsoDoCartao()));
        jtfAcessoConteudoImproprio.setText(String.valueOf(subConta.getAcessoConteudoImproprio()));
        cmbUsuario.getModel().setSelectedItem(conta.getUsuario());
        cmbContaPrincipal.getModel().setSelectedItem(subConta.getContaPrincipal());

    }

    private void limparDadosTela() {
        jtfLogin.setText("");
        jpfSenha.setText("");
        jtfApelido.setText("");
        jtfPerguntaDeSeguranca.setText("");
        jtfRspostaDeSeguranca.setText("");
        jtfUsuDoCartao.setText("");
        jtfAcessoConteudoImproprio.setText("");
//        cmbConta.setSelectedItem(null);
        cmbUsuario.getModel().setSelectedItem(null);
        cmbContaPrincipal.getModel().setSelectedItem(null);
    }

    private void atualizarCmb() {
        DefaultComboBoxModel<Usuario> comboBoxModelUsuario = new DefaultComboBoxModel<>();
        try {
            comboBoxModelUsuario.addAll(new UsuarioDao().findAll());
        } catch (Exception ex) {
            Logger.getLogger(IjfContaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        cmbUsuario.setModel(comboBoxModelUsuario);

        DefaultComboBoxModel<ContaPrincipal> comboBoxModelContaPrincipal = new DefaultComboBoxModel<>();
        try {
            comboBoxModelContaPrincipal.addAll(new ContaPrincipalDao().findAll());
        } catch (Exception ex) {
            Logger.getLogger(IjfContaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        cmbContaPrincipal.setModel(comboBoxModelContaPrincipal);

        DefaultComboBoxModel<Conta> comboBoxModelConta = new DefaultComboBoxModel<>();
        try {
            comboBoxModelConta.addAll(new ContaDao().localizarTodasSubContas());
        } catch (Exception ex) {
            Logger.getLogger(IjfContaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        cmbConta.setModel(comboBoxModelConta);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnListar;
    private javax.swing.JComboBox<Conta> cmbConta;
    private javax.swing.JComboBox<ContaPrincipal> cmbContaPrincipal;
    private javax.swing.JComboBox<Usuario> cmbUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField jtfAcessoConteudoImproprio;
    private javax.swing.JTextField jtfApelido;
    private javax.swing.JTextField jtfLogin;
    private javax.swing.JTextField jtfPerguntaDeSeguranca;
    private javax.swing.JTextField jtfRspostaDeSeguranca;
    private javax.swing.JTextField jtfUsuDoCartao;
    // End of variables declaration//GEN-END:variables
}
