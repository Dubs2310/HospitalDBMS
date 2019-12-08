/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UpdateDeleteDoctor extends javax.swing.JFrame {
   
   

    ResultSet rsDoc;

    myDBCon dBCon;
    /**
     * Creates new form UpdateandDeleteDept
     */
    public UpdateDeleteDoctor() {
       
        initComponents();
                 this.setTitle("Update/Delete Doctor");
        setSize(717, 390);
        this.setLocationRelativeTo(null);
        lblDocIdError.setVisible(false);
        lblFnameError.setVisible(false);
        lblLnameError.setVisible(false);
        lblSalaryError.setVisible(false);
        lblSpecError.setVisible(false);
        dBCon = new myDBCon();
        getNewData();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
    
    private void getNewData(){
    
      try {
            // populate deptno field
            rsDoc = dBCon.executeStatement("SELECT doctor_id, first_name, last_name, speciality, salary FROM doctor ORDER BY doctor_id ASC ");
            rsDoc.first();

            populateFields();
        } catch (SQLException e) {
            javax.swing.JLabel label = new javax.swing.JLabel("SQL Error - Display selected doctor.");
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

        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDocId = new javax.swing.JTextField();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        txtSpec = new javax.swing.JTextField();
        lblDocIdError = new javax.swing.JLabel();
        lblLnameError = new javax.swing.JLabel();
        lblFnameError = new javax.swing.JLabel();
        lblSalaryError = new javax.swing.JLabel();
        lblSpecError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update/Delete Doctor");
        jLabel1.setPreferredSize(new java.awt.Dimension(670, 456));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 10, 720, 58);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(240, 290, 140, 45);

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(390, 290, 130, 45);

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnNext.setText("Next >>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        getContentPane().add(btnNext);
        btnNext.setBounds(535, 290, 160, 45);

        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnPrevious.setText("<< Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrevious);
        btnPrevious.setBounds(20, 290, 210, 45);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("DOCTOR ID:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 90, 113, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("FIRST NAME:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 130, 119, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("LAST NAME:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 170, 109, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("SALARY:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(140, 250, 77, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("SPECIALTY:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(110, 210, 107, 22);

        txtDocId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtDocId);
        txtDocId.setBounds(230, 80, 100, 30);

        txtFname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtFname);
        txtFname.setBounds(230, 120, 200, 30);

        txtLname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtLname);
        txtLname.setBounds(230, 160, 200, 30);

        txtSalary.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtSalary);
        txtSalary.setBounds(230, 240, 200, 30);

        txtSpec.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSpec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecActionPerformed(evt);
            }
        });
        getContentPane().add(txtSpec);
        txtSpec.setBounds(230, 200, 200, 30);

        lblDocIdError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblDocIdError.setForeground(new java.awt.Color(255, 0, 0));
        lblDocIdError.setText("error label");
        getContentPane().add(lblDocIdError);
        lblDocIdError.setBounds(450, 90, 220, 22);

        lblLnameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblLnameError.setForeground(new java.awt.Color(255, 0, 0));
        lblLnameError.setText("error label");
        getContentPane().add(lblLnameError);
        lblLnameError.setBounds(450, 160, 220, 22);

        lblFnameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblFnameError.setForeground(new java.awt.Color(255, 0, 0));
        lblFnameError.setText("error label");
        getContentPane().add(lblFnameError);
        lblFnameError.setBounds(450, 120, 220, 22);

        lblSalaryError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblSalaryError.setForeground(new java.awt.Color(255, 0, 0));
        lblSalaryError.setText("error label");
        getContentPane().add(lblSalaryError);
        lblSalaryError.setBounds(450, 250, 220, 22);

        lblSpecError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblSpecError.setForeground(new java.awt.Color(255, 0, 0));
        lblSpecError.setText("error label");
        getContentPane().add(lblSpecError);
        lblSpecError.setBounds(450, 210, 220, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void populateFields(){
    try {
            txtDocId.setText(rsDoc.getString("doctor_id"));
            txtFname.setText(rsDoc.getString("first_name"));
            txtLname.setText(rsDoc.getString("last_name"));
            txtSpec.setText(rsDoc.getString("speciality"));
            txtSalary.setText(rsDoc.getString("salary"));

            EnableDisableButtons();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeletePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
     private void EnableDisableButtons() {
        try {
            if (rsDoc.isFirst()) {
                btnPrevious.setEnabled(false);
            } else {
                btnPrevious.setEnabled(true);
            }
            if (rsDoc.isLast()) {
                btnNext.setEnabled(false);
            } else {
                btnNext.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeletePatient.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     
     private void MoveNext(){
         clearErrorLabel();
         try {
            if (!rsDoc.isLast()) {

                rsDoc.next();
                populateFields();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeletePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
   private void MovePrevious(){
       clearErrorLabel();
        try {
            // TODO add your handling code here:

            if (!rsDoc.isFirst()) {
                rsDoc.previous();
                populateFields();

            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeletePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   

   void clearErrorLabel()
   { 
        lblDocIdError.setVisible(false);
        lblFnameError.setVisible(false);
        lblLnameError.setVisible(false);
        lblSalaryError.setVisible(false);
        lblSpecError.setVisible(false);
        lblDocIdError.setText("");
       lblFnameError.setText("");
       lblLnameError.setText("");
       lblSalaryError.setText("");
       lblSpecError.setText("");
   }
   
    
   boolean isValidData() {
        clearErrorLabel();
        boolean result = true; // assume all details are true, set to false if otherwise 
        // you need to check format deails and make sure they are consistent with DB 
        if (txtDocId.getText().trim().isEmpty() || !isInteger(txtDocId.getText().trim())) {
            if (txtDocId.getText().trim().isEmpty()) {
                lblDocIdError.setText("Invalid. Cannot be empty.");
            } else if (!isInteger(txtDocId.getText().trim())) {
                lblDocIdError.setText("Invalid. Must be integer.");
            }
            lblDocIdError.setVisible(true);
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

        if (txtSalary.getText().trim().isEmpty() || !(isInteger(txtSalary.getText().trim()) || isDouble(txtSalary.getText().trim()))) {
            if (txtSalary.getText().trim().isEmpty()) {
                lblSalaryError.setText("Invalid. Cannot be empty.");
            } else if (!(isInteger(txtSalary.getText().trim()) || isDouble(txtSalary.getText().trim()))) {
                lblSalaryError.setText("Invalid. Must be number.");
            }
            lblSalaryError.setVisible(true);
            result = false;
        }

        if (txtSpec.getText().trim().isEmpty() || (txtSpec.getText().trim().length() > 30)) {
            if (txtSpec.getText().trim().isEmpty()) {
                lblSpecError.setText("Invalid. Cannot be empty.");
            } else if (txtSpec.getText().trim().length() > 30) {
                lblSpecError.setText("Invalid. Must be <= 30 chars.");
            }
            lblSpecError.setVisible(true);
            result = false;
        }

        return result;
    }
    private void txtLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLnameActionPerformed

    private void txtSpecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpecActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        MovePrevious();
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        MoveNext();
    }//GEN-LAST:event_btnNextActionPerformed

    
    private boolean isDocTreatingPatient(String docid) throws SQLException {
        boolean hasData = false;
        String stmtSQL = "SELECT doctors_id FROM treats WHERE doctors_id = " + docid;
        ResultSet rs = dBCon.executeStatement(stmtSQL);
        // isBeforeFirst() returns false if there are no data in the resultset
        hasData = rs.isBeforeFirst();

        return hasData;
    }
    
    private boolean isDocWorkingForWard(String docid) throws SQLException {
        boolean hasData = false;
        String stmtSQL = "SELECT doc_id FROM works_for WHERE doc_id = " + docid;
        ResultSet rs = dBCon.executeStatement(stmtSQL);
        // isBeforeFirst() returns false if there are no data in the resultset
        hasData = rs.isBeforeFirst();

        return hasData;
    }

    
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Confirm deletion", JOptionPane.WARNING_MESSAGE);
        if (choice != JOptionPane.OK_OPTION) {
            return;
        }

        try {
            if (isDocTreatingPatient(txtDocId.getText())) {
                JOptionPane.showMessageDialog(null, "Can't delete doctor having treatment");
                return;
            }
            if (isDocWorkingForWard(txtDocId.getText())) {
                JOptionPane.showMessageDialog(null, "Remove assignment from ward first");
                return;
            }
            
            // make the result set scrolable forward/backward updatable

            String statement = "DELETE doctor WHERE doctor_id = " + txtDocId.getText().trim();

            int result = dBCon.executePrepared(statement);
            if (result > 0) {
                javax.swing.JLabel label = new javax.swing.JLabel("Doc No " + txtDocId.getText().trim() + " deleted successfully.");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                getNewData();
            }

            dBCon.prepStatement.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error deleting doctor.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private boolean isDuplicate(int docid) throws SQLException {
        boolean isduplicate = false;
        String stmtSQL = "SELECT doctor_id FROM doctor WHERE doctor_id = " + docid;
        ResultSet rs = dBCon.executeStatement(stmtSQL);
        // isBeforeFirst() returns false if there are no data in the resultset
        isduplicate = rs.isBeforeFirst();

        return isduplicate;
    }
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        //confirm dialog
        int confirmationChoice = JOptionPane.showConfirmDialog(null, "Are you sure you want to update this?", "Confirm update", JOptionPane.WARNING_MESSAGE);
        if (confirmationChoice != JOptionPane.OK_OPTION){
            return;
        }

        try {
            if (isValidData()) {

                //check if department number exists
                if (!(txtDocId.getText().trim().equals(rsDoc.getString("doctor_id"))) && isDuplicate(Integer.parseInt(txtDocId.getText().trim())))
                {
                    lblDocIdError.setText("Doctor id already exists");
                    lblDocIdError.setVisible(true);

                    javax.swing.JLabel label = new javax.swing.JLabel("Doctor ID already exists");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                
                //If id changed, stop it
                if (!txtDocId.getText().trim().equals(rsDoc.getString("doctor_id"))) {
                    if (isDocTreatingPatient(rsDoc.getString("doctor_id"))) {
                        JOptionPane.showMessageDialog(null, "Can't update doctorid having treatment");
                        return;
                    }
                    if (isDocWorkingForWard(rsDoc.getString("doctor_id"))) {
                        JOptionPane.showMessageDialog(null, "Remove assignment from ward first");
                        return;
                    }
                }

                String statement = "UPDATE doctor SET doctor_id = " + 
                        txtDocId.getText().trim() + 
                        ", first_name = '" + txtFname.getText().trim().toUpperCase() +
                        "', last_name = '" + txtLname.getText().trim().toUpperCase() + 
                        "', speciality = '" + txtSpec.getText().trim().toUpperCase() + 
                        "', salary = " + txtSalary.getText().trim() + 
                        " WHERE doctor_id = " + rsDoc.getString("doctor_id");
                
                int result = dBCon.executePrepared(statement);

                if (result > 0) {
                    //updated succesfully
                    javax.swing.JLabel label = new javax.swing.JLabel("Doctor No " + txtDocId.getText() + " updated successfully.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

                    getNewData();
                } else {
                    System.out.println("Error! Failed server side");
                    // check validation errors
                }

            } else {
                javax.swing.JLabel label = new javax.swing.JLabel("Please fix validation errors...");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

        } catch (SQLException e) {
            //error updating department
            JOptionPane.showMessageDialog(null, "Error updating doctor." + e.getMessage());

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateDeleteDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDeleteDoctor().setVisible(true);
            }
        });
    }
    //check if the String passed is an integer
public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
//check if the String passed is a double
    public boolean isDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblDocIdError;
    private javax.swing.JLabel lblFnameError;
    private javax.swing.JLabel lblLnameError;
    private javax.swing.JLabel lblSalaryError;
    private javax.swing.JLabel lblSpecError;
    private javax.swing.JTextField txtDocId;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtSpec;
    // End of variables declaration//GEN-END:variables

   
}
