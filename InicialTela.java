/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author cadub
 */
public class InicialTela extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public InicialTela() {
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

        Iscite = new javax.swing.JLabel();
        Project = new javax.swing.JLabel();
        BotãoPlay = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Iscite.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        Iscite.setForeground(new java.awt.Color(255, 255, 255));
        Iscite.setText(" iscite");
        getContentPane().add(Iscite, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, -1, -1));

        Project.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        Project.setForeground(new java.awt.Color(255, 255, 255));
        Project.setText("Project");
        getContentPane().add(Project, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        BotãoPlay.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\Downloads\\zyro-image (3).png")); // NOI18N
        BotãoPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoPlayActionPerformed(evt);
            }
        });
        getContentPane().add(BotãoPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 270, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\Downloads\\Icone Laranja Discite (2) (1).png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\OneDrive\\Imagens\\Saved Pictures\\Azul Laranja.jpg")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotãoPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoPlayActionPerformed
        // TODO add your handling code here:
        LoginTela Tl = new LoginTela();
        Tl.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_BotãoPlayActionPerformed

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
            java.util.logging.Logger.getLogger(InicialTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicialTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicialTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicialTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicialTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotãoPlay;
    private javax.swing.JLabel Iscite;
    private javax.swing.JLabel Project;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}