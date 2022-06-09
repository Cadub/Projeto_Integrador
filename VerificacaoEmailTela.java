/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany;


import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author cadub
 */
public class VerificacaoEmailTela extends javax.swing.JFrame {

   

    /**
     * Creates new form VerificacaoEmailTela
     */
    public VerificacaoEmailTela() {
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

        CaixaParaEmail = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        BotaoVerificar = new javax.swing.JButton();
        BotaoMudarSenha = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtConfirmarSenha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        CaixaParaEmail.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Trocar Senha");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 70, -1));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 250, -1));

        BotaoVerificar.setText("Verificar Email");
        BotaoVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVerificarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, -1, -1));

        BotaoMudarSenha.setText("Mudar Senha");
        BotaoMudarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMudarSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoMudarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 330, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, -1));
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 250, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirmar Senha:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 200, 30));
        getContentPane().add(txtConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 250, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\Downloads\\Icone Laranja Discite (1).png")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Eras Demi ITC", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 102, 0));
        jLabel8.setText("Project Discite");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        Fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\OneDrive\\Imagens\\Saved Pictures\\Azul Laranja.jpg")); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 930, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowActivated

    private void BotaoVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVerificarActionPerformed
        // TODO add your handling code here:
        try {
            String email = txtEmail.getText(); 
            UsuarioVerificacao ObjetoUsuario2 = new UsuarioVerificacao();
            ObjetoUsuario2.setEmail(email);
            
             UsuarioVerificacaoDAO ObjetoUsuarioDAO2 = new UsuarioVerificacaoDAO();
            
             boolean rsusuarioDAO2 = ObjetoUsuarioDAO2.existe(ObjetoUsuario2);
        
            if (rsusuarioDAO2){
                
                txtSenha.setEnabled(true);
                txtConfirmarSenha.setEnabled(true);
                BotaoMudarSenha.setEnabled(true);
                
                CaixaParaEmail.setText(email);
                JOptionPane.showMessageDialog(null, "O email existe. Agora pode mudar a senha");
               
            }
            else {
                JOptionPane.showMessageDialog(null, "Email Inválido");
            }
        }
        catch (Exception e){
            
        }
    }//GEN-LAST:event_BotaoVerificarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        txtSenha.setEnabled(false);
        txtConfirmarSenha.setEnabled(false);
        BotaoMudarSenha.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void BotaoMudarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMudarSenhaActionPerformed
        // TODO add your handling code here:
        if (txtSenha.getText().equals(txtConfirmarSenha.getText())); {
            try {    
                    String sql = "Update login Set senha = ? where email = ?";

                    Connection conexao = ConexaoHistorico.getConnection();
                    PreparedStatement ps = conexao.prepareStatement(sql);

                    ps.setString(1, txtSenha.getText());
                    ps.setString(2, CaixaParaEmail.getText());

                    ps.execute();

                    ps.close();
                    conexao.close();
                    
                    JOptionPane.showMessageDialog(null, "Senha alterada");
                    
                    LoginTela Lt = new LoginTela();
                    Lt.setVisible(true);
                    
                    this.dispose();
            }
            catch (Exception e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
       
        
    }//GEN-LAST:event_BotaoMudarSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(VerificacaoEmailTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerificacaoEmailTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerificacaoEmailTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerificacaoEmailTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerificacaoEmailTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoMudarSenha;
    private javax.swing.JButton BotaoVerificar;
    private javax.swing.JLabel CaixaParaEmail;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtConfirmarSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
