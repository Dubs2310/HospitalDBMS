
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class AddWorksFor extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployee
     */
    myDBCon dbCon;
    ResultSet rsDoc;
    ResultSet rsWard;

    public AddWorksFor() {
        
        initComponents();
         this.setTitle("Add WorksFor");
        this.setLocationRelativeTo(null); // center form in screen 
        // set all error labels to invisible
       
        try {
            dbCon = new myDBCon();
            rsDoc = dbCon.executeStatement("SELECT doctor_id FROM doctor ORDER BY doctor_id ASC");
            while (rsDoc.next()) {
                cmbDoctorID.addItem(rsDoc.getString("doctor_id"));
            }
            rsWard = dbCon.executeStatement("SELECT ward_id FROM Ward ORDER BY ward_id ASC");
            while (rsWard.next()) {
                cmbWardID.addItem(rsWard.getString("ward_id"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
        
 private void RetreiveDocName(String doc_id){
        
        try {
            ResultSet docname = dbCon.executeStatement("select first_name||' '||last_name \"Name\" from doctor where doctor_id = "+doc_id);
            docname.first();
            txtDocName.setText(docname.getString("Name"));
        } catch (SQLException ex) {
            javax.swing.JLabel label = new javax.swing.JLabel("SQL Error - Getting doctor name.");
            label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
            JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    private void RetreiveWardName(String ward_id){
        
        try {
            ResultSet patientname= dbCon.executeStatement("select ward_name from ward where ward_id = "+ward_id);
            patientname.first();       
            txtWardName.setText(patientname.getString("ward_name"));
            
        } catch (SQLException ex) {
            javax.swing.JLabel label = new javax.swing.JLabel("SQL Error - Getting ward name.");
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
        btnNewAssignmnet = new javax.swing.JButton();
        cmbDoctorID = new javax.swing.JComboBox<>();
        cmbWardID = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtWardName = new javax.swing.JTextField();
        txtDocName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Employee");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Assign Doctor to Ward");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("DOCTOR ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("WARD ID:");

        btnNewAssignmnet.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnNewAssignmnet.setText("Add New");
        btnNewAssignmnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewAssignmnetActionPerformed(evt);
            }
        });

        cmbDoctorID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbDoctorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDoctorIDActionPerformed(evt);
            }
        });

        cmbWardID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbWardID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbWardIDActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitaldbms/works_for.png"))); // NOI18N

        txtWardName.setEditable(false);
        txtWardName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtWardName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWardNameActionPerformed(evt);
            }
        });

        txtDocName.setEditable(false);
        txtDocName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDocName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnNewAssignmnet))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cmbDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cmbWardID, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtWardName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDocName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDocName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbWardID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWardName))
                        .addGap(18, 18, 18)
                        .addComponent(btnNewAssignmnet)
                        .addGap(15, 15, 15))))
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


    private boolean isDuplicate(int docid, int wardid) throws SQLException {
        boolean isduplicate = false;
        String stmtSQL = "SELECT * FROM Works_for WHERE doc_id = " + docid+ " AND wards_id = "+wardid;
        ResultSet rs = dbCon.executeStatement(stmtSQL);
        // isBeforeFirst() returns false if there are no data in the resultset
        isduplicate = rs.isBeforeFirst();

        return isduplicate;
    }
    private void btnNewAssignmnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewAssignmnetActionPerformed
        // TODO add your handling code here:
        String doc = cmbDoctorID.getSelectedItem().toString();
        String ward = cmbWardID.getSelectedItem().toString();
        
        try {
          
              
            if (!isDuplicate(Integer.parseInt(doc),Integer.parseInt(ward))){
              
                String prepSQL = "INSERT INTO WORKS_FOR (doc_id, wards_id) VALUES (" 
                        + doc+ ", " + ward + ")";

                int result = dbCon.executePrepared(prepSQL);
                //if succesfull
                if (result > 0) {

                    javax.swing.JLabel label = new javax.swing.JLabel("Doctor "+doc+ " successfully assigned to Ward " + ward);
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                }  }
                else { //validation error
                if (isDuplicate(Integer.parseInt(doc), Integer.parseInt(ward))) {
                    javax.swing.JLabel label = new javax.swing.JLabel("Doctor "+doc+ " is already assigned to Ward " + ward);
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
                } 
                    
            }
        } catch (SQLException e) {
            //error adding employee
            JOptionPane.showMessageDialog(null, "Error assigning Dctor to Ward."+e.getMessage());
        }
    }//GEN-LAST:event_btnNewAssignmnetActionPerformed

    private void cmbDoctorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDoctorIDActionPerformed
        // TODO add your handling code here:
        RetreiveDocName(cmbDoctorID.getSelectedItem().toString());
    }//GEN-LAST:event_cmbDoctorIDActionPerformed

    private void cmbWardIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbWardIDActionPerformed
        // TODO add your handling code here:
        RetreiveWardName(cmbWardID.getSelectedItem().toString());
    }//GEN-LAST:event_cmbWardIDActionPerformed

    private void txtWardNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWardNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWardNameActionPerformed

    private void txtDocNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewAssignmnet;
    private javax.swing.JComboBox<String> cmbDoctorID;
    private javax.swing.JComboBox<String> cmbWardID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtDocName;
    private javax.swing.JTextField txtWardName;
    // End of variables declaration//GEN-END:variables
}