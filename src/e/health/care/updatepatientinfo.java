package e.health.care;

import connectiondatabase.connectionprovider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class updatepatientinfo extends javax.swing.JFrame {

    
    public updatepatientinfo() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        textfield = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        blood = new javax.swing.JComboBox<>();
        search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(280, 150));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 4, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Patient ID");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Name");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Age");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Contact No");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Email");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Blood Group");

        gender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select option", "Male", "Female", "Custom" }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Gender");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Address");

        update.setBackground(new java.awt.Color(0, 102, 102));
        update.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/health/care/icon/save-icon--1.png"))); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        CancelBtn.setBackground(new java.awt.Color(204, 204, 204));
        CancelBtn.setForeground(new java.awt.Color(204, 51, 0));
        CancelBtn.setText("Cancel");
        CancelBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        textfield.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        textfield.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        textfield.setPreferredSize(new java.awt.Dimension(350, 20));

        name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        name.setPreferredSize(new java.awt.Dimension(350, 20));

        age.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        age.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        age.setPreferredSize(new java.awt.Dimension(350, 20));

        contact.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        contact.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        contact.setPreferredSize(new java.awt.Dimension(350, 20));

        email.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        email.setPreferredSize(new java.awt.Dimension(350, 20));

        address.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        address.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        address.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        address.setPreferredSize(new java.awt.Dimension(350, 20));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/health/care/icon/record1.png"))); // NOI18N
        jLabel9.setText("Patient's Information ");

        blood.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        blood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select option", "A(+ve)", "A(-ve)", "B(+ve)", "B(-ve)", "AB(+ve)", "AB(-ve)", "O(+ve)", "O(-ve)" }));
        blood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodActionPerformed(evt);
            }
        });

        search.setBackground(new java.awt.Color(0, 102, 102));
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/health/care/icon/search.png"))); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(289, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(290, 290, 290))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(contact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(blood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(search))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1)
                    .addComponent(textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(blood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(20, 20, 20)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/healthcare";
        SUser = "root";
        SPass = "arefin";

        String patientid= textfield.getText();
        String patientname=name.getText();
        String patientage= age.getText();
        String patientcontact=contact.getText();
        String patientemail= email.getText();
        String patientblood=(String) blood.getSelectedItem();
        String patientgender=(String) gender.getSelectedItem();
        String patientaddress= address.getText();

        if(patientname.isEmpty() || patientage.isEmpty() || patientcontact.isEmpty()||patientemail.isEmpty() || patientblood.isEmpty()|| patientgender.isEmpty() || patientaddress.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter data in all field!", "Error",
                JOptionPane.ERROR_MESSAGE);
        }
        else {

            try{

                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
                Statement st = con.createStatement();

                //Connection con=connectionprovider.getCon();
                //Statement st=con.createStatement();
                String query = "UPDATE patientinfo SET patientname='" + patientname + "', age='" + patientage + "', contact='" + patientcontact + "', email='" + patientemail + "', bloodgroup='" + patientblood + "', gender='" + patientgender + "', address='" + patientaddress + "' WHERE patientID='" + patientid + "'";

                st.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Successfully! Updated!");
                setVisible(false);
                this.dispose();
                //new Addnewpatient().setVisible(true);

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Please enter your data in correct form!1");
            }
        }

    }//GEN-LAST:event_updateActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void bloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/healthcare";
        SUser = "root";
        SPass = "arefin";
        String patientid= textfield.getText();
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();

            String query = "SELECT * FROM patientinfo WHERE patientID= '"+patientid+"'";
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next()){
                name.setText(rs.getString(2));
                age.setText(rs.getString(3));
                contact.setText(rs.getString(4));
                email.setText(rs.getString(5));
                blood.setSelectedItem(rs.getString(6));
                gender.setSelectedItem(rs.getString(7));
                address.setText(rs.getString(8));
                textfield.setEditable(false);
                
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Patient ID doesn't exist!");
            }
         }
         catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Connection Error: " + e.getMessage());
         }
        
    }//GEN-LAST:event_searchActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatepatientinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBtn;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JComboBox<String> blood;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JButton search;
    private javax.swing.JTextField textfield;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
