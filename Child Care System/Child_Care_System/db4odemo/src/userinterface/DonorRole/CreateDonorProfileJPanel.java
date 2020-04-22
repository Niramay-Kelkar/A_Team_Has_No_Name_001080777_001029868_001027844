/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DonorRole;

import Business.Employee.Employee;
import Business.UserAccount.UserAccount;
import Business.Validation.DOBValidation;
import Business.Validation.EmailValidation;
import Business.Validation.NumberValidation;
import Business.Validation.PhoneNoValidation;
import Business.Validation.StringValidation;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author moury
 */
public class CreateDonorProfileJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    
    /**
     * Creates new form CreateDonorProfileJPanel
     */
    public CreateDonorProfileJPanel(JPanel userProcessContainer, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        
        jTextField2.setText(userAccount.getEmployee().getName());
        name.setVisible(true);
        inputVerifier();
    }

    
    private void inputVerifier() {
          
        InputVerifier strValidation = new StringValidation();
        jTextField2.setInputVerifier(strValidation);
        addressTextField.setInputVerifier(strValidation);
        cityTextField.setInputVerifier(strValidation);
        occupationTextField.setInputVerifier(strValidation);
        
        InputVerifier dobValidation = new DOBValidation();
        dobTextField.setInputVerifier(dobValidation);
        
        InputVerifier noValidation = new NumberValidation();
        zipcodeTextField.setInputVerifier(noValidation);
        
        InputVerifier phnValidation = new PhoneNoValidation();
        phoneNumberTextField.setInputVerifier(phnValidation);
         
        InputVerifier emailValidation = new EmailValidation();
        emailTextField.setInputVerifier(emailValidation);
     
        
    }
    
    public void resetFields()
    {
        
        jTextField2.setText("");
        dobTextField.setText("");
        addressTextField.setText("");
        cityTextField.setText("");
        occupationTextField.setText("");
        zipcodeTextField.setText("");
        emailTextField.setText("");
        phoneNumberTextField.setText("");  
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        name1 = new javax.swing.JLabel();
        dobTextField = new javax.swing.JTextField();
        name2 = new javax.swing.JLabel();
        occupationTextField = new javax.swing.JTextField();
        name3 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        name4 = new javax.swing.JLabel();
        name5 = new javax.swing.JLabel();
        name6 = new javax.swing.JLabel();
        cityTextField = new javax.swing.JTextField();
        zipcodeTextField = new javax.swing.JTextField();
        phoneNumberTextField = new javax.swing.JTextField();
        name7 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        createProfileButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        name.setText("Full Name:");
        add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 194, 28));

        jTextField2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 180, -1));

        addressTextField.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        addressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextFieldActionPerformed(evt);
            }
        });
        add(addressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 180, -1));

        name1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        name1.setText("Address:");
        add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 194, 28));

        dobTextField.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        dobTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobTextFieldActionPerformed(evt);
            }
        });
        add(dobTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 180, -1));

        name2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        name2.setText("Email Address:");
        add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 194, 28));

        occupationTextField.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        occupationTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                occupationTextFieldActionPerformed(evt);
            }
        });
        add(occupationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 180, -1));

        name3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        name3.setText("Date Of Birth:");
        add(name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 194, 28));

        emailTextField.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });
        add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 180, -1));

        name4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        name4.setText("Occupation:");
        add(name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 194, 28));

        name5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        name5.setText("City:");
        add(name5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 194, 28));

        name6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        name6.setText("Zipcode:");
        add(name6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 194, 28));

        cityTextField.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTextFieldActionPerformed(evt);
            }
        });
        add(cityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 180, -1));

        zipcodeTextField.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        zipcodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipcodeTextFieldActionPerformed(evt);
            }
        });
        add(zipcodeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 180, -1));

        phoneNumberTextField.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        phoneNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberTextFieldActionPerformed(evt);
            }
        });
        add(phoneNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 180, -1));

        name7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        name7.setText("Phone Number:");
        add(name7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 194, 28));

        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Double Left_100px.png"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 60, 60));

        createProfileButton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        createProfileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_create.png"))); // NOI18N
        createProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createProfileButtonActionPerformed(evt);
            }
        });
        add(createProfileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 130, 40));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Enter Donor Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 210, 52));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blue-and-silver-stetoscope-40568.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void addressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTextFieldActionPerformed

    private void dobTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobTextFieldActionPerformed

    private void occupationTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_occupationTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_occupationTextFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void cityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTextFieldActionPerformed

    private void zipcodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipcodeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipcodeTextFieldActionPerformed

    private void phoneNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberTextFieldActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void createProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createProfileButtonActionPerformed
        Employee employee = userAccount.getEmployee();

        if( addressTextField.getText().trim().isEmpty() ||
            cityTextField.getText().trim().isEmpty() ||
            occupationTextField.getText().trim().isEmpty() ||
            emailTextField.getText().trim().isEmpty() ||
            phoneNumberTextField.getText().trim().isEmpty() ||
            dobTextField.getText().trim().isEmpty() ||
            zipcodeTextField.getText().trim().isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "Please enter all the details");
            return;
        }

        try
        {
            DateFormat dateFormat =  new SimpleDateFormat("MM/dd/yyyy");
            Date date = new Date();
            Date dob =  dateFormat.parse(dobTextField.getText());
            if(dob.after(date) || dob.equals(date))
            {
                JOptionPane.showMessageDialog(null, "Date of Birth should be less than present date");
                return;
            }
            employee.setDob(dateFormat.parse(dobTextField.getText()));
            employee.setAddress1(addressTextField.getText());
            employee.setCity(cityTextField.getText());
            employee.setOccupation(occupationTextField.getText());
            employee.setZipCode(zipcodeTextField.getText());
            employee.setEmailId(emailTextField.getText());
            employee.setPhoneNumber(phoneNumberTextField.getText());

            JOptionPane.showMessageDialog(null, "Details have been added successfully", "success", JOptionPane.PLAIN_MESSAGE);
            resetFields();
        }
        catch(ParseException pe)
        {
            JOptionPane.showMessageDialog(null, "Enter valid Date of Birth!");
            return;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Enter valid data in all the fields");
            return;
        }
    }//GEN-LAST:event_createProfileButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JButton createProfileButton;
    private javax.swing.JTextField dobTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel name5;
    private javax.swing.JLabel name6;
    private javax.swing.JLabel name7;
    private javax.swing.JTextField occupationTextField;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JTextField zipcodeTextField;
    // End of variables declaration//GEN-END:variables
}