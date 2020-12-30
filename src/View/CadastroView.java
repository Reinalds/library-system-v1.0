package View;

import Controller.AssociadoControl;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class CadastroView extends javax.swing.JFrame {

    public CadastroView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnCabecalho = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        stPreto = new javax.swing.JSeparator();
        stAmarelo = new javax.swing.JSeparator();
        pnCadastro = new javax.swing.JPanel();
        lbLogin = new javax.swing.JLabel();
        txLogin = new javax.swing.JTextField();
        lbSenha = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        txNome = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        txEmail = new javax.swing.JTextField();
        txTelefone = new javax.swing.JTextField();
        txTelefone = new javax.swing.JFormattedTextField(setMascara("(##)#####-####"));
        lbTelefone = new javax.swing.JLabel();
        txSenha = new javax.swing.JPasswordField();
        btCadastrar = new javax.swing.JButton();
        lbAviso = new javax.swing.JLabel();
        lbAviso.setVisible(false);
        lbConfirmaSenha = new javax.swing.JLabel();
        txConfirmaSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Biblioteca - Cadastrar");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        pnCabecalho.setBackground(new java.awt.Color(255, 255, 255));

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Midia/logoUtf.jpg"))); // NOI18N

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lbTitulo.setText("BIBLIOTECA");

        stPreto.setBackground(new java.awt.Color(0, 0, 0));
        stPreto.setForeground(new java.awt.Color(0, 0, 0));
        stPreto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));

        stAmarelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 10));

        javax.swing.GroupLayout pnCabecalhoLayout = new javax.swing.GroupLayout(pnCabecalho);
        pnCabecalho.setLayout(pnCabecalhoLayout);
        pnCabecalhoLayout.setHorizontalGroup(
            pnCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(stPreto, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCabecalhoLayout.createSequentialGroup()
                        .addComponent(lbTitulo)
                        .addGap(65, 65, 65)
                        .addComponent(lbLogo))
                    .addComponent(stAmarelo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnCabecalhoLayout.setVerticalGroup(
            pnCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitulo)
                    .addComponent(lbLogo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stPreto, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stAmarelo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnCabecalho, java.awt.BorderLayout.NORTH);

        pnCadastro.setBackground(new java.awt.Color(255, 255, 255));
        pnCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        lbLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbLogin.setText("Login:");

        txLogin.setToolTipText("");
        txLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txLoginFocusLost(evt);
            }
        });
        txLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txLoginKeyReleased(evt);
            }
        });

        lbSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbSenha.setText("Senha:");

        lbNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNome.setText("Nome:");

        txNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txNomeKeyReleased(evt);
            }
        });

        lbEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbEmail.setText("Email:");

        txEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txEmailKeyReleased(evt);
            }
        });

        txTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txTelefoneKeyReleased(evt);
            }
        });

        lbTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbTelefone.setText("Telefone:");

        txSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txSenhaKeyReleased(evt);
            }
        });

        btCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.setEnabled(false);
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        lbAviso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbAviso.setForeground(new java.awt.Color(255, 0, 0));
        lbAviso.setText("Login já Cadastrado!");

        lbConfirmaSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbConfirmaSenha.setText("Repita a Senha:");

        txConfirmaSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txConfirmaSenhaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnCadastroLayout = new javax.swing.GroupLayout(pnCadastro);
        pnCadastro.setLayout(pnCadastroLayout);
        pnCadastroLayout.setHorizontalGroup(
            pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCadastroLayout.createSequentialGroup()
                        .addComponent(lbTelefone)
                        .addGap(18, 18, 18)
                        .addComponent(txTelefone))
                    .addGroup(pnCadastroLayout.createSequentialGroup()
                        .addComponent(lbEmail)
                        .addGap(30, 30, 30)
                        .addComponent(txEmail))
                    .addGroup(pnCadastroLayout.createSequentialGroup()
                        .addComponent(lbAviso, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btCadastrar))
                    .addGroup(pnCadastroLayout.createSequentialGroup()
                        .addComponent(lbConfirmaSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txConfirmaSenha))
                    .addGroup(pnCadastroLayout.createSequentialGroup()
                        .addGroup(pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCadastroLayout.createSequentialGroup()
                                .addComponent(lbNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(pnCadastroLayout.createSequentialGroup()
                                .addComponent(lbSenha)
                                .addGap(8, 8, 8)))
                        .addGroup(pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txSenha)
                            .addComponent(txNome)))
                    .addGroup(pnCadastroLayout.createSequentialGroup()
                        .addComponent(lbLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txLogin)))
                .addContainerGap())
        );
        pnCadastroLayout.setVerticalGroup(
            pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLogin)
                    .addComponent(txLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSenha)
                    .addComponent(txSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbConfirmaSenha)
                    .addComponent(txConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefone)
                    .addComponent(txTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnCadastro, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        LoginView lV = new LoginView();
        lV.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        AssociadoControl controller = new AssociadoControl();
        controller.cadastrarAssociado(this, txNome.getText(), txTelefone.getText(), txEmail.getText(), txLogin.getText(), txSenha.getPassword(), txConfirmaSenha.getPassword(), this);
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void txLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txLoginFocusLost
        AssociadoControl controller = new AssociadoControl();
        controller.verificarAssociadoCadastrado(this, txLogin.getText());
    }//GEN-LAST:event_txLoginFocusLost

    private void txLoginKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txLoginKeyReleased
        AssociadoControl controller = new AssociadoControl();
        controller.verificarCamposVazios(this);
    }//GEN-LAST:event_txLoginKeyReleased

    private void txNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNomeKeyReleased
        AssociadoControl controller = new AssociadoControl();
        controller.verificarCamposVazios(this);
    }//GEN-LAST:event_txNomeKeyReleased

    private void txSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txSenhaKeyReleased
        AssociadoControl controller = new AssociadoControl();
        controller.verificarCamposVazios(this);
    }//GEN-LAST:event_txSenhaKeyReleased

    private void txConfirmaSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txConfirmaSenhaKeyReleased
        AssociadoControl controller = new AssociadoControl();
        controller.verificarCamposVazios(this);
    }//GEN-LAST:event_txConfirmaSenhaKeyReleased

    private void txEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txEmailKeyReleased
        AssociadoControl controller = new AssociadoControl();
        controller.verificarCamposVazios(this);
    }//GEN-LAST:event_txEmailKeyReleased

    private void txTelefoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txTelefoneKeyReleased
        AssociadoControl controller = new AssociadoControl();
        controller.verificarCamposVazios(this);
    }//GEN-LAST:event_txTelefoneKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JLabel lbAviso;
    private javax.swing.JLabel lbConfirmaSenha;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pnCabecalho;
    private javax.swing.JPanel pnCadastro;
    private javax.swing.JSeparator stAmarelo;
    private javax.swing.JSeparator stPreto;
    private javax.swing.JPasswordField txConfirmaSenha;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextField txLogin;
    private javax.swing.JTextField txNome;
    private javax.swing.JPasswordField txSenha;
    private javax.swing.JTextField txTelefone;
    // End of variables declaration//GEN-END:variables

    public void ocultarAviso() {
        lbAviso.setVisible(false);
    }

    public void mostrarAviso(String aviso) {
        lbAviso.setText(aviso);
        lbAviso.setVisible(true);
    }
    
    public void informarSucesso()
    {
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public MaskFormatter setMascara(String masc)
    {
        MaskFormatter mascTmp = new MaskFormatter();
        try{
            mascTmp.setMask(masc);             //Atribui a mascara
            mascTmp.setPlaceholderCharacter(' '); //Caracter para preenchimento 
        }
        catch (ParseException ex) {}
        
        return mascTmp;
    }

    public JPasswordField getTxConfirmaSenha() {
        return txConfirmaSenha;
    }

    public JTextField getTxEmail() {
        return txEmail;
    }

    public JTextField getTxLogin() {
        return txLogin;
    }

    public JTextField getTxNome() {
        return txNome;
    }

    public JPasswordField getTxSenha() {
        return txSenha;
    }

    public JTextField getTxTelefone() {
        return txTelefone;
    }

    public JButton getBtCadastrar() {
        return btCadastrar;
    }
    
    
}
