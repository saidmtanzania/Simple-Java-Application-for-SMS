/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appone;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class LogiN extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public LogiN() {
        initComponents();
        setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LoginID = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        LoginPass = new javax.swing.JPasswordField();
        CurrentPass = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.0F);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 40, 30));

        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(856, 512, 30, 30));

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 430, 50, 50));

        LoginID.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        LoginID.setBorder(null);
        LoginID.setOpaque(false);
        LoginID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginIDActionPerformed(evt);
            }
        });
        getContentPane().add(LoginID, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 209, 187, 33));

        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 240, 60));

        LoginPass.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        LoginPass.setBorder(null);
        getContentPane().add(LoginPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 278, 183, 33));

        CurrentPass.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        CurrentPass.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(CurrentPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 184, 160, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appone/images/AppOneLogiN.png"))); // NOI18N
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
   }       
    }//GEN-LAST:event_formWindowOpened

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
            String Username = LoginID.getText();
            String Password = LoginPass.getText();
            String Atype ="Admin";
            String Ltype="Lecturer";
            String Stype="Student";
            
            if(Username.equals("")||Password.equals("")){
                CurrentPass.setText("All Field Must be Filled :) ");
                    CurrentPass.requestFocus();
                
            }else{
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                     con = (Connection) (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/civesystem?zeroDateTimeBehavior=convertToNull", "root","");  
                      pst = (PreparedStatement) con.prepareStatement("SELECT * FROM `users` WHERE  ID = ? AND PASSWORD = ?");
                      pst.setString(1,Username);
                      pst.setString(2,Password);
                      rs = pst.executeQuery();
                      
                      if(rs.next()){
                          String s1 = rs.getString("UserTP");
                          if(Atype.equalsIgnoreCase("Admin") && s1.equalsIgnoreCase("Admin")){
                              Dashboard ad = new Dashboard();
                              ad.setVisible(true);
                              String shu = LoginID.getText();
                              ad.ss(shu);
                              this.dispose();
                          }
                          if(Stype.equalsIgnoreCase("Student") && s1.equalsIgnoreCase("Student")){
                              StudentDashboard stk = new StudentDashboard();
                                stk.setVisible(true);
                                String shaa = LoginID.getText();
                                stk.su(shaa);
                                 this.dispose();
                          }
                          if(Ltype.equalsIgnoreCase("Lecturer") && s1.equalsIgnoreCase("Lecturer")){
                             LecturerDashboard ssd = new LecturerDashboard();
                                     ssd.setVisible(true);
                                     String dsd = LoginID.getText();
                                     ssd.shoo(dsd);
                              this.dispose();
                          }
                      }else{
                       JOptionPane.showMessageDialog(rootPane,"Username and Password is incorrect!","Login Error", 1);   
                      }
                }catch(Exception ex){
                    System.out.println(""+ex);
                }
            }
     
 
    }//GEN-LAST:event_jLabel2MouseClicked
    
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
     int a = JOptionPane.showConfirmDialog(null, "Do you really want to exit?","Exit",JOptionPane.YES_NO_OPTION);
        if(a==0){
        System.exit(0);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
     this.setState(JFrame.ICONIFIED);   // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void LoginIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginIDActionPerformed

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
            java.util.logging.Logger.getLogger(LogiN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogiN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogiN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogiN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogiN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CurrentPass;
    private javax.swing.JTextField LoginID;
    private javax.swing.JPasswordField LoginPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
