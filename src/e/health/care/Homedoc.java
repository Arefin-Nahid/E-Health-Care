
package e.health.care;

import javax.swing.JOptionPane;


public class Homedoc extends javax.swing.JFrame {
    public int i=0;
   
    public Homedoc() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Addnewpatient = new javax.swing.JButton();
        AddDiagnosisInfo = new javax.swing.JButton();
        historyofpatient = new javax.swing.JButton();
        updaterecord = new javax.swing.JButton();
        LogOutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/health/care/icon/leftdown.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1125, 40, 201, -1));

        Addnewpatient.setBackground(new java.awt.Color(0, 153, 153));
        Addnewpatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/health/care/icon/ADDPATIENT.png"))); // NOI18N
        Addnewpatient.setText("Add New Patient");
        Addnewpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddnewpatientActionPerformed(evt);
            }
        });
        jPanel1.add(Addnewpatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(1125, 152, 201, -1));

        AddDiagnosisInfo.setBackground(new java.awt.Color(0, 153, 153));
        AddDiagnosisInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/health/care/icon/diagnosis2.png"))); // NOI18N
        AddDiagnosisInfo.setText("Add Diagnosis Info");
        AddDiagnosisInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDiagnosisInfoActionPerformed(evt);
            }
        });
        jPanel1.add(AddDiagnosisInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1125, 264, 201, -1));

        historyofpatient.setBackground(new java.awt.Color(0, 153, 153));
        historyofpatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/health/care/icon/record.png"))); // NOI18N
        historyofpatient.setText("Full History of Patient");
        historyofpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyofpatientActionPerformed(evt);
            }
        });
        jPanel1.add(historyofpatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(1125, 376, 201, -1));

        updaterecord.setBackground(new java.awt.Color(0, 153, 153));
        updaterecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/health/care/icon/record1.png"))); // NOI18N
        updaterecord.setText("Update Patient record");
        updaterecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updaterecordActionPerformed(evt);
            }
        });
        jPanel1.add(updaterecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(1125, 488, -1, -1));

        LogOutBtn.setBackground(new java.awt.Color(204, 204, 204));
        LogOutBtn.setForeground(new java.awt.Color(204, 0, 0));
        LogOutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/health/care/icon/lgout.png"))); // NOI18N
        LogOutBtn.setText("LOGOUT");
        LogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(LogOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1125, 591, 201, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/health/care/icon/homedoc.png"))); // NOI18N
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
            Addnewpatient.setLocation(912, 40);
            AddDiagnosisInfo.setLocation(684, 40);
            historyofpatient.setLocation(472, 40);
            updaterecord.setLocation(250, 40);
            LogOutBtn.setLocation(32, 40);
            i=1;
            
        }
        else{
            Addnewpatient.setLocation(1132, 150);
            AddDiagnosisInfo.setLocation(1132, 260);
            historyofpatient.setLocation(1132, 370);
            updaterecord.setLocation(1132, 480);
            LogOutBtn.setLocation(1132, 590);
            i=0;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AddnewpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddnewpatientActionPerformed
            Addnewpatient AddnewpatientFrame = new Addnewpatient();
            AddnewpatientFrame.setVisible(true);
            AddnewpatientFrame.pack();
            AddnewpatientFrame.setLocationRelativeTo(null); 
    }//GEN-LAST:event_AddnewpatientActionPerformed

    private void AddDiagnosisInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDiagnosisInfoActionPerformed
            adddiagnosisinfo AdddiginfoFrame = new adddiagnosisinfo();
            AdddiginfoFrame.setVisible(true);
            AdddiginfoFrame.pack();
            AdddiginfoFrame.setLocationRelativeTo(null); 
    }//GEN-LAST:event_AddDiagnosisInfoActionPerformed

    private void historyofpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyofpatientActionPerformed
            full_history_of_patient historyFrame = new full_history_of_patient();
            historyFrame.setVisible(true);
            historyFrame.pack();
            historyFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_historyofpatientActionPerformed

    private void updaterecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updaterecordActionPerformed
            updatepatientinfo updateFrame = new updatepatientinfo();
            updateFrame.setVisible(true);
            updateFrame.pack();
            updateFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_updaterecordActionPerformed

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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homedoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDiagnosisInfo;
    private javax.swing.JButton Addnewpatient;
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JButton historyofpatient;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton updaterecord;
    // End of variables declaration//GEN-END:variables
}
