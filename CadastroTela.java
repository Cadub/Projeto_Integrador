/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author cadub
 */
public class CadastroTela extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    public CadastroTela() {
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

        jLabel7 = new javax.swing.JLabel();
        CaixaParaEmail = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        NomeLabel = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        SenhaLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtConfirmarSenha = new javax.swing.JTextField();
        BotaoCadastro = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\OneDrive\\Imagens\\Saved Pictures\\Azul Laranja.jpg")); // NOI18N

        CaixaParaEmail.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 28, -1, -1));

        NomeLabel.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        NomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        NomeLabel.setText("Nome:");
        getContentPane().add(NomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 221, -1));

        EmailLabel.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        EmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmailLabel.setText("Email:");
        getContentPane().add(EmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, -1, -1));

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 221, -1));

        SenhaLabel.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        SenhaLabel.setForeground(new java.awt.Color(255, 255, 255));
        SenhaLabel.setText("Senha:");
        getContentPane().add(SenhaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirmar Senha:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 221, -1));

        txtConfirmarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmarSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 220, -1));

        BotaoCadastro.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\OneDrive\\Imagens\\Saved Pictures\\Botão de Registrar.png")); // NOI18N
        BotaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 160, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\Downloads\\Icone Laranja Discite (1).png")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Eras Demi ITC", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 102, 0));
        jLabel8.setText("Project Discite");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\OneDrive\\Imagens\\Saved Pictures\\Azul Laranja.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtConfirmarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmarSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmarSenhaActionPerformed

    private void BotaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastroActionPerformed
        // TODO add your handling code here:
        String arroba = txtEmail.getText();
        String senha2 = txtSenha.getText();
        String senha3 = txtConfirmarSenha.getText();

        if (arroba.indexOf("@") > 0) {
            if (senha2.equals(senha3)) {
                try {
                    
                    String nome, email, senha;
                    nome = txtNome.getText();
                    email = txtEmail.getText();
                    senha = txtSenha.getText();

                    Usuario usuario = new Usuario(nome, email, senha); 
                    
                    UsuarioCadastroDAO ObjetoUsuarioCadastradoDAO = new UsuarioCadastroDAO();
                    ObjetoUsuarioCadastradoDAO.cadastrar(usuario);

                    PrincipalTela TP = new PrincipalTela();
                    TP.setVisible(true);

                    PrincipalTela.CaixaParaEmail.setText(email);

                    this.dispose();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "FRMLOGINVIEW" + e);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Você deve escrever a mesma senha em ambas as caixas");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Houve um erro no cadastro do seu email");
        }
    }//GEN-LAST:event_BotaoCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastro;
    public static javax.swing.JLabel CaixaParaEmail;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel NomeLabel;
    private javax.swing.JLabel SenhaLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtConfirmarSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}