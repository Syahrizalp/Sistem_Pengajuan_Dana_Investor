
import java.awt.Color;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Dasboard extends javax.swing.JFrame {

    /**
     * Creates new form Dasboard
     */
    public Dasboard() {
        initComponents();
         this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pancompany = new javax.swing.JPanel();
        ic_company = new javax.swing.JLabel();
        lb_perusahaan = new javax.swing.JLabel();
        paneisnvestor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pancompany.setBackground(new java.awt.Color(45, 59, 150));
        pancompany.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pancompanyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pancompanyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pancompanyMouseExited(evt);
            }
        });
        pancompany.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ic_company.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Company.png"))); // NOI18N
        pancompany.add(ic_company, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        lb_perusahaan.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lb_perusahaan.setForeground(new java.awt.Color(255, 255, 255));
        lb_perusahaan.setText("PERUSAHAAN");
        pancompany.add(lb_perusahaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        getContentPane().add(pancompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 310, 40));

        paneisnvestor.setBackground(new java.awt.Color(45, 59, 150));
        paneisnvestor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paneisnvestorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paneisnvestorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paneisnvestorMouseExited(evt);
            }
        });
        paneisnvestor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Banknotes.png"))); // NOI18N
        paneisnvestor.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jLabel3.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INVESTOR");
        paneisnvestor.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 100, 40));

        getContentPane().add(paneisnvestor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 300, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/afiks.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pancompanyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pancompanyMouseEntered
        pancompany.setBackground(new Color(37, 39, 40));
        // TODO add your handling code here:
    }//GEN-LAST:event_pancompanyMouseEntered

    private void pancompanyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pancompanyMouseExited
        pancompany.setBackground(new Color(45, 59, 150));
        // TODO add your handling code here:
    }//GEN-LAST:event_pancompanyMouseExited

    private void paneisnvestorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneisnvestorMouseEntered
        paneisnvestor.setBackground(new Color(37, 39, 40));
        // TODO add your handling code here:
    }//GEN-LAST:event_paneisnvestorMouseEntered

    private void paneisnvestorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneisnvestorMouseExited
         paneisnvestor.setBackground(new Color(45, 59, 150));
// TODO add your handling code here:
    }//GEN-LAST:event_paneisnvestorMouseExited

    private void pancompanyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pancompanyMouseClicked
        LoginUtama lg = new LoginUtama();
        lg.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_pancompanyMouseClicked

    private void paneisnvestorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneisnvestorMouseClicked
         LoginUtama lg = new LoginUtama();
        lg.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_paneisnvestorMouseClicked

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
            java.util.logging.Logger.getLogger(Dasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dasboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ic_company;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lb_perusahaan;
    private javax.swing.JPanel pancompany;
    private javax.swing.JPanel paneisnvestor;
    // End of variables declaration//GEN-END:variables
}
