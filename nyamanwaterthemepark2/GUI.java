package nyamanwaterthemepark2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import javax.swing.JOptionPane;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        searchButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        displayButton = new javax.swing.JButton();
        calculateButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OutputArea = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        totalField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        discountComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        Numsenior = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        numChildrenField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        numAdultsField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Mykad = new javax.swing.JRadioButton();
        normal = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        contactNumField = new javax.swing.JTextField();
        fullnamefield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Edit = new javax.swing.JButton();
        Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, -1, -1));

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jPanel1.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, -1, -1));

        displayButton.setText("Display All");
        displayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayButtonActionPerformed(evt);
            }
        });
        jPanel1.add(displayButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, -1, -1));

        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(calculateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, -1, -1));

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, -1, -1));

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        jPanel1.add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 153, 153));
        jLabel9.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 204, 255));
        jLabel9.setText("NYAMAN WATER PARK THEME");
        jLabel9.setMaximumSize(new java.awt.Dimension(350, 23));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 400, 30));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        OutputArea.setColumns(20);
        OutputArea.setRows(5);
        OutputArea.setSelectionColor(new java.awt.Color(102, 204, 0));
        jScrollPane1.setViewportView(OutputArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 390, 250));

        jPanel3.setBackground(new java.awt.Color(255, 102, 153));

        totalField.setText("RM");
        totalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Total Price:");

        discountComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "25%", "50%", "75%" }));
        discountComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountComboBoxActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Discount:");

        Numsenior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumseniorActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Senior Citizen:");

        numChildrenField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numChildrenFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Children:");

        numAdultsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numAdultsFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Adult:");

        Mykad.setBackground(new java.awt.Color(255, 102, 153));
        buttonGroup1.add(Mykad);
        Mykad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Mykad.setText("MYKAD");

        normal.setBackground(new java.awt.Color(255, 102, 153));
        buttonGroup1.add(normal);
        normal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        normal.setText("Normal");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Charge Rate:");

        contactNumField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNumFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Contact Num:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Full Name:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fullnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contactNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(normal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Mykad))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numAdultsField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numChildrenField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Numsenior, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(discountComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(normal)
                    .addComponent(Mykad))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(numAdultsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(numChildrenField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(Numsenior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(discountComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 360, 300));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/Gemini_Generated_Image_qtg6kyqtg6kyqtg6__1_-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 200, 120));

        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        jPanel1.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, -1, -1));

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void displayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayButtonActionPerformed

        
        OutputArea.setText("List of Customers\n\n");

        try {
         
            ArrayList<Customer> customerList = CustomerDB.readAll();

           Comparator<Customer> comp = (c1, c2) -> Double.compare(c1.getTotalCharge(), c2.getTotalCharge());
        customerList.sort(comp);  


            OutputArea.append(
                    String.format("%-15s %-15s %-18s %-18s %-19s %-23s %-24s %-21s\n",
                            "Name", "Contact", "Rate Type", "Adults", "Children", "Seniors", "Discount", "Total Charge"));
            OutputArea.append("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

    
            for (Customer customer : customerList) {
                OutputArea.append(
                        customer.getName() + "\t"
                        + customer.getContact() + "\t"
                        + customer.getRateType() + "\t"
                        + customer.getNumAdults() + "\t"
                        + customer.getNumChildren() + "\t"
                        + customer.getNumSeniors() + "\t"
                        + customer.getDiscount() + "%\t"
                        + customer.getTotalCharge() + "\n"
                );
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            OutputArea.setText("Error: Unable to retrieve customer data.");
        }

    }//GEN-LAST:event_displayButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        fullnamefield.setText("");
        contactNumField.setText("");
        numAdultsField.setText("0");
        numChildrenField.setText("0");
        Numsenior.setText("0");
        totalField.setText("");
        buttonGroup1.clearSelection();
        discountComboBox.setSelectedIndex(0);
        OutputArea.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed

        try {
          
            int numAdults = Integer.parseInt(numAdultsField.getText());
            int numChildren = Integer.parseInt(numChildrenField.getText());
            int numSeniors = Integer.parseInt(Numsenior.getText());

           
            String discountStr = discountComboBox.getSelectedItem().toString().replace("%", "");
            double discount = Double.parseDouble(discountStr);


            boolean isNormal = normal.isSelected();

 
        double adultRate = isNormal ? 100.0 : 50.0;
        double childRate = isNormal ? 60.0 : 30.0;
        double seniorRate = isNormal ? 30.0 : 15.0;

            double total = (numAdults * adultRate) + (numChildren * childRate) + (numSeniors * seniorRate);
            double totalCharge = total - (total * (discount / 100));  

          
            totalField.setText(String.format("RM%.2f", totalCharge));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for all fields.");
        }
    }//GEN-LAST:event_calculateButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

    
        String nameTarget = fullnamefield.getText().trim();
        if (nameTarget.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a name to search.", "Input Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
       
            Customer cust = CustomerDB.searchByName(nameTarget);

            if (cust != null) {
               
                String customerDetails = "Name: " + cust.getName() + "\n"
                        + "Contact: " + cust.getContact() + "\n"
                        + "Rate Type: " + cust.getRateType() + "\n"
                        + "Adults: " + cust.getNumAdults() + "\n"
                        + "Children: " + cust.getNumChildren() + "\n"
                        + "Seniors: " + cust.getNumSeniors() + "\n"
                        + "Discount: " + cust.getDiscount() + "%\n"
                        + "Total Charge: " + cust.getTotalCharge();

      
                OutputArea.setText(customerDetails);
            } else {
                JOptionPane.showMessageDialog(this, "Customer not found.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error occurred while searching for the customer.", "Database Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_searchButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
    try {
   
        if (totalField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please do calculation first before save.", "INPUT ERROR", JOptionPane.WARNING_MESSAGE);
            return;
        }

     
        String fullName = fullnamefield.getText().trim();
        String contactNum = (contactNumField.getText().trim());
        String chargeRate = normal.isSelected() ? "Normal" : "MyKad";
        int numAdults = Integer.parseInt(numAdultsField.getText().trim());
        int numChildren = Integer.parseInt(numChildrenField.getText().trim());
        int numSeniorCitizens = Integer.parseInt(Numsenior.getText().trim());
        
      
        int couponPromo = normal.isSelected() ? 20 : 50;

        
        double totalAmount = Double.parseDouble(totalField.getText().replace("RM", "").trim());

  
        Customer cust = new Customer(fullName, contactNum, chargeRate, numAdults, numChildren, numSeniorCitizens, couponPromo, totalAmount);
        
       
        CustomerDB.addRecord(cust);

        
        JOptionPane.showMessageDialog(this, "Add data successful in database");
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "An error occurred while saving the data to the database.", "DATABASE ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Please enter valid numeric values.", "INPUT ERROR", JOptionPane.WARNING_MESSAGE);
    }


    }//GEN-LAST:event_saveButtonActionPerformed

    private void numAdultsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numAdultsFieldActionPerformed
        
    }//GEN-LAST:event_numAdultsFieldActionPerformed

    private void numChildrenFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numChildrenFieldActionPerformed
   
    }//GEN-LAST:event_numChildrenFieldActionPerformed

    private void NumseniorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumseniorActionPerformed
        
    }//GEN-LAST:event_NumseniorActionPerformed

    private void totalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalFieldActionPerformed
      
    }//GEN-LAST:event_totalFieldActionPerformed

    private void contactNumFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNumFieldActionPerformed
        
    }//GEN-LAST:event_contactNumFieldActionPerformed

    private void discountComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountComboBoxActionPerformed
     
    }//GEN-LAST:event_discountComboBoxActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed

                                  
    try {
        
        OutputArea.setText("");

    
        String nameToSearch = JOptionPane.showInputDialog(this, "Enter the name of the customer to search:", "Search Customer", JOptionPane.QUESTION_MESSAGE);

        if (nameToSearch == null || nameToSearch.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No name entered. Operation cancelled.", "Input Error", JOptionPane.WARNING_MESSAGE);
            return;
        }


        Customer cust = CustomerDB.searchByName(nameToSearch.trim());

        if (cust == null) {
            JOptionPane.showMessageDialog(this, "No customer found with the name: " + nameToSearch, "Search Result", JOptionPane.INFORMATION_MESSAGE);
            return;
        }


        OutputArea.append(String.format("%-15s %-15s %-18s %-18s %-19s %-23s %-24s %-21s\n",
                "Name", "Contact", "Rate Type", "Adults", "Children", "Seniors", "Discount", "Total Charge"));
        OutputArea.append("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

        OutputArea.append(String.format("%-15s %-15s %-18s %-18s %-19s %-23s %-24s %-21s\n",
                cust.getName(), cust.getContact(), cust.getRateType(), cust.getNumAdults(),
                cust.getNumChildren(), cust.getNumSeniors(), cust.getDiscount() + "%", cust.getTotalCharge()));

      
        int confirmation = JOptionPane.showConfirmDialog(this, 
                "Customer found: \nName: " + cust.getName() + 
                "\nContact: " + cust.getContact() + 
                "\n\nDo you want to edit this customer's information?", 
                "Confirm Edit", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE);

        if (confirmation == JOptionPane.YES_OPTION) {

            if (fullnamefield.getText().isEmpty() || contactNumField.getText().isEmpty() || 
                discountComboBox.getSelectedItem() == null || totalField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all fields.", "INPUT ERROR", JOptionPane.WARNING_MESSAGE);
                return;
            }

          
            String updatedName = fullnamefield.getText().trim();
            String updatedContact = contactNumField.getText().trim();
            String updatedChargeRate = normal.isSelected() ? "Normal" : "MyKad";
            int updatedNumAdults = Integer.parseInt(numAdultsField.getText().trim());
            int updatedNumChildren = Integer.parseInt(numChildrenField.getText().trim());
            int updatedNumSeniors = Integer.parseInt(Numsenior.getText().trim());
            double updatedDiscount = Double.parseDouble(discountComboBox.getSelectedItem().toString().replace("%", ""));
            double updatedTotalCharge = Double.parseDouble(totalField.getText().replace("RM", "").trim());

        
            Customer updatedCustomer = new Customer(updatedName, updatedContact, updatedChargeRate, updatedNumAdults, updatedNumChildren, updatedNumSeniors, updatedDiscount, updatedTotalCharge);

      
            int rowsAffected = CustomerDB.updateCustomer(updatedCustomer);

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Customer information successfully updated.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update customer information. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Edit operation cancelled.", "Cancelled", JOptionPane.INFORMATION_MESSAGE);
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Database error occurred while editing customer information.", "Database Error", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Please ensure all numeric fields contain valid numbers.", "Input Error", JOptionPane.WARNING_MESSAGE);
    }

    }//GEN-LAST:event_EditActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed


        try {

            int contactNo = Integer.parseInt(contactNumField.getText());  

 
            int rowCount = CustomerDB.deleteCustomer(contactNo);

         
            if (rowCount > 0) {
                JOptionPane.showMessageDialog(this, "Data successfully deleted from the database.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Data NOT successfully deleted from the database. Please check the contact number.", "Error", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException ex) {
      
            JOptionPane.showMessageDialog(this, "Please enter a valid contact number.", "Input Error", JOptionPane.WARNING_MESSAGE);
        } catch (SQLException ex) {
      
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database error occurred while deleting data.", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_DeleteActionPerformed
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

 /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JRadioButton Mykad;
    private javax.swing.JTextField Numsenior;
    private javax.swing.JTextArea OutputArea;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calculateButton;
    private javax.swing.JTextField contactNumField;
    private javax.swing.JComboBox<String> discountComboBox;
    private javax.swing.JButton displayButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField fullnamefield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton normal;
    private javax.swing.JTextField numAdultsField;
    private javax.swing.JTextField numChildrenField;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField totalField;
    // End of variables declaration//GEN-END:variables
}
