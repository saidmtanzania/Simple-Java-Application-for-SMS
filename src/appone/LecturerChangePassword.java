/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appone;

import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Udom
 */
public class LecturerChangePassword extends javax.swing.JFrame {
        String pok;
        com.mysql.jdbc.Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs;
    /**
     * Creates new form LecturerChangePassword
     */
    public LecturerChangePassword() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        viewpaN.setEnabled(false);
        viewpaN.setVisible(false);
        set0.setEnabled(false);
        set0.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home = new javax.swing.JLabel();
        AddCourseWork = new javax.swing.JLabel();
        MyProfile = new javax.swing.JLabel();
        ChangePass = new javax.swing.JLabel();
        set1 = new javax.swing.JLabel();
        set0 = new javax.swing.JLabel();
        viewpaN = new javax.swing.JPanel();
        LogOut = new javax.swing.JLabel();
        MyProFile = new javax.swing.JLabel();
        ChangePass1 = new javax.swing.JLabel();
        viewSetting1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IDCAPTURE = new javax.swing.JLabel();
        OldPass = new javax.swing.JPasswordField();
        NewPass = new javax.swing.JPasswordField();
        ReTP = new javax.swing.JPasswordField();
        CurrentPass = new javax.swing.JLabel();
        newPass = new javax.swing.JLabel();
        Retp = new javax.swing.JLabel();
        Okbtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.0F);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 95, 20));

        AddCourseWork.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddCourseWork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddCourseWorkMouseClicked(evt);
            }
        });
        getContentPane().add(AddCourseWork, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 288, 130, 20));

        MyProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MyProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MyProfileMouseClicked(evt);
            }
        });
        getContentPane().add(MyProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 314, 100, 20));

        ChangePass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ChangePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangePassMouseClicked(evt);
            }
        });
        getContentPane().add(ChangePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 346, 140, 20));

        set1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        set1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                set1MouseClicked(evt);
            }
        });
        getContentPane().add(set1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 32, 30));

        set0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                set0MouseClicked(evt);
            }
        });
        getContentPane().add(set0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 32, 30));

        viewpaN.setBackground(new java.awt.Color(42, 101, 106));
        viewpaN.setLayout(null);

        LogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutMouseClicked(evt);
            }
        });
        viewpaN.add(LogOut);
        LogOut.setBounds(20, 78, 80, 20);

        MyProFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MyProFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MyProFileMouseClicked(evt);
            }
        });
        viewpaN.add(MyProFile);
        MyProFile.setBounds(20, 17, 90, 20);

        ChangePass1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ChangePass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangePass1MouseClicked(evt);
            }
        });
        viewpaN.add(ChangePass1);
        ChangePass1.setBounds(20, 48, 140, 20);

        viewSetting1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appone/images/Group 2.png"))); // NOI18N
        viewpaN.add(viewSetting1);
        viewSetting1.setBounds(0, 0, 169, 118);

        getContentPane().add(viewpaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 367, 169, 118));

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 3, 30, 27));

        IDCAPTURE.setFont(new java.awt.Font("Merienda", 0, 14)); // NOI18N
        IDCAPTURE.setForeground(new java.awt.Color(255, 255, 255));
        IDCAPTURE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(IDCAPTURE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 160, 30));

        OldPass.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        OldPass.setBorder(null);
        OldPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OldPassActionPerformed(evt);
            }
        });
        getContentPane().add(OldPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 163, 223, 34));

        NewPass.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        NewPass.setBorder(null);
        NewPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPassActionPerformed(evt);
            }
        });
        getContentPane().add(NewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 215, 223, 34));

        ReTP.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ReTP.setBorder(null);
        ReTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReTPActionPerformed(evt);
            }
        });
        getContentPane().add(ReTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 264, 223, 34));

        CurrentPass.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        CurrentPass.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(CurrentPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 135, 220, 20));

        newPass.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        newPass.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(newPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 135, 220, 20));

        Retp.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        Retp.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(Retp, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 135, 220, 20));

        Okbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Okbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OkbtnMouseClicked(evt);
            }
        });
        getContentPane().add(Okbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 323, 65, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appone/imageslecturer/AppOneLecturerChangepassword.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        setSize(new java.awt.Dimension(900, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    for (double i=0.0; i<=1.0;i=i+0.1){
    String val=i+"";
    float f=Float.valueOf(val);
    this.setOpacity(f);
    try{
        Thread.sleep(50);
    }                                 

    catch(Exception e){
        
    }
   }        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        LecturerDashboard ad = new LecturerDashboard();
          ad.setVisible(true);
           ad.shoo(pok);
           this.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_homeMouseClicked

    private void AddCourseWorkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddCourseWorkMouseClicked
       LecturerAddCourseWork gd = new LecturerAddCourseWork();
          gd.setVisible(true);
           gd.shoo(pok);
           this.dispose();
    }//GEN-LAST:event_AddCourseWorkMouseClicked

    private void MyProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MyProfileMouseClicked
        LecturerMyProfile nd = new LecturerMyProfile();
          nd.setVisible(true);
           nd.shoo(pok);
           this.dispose();
    }//GEN-LAST:event_MyProfileMouseClicked

    private void ChangePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePassMouseClicked
         LecturerChangePassword ned = new LecturerChangePassword();
          ned.setVisible(true);
           ned.shoo(pok);
           this.dispose();
    }//GEN-LAST:event_ChangePassMouseClicked

    private void set1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_set1MouseClicked
        viewpaN.setEnabled(true);
        viewpaN.setVisible(true);
        set0.setEnabled(true);
        set0.setVisible(true);
        set1.setEnabled(false);
        set1.setVisible(false);
    }//GEN-LAST:event_set1MouseClicked

    private void set0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_set0MouseClicked
        viewpaN.setEnabled(false);
        viewpaN.setVisible(false);
        set0.setEnabled(false);
        set0.setVisible(false);
        set1.setEnabled(true);
        set1.setVisible(true);
    }//GEN-LAST:event_set0MouseClicked

    private void LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseClicked
        new LogiN().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_LogOutMouseClicked

    private void MyProFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MyProFileMouseClicked
        LecturerMyProfile nid = new LecturerMyProfile();
          nid.setVisible(true);
           nid.shoo(pok);
           this.dispose();
    }//GEN-LAST:event_MyProFileMouseClicked

    private void ChangePass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePass1MouseClicked
        LecturerChangePassword nird = new LecturerChangePassword();
          nird.setVisible(true);
           nird.shoo(pok);
           this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_ChangePass1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(JFrame.ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void OldPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OldPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OldPassActionPerformed

    private void NewPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewPassActionPerformed

    private void ReTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReTPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReTPActionPerformed

    private void OkbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OkbtnMouseClicked
        String Old,New,Match;
        Old = OldPass.getText();
        New = NewPass.getText();
        Match = ReTP.getText();
        String sql = "SELECT * FROM `users` WHERE ID='"+pok+"'";
        String sql1 ="UPDATE `users` SET `PASSWORD`='"+New+"' WHERE ID='"+pok+"'";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (com.mysql.jdbc.Connection) (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/civesystem?zeroDateTimeBehavior=convertToNull", "root","");
            pst = (PreparedStatement) con.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                if(Old.equals("")||New.equals("")||Match.equals("")){
                    newPass.setText("All Field Must be Filled :) ");
                    newPass.requestFocus();
                }else if(rs.getString("PASSWORD").equals(Old)){
                    newPass.setText("");
                    if(New.equals(Match)){
                        Retp.setText("");
                        CurrentPass.setText("");
                        pst = (PreparedStatement) con.prepareStatement(sql1);
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Password Successfully Changed:)");
                        OldPass.setText("");
                        NewPass.setText("");
                        ReTP.setText("");
                    }else{
                        CurrentPass.setText("");
                        Retp.setText("Retype Password Doesnt Match!");
                        Retp.requestFocus();
                    }
                }else{
                    Retp.setText("");
                    newPass.setText("");
                    CurrentPass.setText("Invalid Old Password!");
                    CurrentPass.requestFocus();
                }

            }

        }catch(Exception ex){

        }
    }//GEN-LAST:event_OkbtnMouseClicked

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
            java.util.logging.Logger.getLogger(LecturerChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecturerChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecturerChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturerChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LecturerChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddCourseWork;
    private javax.swing.JLabel ChangePass;
    private javax.swing.JLabel ChangePass1;
    private javax.swing.JLabel CurrentPass;
    private javax.swing.JLabel IDCAPTURE;
    private javax.swing.JLabel LogOut;
    private javax.swing.JLabel MyProFile;
    private javax.swing.JLabel MyProfile;
    private javax.swing.JPasswordField NewPass;
    private javax.swing.JLabel Okbtn;
    private javax.swing.JPasswordField OldPass;
    private javax.swing.JPasswordField ReTP;
    private javax.swing.JLabel Retp;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel newPass;
    private javax.swing.JLabel set0;
    private javax.swing.JLabel set1;
    private javax.swing.JLabel viewSetting1;
    private javax.swing.JPanel viewpaN;
    // End of variables declaration//GEN-END:variables

    final void shoo(String dsd) {
        pok = dsd;
        IDCAPTURE.setText(dsd);
    }
}
