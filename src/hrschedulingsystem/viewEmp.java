
package hrschedulingsystem;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class viewEmp extends javax.swing.JFrame {
    public static String errorPos, errorProjStat;
    public static int selectedRowIndex;
    public static int empid = 21;
    public static String fname, lname, pos, assProj, projName;
    public static float salary;
    public static ArrayList<HRSchedule> LList;
    public viewEmp() {
        initComponents();
        addRowToJTable();
    }
    public void backMenu()
    {
        new Menu().setVisible(true);
        this.dispose();
    }
    public void addRowToJTable()
    {
        DefaultTableModel model = (DefaultTableModel) empTable.getModel();
        HRSchedulingSystem cc = new HRSchedulingSystem();
        ArrayList<HRSchedule> list = cc.initial();
        Object rowData[] = new Object[7];
        for(int i = 0; i < list.size(); i++){
            rowData[0] = list.get(i).employeeID;
            rowData[1] = list.get(i).fname;
            rowData[2] = list.get(i).lname;
            rowData[3] = list.get(i).pos;
            rowData[4] = list.get(i).projName;
            rowData[5] = list.get(i).assignedProj;
            rowData[6] = list.get(i).salary;
            model.addRow(rowData);
        }
    }
    
    public void getDetailsInRow()
    {
        DefaultTableModel model = (DefaultTableModel) empTable.getModel();
        selectedRowIndex = empTable.getSelectedRow();

        empid = (int) model.getValueAt(selectedRowIndex, 0);

        fname = (String) model.getValueAt(selectedRowIndex, 1);

        lname = (String) model.getValueAt(selectedRowIndex, 2);

        pos = (String) model.getValueAt(selectedRowIndex, 3);
        
        projName = (String) model.getValueAt(selectedRowIndex, 4);
        
        assProj = (String) model.getValueAt(selectedRowIndex, 5);
        
        salary = (float) model.getValueAt(selectedRowIndex, 6);
        
        setTextFieldFromRow(fname, lname, pos, assProj);
    }
    
    public void setTextFieldFromRow (String first, String last,
            String empPos, String assproj)
    {
        first_name.setText(first);
        last_name.setText(last);
        pos_combobox.setSelectedItem(empPos);
        assproj_combobox.setSelectedItem(assproj);
    }
    
    public void checkProjectforAdd(String first, String last,
            String empPos, String assproj)
    {
        int empId;
        String empFname, empLname, empPosi, empProjname, empAssproj;
        float empSalary;
        if(!first_name.getText().isEmpty() && !last_name.getText().isEmpty()){
            empId = empid;
            
            empFname = first_name.getText();
            
            empLname = last_name.getText();

            empPosi = (String) pos_combobox.getSelectedItem();
           
            empProjname = (String) projname_combobox.getSelectedItem();
            
            empAssproj = (String) assproj_combobox.getSelectedItem();
            
            calculatePay cp = new calculatePay();
            
            empSalary = cp.computeEmpSalary(empPosi, empProjname, empAssproj);

            DefaultTableModel model = (DefaultTableModel) empTable.getModel();
            model.addRow(new Object[]{
                empId, empFname, empLname, empPosi, empProjname, empAssproj, empSalary
            });
            
            empid++;
            
            status.setText("SUCESSFULLY ADDED!");
        }else{
            status.setText("There is an error in your input!");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        empTable = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        first_name = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        last_name = new javax.swing.JTextField();
        delete = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        pos_combobox = new javax.swing.JComboBox<>();
        assproj_combobox = new javax.swing.JComboBox<>();
        back = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        projname_combobox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 44, 84));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 214, 186));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMPLOYEE LIST");

        jScrollPane1.setBorder(null);

        empTable.setAutoCreateRowSorter(true);
        empTable.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        empTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "First Name", "Last Name", "Position", "Project Name", "Assigned Project", "Salary"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        empTable.setColumnSelectionAllowed(true);
        empTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(empTable);
        empTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(245, 214, 186));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("First Name");

        first_name.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        first_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        first_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                first_nameActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(245, 214, 186));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Assigned Project");

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(245, 214, 186));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Last Name");

        last_name.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        last_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        last_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                last_nameActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(216, 131, 115));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(23, 37, 90));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hazel Cavite\\Documents\\NetBeansProjects\\LibraryCardCatalog\\img\\delete.png")); // NOI18N
        jLabel6.setText("DELETE");

        javax.swing.GroupLayout deleteLayout = new javax.swing.GroupLayout(delete);
        delete.setLayout(deleteLayout);
        deleteLayout.setHorizontalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        deleteLayout.setVerticalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add.setBackground(new java.awt.Color(216, 131, 115));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(23, 37, 90));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hazel Cavite\\Documents\\NetBeansProjects\\LibraryCardCatalog\\img\\add.png")); // NOI18N
        jLabel3.setText("ADD");

        javax.swing.GroupLayout addLayout = new javax.swing.GroupLayout(add);
        add.setLayout(addLayout);
        addLayout.setHorizontalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addContainerGap())
        );
        addLayout.setVerticalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        update.setBackground(new java.awt.Color(216, 131, 115));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(23, 37, 90));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hazel Cavite\\Documents\\NetBeansProjects\\LibraryCardCatalog\\img\\edit.png")); // NOI18N
        jLabel2.setText("UPDATE");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout updateLayout = new javax.swing.GroupLayout(update);
        update.setLayout(updateLayout);
        updateLayout.setHorizontalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        updateLayout.setVerticalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        status.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        status.setForeground(new java.awt.Color(51, 255, 51));
        status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(245, 214, 186));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Position");

        pos_combobox.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        pos_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Specialist", "Associate", "Analyst" }));

        assproj_combobox.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        assproj_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Internal", "External" }));

        back.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hazel Cavite\\Documents\\NetBeansProjects\\HRSchedulingSystem\\img\\cancel.png")); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(245, 214, 186));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Project Name");

        projname_combobox.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        projname_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DTR Payroll", "QR Scanner", "Calculator System", "Campus Google Map", "Jeepney Fare" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                                .addComponent(back))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(last_name)
                            .addComponent(first_name, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(jLabel19))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(assproj_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pos_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(projname_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addComponent(jLabel21)))))))
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(back)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pos_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(first_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(last_name, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(assproj_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(projname_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void last_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_last_nameActionPerformed

    }//GEN-LAST:event_last_nameActionPerformed

    private void first_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_first_nameActionPerformed

    }//GEN-LAST:event_first_nameActionPerformed

    private void empTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empTableMouseClicked
       getDetailsInRow();
    }//GEN-LAST:event_empTableMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       
    }//GEN-LAST:event_jLabel2MouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want "
                + "to update this?", "Alert", JOptionPane.YES_NO_OPTION);
        if(confirm == 0){
            if(selectedRowIndex >=0 && !first_name.getText().isEmpty() 
                && !last_name.getText().isEmpty()){
                    DefaultTableModel model = (DefaultTableModel) empTable.getModel();
                    model.setValueAt(empid, selectedRowIndex, 0);
                    model.setValueAt(first_name.getText(), selectedRowIndex, 1);
                    model.setValueAt(last_name.getText(), selectedRowIndex, 2);
                    model.setValueAt(pos_combobox.getSelectedItem(), selectedRowIndex, 3);
                    model.setValueAt(assproj_combobox.getSelectedItem(), selectedRowIndex, 5);
                    
                    
                    
                    status.setText("SUCESSFULLY UPDATED!");
                    
            }else{
                status.setText("There is an error in your input!");
            }
        }else{
            JOptionPane.showOptionDialog(null, "Update cancelled!","Alert",
                JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,
                null, new Object[]{}, null);
        }
    }//GEN-LAST:event_updateMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want "
                + "to delete this?", "Alert", JOptionPane.YES_NO_OPTION);
        if(confirm == 0){
            getDetailsInRow();
            DefaultTableModel model = (DefaultTableModel) empTable.getModel();
            model.removeRow(selectedRowIndex);
            status.setText("Successfully deleted!");
        }else{
            JOptionPane.showOptionDialog(null, "Delete cancelled!","Alert",
                JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,
                null, new Object[]{}, null);
        }
    }//GEN-LAST:event_deleteMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        
        checkProjectforAdd(first_name.getText(), last_name.getText(),
            (String)pos_combobox.getSelectedItem(), (String)assproj_combobox.getSelectedItem());
    }//GEN-LAST:event_addMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        backMenu();
    }//GEN-LAST:event_backMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    private javax.swing.JComboBox<String> assproj_combobox;
    private javax.swing.JLabel back;
    private javax.swing.JPanel delete;
    private javax.swing.JTable empTable;
    private javax.swing.JTextField first_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField last_name;
    private javax.swing.JComboBox<String> pos_combobox;
    private javax.swing.JComboBox<String> projname_combobox;
    private javax.swing.JLabel status;
    private javax.swing.JPanel update;
    // End of variables declaration//GEN-END:variables
}
