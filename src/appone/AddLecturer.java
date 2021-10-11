/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appone;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public final class AddLecturer extends javax.swing.JFrame {
    String ak;
    Connection con = null;
    PreparedStatement pst = null;
   
     String DEP;
    
    public AddLecturer() {
        initComponents();
         setBackground(new Color(0,0,0,0));
        viewpaN.setEnabled(false);
        viewpaN.setVisible(false);
        set0.setEnabled(false);
        set0.setVisible(false);
    }
 
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("civesystem?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        courseQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Course c");
        courseList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : courseQuery.getResultList();
        home = new javax.swing.JLabel();
        AddStudent = new javax.swing.JLabel();
        ChangePass = new javax.swing.JLabel();
        set1 = new javax.swing.JLabel();
        AddLecturer = new javax.swing.JLabel();
        set0 = new javax.swing.JLabel();
        viewpaN = new javax.swing.JPanel();
        LogOut = new javax.swing.JLabel();
        MyProFile = new javax.swing.JLabel();
        ChangePass1 = new javax.swing.JLabel();
        viewSetting1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        DISPLAY = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        JOkbtn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        IDCAPTURE = new javax.swing.JLabel();
        DISPLAY1 = new javax.swing.JLabel();
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

        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 95, 20));

        AddStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddStudentMouseClicked(evt);
            }
        });
        getContentPane().add(AddStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 314, 100, 20));

        ChangePass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ChangePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangePassMouseClicked(evt);
            }
        });
        getContentPane().add(ChangePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 140, 20));

        set1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        set1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                set1MouseClicked(evt);
            }
        });
        getContentPane().add(set1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 32, 30));

        AddLecturer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddLecturer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddLecturerMouseClicked(evt);
            }
        });
        getContentPane().add(AddLecturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 288, 110, 20));

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

        getContentPane().add(viewpaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 169, 118));

        jButton4.setText("Upload");
        jButton4.setPreferredSize(new java.awt.Dimension(65, 30));
        jButton4.setRequestFocusEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 80, -1));

        DISPLAY.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(DISPLAY, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        jButton2.setText("Export");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        jButton1.setText("Import");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 70, -1));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 680, 490));

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 3, 30, 27));

        JOkbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JOkbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JOkbtnMouseClicked(evt);
            }
        });
        getContentPane().add(JOkbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(654, 414, 54, 30));

        jLabel4.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        jLabel4.setText("Add Lecturer");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Admin");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        IDCAPTURE.setFont(new java.awt.Font("Merienda", 0, 14)); // NOI18N
        IDCAPTURE.setForeground(new java.awt.Color(255, 255, 255));
        IDCAPTURE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(IDCAPTURE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 140, 30));

        DISPLAY1.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(DISPLAY1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appone/images/AppOneAdminAddLecturer.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        setSize(new java.awt.Dimension(900, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        Dashboard ad = new Dashboard();
          ad.setVisible(true);
           ad.ss(ak);
           this.dispose();
                 // TODO add your handling code here:
    }//GEN-LAST:event_homeMouseClicked

    private void AddStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddStudentMouseClicked
        AddStudent nk = new AddStudent();
          nk.setVisible(true);
           nk.ss(ak);
           this.dispose();
    }//GEN-LAST:event_AddStudentMouseClicked

    private void set1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_set1MouseClicked
        viewpaN.setEnabled(true);
        viewpaN.setVisible(true);
        set0.setEnabled(true);
        set0.setVisible(true);
        set1.setEnabled(false);
        set1.setVisible(false);

    }//GEN-LAST:event_set1MouseClicked

    private void AddLecturerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddLecturerMouseClicked
        AddLecturer pk = new AddLecturer();
          pk.setVisible(true);
           pk.ss(ak);
           this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_AddLecturerMouseClicked

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
        ProfileAdmin io = new ProfileAdmin();
          io.setVisible(true);
           io.ss(ak);
           this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_MyProFileMouseClicked

    private void ChangePass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePass1MouseClicked
      ChangePassW xo = new ChangePassW();
          xo.setVisible(true);
           xo.ss(ak);
           this.dispose();
    }//GEN-LAST:event_ChangePass1MouseClicked

    private void ChangePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePassMouseClicked
        ChangePassW xo = new ChangePassW();
          xo.setVisible(true);
           xo.ss(ak);
           this.dispose();

    }//GEN-LAST:event_ChangePassMouseClicked

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

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(JFrame.ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void JOkbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JOkbtnMouseClicked
      
    }//GEN-LAST:event_JOkbtnMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       JFileChooser fileChooser = new JFileChooser();
       fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
       int result = fileChooser.showOpenDialog(this);
       if (result == JFileChooser.APPROVE_OPTION) {
       File selectedFile = fileChooser.getSelectedFile();
       System.out.println("Selected file: " + selectedFile.getAbsolutePath());
       DISPLAY.setText(selectedFile.getName());
       DISPLAY1.setText(selectedFile.getAbsolutePath());
       
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String jdbcURL = "jdbc:mysql://localhost:3306/civesystem";
        String username = "root";
        String password = "";
 
        String csvFilePath = DISPLAY1.getText();
 
        int batchSize = 20;
 
        Connection connection = null;
        try {
 
            connection = (Connection) DriverManager.getConnection(jdbcURL, username, password);
            connection.setAutoCommit(false);
 
            String sql = "INSERT INTO `users`(`Fname`, `Lname`, `ID`, `DEPARTMENT`, `COID`, `UserTP`, `GENDER`, `EMAIL`, `PHONENUMBER`, `PASSWORD`) VALUES (?,?,?,?,?,? ?, ?, ?, ?)";
            PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
 
            BufferedReader lineReader = new BufferedReader(new FileReader(csvFilePath));
            String lineText = null;
 
            int count = 0;
 
            lineReader.readLine(); // skip header line
            while ((lineText = lineReader.readLine()) != null) {
                String[] data = lineText.split(",");
                String FirstName = data[0];
                String LastName = data[1];
                String Identity = data[2];
                String Department = data[3];
                String COID = data[4];
                String USERTP = data[5];
                String GENDER = data[6];
                String EMAIL = data[7];
                String PHONENUMBER = data[8];
                String PASSWORD = data[9];
               
 
                statement.setString(1, FirstName);
                statement.setString(2, LastName);
                statement.setString(3, Identity);
                statement.setString(4, Department);
                statement.setString(5, COID);
                statement.setString(6, USERTP);
                statement.setString(7, GENDER);
                statement.setString(8, EMAIL);
                statement.setString(9, PHONENUMBER);
                statement.setString(10, PASSWORD);
 
               
 
                statement.addBatch();
 
                if (count % batchSize == 0) {
                    statement.executeBatch();
                }
            }
 
            lineReader.close();
 
            // execute the remaining queries
            statement.executeBatch();
 
            connection.commit();
            connection.close();
 
        } catch (Exception ex) {
            System.err.println(ex);
        }
      
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(AddLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddLecturer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddLecturer;
    private javax.swing.JLabel AddStudent;
    private javax.swing.JLabel ChangePass;
    private javax.swing.JLabel ChangePass1;
    private javax.swing.JLabel DISPLAY;
    private javax.swing.JLabel DISPLAY1;
    private javax.swing.JLabel IDCAPTURE;
    private javax.swing.JLabel JOkbtn;
    private javax.swing.JLabel LogOut;
    private javax.swing.JLabel MyProFile;
    private java.util.List<appone.Course> courseList;
    private javax.persistence.Query courseQuery;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel home;
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel set0;
    private javax.swing.JLabel set1;
    private javax.swing.JLabel viewSetting1;
    private javax.swing.JPanel viewpaN;
    // End of variables declaration//GEN-END:variables

    final void ss(String shu) {
       ak = shu;
        IDCAPTURE.setText(shu); //To change body of generated methods, choose Tools | Templates.
    }
}
