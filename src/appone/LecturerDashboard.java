/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appone;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Udom
 */
public class LecturerDashboard extends javax.swing.JFrame {
            String pok;
    /**
     * Creates new form LecturerDashboard
     */
    public LecturerDashboard() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        IDCAPTURE = new javax.swing.JLabel();
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

        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 125, 154, 118));

        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 122, 154, 118));

        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 125, 154, 118));

        IDCAPTURE.setFont(new java.awt.Font("Merienda", 0, 14)); // NOI18N
        IDCAPTURE.setForeground(new java.awt.Color(255, 255, 255));
        IDCAPTURE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(IDCAPTURE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appone/imageslecturer/AppOneLecturerDashboard.png"))); // NOI18N
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
   } // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        LecturerDashboard ad = new LecturerDashboard();
          ad.setVisible(true);
           ad.shoo(pok);
           this.dispose();
        
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
           this.dispose();
    }//GEN-LAST:event_ChangePass1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(JFrame.ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
    LecturerAddCourseWork gd = new LecturerAddCourseWork();
          gd.setVisible(true);
           gd.shoo(pok);
           this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        LecturerMyProfile nid = new LecturerMyProfile();
          nid.setVisible(true);
           nid.shoo(pok);
           this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
    LecturerChangePassword nird = new LecturerChangePassword();
          nird.setVisible(true);
           nird.shoo(pok);
           this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(LecturerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecturerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecturerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LecturerDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddCourseWork;
    private javax.swing.JLabel ChangePass;
    private javax.swing.JLabel ChangePass1;
    private javax.swing.JLabel IDCAPTURE;
    private javax.swing.JLabel LogOut;
    private javax.swing.JLabel MyProFile;
    private javax.swing.JLabel MyProfile;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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