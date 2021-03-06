
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class UpdateDeleteLoginUser extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployee
     */
    myDBCon dbCon;

    ResultSet rs;

    public UpdateDeleteLoginUser() {
       
        initComponents();
          this.setTitle("Update/Delete Login User");
        // center form in screen 
        this.setLocationRelativeTo(null);
        // set all error labels to invisible
        lblUsernameError.setVisible(false);
        lblPasswordError.setVisible(false);
        lblConfirmPasswordError.setVisible(false);
        lblNameError.setVisible(false);

        //populate mgr and deptno combo boxes
        dbCon = new myDBCon();
        getNewData();

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
        jLabel8 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        cmbUserType = new javax.swing.JComboBox<>();
        btnUpdateUser = new javax.swing.JButton();
        lblUsernameError = new javax.swing.JLabel();
        lblConfirmPasswordError = new javax.swing.JLabel();
        lblPasswordError = new javax.swing.JLabel();
        lblNameError = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        btnDeleteUser = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Login User");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Update/Delete Login User");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Password:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Confirm Password:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Type:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Name:");

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cmbUserType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnUpdateUser.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnUpdateUser.setText("Update");
        btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserActionPerformed(evt);
            }
        });

        lblUsernameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblUsernameError.setForeground(new java.awt.Color(255, 0, 0));
        lblUsernameError.setText("error label");

        lblConfirmPasswordError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblConfirmPasswordError.setForeground(new java.awt.Color(255, 0, 0));
        lblConfirmPasswordError.setText("error label");

        lblPasswordError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblPasswordError.setForeground(new java.awt.Color(255, 0, 0));
        lblPasswordError.setText("error label");

        lblNameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblNameError.setForeground(new java.awt.Color(255, 0, 0));
        lblNameError.setText("error label");

        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        txtConfirmPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        btnDeleteUser.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDeleteUser.setText("Delete");
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnPrevious)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(txtUsername)
                                    .addComponent(txtPassword)
                                    .addComponent(txtConfirmPassword)
                                    .addComponent(cmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblPasswordError, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(lblConfirmPasswordError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblUsernameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUpdateUser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDeleteUser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNext)))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsernameError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPasswordError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConfirmPasswordError))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateUser)
                    .addComponent(btnDeleteUser)
                    .addComponent(btnNext)
                    .addComponent(btnPrevious))
                .addGap(0, 46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void getNewData() {
        try {
            String str;
            // populate deptno field
            rs = dbCon.executeStatement("SELECT username, name, type from users ORDER BY username ASC");

//populate usertype combo
            ResultSet rsUserType = dbCon.executeStatement("SELECT Type FROM users ORDER BY Type");
            cmbUserType.removeAllItems();
            while (rsUserType.next()) {
                if (rsUserType.getInt("type") == 0){
                    cmbUserType.addItem("Administrator");
                }
                else{
                    cmbUserType.addItem("Normal");
                }
            }

            // populate rest of fields
            rs.beforeFirst();
            rs.first();
            populateFields();
        } catch (SQLException e) {
            javax.swing.JLabel label = new javax.swing.JLabel("SQL Error - Display selected empno.");
            label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
            JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void populateFields() {
        try {
            txtName.setText(rs.getString("Name"));
            txtUsername.setText(rs.getString("Username"));
            if (Integer.parseInt(rs.getString("Type")) == 0) {
                cmbUserType.setSelectedIndex(0);
            } else {
                cmbUserType.setSelectedIndex(1);
            }

            EnableDisableButtons();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeletePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void EnableDisableButtons() {
        try {
            if (rs.isFirst()) {
                btnPrevious.setEnabled(false);
            } else {
                btnPrevious.setEnabled(true);
            }
            if (rs.isLast()) {
                btnNext.setEnabled(false);
            } else {
                btnNext.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeletePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void clearErrorLabels() {
        lblUsernameError.setText("");
        lblUsernameError.setVisible(false);
        lblPasswordError.setText("");
        lblPasswordError.setVisible(false);
        lblConfirmPasswordError.setText("");
        lblConfirmPasswordError.setVisible(false);
        lblNameError.setText("");
        lblNameError.setVisible(false);
    }
    //check if the data in the text fields are all valid
    boolean isValidPassword() {
        boolean result = true;

        if (txtPassword.getText().trim().isEmpty() || (txtPassword.getText().trim().length() > 25 || txtPassword.getText().trim().length() < 8)) {
            if (txtPassword.getText().trim().isEmpty()) {
                lblPasswordError.setText("Invalid. Cannot be empty.");
            } else if (txtPassword.getText().trim().length() > 25 || txtPassword.getText().trim().length() < 8) {
                lblPasswordError.setText("Invalid. Must be 8 < Name < 25 chars..");
            }
            lblPasswordError.setVisible(true);
            result = false;
        }

        if (txtConfirmPassword.getText().trim().isEmpty() || (txtConfirmPassword.getText().trim().length() > 25 || txtConfirmPassword.getText().trim().length() < 8)) {
            if (txtConfirmPassword.getText().trim().isEmpty()) {
                lblConfirmPasswordError.setText("Invalid. Cannot be empty.");
            } else if (txtConfirmPassword.getText().trim().length() > 25 || txtConfirmPassword.getText().trim().length() < 8) {
                lblConfirmPasswordError.setText("Invalid. Must be 8 < Name < 25 chars..");
            }
            lblConfirmPasswordError.setVisible(true);
            result = false;
        }

        if (result == true) { // all other password valdations are correct, now check for equality 
            if (!txtPassword.getText().equals(txtConfirmPassword.getText())) {
                lblConfirmPasswordError.setText("Invalid. Passwords do NOT match.");
                lblConfirmPasswordError.setVisible(true);
                result = false;
            }
        }
        return result;
    }

    boolean isValidData() {
        clearErrorLabels();
        boolean result = true;
        if (txtUsername.getText().trim().isEmpty() || (txtUsername.getText().trim().length() > 25 || txtUsername.getText().trim().length() < 8)) {
            if (txtUsername.getText().trim().isEmpty()) {
                lblUsernameError.setText("Invalid. Cannot be empty.");
            } else if (txtUsername.getText().trim().length() > 25 || txtUsername.getText().trim().length() < 8) {
                lblUsernameError.setText("Invalid. Must be 8 < Name < 25 chars..");
            }
            lblUsernameError.setVisible(true);
            result = false;
        }

        if (txtName.getText().trim().isEmpty() || (txtName.getText().trim().length() > 25 || txtName.getText().trim().length() < 8)) {
            if (txtName.getText().trim().isEmpty()) {
                lblNameError.setText("Invalid. Cannot be empty.");
            } else if ((txtName.getText().trim().length() > 25 || txtName.getText().trim().length() < 8)) {
                lblNameError.setText("Invalid. Must be 8 < Name < 25 chars.");
            }
            lblNameError.setVisible(true);
            result = false;
        }

        //lastly confirm same passwords entered 
        if (!isValidPassword()) {
            result = false;
        }

        return result;
    }

    void clearInputBoxes() {
        txtName.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        txtConfirmPassword.setText("");
        cmbUserType.setSelectedIndex(0);
    }

    private boolean Duplicate(String usernameString) throws SQLException
    {        boolean duplicate = false;
            String splt = "SELECT username FROM users WHERE LOWER(username) = LOWER('" + usernameString + "')";
            ResultSet rs = dbCon.executeStatement(splt);
            duplicate = rs.isBeforeFirst();
            return duplicate;
    }
    
    private void cascadeUserDeletion(String username) throws SQLException {
        String stmtSQL = "DELETE logging WHERE usr = '" + username + "'";
        dbCon.executePrepared(stmtSQL);
        // isBeforeFirst() returns false if there are no data in the resultset
    }

    
    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed
        // TODO add your handling code here:
        // confirm dialog for updation
        int confirmationChoice = JOptionPane.showConfirmDialog(null, "Are you sure you want to update this?", "Confirm update", JOptionPane.WARNING_MESSAGE);
        if (confirmationChoice != JOptionPane.OK_OPTION){
            return;
        }
        // verify that new user does not currently exist 

        try {
            // make the result set scrolable forward/backward updatable
            if (isValidData()) {
               //if username exists then error message and return
             if (!txtUsername.getText().equals(rs.getString("username")) && Duplicate(txtUsername.getText())) {
                lblUsernameError.setText("Username already exits.");
                lblUsernameError.setVisible(true);
                javax.swing.JLabel label = new javax.swing.JLabel("Username already exists");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
             
             }
             
             //if username changes, delete old logs
             if (!txtUsername.getText().equals(rs.getString("username"))){
                 cascadeUserDeletion(rs.getString("username"));
             }
      
                // add new user
                int userType = 1; // default to Normal user
                if (cmbUserType.getSelectedItem().equals("Administrator")) {
                    userType = 0;
                } else {
                    userType = 1;
                }

                    String prepSQL = "UPDATE users SET Username = '"+
                            txtUsername.getText() + "', Password = '"+
                            txtPassword.getText() + "', Name = '"+
                            txtName.getText()+"', Type = "+
                            userType+" WHERE username = LOWER('" + rs.getString("username") + "')";


                int result = dbCon.executePrepared(prepSQL);

                if (result >= 1) {
                    //succesfull updated
                    javax.swing.JLabel label = new javax.swing.JLabel("Login User Updated Successfully.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                    
                    getNewData();
                }

    
            } 
            else {
                //validation error
                javax.swing.JLabel label = new javax.swing.JLabel("Please fix validation errors...");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            //error updating login user
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error Updating Login User");
        }
    }//GEN-LAST:event_btnUpdateUserActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        // TODO add your handling code here:
        //confirmation dialog
        int confirmationChoice = JOptionPane.showConfirmDialog(null, "Are you sure you want to update this?", "Confirm update", JOptionPane.WARNING_MESSAGE);
        if (confirmationChoice != JOptionPane.OK_OPTION){
            return;
        }
        try {
            cascadeUserDeletion(txtUsername.getText().trim());
            // make the result set scrolable forward/backward updatable
            String prepSQL = "DELETE users WHERE username = '" + txtUsername.getText().trim() + "'";
            int result = dbCon.executePrepared(prepSQL);
            if (result > 0) {
                //succesfull deletion
                javax.swing.JLabel label = new javax.swing.JLabel("Username '" + txtUsername.getText().trim() + "' deleted successfully.");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                getNewData();
            }
        } catch (SQLException e) {
            //error deleting login user
            JOptionPane.showMessageDialog(null, "Error deleting login user.");
        }
    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void MoveNext() {
        clearErrorLabels();
        try {
            // TODO add your handling code here:
            if (!rs.isLast()) {
                rs.next();
                populateFields();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeletePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void MovePrevious() {
        clearErrorLabels();
        try {
            // TODO add your handling code here:
            if (!rs.isFirst()) {
                rs.previous();
                populateFields();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeletePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        MoveNext();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        MovePrevious();
    }//GEN-LAST:event_btnPreviousActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JComboBox<String> cmbUserType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblConfirmPasswordError;
    private javax.swing.JLabel lblNameError;
    private javax.swing.JLabel lblPasswordError;
    private javax.swing.JLabel lblUsernameError;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
