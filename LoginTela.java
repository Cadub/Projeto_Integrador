/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Jogo;

import javax.swing.JOptionPane;

/**
 *
 * @author cadub
 */
public class LoginTela extends javax.swing.JFrame {

    /**
     * Creates new form LoginTela
     */
    public LoginTela() {
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

        BotaoLogin = new javax.swing.JButton();
        CaixaDeTextoEmail = new javax.swing.JTextField();
        CaixaDeTextoSenha = new javax.swing.JPasswordField();
        BotãoCadastro = new javax.swing.JButton();
        BotaoEsqueceuSenha = new javax.swing.JButton();
        BotaoSair = new javax.swing.JButton();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotaoLogin.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\Downloads\\BotãoLogin.png")); // NOI18N
        BotaoLogin.setBorder(null);
        BotaoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLoginActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 590, 360, 80));

        CaixaDeTextoEmail.setBackground(new java.awt.Color(95, 84, 242));
        CaixaDeTextoEmail.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CaixaDeTextoEmail.setForeground(new java.awt.Color(255, 255, 255));
        CaixaDeTextoEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        CaixaDeTextoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixaDeTextoEmailActionPerformed(evt);
            }
        });
        getContentPane().add(CaixaDeTextoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 580, 60));

        CaixaDeTextoSenha.setBackground(new java.awt.Color(95, 84, 242));
        CaixaDeTextoSenha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CaixaDeTextoSenha.setForeground(new java.awt.Color(255, 255, 255));
        CaixaDeTextoSenha.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        getContentPane().add(CaixaDeTextoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 580, 60));

        BotãoCadastro.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\Downloads\\BotaoCadastrar.png")); // NOI18N
        BotãoCadastro.setBorder(null);
        BotãoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(BotãoCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(885, 395, -1, 60));

        BotaoEsqueceuSenha.setBackground(new java.awt.Color(239, 164, 83));
        BotaoEsqueceuSenha.setFont(new java.awt.Font("Eras Bold ITC", 0, 22)); // NOI18N
        BotaoEsqueceuSenha.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\Downloads\\BotãoEsqueciSenha.png")); // NOI18N
        BotaoEsqueceuSenha.setBorder(null);
        BotaoEsqueceuSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEsqueceuSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoEsqueceuSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 540, 200, 30));

        BotaoSair.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\Downloads\\BotãoLogout.png")); // NOI18N
        BotaoSair.setBorder(null);
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 630, 80, 80));

        Fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\Downloads\\1253QUANTUMVM.UNRARMETRO_ckbnxvahp5f44!App\\Extracted\\Imagens feitas\\LOGIN.png")); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotãoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoCadastroActionPerformed
        // TODO add your handling code here:
        CadastroTela Ct = new CadastroTela();
        Ct.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_BotãoCadastroActionPerformed

    private void BotaoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLoginActionPerformed
        // TODO add your handling code here:
        try {
            
            String email, senha;
            email = CaixaDeTextoEmail.getText();
            senha = new String (CaixaDeTextoSenha.getPassword());

            Usuario usuario = new Usuario(email, senha);

            UsuarioDAO ObjetoUsuarioDAO = new UsuarioDAO();
            boolean rsusuarioDAO = ObjetoUsuarioDAO.existe(usuario);

            if (rsusuarioDAO){

                PrincipalTela TP = new PrincipalTela();
                TP.setVisible(true);

                PrincipalTela.CaixaParaEmail.setText(email);

            this.dispose();

            }
            else {
                JOptionPane.showMessageDialog(null, "Email ou Senha Inválidos");
            }

        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "FRMLOGINVIEW" + e);
        }
    }//GEN-LAST:event_BotaoLoginActionPerformed

    private void CaixaDeTextoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaDeTextoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaixaDeTextoEmailActionPerformed

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BotaoSairActionPerformed

    private void BotaoEsqueceuSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEsqueceuSenhaActionPerformed
        // TODO add your handling code here:
        TrocarSenhaTela Tst = new TrocarSenhaTela();
        Tst.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_BotaoEsqueceuSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEsqueceuSenha;
    private javax.swing.JButton BotaoLogin;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JButton BotãoCadastro;
    private javax.swing.JTextField CaixaDeTextoEmail;
    private javax.swing.JPasswordField CaixaDeTextoSenha;
    private javax.swing.JLabel Fundo;
    // End of variables declaration//GEN-END:variables
}
