
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class AddTreats extends javax.swing.JFrame {

    myDBCon dbCon;
    ResultSet rsTreats;
    ResultSet rsPat;
    ResultSet rsDoc;


    public AddTreats() {
        initComponents();
        this.setLocationRelativeTo(null); // center form in screen 
        // set all error labels to invisible
        lblStartDateError.setVisible(false);
        lblEndDateError.setVisible(false);


        try {
            dbCon = new myDBCon();
            rsPat = dbCon.executeStatement("SELECT patient_id FROM patient ORDER BY patient_id ASC");
            while (rsPat.next()) {
                cmbPat.addItem(rsPat.getString("patient_id"));
            }
            rsDoc = dbCon.executeStatement("SELECT doctor_id FROM doctor ORDER BY doctor_id ASC");
            while (rsDoc.next()) {
                cmbDoc.addItem(rsDoc.getString("doctor_id"));
            }
        } catch (SQLException e) {
            System.out.println(e);
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbDoc = new javax.swing.JComboBox<>();
        btnAddNewTreats = new javax.swing.JButton();
        lblStartDateError = new javax.swing.JLabel();
        ftxtStartDate = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbPat = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        ftxtEndDate = new javax.swing.JFormattedTextField();
        lblEndDateError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Employee");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Add New Treatment");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("DOCTOR ID:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("START DATE:");

        cmbDoc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnAddNewTreats.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddNewTreats.setText("Add New");
        btnAddNewTreats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewTreatsActionPerformed(evt);
            }
        });

        lblStartDateError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblStartDateError.setForeground(new java.awt.Color(255, 0, 0));
        lblStartDateError.setText("error label");

        ftxtStartDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d-MMM-yyyy"))));
        ftxtStartDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ftxtStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtStartDateActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("PATIENT ID:");

        cmbPat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbPat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPatActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("END DATE:");

        ftxtEndDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d-MMM-yyyy"))));
        ftxtEndDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ftxtEndDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtEndDateActionPerformed(evt);
            }
        });

        lblEndDateError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblEndDateError.setForeground(new java.awt.Color(255, 0, 0));
        lblEndDateError.setText("error label");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ftxtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblEndDateError, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ftxtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblStartDateError, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddNewTreats)
                .addGap(202, 202, 202))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cmbDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(cmbPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ftxtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStartDateError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ftxtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndDateError))
                .addGap(18, 18, 18)
                .addComponent(btnAddNewTreats)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // verify valid entry of integer values
    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    // verify valid entry of double values
    public boolean isDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    void clearErrorLabels() { // clear all labels used to display error messages 

        lblStartDateError.setText("");
        lblStartDateError.setVisible(false);
        lblEndDateError.setText("");
        lblEndDateError.setVisible(false);
    }

    // validate all user entry before sending new employee details to DB
    boolean isValidData() {
        clearErrorLabels();
        boolean result = true; // assume all details are true, set to false if otherwise 
        // you need to check format deails and make sure they are consistent with DB 
        if (ftxtStartDate.getText().trim().isEmpty()) {
            lblStartDateError.setText("Invalid. Cannot be empty.");
            lblStartDateError.setVisible(true);
            result = false;
        }
        
        if (ftxtEndDate.getText().trim().isEmpty()) {
            lblEndDateError.setText("Invalid. Cannot be empty.");
            lblEndDateError.setVisible(true);
            result = false;
        }

        return result;
    }

    void clearInputBoxes() { // clear for every new entry 
        ftxtEndDate.setText("");
        ftxtStartDate.setText("");
        
        cmbDoc.setSelectedIndex(0);
        cmbPat.setSelectedIndex(0);
    }
    
    private String getFormattedDate(String inpDate) {
        DateTimeFormatter inpFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate retrievedTime = LocalDate.parse(inpDate.substring(0, 10));
        DateTimeFormatter outFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        return retrievedTime.format(outFormatter);
    }

    private boolean isDuplicate(int docid, int patid, String startDate) throws SQLException {
        boolean isduplicate = false;
        String stmtSQL = "SELECT doctors_id, patients_id, first_date FROM treats WHERE patients_id = " 
                + patid +
                " AND doctors_id = " + docid + 
                " AND first_date = '" + startDate + 
                "'";
        ResultSet rs = dbCon.executeStatement(stmtSQL);
        // isBeforeFirst() returns false if there are no data in the resultset
        isduplicate = rs.isBeforeFirst();

        return isduplicate;
    }
    
    private void btnAddNewTreatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewTreatsActionPerformed
        // TODO add your handling code here:

        try {
           // you need also to verify that the empno is unique and not duplicate 
              
            if (isValidData() && !isDuplicate(
                    Integer.parseInt(cmbDoc.getSelectedItem().toString()),
                    Integer.parseInt(cmbPat.getSelectedItem().toString()),
                    ftxtStartDate.getText())) {
              
                // if new employee details are valid, then add new employee to DB
                String prepSQL = "INSERT INTO treats (doctors_id, patients_id, first_date, last_date) VALUES (" 
                        + cmbDoc.getSelectedItem().toString() + ", "
                        + cmbPat.getSelectedItem().toString()
                        + ", '" + ftxtStartDate.getText().trim()
                        + "', '" + ftxtEndDate.getText().trim() + "')";
                
                System.out.println(prepSQL);

                int result = dbCon.executePrepared(prepSQL);
                //if succesfull
                if (result > 0) {

                    javax.swing.JLabel label = new javax.swing.JLabel("New treatment added successfully.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                    clearInputBoxes();
                }  }
                else { //validation error
                if (!isDuplicate(
                    Integer.parseInt(cmbDoc.getSelectedItem().toString()),
                    Integer.parseInt(cmbPat.getSelectedItem().toString()),
                    ftxtStartDate.getText())) {
                    javax.swing.JLabel label = new javax.swing.JLabel("Please fix validation errors...");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
                } else { 
                    javax.swing.JLabel label = new javax.swing.JLabel("Treatment Already exists.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.INFORMATION_MESSAGE);
                    
                }

            }
        } catch (SQLException e) {
            //error adding employee
            JOptionPane.showMessageDialog(null, "Error adding new treatment."+e.getMessage());
        }
    }//GEN-LAST:event_btnAddNewTreatsActionPerformed

    private void ftxtStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtStartDateActionPerformed

    private void ftxtEndDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtEndDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtEndDateActionPerformed

    private void cmbPatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewTreats;
    private javax.swing.JComboBox<String> cmbDoc;
    private javax.swing.JComboBox<String> cmbPat;
    private javax.swing.JFormattedTextField ftxtEndDate;
    private javax.swing.JFormattedTextField ftxtStartDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblEndDateError;
    private javax.swing.JLabel lblStartDateError;
    // End of variables declaration//GEN-END:variables
}