/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appone;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Udom
 */
public class StudentViewCoursework extends javax.swing.JFrame {
     String pk;

    /**
     * Creates new form StudentViewCoursework
     */
    public StudentViewCoursework() {
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
        ViewCourseWork = new javax.swing.JLabel();
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
        UserTable = new javax.swing.JScrollPane();
        ResuLt = new javax.swing.JTable();
        TABLES = new javax.swing.JScrollPane();
        ShowTotal = new javax.swing.JTable();
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

        ViewCourseWork.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewCourseWork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewCourseWorkMouseClicked(evt);
            }
        });
        getContentPane().add(ViewCourseWork, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 288, 130, 20));

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

        UserTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                UserTableAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        ResuLt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COURSE ID", "TEST 1", "TEST 2", "ASSIGNMENT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ResuLt.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ResuLtAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        UserTable.setViewportView(ResuLt);
        if (ResuLt.getColumnModel().getColumnCount() > 0) {
            ResuLt.getColumnModel().getColumn(0).setResizable(false);
            ResuLt.getColumnModel().getColumn(1).setResizable(false);
            ResuLt.getColumnModel().getColumn(2).setResizable(false);
            ResuLt.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(UserTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 580, 380));

        ShowTotal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ShowTotal.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                ShowTotalComponentAdded(evt);
            }
        });
        ShowTotal.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ShowTotalAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        TABLES.setViewportView(ShowTotal);

        getContentPane().add(TABLES, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 170, 100, 380));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appone/imagestudents/AppOneStudentViewCoursework.png"))); // NOI18N
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
   }         // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        StudentDashboard ez = new StudentDashboard();
          ez.setVisible(true);
           ez.su(pk);
           this.dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_homeMouseClicked

    private void ViewCourseWorkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewCourseWorkMouseClicked
         StudentViewCoursework ed = new StudentViewCoursework();
          ed.setVisible(true);
           ed.su(pk);
           this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewCourseWorkMouseClicked

    private void MyProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MyProfileMouseClicked
        StudentMyProfile ev = new StudentMyProfile();
          ev.setVisible(true);
           ev.su(pk);
           this.dispose();
       
    }//GEN-LAST:event_MyProfileMouseClicked

    private void ChangePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePassMouseClicked
        StudentChangePassword zv = new StudentChangePassword();
          zv.setVisible(true);
           zv.su(pk);
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
        StudentMyProfile uv = new StudentMyProfile();
          uv.setVisible(true);
           uv.su(pk);
           this.dispose();
        
    }//GEN-LAST:event_MyProFileMouseClicked

    private void ChangePass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePass1MouseClicked
        StudentChangePassword ziv = new StudentChangePassword();
          ziv.setVisible(true);
           ziv.su(pk);
           this.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_ChangePass1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(JFrame.ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void ResuLtAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ResuLtAncestorAdded
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/civesystem","root","");
            Statement st =con.createStatement();
            String sql;
            sql = "SELECT * FROM `coursework` WHERE SID='"+pk+"'";
            ResultSet rs=st.executeQuery(sql);
            while (rs.next()){

                String COURSEID=rs.getString("COID");
                String TEST01=rs.getString("TEST1");
                String TEST02=rs.getString("TEST2");
                String ASSIGN=rs.getString("ASSIGNMENT");
                String vwty []={COURSEID,TEST01,TEST02,ASSIGN};
                DefaultTableModel tblmodel=(DefaultTableModel)ResuLt.getModel();
                tblmodel.addRow(vwty);
            }

            con.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_ResuLtAncestorAdded

    private void UserTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_UserTableAncestorAdded
        /*try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/civesystem","root","");
            Statement st =con.createStatement();
            String sql;
            sql = "SELECT TEST1+TEST2+ASSIGNMENT FROM coursework`";
            ResultSet rs=st.executeQuery(sql);
            while (rs.next()){

                String TOTAL =rs.getString(5);

                String vwty []={TOTAL,TOTAL,TOTAL,TOTAL,TOTAL};
                DefaultTableModel tblmodel=(DefaultTableModel)ResuLt.getModel();
                tblmodel.addRow(vwty);
            }

            con.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }          // TODO add your handling code here:
        */
    }//GEN-LAST:event_UserTableAncestorAdded

    private void ShowTotalComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_ShowTotalComponentAdded

        // TODO add your handling code here:
    }//GEN-LAST:event_ShowTotalComponentAdded

    private void ShowTotalAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ShowTotalAncestorAdded
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/civesystem","root","");
            Statement st =con.createStatement();
            String sql;
            sql = "SELECT TEST1+TEST2+ASSIGNMENT FROM `coursework` WHERE SID='"+pk+"'";
            ResultSet rs=st.executeQuery(sql);
            while (rs.next()){
                String TOTAL=rs.getString(1);
                String vwty []={TOTAL};
                DefaultTableModel TABLES=(DefaultTableModel)ShowTotal.getModel();
                TABLES.addRow(vwty);
            }

            con.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }         // TODO add your handling code here:
    }//GEN-LAST:event_ShowTotalAncestorAdded

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
            java.util.logging.Logger.getLogger(StudentViewCoursework.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentViewCoursework.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentViewCoursework.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentViewCoursework.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentViewCoursework().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ChangePass;
    private javax.swing.JLabel ChangePass1;
    private javax.swing.JLabel IDCAPTURE;
    private javax.swing.JLabel LogOut;
    private javax.swing.JLabel MyProFile;
    private javax.swing.JLabel MyProfile;
    private javax.swing.JTable ResuLt;
    private javax.swing.JTable ShowTotal;
    private javax.swing.JScrollPane TABLES;
    private javax.swing.JScrollPane UserTable;
    private javax.swing.JLabel ViewCourseWork;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel set0;
    private javax.swing.JLabel set1;
    private javax.swing.JLabel viewSetting1;
    private javax.swing.JPanel viewpaN;
    // End of variables declaration//GEN-END:variables

    final void su(String shaa) {
        pk = shaa;
        IDCAPTURE.setText(shaa);
    }
}
