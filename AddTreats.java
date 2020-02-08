
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
          this.setTitle("Assign Treatment");
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
    
    
    private void RetreiveDocName(String doc_id){
        
        try {
            ResultSet docname = dbCon.executeStatement("select first_name||' '||last_name \"Name\" from doctor where doctor_id = "+doc_id);
            docname.first();
            txtDocName2.setText(docname.getString("Name"));
        } catch (SQLException ex) {
            javax.swing.JLabel label = new javax.swing.JLabel("SQL Error - Getting doctor name.");
            label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
            JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    private void RetreivePatientName(String patient_id){
        
        try {
            ResultSet patientname= dbCon.executeStatement("select fname||' '||lname \"Name\" from patient where patient_id = "+patient_id);
            patientname.first();
            txtPatientName.setText(patientname.getString("Name"));
        } catch (SQLException ex) {
            javax.swing.JLabel label = new javax.swing.JLabel("SQL Error - Getting patient name.");
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

        jFrame1 = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbDoc1 = new javax.swing.JComboBox<>();
        btnAddNewTreats1 = new javax.swing.JButton();
        lblStartDateError1 = new javax.swing.JLabel();
        ftxtStartDate1 = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        cmbPat1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        ftxtEndDate1 = new javax.swing.JFormattedTextField();
        lblEndDateError1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtDocName = new javax.swing.JTextField();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtDocName2 = new javax.swing.JTextField();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrame1.setTitle("Add New Employee");
        jFrame1.setResizable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Add New Treatment");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("DOCTOR ID:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("START DATE:");

        cmbDoc1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbDoc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDoc1ActionPerformed(evt);
            }
        });

        btnAddNewTreats1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddNewTreats1.setText("Add New");
        btnAddNewTreats1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewTreats1ActionPerformed(evt);
            }
        });

        lblStartDateError1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblStartDateError1.setForeground(new java.awt.Color(255, 0, 0));
        lblStartDateError1.setText("error label");

        ftxtStartDate1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d-MMM-yyyy"))));
        ftxtStartDate1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ftxtStartDate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtStartDate1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("PATIENT ID:");

        cmbPat1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbPat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPat1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("END DATE:");

        ftxtEndDate1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d-MMM-yyyy"))));
        ftxtEndDate1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ftxtEndDate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtEndDate1ActionPerformed(evt);
            }
        });

        lblEndDateError1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblEndDateError1.setForeground(new java.awt.Color(255, 0, 0));
        lblEndDateError1.setText("error label");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitaldbms/treats.png"))); // NOI18N

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel13))
                    .addComponent(jLabel14))
                .addGap(59, 59, 59)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(jLabel11))
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ftxtStartDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftxtEndDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblEndDateError1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(lblStartDateError1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddNewTreats1)
                            .addComponent(cmbPat1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbDoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cmbDoc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cmbPat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel13))
                            .addComponent(jLabel14)))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(lblStartDateError1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEndDateError1))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ftxtStartDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ftxtEndDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnAddNewTreats1)
                .addGap(45, 45, 45))
        );

        txtDocName.setEditable(false);
        txtDocName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDocName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocNameActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Employee");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Treatment");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("DOCTOR ID:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("START DATE:");

        cmbDoc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDocActionPerformed(evt);
            }
        });

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitaldbms/treats.png"))); // NOI18N

        txtPatientName.setEditable(false);
        txtPatientName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });

        txtDocName2.setEditable(false);
        txtDocName2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDocName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocName2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2))
                    .addComponent(jLabel3))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7))
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ftxtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftxtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblEndDateError, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(lblStartDateError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddNewTreats)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbPat, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDocName2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmbDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDocName2))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmbPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPatientName)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2))
                            .addComponent(jLabel3))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblStartDateError)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblEndDateError))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ftxtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ftxtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnAddNewTreats)
                .addGap(45, 45, 45))
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
        RetreivePatientName(cmbPat.getSelectedItem().toString());
    }//GEN-LAST:event_cmbPatActionPerformed

    private void cmbDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDocActionPerformed
        // TODO add your handling code here:
        RetreiveDocName(cmbDoc.getSelectedItem().toString());
    }//GEN-LAST:event_cmbDocActionPerformed

    private void cmbDoc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDoc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDoc1ActionPerformed

    private void btnAddNewTreats1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewTreats1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddNewTreats1ActionPerformed

    private void ftxtStartDate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtStartDate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtStartDate1ActionPerformed

    private void cmbPat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPat1ActionPerformed

    private void ftxtEndDate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtEndDate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtEndDate1ActionPerformed

    private void txtDocNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocNameActionPerformed

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameActionPerformed

    private void txtDocName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocName2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewTreats;
    private javax.swing.JButton btnAddNewTreats1;
    private javax.swing.JComboBox<String> cmbDoc;
    private javax.swing.JComboBox<String> cmbDoc1;
    private javax.swing.JComboBox<String> cmbPat;
    private javax.swing.JComboBox<String> cmbPat1;
    private javax.swing.JFormattedTextField ftxtEndDate;
    private javax.swing.JFormattedTextField ftxtEndDate1;
    private javax.swing.JFormattedTextField ftxtStartDate;
    private javax.swing.JFormattedTextField ftxtStartDate1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblEndDateError;
    private javax.swing.JLabel lblEndDateError1;
    private javax.swing.JLabel lblStartDateError;
    private javax.swing.JLabel lblStartDateError1;
    private javax.swing.JTextField txtDocName;
    private javax.swing.JTextField txtDocName2;
    private javax.swing.JTextField txtPatientName;
    // End of variables declaration//GEN-END:variables
}
