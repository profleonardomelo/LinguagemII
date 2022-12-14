package JavaSwing_04.ExemplosCompletos.CadastroDeConta;

import javax.swing.JOptionPane;

public class TelaCadastroConta extends javax.swing.JFrame {

    public TelaCadastroConta() {
        initComponents();

        //Iniciar o JFrame no meio da tela.
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPossuiConta = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        lblNomeDoCliente = new javax.swing.JLabel();
        lblNumeroDaConta = new javax.swing.JLabel();
        txtNomeDoCliente = new javax.swing.JTextField();
        txtNumeroDaConta = new javax.swing.JTextField();
        lblSaldoInicialDaConta = new javax.swing.JLabel();
        txtSaldoInicialDaConta = new javax.swing.JTextField();
        lblTipoDeConta = new javax.swing.JLabel();
        cmbTipoDeConta = new javax.swing.JComboBox<>();
        lblTipoDeConta1 = new javax.swing.JLabel();
        rdbSim = new javax.swing.JRadioButton();
        rdbNao = new javax.swing.JRadioButton();
        lblSolicitarCartao = new javax.swing.JLabel();
        chbDebito = new javax.swing.JCheckBox();
        chbCredito = new javax.swing.JCheckBox();
        lblObservacao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaObservacao = new javax.swing.JTextArea();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Bancário IFBA");
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Cadastro de Conta");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblNomeDoCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNomeDoCliente.setText("Nome do Cliente:");

        lblNumeroDaConta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNumeroDaConta.setText("Número da Conta:");

        txtNomeDoCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNomeDoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeDoClienteKeyTyped(evt);
            }
        });

        txtNumeroDaConta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNumeroDaConta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroDaContaKeyTyped(evt);
            }
        });

        lblSaldoInicialDaConta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSaldoInicialDaConta.setText("Saldo Inicial da Conta:");

        txtSaldoInicialDaConta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSaldoInicialDaConta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSaldoInicialDaContaKeyTyped(evt);
            }
        });

        lblTipoDeConta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTipoDeConta.setText("Tipo de Conta:");

        cmbTipoDeConta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbTipoDeConta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Corrente", "Poupança" }));

        lblTipoDeConta1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTipoDeConta1.setText("Já Possui Conta Neste Banco?");

        bgPossuiConta.add(rdbSim);
        rdbSim.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdbSim.setText("Sim");
        rdbSim.setActionCommand("SIM");

        bgPossuiConta.add(rdbNao);
        rdbNao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdbNao.setText("Não");
        rdbNao.setActionCommand("NÃO");

        lblSolicitarCartao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSolicitarCartao.setText("Solicitar Cartão:");

        chbDebito.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chbDebito.setText("Débito");

        chbCredito.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chbCredito.setText("Crédito");

        lblObservacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblObservacao.setText("Observação:");

        txaObservacao.setColumns(20);
        txaObservacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txaObservacao.setRows(5);
        jScrollPane1.setViewportView(txaObservacao);

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNumeroDaConta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumeroDaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNomeDoCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeDoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTipoDeConta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbTipoDeConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTipoDeConta1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdbSim, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdbNao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSolicitarCartao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chbDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chbCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblObservacao)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane1))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblSaldoInicialDaConta)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtSaldoInicialDaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitulo)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeDoCliente)
                    .addComponent(txtNomeDoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroDaConta)
                    .addComponent(txtNumeroDaConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldoInicialDaConta)
                    .addComponent(txtSaldoInicialDaConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoDeConta)
                    .addComponent(cmbTipoDeConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoDeConta1)
                    .addComponent(rdbSim)
                    .addComponent(rdbNao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSolicitarCartao)
                    .addComponent(chbDebito)
                    .addComponent(chbCredito))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblObservacao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        
        String nomeDoCliente = txtNomeDoCliente.getText();
        
        String numeroDaConta = txtNumeroDaConta.getText();
        
        String saldoInicialDaConta = txtSaldoInicialDaConta.getText();
        
        String tipoDeConta = cmbTipoDeConta.getSelectedItem().toString();
        
        String jaPossuiConta = bgPossuiConta.getSelection().getActionCommand();
        
        String solicitarCartao = "";
        
        if(chbDebito.isSelected())
        {
            solicitarCartao += "-Débito ";
        }
        
        if(chbCredito.isSelected())
        {
            solicitarCartao += "-Crédito ";
        }
        
        String observacao = txaObservacao.getText();
        
        String mensagem = "Nome do Cliente: " + nomeDoCliente +
                        "\nNúmero da Conta: " + numeroDaConta +
                        "\nSaldo Inicial da Conta: " + saldoInicialDaConta +
                        "\nTipo de Conta: " + tipoDeConta +
                        "\nJá Possui Conta Neste Banco? " + jaPossuiConta +
                        "\nSolicitar Cartão: " + solicitarCartao +
                        "\nObservação: " + observacao;
        
        JOptionPane.showMessageDialog(this, mensagem);
                
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtNomeDoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeDoClienteKeyTyped
        PermitirDigitarSomenteLetrasEEspaco(evt);
    }//GEN-LAST:event_txtNomeDoClienteKeyTyped

    private void txtNumeroDaContaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroDaContaKeyTyped
        PermitirDigitarSomenteNumeros(evt);
    }//GEN-LAST:event_txtNumeroDaContaKeyTyped

    private void txtSaldoInicialDaContaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaldoInicialDaContaKeyTyped
        PermitirDigitarSomenteNumerosEVirgula(evt);
    }//GEN-LAST:event_txtSaldoInicialDaContaKeyTyped

    private void PermitirDigitarSomenteNumeros(java.awt.event.KeyEvent evt)
    {
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c))
        {
            evt.consume();
        }
    }
    
    private void PermitirDigitarSomenteLetrasEEspaco(java.awt.event.KeyEvent evt)
    {
        char c = evt.getKeyChar();
        
        if(!Character.isAlphabetic(c) && c != ' ')
        {
            evt.consume();
        }
    }
    
    private void PermitirDigitarSomenteNumerosEVirgula(java.awt.event.KeyEvent evt)
    {
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c) && c != ',')
        {
            evt.consume();
        }
    }
    
    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgPossuiConta;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JCheckBox chbCredito;
    private javax.swing.JCheckBox chbDebito;
    private javax.swing.JComboBox<String> cmbTipoDeConta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNomeDoCliente;
    private javax.swing.JLabel lblNumeroDaConta;
    private javax.swing.JLabel lblObservacao;
    private javax.swing.JLabel lblSaldoInicialDaConta;
    private javax.swing.JLabel lblSolicitarCartao;
    private javax.swing.JLabel lblTipoDeConta;
    private javax.swing.JLabel lblTipoDeConta1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rdbNao;
    private javax.swing.JRadioButton rdbSim;
    private javax.swing.JTextArea txaObservacao;
    private javax.swing.JTextField txtNomeDoCliente;
    private javax.swing.JTextField txtNumeroDaConta;
    private javax.swing.JTextField txtSaldoInicialDaConta;
    // End of variables declaration//GEN-END:variables
}
