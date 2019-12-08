
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class UpdateDeletePatient extends javax.swing.JFrame {

    myDBCon dbCon;
    ResultSet rsPatient;
    ResultSet rsWardId;

    /**
     * Creates new form AddEmployee
     */
    public UpdateDeletePatient() {
        
        initComponents();
         this.setTitle("Update/Delete Patient");
        this.setLocationRelativeTo(null);
        lblPatIdError.setVisible(false);
        lblFnameError.setVisible(false);
        lblLnameError.setVisible(false);
        lblDateOfBirthError.setVisible(false);
        dbCon = new myDBCon();
        getNewData();
    }

    private void getNewData() {

        try {
            String str;

            rsWardId = dbCon.executeStatement("SELECT ward_id FROM ward ORDER BY ward_id ASC ");
            cmbWardId.removeAllItems();
            while (rsWardId.next()) {
                cmbWardId.addItem(rsWardId.getString("ward_id"));
            }

            rsPatient = dbCon.executeStatement("SELECT patient_id, fname, lname, date_of_birth, ward_id FROM patient ORDER BY patient_id ASC ");

            // populate rest of fields
            rsPatient.beforeFirst();
            rsPatient.first();
            populateFields();
        } catch (SQLException e) {
            javax.swing.JLabel label = new javax.swing.JLabel("SQL Error - Display selected patient.");
            label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
            JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        cmbWardId = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtPatId = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        lblPatIdError = new javax.swing.JLabel();
        lblFnameError = new javax.swing.JLabel();
        lblLnameError = new javax.swing.JLabel();
        lblDateOfBirthError = new javax.swing.JLabel();
        ftxtDateOfBirth = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update/Delete Employee");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update/Delete Patient");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("PATIENT ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("FIRST NAME:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("LAST NAME:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("WARD ID:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("DATE OF BIRTH:");

        txtFname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtLname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLnameActionPerformed(evt);
            }
        });

        cmbWardId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtPatId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnNext.setText("Next >>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnPrevious.setText("<< Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        lblPatIdError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblPatIdError.setForeground(new java.awt.Color(255, 0, 0));
        lblPatIdError.setText("error label");

        lblFnameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblFnameError.setForeground(new java.awt.Color(255, 0, 0));
        lblFnameError.setText("error label");

        lblLnameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblLnameError.setForeground(new java.awt.Color(255, 0, 0));
        lblLnameError.setText("error label");

        lblDateOfBirthError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblDateOfBirthError.setForeground(new java.awt.Color(255, 0, 0));
        lblDateOfBirthError.setText("error label");

        ftxtDateOfBirth.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d-MMM-yyyy"))));
        ftxtDateOfBirth.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ftxtDateOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtDateOfBirthActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(btnPrevious))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPatId, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtLname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ftxtDateOfBirth))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFnameError, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(lblLnameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDateOfBirthError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPatIdError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext))
                    .addComponent(cmbWardId, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPatId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPatIdError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFnameError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLnameError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(lblDateOfBirthError)
                    .addComponent(ftxtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cmbWardId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrevious)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnNext))
                .addGap(0, 42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLnameActionPerformed

    private String getFormattedDate(String inpDate){
        DateTimeFormatter inpFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate retrievedTime = LocalDate.parse(inpDate.substring(0, 10));
        DateTimeFormatter outFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        return retrievedTime.format(outFormatter);
    }
    
    private void populateFields() {
        try {
            txtPatId.setText(rsPatient.getString("patient_id"));
            txtFname.setText(rsPatient.getString("fname"));
            txtLname.setText(rsPatient.getString("lname"));
            cmbWardId.setSelectedItem(rsPatient.getString("ward_id"));
            ftxtDateOfBirth.setText(getFormattedDate(rsPatient.getString("date_of_birth")));
            
            EnableDisableButtons();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeletePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void MoveNext() {
        try {
            // TODO add your handling code here:
            if (!rsPatient.isLast()) {
                rsPatient.next();
                populateFields();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeletePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        MoveNext();
    }//GEN-LAST:event_btnNextActionPerformed

    private void MovePrevious() {
        try {
            // TODO add your handling code here:
            if (!rsPatient.isFirst()) {
                rsPatient.previous();
                populateFields();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeletePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void EnableDisableButtons() {
        try {
            if (rsPatient.isFirst()) {
                btnPrevious.setEnabled(false);
            } else {
                btnPrevious.setEnabled(true);
            }
            if (rsPatient.isLast()) {
                btnNext.setEnabled(false);
            } else {
                btnNext.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeletePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        MovePrevious();
    }//GEN-LAST:event_btnPreviousActionPerformed

    
    private void cascadePatientDeletion(String patid) throws SQLException {
        String stmtSQL = "DELETE treats WHERE patients_id = " + patid;
        dbCon.executePrepared(stmtSQL);
        // isBeforeFirst() returns false if there are no data in the resultset

    }
    
    private boolean isPatientBeingTreated(String patid) throws SQLException {
        boolean hasData = false;
        String stmtSQL = "SELECT patients_id FROM treats WHERE patients_id = " + patid;
        ResultSet rs = dbCon.executeStatement(stmtSQL);
        // isBeforeFirst() returns false if there are no data in the resultset
        hasData = rs.isBeforeFirst();

        return hasData;
    }
    
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        //ask confirmation
         int confirmationChoice = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this?", "Confirm delete", JOptionPane.WARNING_MESSAGE);
        if (confirmationChoice != JOptionPane.OK_OPTION){
            return;
        }
        try {
            cascadePatientDeletion(txtPatId.getText().trim());
            // make the result set scrolable forward/backward updatable
            String prepSQL = "DELETE patient WHERE patient_id = " + txtPatId.getText().trim();
            int result = dbCon.executePrepared(prepSQL);
            if (result > 0) {
                javax.swing.JLabel label = new javax.swing.JLabel("Patient No " + txtPatId.getText().trim() + " deleted successfully.");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                getNewData();
            }
        } catch (SQLException e) {
            //error deleting employee
            JOptionPane.showMessageDialog(null, "Error deleting patient.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    void clearErrorLabels() {
        lblPatIdError.setText("");
        lblPatIdError.setVisible(false);
        lblFnameError.setText("");
        lblFnameError.setVisible(false);
        lblLnameError.setText("");
        lblLnameError.setVisible(false);
        lblDateOfBirthError.setText("");
        lblDateOfBirthError.setVisible(false);
    }

    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public boolean isDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
    
    private boolean isDuplicate(int patid) throws SQLException {
        boolean isduplicate = false;
        String stmtSQL = "SELECT patient_id FROM patient WHERE patient_id = " + patid;
        ResultSet rs = dbCon.executeStatement(stmtSQL);
        // isBeforeFirst() returns false if there are no data in the resultset
        isduplicate = rs.isBeforeFirst();
        rs.close();
        return isduplicate;
    }

    boolean isValidData() {
        clearErrorLabels();
        boolean result = true; // assume all details are true, set to false if otherwise 
        // you need to check format deails and make sure they are consistent with DB 
        if (txtPatId.getText().trim().isEmpty() || !isInteger(txtPatId.getText().trim())) {
            if (txtPatId.getText().trim().isEmpty()) {
                lblPatIdError.setText("Invalid. Cannot be empty.");
            } else if (!isInteger(txtPatId.getText().trim())) {
                lblPatIdError.setText("Invalid. Must be integer.");
            }
            lblPatIdError.setVisible(true);
            result = false;
        }

        if (txtFname.getText().trim().isEmpty() || (txtFname.getText().trim().length() > 30)) {
            if (txtFname.getText().trim().isEmpty()) {
                lblFnameError.setText("Invalid. Cannot be empty.");
            } else if ((txtFname.getText().trim().length() > 30)) {
                lblFnameError.setText("Invalid. Must be <= 30 chars.");
            }
            lblFnameError.setVisible(true);
            result = false;
        }

        if (txtLname.getText().trim().isEmpty() || (txtLname.getText().trim().length() > 30)) {
            if (txtLname.getText().trim().isEmpty()) {
                lblLnameError.setText("Invalid. Cannot be empty.");
            } else if (txtLname.getText().trim().length() > 30) {
                lblLnameError.setText("Invalid. Must be <= 30 chars.");
            }
            lblLnameError.setVisible(true);
            result = false;
        }

        if (ftxtDateOfBirth.getText().trim().isEmpty()) {
            lblDateOfBirthError.setText("Invalid. Cannot be empty.");
            lblDateOfBirthError.setVisible(true);
            result = false;
        }

        return result;
    }

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        //ask for confirmation
        int confirmationChoice = JOptionPane.showConfirmDialog(null, "Are you sure you want to update this?", "Confirm update", JOptionPane.WARNING_MESSAGE);
        if (confirmationChoice != JOptionPane.OK_OPTION){
            return;
        }
        try {
         
            if (isValidData()) {
                
                if (!(txtPatId.getText().trim().equals(rsPatient.getString("patient_id"))) && isDuplicate(Integer.parseInt(txtPatId.getText().trim()))) {
                    lblPatIdError.setText("Patient id already exists");
                    lblPatIdError.setVisible(true);

                    javax.swing.JLabel label = new javax.swing.JLabel("Patient ID already exists");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                
                if (!txtPatId.getText().trim().equals(rsPatient.getString("patient_id"))) {
                    if (isPatientBeingTreated(rsPatient.getString("patient_id"))) {
                        JOptionPane.showMessageDialog(null, "Cant change id of patient on treatment");
                        return;
                    }
                }
                
                String prepSQL = "UPDATE patient SET patient_id = " + 
                        txtPatId.getText().trim() + 
                        ", fname = '" + txtFname.getText().trim().toUpperCase() +
                        "', lname = '" + txtLname.getText().trim().toUpperCase() + 
                        "', date_of_birth = '" + ftxtDateOfBirth.getText() + 
                        "', ward_id = " + cmbWardId.getSelectedItem() + 
                        " WHERE patient_id = " + rsPatient.getString("patient_id");
                System.out.println(prepSQL);
                int result = dbCon.executePrepared(prepSQL);
                if (result > 0) {
                    //if successfull
                    javax.swing.JLabel label = new javax.swing.JLabel("Patient Number " + txtPatId.getText() + " updated successfully.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

                    getNewData();
                }
                } else {
                //validation error
                javax.swing.JLabel label = new javax.swing.JLabel("Please fix validation errors...");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);

            }

        } catch (SQLException e) {
            //error updating eployee
            JOptionPane.showMessageDialog(null, "Error updating patient.");

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void ftxtDateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtDateOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtDateOfBirthActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbWardId;
    private javax.swing.JFormattedTextField ftxtDateOfBirth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblDateOfBirthError;
    private javax.swing.JLabel lblFnameError;
    private javax.swing.JLabel lblLnameError;
    private javax.swing.JLabel lblPatIdError;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtPatId;
    // End of variables declaration//GEN-END:variables
}
