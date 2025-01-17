/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageAirliner;

import Business.Customer;
import Business.Ticket;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author deekshakhajuria
 */
public class WelcomeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WelcomeJPanel
     */
    private JPanel displayPanel;
    private Customer customer;

    WelcomeJPanel(JPanel displayPanel, Customer customer) {
        initComponents();
        this.displayPanel = displayPanel;
        this.customer = customer;
        populateDetails();
    }

    private void populateDetails() {
        System.out.println("Interface.WelcomeJPanel.<init>()");
        try {
            System.out.println(customer.getTicket());
            Ticket ticket = customer.getTicket();
            userNameTextField.setText(ticket.getUserName());
            flightNumberTextField.setText(ticket.getFlightNumber());
            departureTextField.setText(ticket.getDepartureLocation());
            arrivalTextField.setText(ticket.getArrivalLocation());
            dateTextField.setText(ticket.getDate());
            bookingTextField.setText(ticket.getBookingDate() + "");
            timeTextField.setText(ticket.getFlightTime());
            durationTextField.setText(Double.toString(ticket.getFlightDuration()));
            priceTextField.setText(Double.toString(ticket.getPrice()));
            ticketTextField.setText(ticket.getTicketNumber());
            seatNoTxtField.setText(ticket.getSeatNumber());
        } catch (Exception e) {
            e.printStackTrace();
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

        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        flightNumberTextField = new javax.swing.JTextField();
        departureTextField = new javax.swing.JTextField();
        arrivalTextField = new javax.swing.JTextField();
        dateTextField = new javax.swing.JTextField();
        timeTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        durationTextField = new javax.swing.JTextField();
        priceTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ticketTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        bookingTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        seatNoTxtField = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 13, 85, 35));

        jLabel5.setText("Departure Date:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 255, -1, 37));

        jLabel6.setText("Flight Number");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 128, -1, 33));

        jLabel7.setText("Flight Duration:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, 33));

        jLabel9.setText("Price:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 220, -1, 34));

        flightNumberTextField.setEditable(false);
        flightNumberTextField.setEnabled(false);
        add(flightNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 133, 179, -1));

        departureTextField.setEditable(false);
        departureTextField.setEnabled(false);
        add(departureTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 174, 179, -1));

        arrivalTextField.setEditable(false);
        arrivalTextField.setEnabled(false);
        add(arrivalTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 217, 179, -1));

        dateTextField.setEditable(false);
        dateTextField.setEnabled(false);
        dateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTextFieldActionPerformed(evt);
            }
        });
        add(dateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 262, 179, -1));

        timeTextField.setEditable(false);
        timeTextField.setEnabled(false);
        timeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeTextFieldActionPerformed(evt);
            }
        });
        add(timeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 139, 177, -1));

        jLabel2.setText("Flight Time:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 134, -1, 33));

        jLabel3.setText("Departure Location:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 174, -1, 33));

        jLabel4.setText("Arrival Location:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 214, -1, 28));

        durationTextField.setEditable(false);
        durationTextField.setEnabled(false);
        add(durationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 185, 177, -1));

        priceTextField.setEditable(false);
        priceTextField.setEnabled(false);
        add(priceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 226, 177, -1));

        jLabel13.setText("Username:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 88, -1, 33));

        userNameTextField.setEditable(false);
        userNameTextField.setEnabled(false);
        add(userNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 93, 179, -1));

        jLabel10.setText("Ticket Number:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 267, -1, -1));

        ticketTextField.setEditable(false);
        ticketTextField.setEnabled(false);
        add(ticketTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 267, 177, -1));

        jLabel11.setText("Booking Date:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 90, -1, 37));

        bookingTextField.setEditable(false);
        bookingTextField.setEnabled(false);
        add(bookingTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 97, 177, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("BOOKING DETAILS");
        jLabel8.setToolTipText("");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 13, 365, 54));

        jLabel1.setText("(USD)");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(767, 229, -1, -1));

        jLabel12.setText("Seat Number:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 305, -1, 37));

        seatNoTxtField.setEditable(false);
        seatNoTxtField.setEnabled(false);
        seatNoTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatNoTxtFieldActionPerformed(evt);
            }
        });
        add(seatNoTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 305, 179, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        displayPanel.remove(this);
        CardLayout cardLayout = (CardLayout) displayPanel.getLayout();
        cardLayout.previous(displayPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void dateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTextFieldActionPerformed

    private void timeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeTextFieldActionPerformed

    private void seatNoTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatNoTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatNoTxtFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arrivalTextField;
    private javax.swing.JTextField bookingTextField;
    private javax.swing.JButton btnBack;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JTextField departureTextField;
    private javax.swing.JTextField durationTextField;
    private javax.swing.JTextField flightNumberTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JTextField seatNoTxtField;
    private javax.swing.JTextField ticketTextField;
    private javax.swing.JTextField timeTextField;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
