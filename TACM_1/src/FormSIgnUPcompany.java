
import Koneksi.conek1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class FormSIgnUPcompany extends javax.swing.JFrame {

    /**
     * Creates new form FormSignUp1
     */
    public FormSIgnUPcompany() {
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

        rSMaterialButtonRectangle2 = new rojerusan.RSMaterialButtonRectangle();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnumber = new javax.swing.JTextField();
        txtpassword = new javax.swing.JTextField();
        b_kembali = new rojerusan.RSMaterialButtonRectangle();
        b_register = new rojerusan.RSMaterialButtonRectangle();
        jLabel3 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();

        rSMaterialButtonRectangle2.setText("rSMaterialButtonRectangle2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(42, 37, 98)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Kementerian_Investasi_BKPM_Logo_-_Download_Free_PNG-removebg-preview (2).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 70, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        txtnumber.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        txtnumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnumber.setText("Enter your number");
        txtnumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(79, 158, 232)));
        txtnumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnumberFocusLost(evt);
            }
        });
        jPanel1.add(txtnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 140, 30));

        txtpassword.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        txtpassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpassword.setText("Create your password");
        txtpassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(79, 158, 232)));
        txtpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpasswordFocusLost(evt);
            }
        });
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 140, 30));

        b_kembali.setBackground(new java.awt.Color(255, 51, 51));
        b_kembali.setText("kembali");
        b_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_kembaliActionPerformed(evt);
            }
        });
        jPanel1.add(b_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 80, 40));

        b_register.setText("Register");
        b_register.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        b_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_registerActionPerformed(evt);
            }
        });
        jPanel1.add(b_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 100, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Registration");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        txtusername.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        txtusername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtusername.setText("Create your username");
        txtusername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(79, 158, 232)));
        txtusername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtusernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtusernameFocusLost(evt);
            }
        });
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 140, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel5.setText("ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtid.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        txtid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtid.setText("Create your ID");
        txtid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(79, 158, 232)));
        txtid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtidFocusLost(evt);
            }
        });
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 140, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel6.setText("Company Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        txtnama.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        txtnama.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnama.setText("Enter your name");
        txtnama.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(79, 158, 232)));
        txtnama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnamaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnamaFocusLost(evt);
            }
        });
        jPanel1.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 140, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel7.setText("Email");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        txtemail.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        txtemail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtemail.setText("Enter your email");
        txtemail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(79, 158, 232)));
        txtemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtemailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtemailFocusLost(evt);
            }
        });
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 140, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel8.setText("Address");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel9.setText("Phone Number");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel10.setText("Password");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        txtaddress.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        txtaddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtaddress.setText("Enter your address");
        txtaddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(79, 158, 232)));
        txtaddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtaddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtaddressFocusLost(evt);
            }
        });
        jPanel1.add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnumberFocusGained
         String nomor = txtnumber.getText();
        if(nomor.equals("Enter your number")) {
            txtnumber.setText("");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumberFocusGained

    private void txtpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordFocusGained
       String pass = txtpassword.getText();
        if(pass.equals("Create your password")) {
            txtpassword.setText("");
        } 
// TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordFocusGained

    private void txtnumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnumberFocusLost
 String user =txtnumber.getText();
        if(user.equals("")) {
            txtnumber.setText("Enter your number");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumberFocusLost

    private void txtpasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordFocusLost
String pass =txtpassword.getText();
        if(pass.equals("")) {
            txtpassword.setText("Create your password");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordFocusLost

    private void b_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_registerActionPerformed
String id = txtid.getText();
    String companyName = txtnama.getText();
        String address = txtaddress.getText();
        String email = txtemail.getText();
        String phone = txtnumber.getText();
        String username = txtusername.getText();
        String password = txtpassword.getText();

        if (companyName.isEmpty() || address.isEmpty() || email.isEmpty() || phone.isEmpty() || username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Semua field harus diisi!");
            return;
        }

        try (Statement stmt = conek1.GetConnection().createStatement()) {
              // Masukkan data ke tabel login
            String queryLogin = "INSERT INTO login (username, user_password, status) VALUES ('"
                    + username + "', '" + password + "', 'Company')";
            stmt.executeUpdate(queryLogin);
            
            String queryCompany = "INSERT INTO perusahaan (id_perusahaan, username, nama, alamat, email, no_telepon) VALUES ('" + id + "','"
                +username + "', '"    + companyName + "', '" + address + "', '" + email + "', '" + phone + "')";
            stmt.executeUpdate(queryCompany);

           
          
            new LoginUtama().setVisible(true);
            this.dispose();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat membuat akun perusahaan.");
        }



    
        // TODO add your handling code here:
    }//GEN-LAST:event_b_registerActionPerformed

    private void b_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_kembaliActionPerformed
        SignUp sp = new SignUp();
        sp.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_b_kembaliActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void txtusernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusernameFocusGained
        String id = txtusername.getText();
        if(id.equals("Create your username")) {
            txtusername.setText("");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameFocusGained

    private void txtusernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusernameFocusLost
       String id =txtusername.getText();
        if(id.equals("")) {
            txtusername.setText("Create your username");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameFocusLost

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtidFocusGained
        String id = txtid.getText();
        if(id.equalsIgnoreCase("Create your ID")) {
            txtid.setText("");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidFocusGained

    private void txtidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtidFocusLost
       String id =txtid.getText();
        if(id.equalsIgnoreCase("")) {
            txtid.setText("Create your ID");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidFocusLost

    private void txtnamaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnamaFocusGained
         String id = txtnama.getText();
        if(id.equals("Enter your name")) {
            txtnama.setText("");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_txtnamaFocusGained

    private void txtnamaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnamaFocusLost
        String id =txtnama.getText();
        if(id.equals("")) {
            txtnama.setText("Enter your name");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_txtnamaFocusLost

    private void txtemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusGained
        String id = txtemail.getText();
        if(id.equals("Enter your email")) {
            txtemail.setText("");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_txtemailFocusGained

    private void txtemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusLost
        String id =txtemail.getText();
        if(id.equals("")) {
            txtemail.setText("Enter your email");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailFocusLost

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtaddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaddressFocusGained
       String id = txtaddress.getText();
        if(id.equals("Enter your address")) {
            txtaddress.setText("");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddressFocusGained

    private void txtaddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaddressFocusLost
        String id =txtaddress.getText();
        if(id.equals("")) {
            txtaddress.setText("Enter your address");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddressFocusLost

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

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
            java.util.logging.Logger.getLogger(FormSIgnUPcompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSIgnUPcompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSIgnUPcompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSIgnUPcompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSIgnUPcompany().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle b_kembali;
    private rojerusan.RSMaterialButtonRectangle b_register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle2;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnumber;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables

     
}
