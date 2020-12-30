
package View;

import Controller.AssociadoControl;
import Controller.LoginControl;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends javax.swing.JFrame {
    
    public LoginView() 
    {
        initComponents();
        ImageIcon icon = new ImageIcon("C:\\Users\\felip\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoBiblioteca\\midia");
        JLabel iconeUtf = new JLabel(icon);
        label_Aviso.setVisible(false);
    }

    

    public void exibirCapsLock()
    {
        label_Aviso.setText("CAPS LOCK ATIVADO!");
        label_Aviso.setVisible(true);
    }
    
    public void ocultarCapsLock()
    {
        label_Aviso.setVisible(false);
    }
    
    public void exibirLoginSenhaIncorretos()
    {
        label_Aviso.setText("Login ou senha incorretos!");
        label_Aviso.setVisible(true);
    }
    
    public void exibirLoginVazio()
    {
        label_Aviso.setText("Campo Login Vazio!");
        label_Aviso.setVisible(true);
    }
    
    public void exibirSenhaVazio()
    {
        label_Aviso.setText("Campo Senha Vazio!");
        label_Aviso.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        pnLogin = new javax.swing.JPanel();
        pnTitulo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbLogo = new javax.swing.JLabel();
        pnSul = new javax.swing.JPanel();
        btCadastrar = new javax.swing.JButton();
        btEntrarLogin = new javax.swing.JButton();
        btSairLogin = new javax.swing.JButton();
        pnCentro = new javax.swing.JPanel();
        tLogin = new javax.swing.JTextField();
        label_login = new javax.swing.JLabel();
        label_senha = new javax.swing.JLabel();
        pSenha = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        label_Aviso = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login - Biblioteca");
        setBackground(new java.awt.Color(255, 51, 51));

        pnLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnLogin.setLayout(new java.awt.BorderLayout());

        pnTitulo.setBackground(new java.awt.Color(255, 255, 255));

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lbTitulo.setText("BIBLIOTECA");

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Midia/logoUtf.jpg"))); // NOI18N

        javax.swing.GroupLayout pnTituloLayout = new javax.swing.GroupLayout(pnTitulo);
        pnTitulo.setLayout(pnTituloLayout);
        pnTituloLayout.setHorizontalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbLogo)
                .addContainerGap())
        );
        pnTituloLayout.setVerticalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbLogo)
                    .addComponent(lbTitulo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnLogin.add(pnTitulo, java.awt.BorderLayout.NORTH);

        pnSul.setBackground(new java.awt.Color(255, 255, 255));

        btCadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btCadastrar.setText("Cadastre-se!");
        btCadastrar.setDefaultCapable(false);
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btEntrarLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btEntrarLogin.setText("Entrar");
        btEntrarLogin.setEnabled(false);
        btEntrarLogin.setFocusPainted(false);
        btEntrarLogin.setFocusable(false);
        btEntrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarLoginActionPerformed(evt);
            }
        });

        btSairLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSairLogin.setText("Sair");
        btSairLogin.setDefaultCapable(false);
        btSairLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnSulLayout = new javax.swing.GroupLayout(pnSul);
        pnSul.setLayout(pnSulLayout);
        pnSulLayout.setHorizontalGroup(
            pnSulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btSairLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCadastrar)
                .addGap(18, 18, 18)
                .addComponent(btEntrarLogin)
                .addContainerGap())
        );
        pnSulLayout.setVerticalGroup(
            pnSulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSulLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnSulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btEntrarLogin)
                    .addComponent(btSairLogin))
                .addContainerGap())
        );

        pnLogin.add(pnSul, java.awt.BorderLayout.SOUTH);

        pnCentro.setBackground(new java.awt.Color(255, 255, 255));

        tLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tLoginFocusGained(evt);
            }
        });
        tLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tLoginActionPerformed(evt);
            }
        });
        tLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tLoginKeyReleased(evt);
            }
        });

        label_login.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_login.setText("Login:");

        label_senha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_senha.setText("Senha:");

        pSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pSenhaFocusGained(evt);
            }
        });
        pSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pSenhaKeyReleased(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 50));

        label_Aviso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_Aviso.setForeground(new java.awt.Color(255, 0, 0));
        label_Aviso.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_Aviso.setText("Login ou senha incorretos!");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 50));

        javax.swing.GroupLayout pnCentroLayout = new javax.swing.GroupLayout(pnCentro);
        pnCentro.setLayout(pnCentroLayout);
        pnCentroLayout.setHorizontalGroup(
            pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCentroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2))
                .addContainerGap())
            .addGroup(pnCentroLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Aviso, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCentroLayout.createSequentialGroup()
                        .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_login, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_senha, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tLogin)
                            .addComponent(pSenha))))
                .addGap(119, 119, 119))
        );
        pnCentroLayout.setVerticalGroup(
            pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCentroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_login)
                    .addComponent(tLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_senha)
                    .addComponent(pSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_Aviso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnLogin.add(pnCentro, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEntrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarLoginActionPerformed
        AssociadoControl associadoControl = new AssociadoControl();                   //Instancia Controller de Associado
        associadoControl.efetuarLogin(this, tLogin.getText(), pSenha.getPassword());  //Executa "efetuarLogin" do Controller de Associado  
    }//GEN-LAST:event_btEntrarLoginActionPerformed

    
    private void btSairLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairLoginActionPerformed
        dispose();
    }//GEN-LAST:event_btSairLoginActionPerformed

    private void pSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pSenhaFocusGained
        LoginControl loginControl = new LoginControl();
        loginControl.verificarCapsLock(this);
        loginControl.verificarCamposVazios(this);
    }//GEN-LAST:event_pSenhaFocusGained

    private void tLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tLoginFocusGained
        LoginControl loginControl = new LoginControl();
        loginControl.verificarCapsLock(this);
        loginControl.verificarCamposVazios(this);
    }//GEN-LAST:event_tLoginFocusGained

    private void tLoginKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tLoginKeyReleased
        LoginControl loginControl = new LoginControl();
        loginControl.verificarCapsLock(this);
        loginControl.verificarCamposVazios(this);
    }//GEN-LAST:event_tLoginKeyReleased

    private void pSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pSenhaKeyReleased
        LoginControl loginControl = new LoginControl();
        loginControl.verificarCapsLock(this);
        loginControl.verificarCamposVazios(this);
    }//GEN-LAST:event_pSenhaKeyReleased

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        LoginControl loginControl = new LoginControl();
        loginControl.iniciarCadastro(this);
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void tLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tLoginActionPerformed

    public JLabel getLabelAviso() 
    {
        return label_Aviso;
    }

    public JPasswordField getpSenha() 
    {
        return pSenha;
    }

    public JTextField gettLogin() 
    {
        return tLogin;
    }

    public JButton getbEntrarLogin()
    {
        return btEntrarLogin;
    }
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                             
                LoginView ip = new LoginView();
                ip.setLocationRelativeTo(null);
                ip.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btEntrarLogin;
    private javax.swing.JButton btSairLogin;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label_Aviso;
    private javax.swing.JLabel label_login;
    private javax.swing.JLabel label_senha;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPasswordField pSenha;
    private javax.swing.JPanel pnCentro;
    private javax.swing.JPanel pnLogin;
    private javax.swing.JPanel pnSul;
    private javax.swing.JPanel pnTitulo;
    private javax.swing.JTextField tLogin;
    // End of variables declaration//GEN-END:variables

    
}
