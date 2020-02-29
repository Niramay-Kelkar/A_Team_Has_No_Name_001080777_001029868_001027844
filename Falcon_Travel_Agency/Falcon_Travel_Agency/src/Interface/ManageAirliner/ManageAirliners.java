/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageAirliner;

import Business.Airliner;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author moury
 */
public class ManageAirliners extends javax.swing.JPanel {

    /**
     * Creates new form ManageAirliners
     */
    private TravelAgency travelAgecny;
    private JPanel cardSequenceJPanel;
    private String mode;
    private Airliner updatedInfo;

    public ManageAirliners(TravelAgency travelAgency, JPanel cardSequenceJPanel) {
        initComponents();
        this.travelAgecny = travelAgency;
        this.cardSequenceJPanel = cardSequenceJPanel;
        populateTable();
        fleetSizeTxtField.setEnabled(false);
        enableFields(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        airlinerTbl = new javax.swing.JTable();
        viewAirlinerBtn = new javax.swing.JButton();
        deleteAirlinerBtn = new javax.swing.JButton();
        newAirlinerBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        searchAirlinerTxtField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        confirmBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        headquartersTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fleetSizeTxtField = new javax.swing.JTextField();
        updateAirlinerBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        airlinerTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Headquarters", "Fleet Size"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        airlinerTbl.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                airlinerTblHierarchyChanged(evt);
            }
        });
        jScrollPane1.setViewportView(airlinerTbl);
        if (airlinerTbl.getColumnModel().getColumnCount() > 0) {
            airlinerTbl.getColumnModel().getColumn(0).setResizable(false);
            airlinerTbl.getColumnModel().getColumn(1).setResizable(false);
            airlinerTbl.getColumnModel().getColumn(2).setResizable(false);
        }

        viewAirlinerBtn.setText("View Fleet");
        viewAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAirlinerBtnActionPerformed(evt);
            }
        });

        deleteAirlinerBtn.setText("Delete Airliner");
        deleteAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAirlinerBtnActionPerformed(evt);
            }
        });

        newAirlinerBtn.setText("New Airliner");
        newAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAirlinerBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        searchBtn.setText("Search by Name");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        confirmBtn.setText("Confirm");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Name:");

        jLabel3.setText("Headquarters:");

        jLabel4.setText("Fleet Size:");

        fleetSizeTxtField.setEditable(false);

        updateAirlinerBtn.setText("Update Airliner");
        updateAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAirlinerBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("(Go to 'View Airliner' to Add/Delete Fleet)");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MANAGE AIRLINERS");
        jLabel5.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(searchAirlinerTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(headquartersTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(fleetSizeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel1))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(288, 288, 288)
                            .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deleteAirlinerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewAirlinerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newAirlinerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateAirlinerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newAirlinerBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateAirlinerBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteAirlinerBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewAirlinerBtn)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchAirlinerTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(headquartersTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fleetSizeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(confirmBtn)
                .addContainerGap(127, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void enableFields(boolean bool) {
        nameTxtField.setEnabled(bool);
        confirmBtn.setEnabled(bool);
        headquartersTxtField.setEnabled(bool);
//        fleetSizeTxtField.setEnabled(bool);
    }

    private void clearFields() {
        nameTxtField.setText("");
        headquartersTxtField.setText("");
        fleetSizeTxtField.setText("");
    }

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        cardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void deleteAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAirlinerBtnActionPerformed
        // TODO add your handling code here:
        enableFields(false);
        clearFields();
        int selectedRow = airlinerTbl.getSelectedRow();
        if (selectedRow >= 0) {
            Airliner al = (Airliner) airlinerTbl.getValueAt(selectedRow, 0);
            travelAgecny.deleteAirliner(al);
            populateTable();

        } else {
            JOptionPane.showMessageDialog(null, "Please select an airliner to delete");
        }
    }//GEN-LAST:event_deleteAirlinerBtnActionPerformed

    private void viewAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAirlinerBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = airlinerTbl.getSelectedRow();
        if (selectedRow >= 0) {
            Airliner al = (Airliner) airlinerTbl.getValueAt(selectedRow, 0);
            ViewAirliner viewAirliner = new ViewAirliner(al, cardSequenceJPanel);
            CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
            cardSequenceJPanel.add("viewAirliner", viewAirliner);
            layout.next(cardSequenceJPanel);
        } else {
            JOptionPane.showMessageDialog(null, "Please select an airiner to view");
        }

    }//GEN-LAST:event_viewAirlinerBtnActionPerformed

    private void newAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAirlinerBtnActionPerformed
        // TODO add your handling code here:
        mode = "new";
        enableFields(true);
        clearFields();
        fleetSizeTxtField.setText("0");

    }//GEN-LAST:event_newAirlinerBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        enableFields(false);
        clearFields();
        String searchTerm = searchAirlinerTxtField.getText();
        if (searchTerm == null || searchTerm.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter an airliner name to search");
            populateTable();
        } else {
            Airliner found = travelAgecny.searchAirliner(searchTerm);
            if (found == null) {
                JOptionPane.showMessageDialog(null, "No airliner found with provided name");
            } else {
                DefaultTableModel dtm = (DefaultTableModel) airlinerTbl.getModel();
                dtm.setRowCount(0);

                Object row[] = new Object[3];
                row[0] = found;
                row[1] = found.getHeadquarters();
                row[2] = found.getNoOfAirplanes();
                dtm.addRow(row);
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        // TODO add your handling code here:
        String name = nameTxtField.getText();
        if (name == null || name.equals("") || !isValidString(name)) {
            JOptionPane.showMessageDialog(null, "Please enter a valid Name");
            return;
        }

        String headquarters = headquartersTxtField.getText();
        if (headquarters == null || headquarters.equals("") || !isValidString(headquarters)) {
            JOptionPane.showMessageDialog(null, "Please enter valid Headquarters");
            return;
        }
        if (mode == "new") {
            for (Airliner e : travelAgecny.getAirlinerDirectory()) {
                if (e.getAirlinerName().equals(name)) {
                    JOptionPane.showMessageDialog(null, "An airliner with provided name already exists");
                    return;
                }
            }
            travelAgecny.addAirliner(name, 0, headquarters);
            JOptionPane.showMessageDialog(null, "Airliner added to directory");
        } else {
            updatedInfo.setAirlinerName(name);
            updatedInfo.setHeadquarters(headquarters);
            JOptionPane.showMessageDialog(null, "Airliner information updated in directory");

        }
        populateTable();
        enableFields(false);
        clearFields();
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void airlinerTblHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_airlinerTblHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_airlinerTblHierarchyChanged

    private void updateAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAirlinerBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = airlinerTbl.getSelectedRow();
        if (selectedRow >= 0) {
            mode = "update";
            Airliner airliner = (Airliner) airlinerTbl.getValueAt(selectedRow, 0);
            nameTxtField.setText(airliner.getAirlinerName() + "");
            headquartersTxtField.setText(airliner.getHeadquarters() + "");
            fleetSizeTxtField.setText(airliner.getNoOfAirplanes() + "");
            enableFields(true);
            updatedInfo = airliner;
        } else {
            enableFields(false);
            clearFields();
            JOptionPane.showMessageDialog(null, "Please select an airliner to update");
        }
    }//GEN-LAST:event_updateAirlinerBtnActionPerformed

    public boolean isValidString(String str) {
        Pattern p = Pattern.compile("^[a-zA-Z0-9 ]+$");
        Matcher m = p.matcher(str);
        return m.matches();
    }

    public void populateTable() {
        System.out.println("Interface.ManageAirliners.populateTable()");
        DefaultTableModel dtm = (DefaultTableModel) airlinerTbl.getModel();
        dtm.setRowCount(0);

        for (Airliner e : travelAgecny.getAirlinerDirectory()) {
            Object row[] = new Object[3];
            row[0] = e;
            row[1] = e.getHeadquarters();
            row[2] = e.getNoOfAirplanes();
            dtm.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable airlinerTbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JButton deleteAirlinerBtn;
    private javax.swing.JTextField fleetSizeTxtField;
    private javax.swing.JTextField headquartersTxtField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JButton newAirlinerBtn;
    private javax.swing.JTextField searchAirlinerTxtField;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton updateAirlinerBtn;
    private javax.swing.JButton viewAirlinerBtn;
    // End of variables declaration//GEN-END:variables
}
