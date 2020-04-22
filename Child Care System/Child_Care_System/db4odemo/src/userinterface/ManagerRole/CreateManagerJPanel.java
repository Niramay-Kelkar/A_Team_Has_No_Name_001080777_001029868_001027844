/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ManagerRole;

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
 * @author deekshakhajuria
 */
public class CreateManagerJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    /**
     * Creates new form CreateManagerJPanel
     */
    public CreateManagerJPanel(JPanel userProcessContainer, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        inputVerifiers();
        managerNameTextField.setText(userAccount.getEmployee().getName());
    }
    
    private void inputVerifiers() {
          
        InputVerifier dobValidation = new DOBValidation();
        dobTextField.setInputVerifier(dobValidation);
        InputVerifier strValidation = new StringValidation();
        managerNameTextField.setInputVerifier(strValidation);
        addressTextField.setInputVerifier(strValidation);
        cityTextField.setInputVerifier(strValidation);
        occupationTextField.setInputVerifier(strValidation);
        InputVerifier phnValidation = new PhoneNoValidation();
        phoneTextField.setInputVerifier(phnValidation);
        InputVerifier noValidation = new NumberValidation();
        zipcodeTextField.setInputVerifier(noValidation);
        InputVerifier emailValidation = new EmailValidation();
        emailTextField.setInputVerifier(emailValidation);
    }
    
    public void reset()
    {
        managerNameTextField.setText("");
        dobTextField.setText("");
        addressTextField.setText("");
        cityTextField.setText("");
        occupationTextField.setText("");
        zipcodeTextField.setText("");
        emailTextField.setText("");
        phoneTextField.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        dateOfBirth = new javax.swing.JLabel();
        createMangerBtn = new javax.swing.JButton();
        occupation = new javax.swing.JLabel();
        zipCode = new javax.swing.JLabel();
        manageEnt = new javax.swing.JLabel();
        cityTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        zipcodeTextField = new javax.swing.JTextField();
        town = new javax.swing.JLabel();
        managerNameTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        donorName = new javax.swing.JLabel();
        emailID = new javax.swing.JLabel();
        createYourProfile = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        dobTextField = new javax.swing.JFormattedTextField();
        occupationTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Double Left_100px.png"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(40, 50, 60, 40);

        dateOfBirth.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        dateOfBirth.setText("Date Of Birth (MM/DD/YYYY):");
        add(dateOfBirth);
        dateOfBirth.setBounds(280, 230, 240, 21);

        createMangerBtn.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        createMangerBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_create.png"))); // NOI18N
        createMangerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createMangerBtnActionPerformed(evt);
            }
        });
        add(createMangerBtn);
        createMangerBtn.setBounds(430, 530, 120, 40);

        occupation.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        occupation.setText("Occupation:");
        add(occupation);
        occupation.setBounds(280, 350, 91, 21);

        zipCode.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        zipCode.setText("Zip Code:");
        add(zipCode);
        zipCode.setBounds(280, 430, 130, 21);

        manageEnt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        manageEnt.setText("Manager Work Area");
        add(manageEnt);
        manageEnt.setBounds(390, 50, 380, 42);

        cityTextField.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add(cityTextField);
        cityTextField.setBounds(510, 310, 184, 30);

        phoneTextField.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add(phoneTextField);
        phoneTextField.setBounds(510, 470, 184, 30);

        phoneNumber.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        phoneNumber.setText("Phone Number:");
        add(phoneNumber);
        phoneNumber.setBounds(280, 470, 115, 21);

        emailTextField.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add(emailTextField);
        emailTextField.setBounds(510, 390, 184, 30);

        zipcodeTextField.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add(zipcodeTextField);
        zipcodeTextField.setBounds(510, 430, 184, 30);

        town.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        town.setText("City");
        add(town);
        town.setBounds(280, 310, 140, 21);

        managerNameTextField.setEditable(false);
        managerNameTextField.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        managerNameTextField.setEnabled(false);
        add(managerNameTextField);
        managerNameTextField.setBounds(510, 190, 184, 30);

        addressTextField.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add(addressTextField);
        addressTextField.setBounds(510, 270, 184, 30);

        donorName.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        donorName.setText("Full Name:");
        add(donorName);
        donorName.setBounds(280, 190, 194, 30);

        emailID.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        emailID.setText("Email Address:");
        add(emailID);
        emailID.setBounds(280, 390, 130, 21);

        createYourProfile.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        createYourProfile.setText("Create Your Profile:");
        add(createYourProfile);
        createYourProfile.setBounds(280, 130, 250, 21);

        address.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        address.setText("Address: ");
        add(address);
        address.setBounds(280, 270, 194, 21);
        add(dobTextField);
        dobTextField.setBounds(510, 230, 184, 30);

        occupationTextField.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add(occupationTextField);
        occupationTextField.setBounds(510, 350, 184, 30);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blue-and-silver-stetoscope-40568.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(-220, -30, 1620, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void createMangerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createMangerBtnActionPerformed
        Employee employee = userAccount.getEmployee();
        if( addressTextField.getText()==null || addressTextField.getText().trim().isEmpty() ||
            cityTextField.getText()==null || cityTextField.getText().trim().isEmpty() ||
            phoneTextField.getText()==null || phoneTextField.getText().trim().isEmpty() ||
            dobTextField.getText()==null || dobTextField.getText().trim().isEmpty() ||
            occupationTextField.getText()==null || occupationTextField.getText().trim().isEmpty() ||
            emailTextField.getText()==null || emailTextField.getText().trim().isEmpty() ||
            zipcodeTextField.getText()==null || zipcodeTextField.getText().trim().isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "Enter data for all fields");
            return;
        }
        try
        {
            DateFormat dateFormat =  new SimpleDateFormat("MM/dd/yyyy");
            Date date = new Date();
            Date dob =  dateFormat.parse(dobTextField.getText());
            if(dob.after(date) || dob.equals(date))
            {
                JOptionPane.showMessageDialog(null, "Date of Birth not valid");
                return;
            }
            employee.setDob(dateFormat.parse(dobTextField.getText()));
            employee.setAddress1(addressTextField.getText());
            employee.setCity(cityTextField.getText());
            employee.setOccupation(occupationTextField.getText());
            employee.setZipCode(zipcodeTextField.getText());
            employee.setEmailId(emailTextField.getText());
            employee.setPhoneNumber(phoneTextField.getText());

            JOptionPane.showMessageDialog(null, "Created Successfully", "success", JOptionPane.PLAIN_MESSAGE);
            reset();
        }
        catch(ParseException pe)
        {
            JOptionPane.showMessageDialog(null, "Date of Birth not valid");
            return;
        }
        catch(NumberFormatException nfe)
        {
            JOptionPane.showMessageDialog(null, "Invalid Number");
            return;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Invalid Data! Check data in all fields");
            return;
        }
    }//GEN-LAST:event_createMangerBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JButton createMangerBtn;
    private javax.swing.JLabel createYourProfile;
    private javax.swing.JLabel dateOfBirth;
    private javax.swing.JFormattedTextField dobTextField;
    private javax.swing.JLabel donorName;
    private javax.swing.JLabel emailID;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JTextField managerNameTextField;
    private javax.swing.JLabel occupation;
    private javax.swing.JTextField occupationTextField;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JLabel town;
    private javax.swing.JLabel zipCode;
    private javax.swing.JTextField zipcodeTextField;
    // End of variables declaration//GEN-END:variables
}