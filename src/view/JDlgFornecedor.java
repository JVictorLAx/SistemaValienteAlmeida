/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import bean.JvlFornecedor;
import dao.Jvl_FornecedorDAO;
import javax.swing.JOptionPane;
import tools.Util;

/**
 *
 * @author u06296329105
 */
public class JDlgFornecedor extends javax.swing.JDialog {

    /**
     * Creates new form JDlgUsuarios
     */
    boolean incluindo;

    public JDlgFornecedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Cadastro Fornecedor");
        setLocationRelativeTo(null);
        Util.habilitar(false,
                jTxtCodigo, jTxtRazao, jTxtEmail, jTxtCnpj, jTxtDataCadastro, jTxtTelefone,
                jTxtCEP, jTxtCidade, jTxtCodigo, jTxtEstado, jTxtPais, jTxtEndereco, jTxtDescricao, jTxtNome, jTxtProdutosServicos,
                jTxtCategoria, jBtnCancelar, jBtnConfim
        );
    }

    public JvlFornecedor viewBean() {
        JvlFornecedor jvlFornecedor = new JvlFornecedor();

        jvlFornecedor.setJvlIdFornecedor(Util.srToInt(jTxtCodigo.getText()));
        jvlFornecedor.setJvlRazaoSocial(jTxtRazao.getText());
        jvlFornecedor.setJvlEmail(jTxtEmail.getText());
        jvlFornecedor.setJvlCnpj(jTxtCnpj.getText());
        jvlFornecedor.setJvlDataCadastro(null);
        jvlFornecedor.setJvlTelefone(jTxtTelefone.getText());
        jvlFornecedor.setJvlCep(jTxtCEP.getText());
        jvlFornecedor.setJvlCidade(jTxtCidade.getText());
        jvlFornecedor.setJvlEstado(jTxtEstado.getText());
        jvlFornecedor.setJvlPais(jTxtPais.getText());
        jvlFornecedor.setJvlEndereco(jTxtEndereco.getText());
        jvlFornecedor.setJvlDescricao(jTxtDescricao.getText());
        jvlFornecedor.setJvlNome(jTxtNome.getText());
        jvlFornecedor.setJvlProdutoServicos(jTxtProdutosServicos.getText());
        jvlFornecedor.setJvlCategoria(jTxtCategoria.getText());

        return jvlFornecedor;
    }

    public JvlFornecedor beanView(JvlFornecedor jvlFornecedor) {
        jTxtCodigo.setText(Util.intToStg(jvlFornecedor.getJvlIdFornecedor()));
        jTxtRazao.setText(jvlFornecedor.getJvlRazaoSocial());
        jTxtEmail.setText(jvlFornecedor.getJvlEmail());
        jTxtCnpj.setText(jvlFornecedor.getJvlCnpj());
        jTxtDataCadastro.setText(null);
        jTxtTelefone.setText(jvlFornecedor.getJvlTelefone());
        jTxtCEP.setText(jvlFornecedor.getJvlCep());
        jTxtCidade.setText(jvlFornecedor.getJvlCidade());
        jTxtEstado.setText(jvlFornecedor.getJvlEstado());
        jTxtPais.setText(jvlFornecedor.getJvlPais());
        jTxtEndereco.setText(jvlFornecedor.getJvlEndereco());
        jTxtDescricao.setText(jvlFornecedor.getJvlDescricao());
        jTxtNome.setText(jvlFornecedor.getJvlNome());
        jTxtProdutosServicos.setText(jvlFornecedor.getJvlProdutoServicos());
        jTxtCategoria.setText(jvlFornecedor.getJvlCategoria());

        return jvlFornecedor;
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
        jTxtRazao = new javax.swing.JTextField();
        jTxtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtDataCadastro = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtCodigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfim = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jTxtCnpj = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTxtTelefone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTxtEndereco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTxtCidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTxtEstado = new javax.swing.JTextField();
        jTxtCEP = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTxtPais = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxtCategoria = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtDescricao = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTxtProdutosServicos = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Razão Social");

        jTxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEmailActionPerformed(evt);
            }
        });

        jLabel2.setText("Email");

        jLabel4.setText("Data de Cadastro");

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

        jTxtCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCnpjActionPerformed(evt);
            }
        });

        jLabel8.setText("CNPJ");

        jTxtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTelefoneActionPerformed(evt);
            }
        });

        jLabel9.setText("Telefone");

        jTxtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEnderecoActionPerformed(evt);
            }
        });

        jLabel10.setText("Endereço");

        jLabel11.setText("Cidade");

        jLabel12.setText("Estado");

        jTxtCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCEPActionPerformed(evt);
            }
        });

        jLabel13.setText("CEP");

        jLabel14.setText("Pais");

        jLabel5.setText("Categoria");

        jLabel6.setText("Descrição");

        jTxtDescricao.setColumns(20);
        jTxtDescricao.setRows(5);
        jScrollPane1.setViewportView(jTxtDescricao);

        jLabel15.setText("Produtos e serviços");

        jTxtProdutosServicos.setColumns(20);
        jTxtProdutosServicos.setRows(5);
        jScrollPane2.setViewportView(jTxtProdutosServicos);

        jLabel16.setText("Nome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jTxtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(117, 117, 117)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTxtRazao, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jTxtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jTxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel12)
                                                            .addComponent(jLabel15))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jTxtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel13))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel14)
                                                            .addComponent(jTxtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(160, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
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
                .addComponent(jBtnPesquisar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtRazao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnConfim, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnPesquisar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEmailActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodigoActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(false,
                jTxtCodigo, jTxtRazao, jTxtEmail, jTxtCnpj, jTxtDataCadastro, jTxtTelefone,
                jTxtCEP, jTxtCidade, jTxtCodigo, jTxtEstado, jTxtPais, jTxtEndereco, jTxtDescricao, jTxtNome, jTxtProdutosServicos,
                jTxtCategoria, jBtnCancelar, jBtnConfim
        );
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnPesquisar, jBtnExcluir);
        Util.limpar(jTxtCodigo, jTxtRazao, jTxtEmail, jTxtCnpj, jTxtDataCadastro, jTxtTelefone,
                jTxtCEP, jTxtCidade, jTxtCodigo, jTxtEstado, jTxtPais, jTxtEndereco, jTxtDescricao, jTxtNome, jTxtProdutosServicos, jTxtCategoria);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
        incluindo = true;

        Util.habilitar(true,
                jTxtCodigo, jTxtRazao, jTxtEmail, jTxtCnpj, jTxtDataCadastro, jTxtTelefone,
                jTxtCEP, jTxtCidade, jTxtCodigo, jTxtEstado, jTxtPais, jTxtEndereco, jTxtDescricao, jTxtNome, jTxtProdutosServicos,
                jTxtCategoria, jBtnCancelar, jBtnConfim
        );
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnPesquisar, jBtnExcluir);

    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnConfimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfimActionPerformed
        // TODO add your handling code here:

        JvlFornecedor jvlFornecedor = viewBean();
        Jvl_FornecedorDAO jvl_FornecedorDAO = new Jvl_FornecedorDAO();
        if (incluindo == true) {
            jvl_FornecedorDAO.insert(jvlFornecedor);
            Util.mostrar("Usuário salvo com sucesso !");
        } else if (incluindo == false) {
            jvl_FornecedorDAO.update(jvlFornecedor);
            Util.mostrar("Te Alterado com Sucesso !");
        }

        Util.habilitar(false,
                jTxtCodigo, jTxtRazao, jTxtEmail, jTxtCnpj, jTxtDataCadastro, jTxtTelefone,
                jTxtCEP, jTxtCidade, jTxtCodigo, jTxtEstado, jTxtPais, jTxtEndereco, jTxtDescricao, jTxtNome, jTxtProdutosServicos,
                jTxtCategoria, jBtnCancelar, jBtnConfim
        );
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnPesquisar, jBtnExcluir);
        Util.limpar(jTxtCodigo, jTxtRazao, jTxtEmail, jTxtCnpj, jTxtDataCadastro, jTxtTelefone,
                jTxtCEP, jTxtCidade, jTxtCodigo, jTxtEstado, jTxtPais, jTxtEndereco, jTxtDescricao, jTxtNome, jTxtProdutosServicos, jTxtCategoria);
    }//GEN-LAST:event_jBtnConfimActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:
       if (Util.perguntar("você deseja excluir?")) {
        Jvl_FornecedorDAO jvl_FornecedorDAO = new Jvl_FornecedorDAO();
            jvl_FornecedorDAO.delete(viewBean());
            Util.mostrar("Exclusao realizada");
             Util.limpar(jTxtCodigo, jTxtRazao, jTxtEmail, jTxtCnpj, jTxtDataCadastro, jTxtTelefone,
                jTxtCEP, jTxtCidade, jTxtCodigo, jTxtEstado, jTxtPais, jTxtEndereco, jTxtDescricao, jTxtNome, jTxtProdutosServicos, jTxtCategoria);
        } else {
            Util.mostrar("exclusao cancelada");
        }


    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        // TODO add your handling code here:
        JDlgFornecedorPesquisar jDlgFornecedorPesquisar = new JDlgFornecedorPesquisar(null, true);
        jDlgFornecedorPesquisar.setTelaAnterior(this);
        jDlgFornecedorPesquisar.setVisible(true);

    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jTxtCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCnpjActionPerformed

    private void jTxtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTelefoneActionPerformed

    private void jTxtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEnderecoActionPerformed

    private void jTxtCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCEPActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
        incluindo = false;
        Util.habilitar(true,
                jTxtCodigo, jTxtRazao, jTxtEmail, jTxtCnpj, jTxtDataCadastro, jTxtTelefone,
                jTxtCEP, jTxtCidade, jTxtCodigo, jTxtEstado, jTxtPais, jTxtEndereco, jTxtDescricao, jTxtNome, jTxtProdutosServicos,
                jTxtCategoria, jBtnCancelar, jBtnConfim
        );
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnPesquisar, jBtnExcluir);
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
            java.util.logging.Logger.getLogger(JDlgFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgFornecedor dialog = new JDlgFornecedor(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTxtCEP;
    private javax.swing.JTextField jTxtCategoria;
    private javax.swing.JTextField jTxtCidade;
    private javax.swing.JTextField jTxtCnpj;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JFormattedTextField jTxtDataCadastro;
    private javax.swing.JTextArea jTxtDescricao;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtEndereco;
    private javax.swing.JTextField jTxtEstado;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtPais;
    private javax.swing.JTextArea jTxtProdutosServicos;
    private javax.swing.JTextField jTxtRazao;
    private javax.swing.JTextField jTxtTelefone;
    // End of variables declaration//GEN-END:variables
}
