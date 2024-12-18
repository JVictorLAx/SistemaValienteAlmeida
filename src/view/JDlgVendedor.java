/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.JvlVendedor;
import dao.Jvl_VendedorDAO;
import javax.swing.JOptionPane;
import tools.Util;

/**
 *
 * @author u06296329105
 */
public class JDlgVendedor extends javax.swing.JDialog {

    /**
     * Creates new form JDlgVendedor
     */
    public JDlgVendedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Cadastro Vendedor");
        setLocationRelativeTo(null);
        Util.habilitar(false, jTxtEmail, jTxtNome, jTxtIdvendedor, jTxtSalario, jCboGenero,
                jTxtTelefone, jFmtCpf, jBtnCancelar, jBtnConfim);
    }
    boolean incluindo;

    public JvlVendedor viewBean() {
        JvlVendedor vendedor = new JvlVendedor();

        vendedor.setJvlIdVendedor(Util.srToInt(jTxtIdvendedor.getText()));
        vendedor.setJvlNome(jTxtNome.getText());
        vendedor.setJvlTelefone(jTxtTelefone.getText());
        vendedor.setJvlCpf(jFmtCpf.getText());
        vendedor.setJvlGenero(jCboGenero.getSelectedIndex());
        vendedor.setJvlSalario(Util.strgDouble(jTxtSalario.getText()));
        vendedor.setJvlEmail(jTxtEmail.getText());

        return vendedor;
    }

    public JvlVendedor beanView(JvlVendedor vendedor) {
        jTxtIdvendedor.setText(Util.intToStg(vendedor.getJvlIdVendedor()));
        jTxtNome.setText(vendedor.getJvlNome());
        jTxtTelefone.setText(vendedor.getJvlTelefone());
        jFmtCpf.setText(vendedor.getJvlCpf());
        jCboGenero.setSelectedIndex((vendedor.getJvlGenero()));
        jTxtSalario.setText(Util.DoubleString(vendedor.getJvlSalario()));
        jTxtEmail.setText(vendedor.getJvlEmail());

        return vendedor;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTxtIdvendedor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jTxtTelefone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jFmtCpf = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jCboGenero = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTxtSalario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfim = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("ID");

        jLabel2.setText("Nome");

        jLabel3.setText("Telefone");

        jLabel4.setText("CPF");

        jCboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maculino", "Feminino" }));
        jCboGenero.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jCboGeneroComponentHidden(evt);
            }
        });
        jCboGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboGeneroActionPerformed(evt);
            }
        });

        jLabel5.setText("Genero");

        jLabel6.setText("Salário");

        jLabel7.setText("email");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTxtIdvendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(111, 111, 111)
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jCboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jBtnIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnConfim, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnPesquisar)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtIdvendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnConfim, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnPesquisar))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCboGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboGeneroActionPerformed

    private void jCboGeneroComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jCboGeneroComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboGeneroComponentHidden

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:

        incluindo = true;

        Util.habilitar(true, jTxtEmail, jTxtNome, jTxtIdvendedor, jTxtSalario, jCboGenero,
                jTxtTelefone, jFmtCpf, jBtnCancelar, jBtnConfim);
        Util.habilitar(false, jBtnAlterar, jBtnExcluir, jBtnPesquisar, jBtnIncluir);
        Util.limpar(jTxtEmail, jTxtNome, jTxtIdvendedor, jTxtSalario, jCboGenero,
                jTxtTelefone, jFmtCpf);

    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling codeuhere:
        if (Util.perguntar("você deseja excluir?")) {
            Jvl_VendedorDAO vendedorDAO = new Jvl_VendedorDAO();
            vendedorDAO.delete(viewBean());
            Util.mostrar("Exclusao realizada");

            Util.limpar(jTxtEmail, jTxtNome, jTxtIdvendedor, jTxtSalario, jCboGenero,
                    jTxtTelefone, jFmtCpf);
        } else {
            Util.mostrar("exclusao cancelada");
        }

    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnConfimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfimActionPerformed

         JvlVendedor jvlVendedor = viewBean();
        Jvl_VendedorDAO jvl_VendedorDAO = new Jvl_VendedorDAO();
        if (incluindo == true) {
            jvl_VendedorDAO.insert(jvlVendedor);
            Util.mostrar("Usuário salvo com sucesso !");
        }else if(incluindo == false){
        jvl_VendedorDAO.update(jvlVendedor);
        Util.mostrar("Alterado com Sucesso !");
        }
        // TODO add your handling code here:
        Util.habilitar(false, jTxtEmail, jTxtNome, jTxtIdvendedor, jTxtSalario, jCboGenero,
                jTxtTelefone, jFmtCpf, jBtnCancelar, jBtnConfim);
        Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnPesquisar, jBtnIncluir);
        Util.limpar(jTxtEmail, jTxtNome, jTxtIdvendedor, jTxtSalario, jCboGenero,
                jTxtTelefone, jFmtCpf);
    }//GEN-LAST:event_jBtnConfimActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(false, jTxtEmail, jTxtNome, jTxtIdvendedor, jTxtSalario, jCboGenero,
                jTxtTelefone, jFmtCpf, jBtnCancelar, jBtnConfim);
        Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnPesquisar, jBtnIncluir);
        Util.limpar(jTxtEmail, jTxtNome, jTxtIdvendedor, jTxtSalario, jCboGenero,
                jTxtTelefone, jFmtCpf);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        // TODO add your handling code here:
        JDlgVendedorPesquisar jDlgVendedorPesquisar = new JDlgVendedorPesquisar(null, true);
        jDlgVendedorPesquisar.setTelaAnterior(this);
        jDlgVendedorPesquisar.setVisible(true);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        incluindo = false;

        Util.habilitar(true, jTxtEmail, jTxtNome, jTxtIdvendedor, jTxtSalario, jCboGenero,
                jTxtTelefone, jFmtCpf, jBtnCancelar, jBtnConfim);
        Util.habilitar(false, jBtnAlterar, jBtnExcluir, jBtnPesquisar, jBtnIncluir);

        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgVendedor dialog = new JDlgVendedor(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> jCboGenero;
    private javax.swing.JFormattedTextField jFmtCpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtIdvendedor;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtSalario;
    private javax.swing.JTextField jTxtTelefone;
    // End of variables declaration//GEN-END:variables
}
