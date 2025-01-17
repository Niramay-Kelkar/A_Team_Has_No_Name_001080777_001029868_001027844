/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharmacyRole;

import Business.Validation.StringValidation;
import Business.WorkQueue.DoctorTestWorkRequest;
import Business.WorkQueue.DonorTestWorkRequest;
import Business.WorkQueue.PharmacyTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author deekshakhajuria
 */
public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    JPanel userProcessContainer;
    PharmacyTestWorkRequest request;
    
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, PharmacyTestWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        inputVerifier();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitJButton.setText("Submit Result");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 140, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Enter  Results:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 100, 60));

        resultJTextField.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        resultJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultJTextFieldActionPerformed(evt);
            }
        });
        add(resultJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 310, 30));

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Double Left_100px.png"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 60, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blue-and-silver-stetoscope-40568.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void inputVerifier()
    {
        InputVerifier strValidation = new StringValidation();
        resultJTextField.setInputVerifier(strValidation);
    }
    
    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        request.setTestResult(resultJTextField.getText());
        if( resultJTextField.getText().trim().isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "Please enter all the details");
            return;
        }
        request.setStatus("Completed");
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PharmacyWorkAreaJPanel pwjp = (PharmacyWorkAreaJPanel) component;
        pwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void resultJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultJTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
