/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.AirlinerDirectory;
import Business.CustomerDirectory;
import Business.FlightSchedule;
import Business.TicketDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author deekshakhajuria
 */
public class ManageCustomersJPanel extends javax.swing.JPanel {
    
     private JPanel CardSequenceJPanel;
     private  FlightSchedule flightSched;
     private CustomerDirectory custdir;
     private TicketDirectory ticketDir;

    /**
     * Creates new form ManageCustomersJPanel
     * @param CardSequenceJPanel
     */
   
        
    public ManageCustomersJPanel(JPanel CardSequenceJPanel, FlightSchedule flightSched, CustomerDirectory custdir,TicketDirectory ticketDir) {
    initComponents();
    this.CardSequenceJPanel=CardSequenceJPanel;
    this.custdir=custdir;
    this.flightSched=flightSched;
    this.ticketDir=ticketDir;
    
    }

    public ManageCustomersJPanel(JPanel CardSequenceJPanel, AirlinerDirectory airlineDir, FlightSchedule fSched) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        btnalltickets = new javax.swing.JButton();
        btnbookseat = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Customers");

        btnalltickets.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnalltickets.setText("View All Tickets");
        btnalltickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnallticketsActionPerformed(evt);
            }
        });

        btnbookseat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnbookseat.setText("Book Flight");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnalltickets)
                        .addGap(92, 92, 92)
                        .addComponent(btnbookseat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(273, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnalltickets, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbookseat, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(276, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnallticketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnallticketsActionPerformed
        // TODO add your handling code here:
           ViewAllTicketsJPanel manage = new ViewAllTicketsJPanel (CardSequenceJPanel,ticketDir,flightSched);

       CardSequenceJPanel.add("ViewAllTickets",manage);
       CardLayout layout = (CardLayout)CardSequenceJPanel.getLayout();
    
        layout.next(CardSequenceJPanel);
                        
    }//GEN-LAST:event_btnallticketsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnalltickets;
    private javax.swing.JButton btnbookseat;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}