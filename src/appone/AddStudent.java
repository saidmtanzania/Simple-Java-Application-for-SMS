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
import java.sql.Statement;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public final class AddStudent extends javax.swing.JFrame {
    String ak;
    Connection con = null;
    PreparedStatement pst = null;
    public AddStudent() {
        initComponents();
        Faculty();
        Student();
        setBackground(new Color(0,0,0,0));
        viewpaN.setEnabled(false);
        viewpaN.setVisible(false);
        set0.setEnabled(false);
        set0.setVisible(false);
    }
    public void Student(){
   try{Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/civesystem","root","");
            Statement st =con.createStatement();
            String sql;
            sql = "SELECT *FROM users where UserTP='student'";
            ResultSet rs=st.executeQuery(sql);
            while (rs.next()){
                UIDS.addItem(rs.getString("ID"));
               
            }

            con.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        } 
    }
    
    
    public void Faculty(){
   try{Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/civesystem","root","");
            Statement st =con.createStatement();
            String sql;
            sql = "SELECT *FROM faculty";
            ResultSet rs=st.executeQuery(sql);
            while (rs.next()){
                JFaculty.addItem(rs.getString("FACUID"));
               
            }

            con.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        } 
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
        JFirst = new javax.swing.JTextField();
        JLast = new javax.swing.JTextField();
        JEmail = new javax.swing.JTextField();
        UIDS = new javax.swing.JComboBox<String>();
        JFaculty = new javax.swing.JComboBox<String>();
        JGender = new javax.swing.JComboBox<String>();
        JPhone = new javax.swing.JFormattedTextField();
        JPass = new javax.swing.JPasswordField();
        STZ = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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

        JFirst.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        JFirst.setBorder(null);
        getContentPane().add(JFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 109, 160, 29));

        JLast.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        JLast.setBorder(null);
        getContentPane().add(JLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 147, 160, 28));

        JEmail.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        JEmail.setBorder(null);
        getContentPane().add(JEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 295, 160, 28));

        UIDS.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        UIDS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose" }));
        UIDS.setBorder(null);
        UIDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIDSActionPerformed(evt);
            }
        });
        getContentPane().add(UIDS, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 185, 162, 29));

        JFaculty.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        JFaculty.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose" }));
        JFaculty.setBorder(null);
        getContentPane().add(JFaculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 222, 160, 28));

        JGender.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        JGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose", "Male", "Female" }));
        JGender.setBorder(null);
        getContentPane().add(JGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 259, 65, 28));

        JPhone.setBorder(null);
        try {
            JPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JPhone.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        getContentPane().add(JPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 331, 160, 28));

        JPass.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        JPass.setBorder(null);
        JPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPassActionPerformed(evt);
            }
        });
        getContentPane().add(JPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 367, 160, 28));

        STZ.setFont(new java.awt.Font("Merienda", 0, 14)); // NOI18N
        STZ.setForeground(new java.awt.Color(255, 255, 255));
        STZ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(STZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 150, 30));

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
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(654, 370, 54, 30));
        jLabel3.getAccessibleContext().setAccessibleName("btnAdd");

        jLabel4.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        jLabel4.setText("Add Student");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Admin");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appone/images/AppOneAdminAddStudent.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        setSize(new java.awt.Dimension(900, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
          Dashboard ad = new Dashboard();
          ad.setVisible(true);
           ad.ss(ak);
           this.dispose();
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
           this.dispose();
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
           this.dispose();
    }//GEN-LAST:event_MyProFileMouseClicked

    private void ChangePass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePass1MouseClicked
      ChangePassW xo = new ChangePassW();
          xo.setVisible(true);
           xo.ss(ak);
           this.dispose();       // TODO add your handling code here:
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

    private void JPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPassActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(JFrame.ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if(JFirst.getText().equals("")||JLast.getText().equals("")||UIDS.getSelectedItem().equals("Choose")||JFaculty.getSelectedItem().equals("Choose")||JGender.getSelectedItem().equals("Select")||JEmail.getText().equals("")||JPhone.getText().equals("")||JPass.getText().equals("")){
            JOptionPane.showMessageDialog(null, "You must fill all field","Registration error",JOptionPane.ERROR_MESSAGE);
        }else{
            if(!Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$",JEmail.getText())){
                JOptionPane.showMessageDialog(null, "Please enter the valid email","Email error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                
                try{
                    String query = "INSERT INTO `student`(`Fname`, `Lname`, `ID`, `FACULTY`,`UserTP`, `GENDER`, `PHONENUMBER`, `EMAIL`, `PASSWORD`) VALUES (?,?,?,?,?,?,?,?,?)";
                    con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/civesystem?zeroDateTimeBehavior=convertToNull","root","");
                    pst = (PreparedStatement) con.prepareStatement(query);
               
                    pst.setString(1, JFirst.getText());
                    pst.setString(2, JLast.getText());
                    pst.setString(3, UIDS.getSelectedItem().toString());
                    pst.setString(4, JFaculty.getSelectedItem().toString());
                    pst.setString(5, ("Student"));
                    pst.setString(6, JGender.getSelectedItem().toString());
                    pst.setString(7, JPhone.getText());
                    pst.setString(8, JEmail.getText());
                    pst.setString(9, JPass.getText());
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "registration Successfully");
                    
                     JFirst.setText("");
                     JLast.setText("");
                     UIDS.setSelectedItem("Choose");
                     JFaculty.setSelectedItem("Choose");
                     JGender.setSelectedItem("Choose");
                     JEmail.setText("");
                     JPhone.setText("");
                     JPass.setText("");
                    
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "User Already Registered please selct another ID :)");
                }
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void UIDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIDSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UIDSActionPerformed

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
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddLecturer;
    private javax.swing.JLabel AddStudent;
    private javax.swing.JLabel ChangePass;
    private javax.swing.JLabel ChangePass1;
    private javax.swing.JTextField JEmail;
    private javax.swing.JComboBox<String> JFaculty;
    private javax.swing.JTextField JFirst;
    private javax.swing.JComboBox<String> JGender;
    private javax.swing.JTextField JLast;
    private javax.swing.JPasswordField JPass;
    private javax.swing.JFormattedTextField JPhone;
    private javax.swing.JLabel LogOut;
    private javax.swing.JLabel MyProFile;
    private javax.swing.JLabel STZ;
    private javax.swing.JComboBox<String> UIDS;
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

    final void ss(String shu) {
       ak = shu;
        STZ.setText(shu); //To change body of generated methods, choose Tools | Templates.
    }
}
