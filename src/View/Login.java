/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.LoginController;
import Model.DAO.Banco;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author mtsfs
 */
public class Login extends javax.swing.JFrame {
    
    private final LoginController controller;

    /**
     * Creates new form Login
     * @throws java.text.ParseException
     */
    public Login() throws ParseException {
        initComponents();
        controller = new LoginController(this);
        Banco.inicia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonLogin = new javax.swing.JButton();
        CampoSenha = new javax.swing.JPasswordField();
        CampoUsuario = new javax.swing.JTextField();
        TextSenha = new javax.swing.JLabel();
        TextUsuario = new javax.swing.JLabel();
        TextLogin = new javax.swing.JLabel();
        LogoMapleLogin = new javax.swing.JLabel();
        TextMapleLogin = new javax.swing.JLabel();
        PainelLogin = new javax.swing.JLabel();
        BackgroundLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 506));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonLogin.setBackground(new java.awt.Color(164, 0, 0));
        ButtonLogin.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        ButtonLogin.setForeground(new java.awt.Color(255, 255, 255));
        ButtonLogin.setText("Entrar");
        ButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 100, 30));

        CampoSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CampoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(CampoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 160, -1));

        CampoUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CampoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(CampoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 160, -1));

        TextSenha.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        TextSenha.setForeground(new java.awt.Color(255, 255, 255));
        TextSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextSenha.setText("Senha");
        getContentPane().add(TextSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 60, 20));

        TextUsuario.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        TextUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TextUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextUsuario.setText("Usuário");
        getContentPane().add(TextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 60, 20));

        TextLogin.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        TextLogin.setForeground(new java.awt.Color(255, 255, 255));
        TextLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextLogin.setText("Login");
        getContentPane().add(TextLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 280, 20));

        LogoMapleLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icons/logo-sem-fundo.png"))); // NOI18N
        getContentPane().add(LogoMapleLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 110, -1, 90));

        TextMapleLogin.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        TextMapleLogin.setForeground(new java.awt.Color(255, 255, 255));
        TextMapleLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextMapleLogin.setText("Maple System Resources");
        getContentPane().add(TextMapleLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, 50));

        PainelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PainelLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icons/painel-login.png"))); // NOI18N
        getContentPane().add(PainelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 506));

        BackgroundLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/background-login.jpg"))); // NOI18N
        getContentPane().add(BackgroundLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 506));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoUsuarioActionPerformed

    private void ButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoginActionPerformed
        // TODO add your handling code here:
        this.controller.entrarNoSistema();
    }//GEN-LAST:event_ButtonLoginActionPerformed

    private void CampoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundLogin;
    private javax.swing.JButton ButtonLogin;
    private javax.swing.JPasswordField CampoSenha;
    private javax.swing.JTextField CampoUsuario;
    private javax.swing.JLabel LogoMapleLogin;
    private javax.swing.JLabel PainelLogin;
    private javax.swing.JLabel TextLogin;
    private javax.swing.JLabel TextMapleLogin;
    private javax.swing.JLabel TextSenha;
    private javax.swing.JLabel TextUsuario;
    // End of variables declaration//GEN-END:variables

    public JPasswordField getCampoSenha() {
        return CampoSenha;
    }

    public void setCampoSenha(JPasswordField CampoSenha) {
        this.CampoSenha = CampoSenha;
    }

    public JTextField getCampoUsuario() {
        return CampoUsuario;
    }

    public void setCampoUsuario(JTextField CampoUsuario) {
        this.CampoUsuario = CampoUsuario;
    }
    
    public void exibeMensagem(String mensagem) { 
        JOptionPane.showMessageDialog(null, mensagem);
    }
}