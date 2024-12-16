/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

//import bean.Emd_usuario;
//import dao.Emd_usuarioDAO;
import bean.JvlUsuarios;
import dao.Jvl_UsuarioDAO;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

import tools.Util;

/**
 *
 * @author u06296329105
 */
public class JDlgUsuarios extends javax.swing.JDialog {

    /**
     * Creates new form JDlgUsuarios
     */
    private MaskFormatter mascaraCPF, mascaraData;

    public JDlgUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Cadastro Usuário");
        setLocationRelativeTo(null);

        Util.habilitar(false, jTxtCodigo, jTxtNome, jtxtAp, jChBAtivo, jFmtCPF,
                jFmtDataN, jPwfSenha, jCboNivel, jBtnCancelar, jBtnConfim);

        try {
            mascaraCPF = new MaskFormatter("###.###.###-##");
            mascaraData = new MaskFormatter("##/##/####");
        } catch (ParseException ex) {
            Logger.getLogger(JDlgUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFmtCPF.setFormatterFactory(new DefaultFormatterFactory(mascaraCPF));
        jFmtDataN.setFormatterFactory(new DefaultFormatterFactory(mascaraData));
    }
    boolean incluindo;

    public JvlUsuarios viewBean() {
        JvlUsuarios jvlUsuarios = new JvlUsuarios();

        jvlUsuarios.setJvlIdUsuarios(Util.srToInt(jTxtCodigo.getText()));
        jvlUsuarios.setJvlNome(jTxtNome.getText());
        jvlUsuarios.setJvlApelido(jtxtAp.getText());
        jvlUsuarios.setJvlCpf(jFmtCPF.getText());
        jvlUsuarios.setJvlNivel(jCboNivel.getSelectedIndex());
        jvlUsuarios.setJvlSenha(jPwfSenha.getText());
        jvlUsuarios.setJvlNascimento(null);
        if (jChBAtivo.isSelected() == true) {
            jvlUsuarios.setJvlAtivo("S");
        } else {
            jvlUsuarios.setJvlAtivo("N");
        }

        return jvlUsuarios;
    }

    public JvlUsuarios beanView(JvlUsuarios jvlUsuarios) {
        jTxtCodigo.setText(Util.intToStg(jvlUsuarios.getJvlIdUsuarios()));
        jTxtNome.setText(jvlUsuarios.getJvlNome());
        jtxtAp.setText(jvlUsuarios.getJvlApelido());
        jFmtCPF.setText(jvlUsuarios.getJvlCpf());
        jCboNivel.setSelectedIndex((jvlUsuarios.getJvlNivel()));
        jPwfSenha.setText(jvlUsuarios.getJvlSenha());
        jFmtDataN.setText(null);

        if (jvlUsuarios.getJvlAtivo().equals("S")) {
            jChBAtivo.setSelected(true);
        } else {
            jChBAtivo.setSelected(false);
        }
        return jvlUsuarios;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jtxtAp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jFmtCPF = new javax.swing.JFormattedTextField();
        jFmtDataN = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPwfSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jCboNivel = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jChBAtivo = new javax.swing.JCheckBox();
        jTxtCodigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfim = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nome");

        jtxtAp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtApActionPerformed(evt);
            }
        });

        jLabel2.setText("Apelido");

        jFmtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtCPFActionPerformed(evt);
            }
        });

        jLabel3.setText("CPF");

        jLabel4.setText("Nascimento");

        jPwfSenha.setText("jPasswordField1");

        jLabel5.setText("Senha");

        jCboNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Convidado" }));
        jCboNivel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCboNivelItemStateChanged(evt);
            }
        });
        jCboNivel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jCboNivelComponentHidden(evt);
            }
        });
        jCboNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboNivelActionPerformed(evt);
            }
        });

        jLabel6.setText("Nivel");

        jChBAtivo.setText("Ativo");

        jTxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodigoActionPerformed(evt);
            }
        });

        jLabel7.setText("Codigo");

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/incluir.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/alterar.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/Excluir_1.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnConfim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/confirmar.png"))); // NOI18N
        jBtnConfim.setText("Confimar");
        jBtnConfim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfimActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(319, 319, 319)
                                .addComponent(jChBAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTxtNome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxtAp, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPwfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jFmtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(45, 45, 45)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jFmtDataN, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(279, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnConfim, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnPesquisar)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(4, 4, 4)
                .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFmtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtDataN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jChBAtivo))
                    .addComponent(jPwfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnConfim, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnPesquisar))
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtApActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtApActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtApActionPerformed

    private void jCboNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboNivelActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodigoActionPerformed

    private void jFmtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtCPFActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:

        Util.habilitar(false, jTxtCodigo, jTxtNome, jtxtAp, jChBAtivo, jFmtCPF,
                jFmtDataN, jPwfSenha, jCboNivel, jBtnCancelar, jBtnConfim);
        Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
        Util.limpar(jTxtCodigo, jTxtNome, jtxtAp, jChBAtivo, jFmtCPF,
                jFmtDataN, jPwfSenha, jCboNivel);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        incluindo = true;
        // TODO add your handling code here:

        Util.habilitar(false, jTxtCodigo, jTxtNome, jtxtAp, jChBAtivo, jFmtCPF,
                jFmtDataN, jPwfSenha, jBtnConfim, jBtnAlterar, jBtnIncluir, jBtnPesquisar, jBtnExcluir);
        Util.habilitar(true, jTxtCodigo, jTxtNome, jtxtAp, jChBAtivo, jFmtCPF,
                jFmtDataN, jPwfSenha, jCboNivel, jBtnCancelar, jBtnConfim);
        Util.limpar(jTxtCodigo, jTxtNome, jtxtAp, jChBAtivo, jFmtCPF,
                jFmtDataN, jPwfSenha);


    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnConfimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfimActionPerformed
        // TODO add your handling code here:
        JvlUsuarios jvlUsuario = viewBean();
        Jvl_UsuarioDAO jvl_UsuarioDAO = new Jvl_UsuarioDAO();
        if (incluindo == true) {
            jvl_UsuarioDAO.insert(jvlUsuario);
            Util.mostrar("Usuário salvo com sucesso !");
        }else if(incluindo == false){
        jvl_UsuarioDAO.update(jvlUsuario);
        Util.mostrar("Te Alterado com Sucesso !");
        }
        Util.habilitar(false, jTxtCodigo, jTxtNome, jtxtAp, jChBAtivo, jFmtCPF,
                jFmtDataN, jPwfSenha, jCboNivel, jBtnCancelar, jBtnConfim);
        Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
        Util.limpar(jTxtCodigo, jTxtNome, jtxtAp, jChBAtivo, jFmtCPF,
                jFmtDataN, jPwfSenha, jCboNivel);
    }//GEN-LAST:event_jBtnConfimActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:
        if (Util.perguntar("você deseja excluir?")) {
            Jvl_UsuarioDAO jvl_UsuarioDAO = new Jvl_UsuarioDAO();
            jvl_UsuarioDAO.delete(viewBean());
            Util.mostrar("Exclusao realizada");
            Util.limpar(jTxtCodigo, jTxtNome, jtxtAp, jChBAtivo, jFmtCPF,
                    jFmtDataN, jPwfSenha, jCboNivel);
        } else {
            Util.mostrar("exclusao cancelada");
        }

    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        // TODO add your handling code here:

        JDlgUsuariosPesquisar jDlgUsuariosPesquisar = new JDlgUsuariosPesquisar(null, true);
        jDlgUsuariosPesquisar.setTelaAnterior(this);
        jDlgUsuariosPesquisar.setVisible(true);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
         incluindo = false;

          Util.habilitar(false, jTxtCodigo, jTxtNome, jtxtAp, jChBAtivo, jFmtCPF,
                jFmtDataN, jPwfSenha, jBtnConfim, jBtnAlterar, jBtnIncluir, jBtnPesquisar, jBtnExcluir);
        Util.habilitar(true, jTxtCodigo, jTxtNome, jtxtAp, jChBAtivo, jFmtCPF,
                jFmtDataN, jPwfSenha, jCboNivel, jBtnCancelar, jBtnConfim);
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jCboNivelComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jCboNivelComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboNivelComponentHidden

    private void jCboNivelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCboNivelItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboNivelItemStateChanged

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
            java.util.logging.Logger.getLogger(JDlgUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgUsuarios dialog = new JDlgUsuarios(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfim;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JComboBox<String> jCboNivel;
    private javax.swing.JCheckBox jChBAtivo;
    private javax.swing.JFormattedTextField jFmtCPF;
    private javax.swing.JFormattedTextField jFmtDataN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPwfSenha;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jtxtAp;
    // End of variables declaration//GEN-END:variables
}
