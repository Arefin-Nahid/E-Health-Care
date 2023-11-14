
package e.health.care;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import java.awt.Desktop;
import java.net.URL;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {
    
    public int i=0;
    String username;
    public Home(String e) {
        initComponents();
        this.username = e; 
        
    }

    private Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Healthprofile = new javax.swing.JButton();
        ConsultationBtn = new javax.swing.JButton();
        MedicineBtn = new javax.swing.JButton();
        Diagnosis = new javax.swing.JButton();
        LogOutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/health/care/icon/two arrow.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(80, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 188, -1));

        Healthprofile.setBackground(new java.awt.Color(0, 153, 153));
        Healthprofile.setForeground(new java.awt.Color(204, 204, 204));
        Healthprofile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/health/care/icon/profile.jpg"))); // NOI18N
        Healthprofile.setText("Health Profile");
        Healthprofile.setPreferredSize(new java.awt.Dimension(80, 50));
        Healthprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HealthprofileActionPerformed(evt);
            }
        });
        jPanel1.add(Healthprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 145, 188, -1));

        ConsultationBtn.setBackground(new java.awt.Color(0, 153, 153));
        ConsultationBtn.setForeground(new java.awt.Color(204, 204, 204));
        ConsultationBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/health/care/icon/consultation.png"))); // NOI18N
        ConsultationBtn.setText("Online Consultation");
        ConsultationBtn.setPreferredSize(new java.awt.Dimension(80, 50));
        ConsultationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultationBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ConsultationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 188, -1));

        MedicineBtn.setBackground(new java.awt.Color(0, 153, 153));
        MedicineBtn.setForeground(new java.awt.Color(204, 204, 204));
        MedicineBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/health/care/icon/pharmacy.png"))); // NOI18N
        MedicineBtn.setText("Medicine");
        MedicineBtn.setPreferredSize(new java.awt.Dimension(80, 50));
        MedicineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicineBtnActionPerformed(evt);
            }
        });
        jPanel1.add(MedicineBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 355, 188, -1));

        Diagnosis.setBackground(new java.awt.Color(0, 153, 153));
        Diagnosis.setForeground(new java.awt.Color(204, 204, 204));
        Diagnosis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/health/care/icon/record.png"))); // NOI18N
        Diagnosis.setText("Diagnosis");
        Diagnosis.setPreferredSize(new java.awt.Dimension(80, 50));
        Diagnosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagnosisActionPerformed(evt);
            }
        });
        jPanel1.add(Diagnosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 188, -1));

        LogOutBtn.setBackground(new java.awt.Color(204, 204, 204));
        LogOutBtn.setForeground(new java.awt.Color(204, 51, 0));
        LogOutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/health/care/icon/lgout.png"))); // NOI18N
        LogOutBtn.setText("LOGOUT");
        LogOutBtn.setPreferredSize(new java.awt.Dimension(80, 50));
        LogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(LogOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 565, 188, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/health/care/icon/homeicon.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(i==0){
            Healthprofile.setLocation(260, 40);
            ConsultationBtn.setLocation(480, 40);
            MedicineBtn.setLocation(700, 40);
            Diagnosis.setLocation(920, 40);
            LogOutBtn.setLocation(1140, 40);
            i=1;
            
        }
        else{
            Healthprofile.setLocation(40, 145);
            ConsultationBtn.setLocation(40, 250);
            MedicineBtn.setLocation(40, 355);
            Diagnosis.setLocation(40, 460);
            LogOutBtn.setLocation(40, 565);
            i=0;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBtnActionPerformed
        int a= JOptionPane.showConfirmDialog(null, "Do you want to LogOut?", "Select Option", JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
            Display DisplayFrame = new Display();
            DisplayFrame.setVisible(true);
            DisplayFrame.pack();
            DisplayFrame.setLocationRelativeTo(null); 
            this.dispose();
        }
    }//GEN-LAST:event_LogOutBtnActionPerformed

    private void HealthprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HealthprofileActionPerformed
            healthprofile profileFrame = new healthprofile(username);
            profileFrame.setVisible(true);
            profileFrame.pack();
            profileFrame.setLocationRelativeTo(null);
            this.dispose();
    }//GEN-LAST:event_HealthprofileActionPerformed

    private void ConsultationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultationBtnActionPerformed
            online_consultation consultationFrame = new online_consultation(username);
            consultationFrame.setVisible(true);
            consultationFrame.pack();
            consultationFrame.setLocationRelativeTo(null); 
            this.dispose();   
    }//GEN-LAST:event_ConsultationBtnActionPerformed

    private void MedicineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicineBtnActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://epharma.com.bd/").toURI());
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_MedicineBtnActionPerformed

    private void DiagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagnosisActionPerformed
            Diagnosis DiagnosisFrame = new Diagnosis(username);
            DiagnosisFrame.setVisible(true);
            DiagnosisFrame.pack();
            DiagnosisFrame.setLocationRelativeTo(null); 
            this.dispose();
    }//GEN-LAST:event_DiagnosisActionPerformed


    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultationBtn;
    private javax.swing.JButton Diagnosis;
    private javax.swing.JButton Healthprofile;
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JButton MedicineBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
