/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Jogo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cadub
 */
public class AlterarQuestionarioTela extends javax.swing.JFrame {

    /**
     * Creates new form MudarQuestaoTela
     */
    public AlterarQuestionarioTela() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botaoAdicionar = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        botaoDeletar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        CaixaParaEmail.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Alterar Questionário");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 340, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nesta sessão do jogo, você pode modificar os questíonarios a partir de três");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 1000, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("diferentes funções: \"Adicionar\", \"Alterar\" \"Deletar\". Sendo que, tais alterações");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 1080, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("valem para qualquer dificuldade. O que gostaria de fazer?");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        botaoAdicionar.setText("Adicionar");
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, -1, -1));

        botaoAlterar.setText("Alterar");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, -1, -1));

        botaoVoltar.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\Downloads\\BotãoVoltarAzul.png")); // NOI18N
        botaoVoltar.setBorder(null);
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 100));

        botaoDeletar.setText("Deletar");
        botaoDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 420, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\OneDrive\\Imagens\\Saved Pictures\\Azul Laranja.jpg")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        // TODO add your handling code here:
        PrincipalTela Pt = new PrincipalTela();
        Pt.setVisible(true);
        
        String pegarEmail = CaixaParaEmail.getText();
        PrincipalTela.CaixaParaEmail.setText(pegarEmail);
        
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarActionPerformed
        try {
            // TODO add your handling code here:
            AdicionarQuestaoTela Aqt = new AdicionarQuestaoTela();
            Aqt.setVisible(true);
            
            String pegarEmail = CaixaParaEmail.getText();
            AdicionarQuestaoTela.CaixaParaEmail.setText(pegarEmail);
            
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(AlterarQuestionarioTela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoAdicionarActionPerformed

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            AlterarQuestaoTela Aqt = new AlterarQuestaoTela();
            Aqt.setVisible(true);
            
            String pegarEmail = CaixaParaEmail.getText();
            AlterarQuestaoTela.CaixaParaEmail.setText(pegarEmail);
            
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(AlterarQuestionarioTela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void botaoDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeletarActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            DeletarQuestaoTela Dqt = new DeletarQuestaoTela();
            Dqt.setVisible(true);
            
            String pegarEmail = CaixaParaEmail.getText();
            DeletarQuestaoTela.CaixaParaEmail.setText(pegarEmail);
            
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(AlterarQuestionarioTela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoDeletarActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarQuestionarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarQuestionarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarQuestionarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarQuestionarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarQuestionarioTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel CaixaParaEmail;
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoDeletar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}