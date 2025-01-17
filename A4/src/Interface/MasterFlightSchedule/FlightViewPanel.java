/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.MasterFlightSchedule;

import Business.Schedule.Flight;
import Business.Schedule.FlightSchedule;
import Business.Airliner.Airplane;
import Business.Airliner.Airliner;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;

/**
 *
 * @author dell
 */
public class FlightViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form FlightViewPanel
     */
    private JPanel travelAgencyCL;
    private Flight flight;
    private FlightSchedule fs;

    public FlightViewPanel(JPanel travelAgencyCL, Flight flight, FlightSchedule fs) {
        initComponents();
        this.travelAgencyCL = travelAgencyCL;
        this.flight = flight;
        this.fs = fs;
        timeCB.removeAllItems();
        timeCB.addItem("Morning");
        timeCB.addItem("Daytime");
        timeCB.addItem("Evening");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        flightNumTF.setText(flight.getFlightNum());
        airlinerNameTF.setText(flight.getAirliner().getName());
        dateTF.setText(sdf.format(flight.getDate()));
        departureTF.setText(flight.getDeparture());
        destinationTF.setText(flight.getDestination());
        timeCB.setSelectedItem(flight.getTime());
        airplaneNumTF.setText(flight.getAirplane().getAirplaneNum());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        flightNumTF = new javax.swing.JTextField();
        airlinerNameTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        submitBTN = new javax.swing.JButton();
        departureTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        destinationTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dateTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        updateBTN = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        airplaneNumTF = new javax.swing.JTextField();
        timeCB = new javax.swing.JComboBox();

        setPreferredSize(new java.awt.Dimension(681, 483));

        backBTN.setText("<< Back");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        jLabel1.setText("Add Flight");

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel2.setText("Airliner Name");

        flightNumTF.setEditable(false);

        airlinerNameTF.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel3.setText("Flight Number");

        submitBTN.setText("Submit");
        submitBTN.setEnabled(false);
        submitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBTNActionPerformed(evt);
            }
        });

        departureTF.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel4.setText("Departure");

        destinationTF.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel5.setText("Destination");

        dateTF.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel6.setText("Date");

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel7.setText("Time");

        updateBTN.setText("Update");
        updateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTNActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel8.setText("Airplane Number");

        airplaneNumTF.setEditable(false);

        timeCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        timeCB.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(airlinerNameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                    .addComponent(flightNumTF)
                                    .addComponent(departureTF)
                                    .addComponent(destinationTF)
                                    .addComponent(dateTF)
                                    .addComponent(airplaneNumTF, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(backBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(updateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(submitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addComponent(timeCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(2, 2, 2)))))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(airlinerNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(flightNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(departureTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(destinationTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(timeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(airplaneNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBTN)
                    .addComponent(updateBTN)
                    .addComponent(submitBTN))
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        travelAgencyCL.remove(this);
        CardLayout cl = (CardLayout) travelAgencyCL.getLayout();
        Component[] comps = travelAgencyCL.getComponents();
        for (Component comp : comps) {
            if (comp instanceof ManageFlightSchedulePanel) {
                ManageFlightSchedulePanel MLSP = (ManageFlightSchedulePanel) comp;
                MLSP.populate();
            }
        }
        cl.previous(travelAgencyCL);
    }//GEN-LAST:event_backBTNActionPerformed

    private void submitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBTNActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if (airplaneNumTF.getText().isEmpty() || flightNumTF.getText().isEmpty() || airlinerNameTF.getText().isEmpty() || dateTF.getText().isEmpty() || departureTF.getText().isEmpty() || destinationTF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields!!");
            return;
        } else {
            int airplaneNumExist = 0;
            for (Airplane ap : flight.getAirliner().getAirplanesDir()) {
                if (ap.getAirplaneNum().equals(airplaneNumTF.getText())) {
                    airplaneNumExist = 1;
                }
            }
            if (airplaneNumExist == 0) {
                JOptionPane.showMessageDialog(this, "This number does not exist!!");
                return;
            }
        }
        try {
            sdf.parse(dateTF.getText());
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(this, "Please fill date in yyyy-MM-dd format into date field!!");
            return;
        }
        try {
            sdf.setLenient(false);
            sdf.parse(dateTF.getText());
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(this, "Date is illegal!!!");
            return;
        }

        flight.getAirplane().setAirplaneNum(airplaneNumTF.getText());
        try {
            flight.setDate(sdf.parse(dateTF.getText()));
        } catch (Exception e) {
        }
        flight.setFlightNum(flightNumTF.getText());
        flight.setDeparture(departureTF.getText());
        flight.setDestination(destinationTF.getText());
        flight.setTime((String)timeCB.getSelectedItem());

        JOptionPane.showMessageDialog(this, "Updated Successfully");

        flightNumTF.setEditable(false);
        dateTF.setEditable(false);
        departureTF.setEditable(false);
        destinationTF.setEditable(false);
        timeCB.setEnabled(false);
        updateBTN.setEnabled(true);
        submitBTN.setEnabled(false);
        airplaneNumTF.setEditable(false);
    }//GEN-LAST:event_submitBTNActionPerformed

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed
        airplaneNumTF.setEditable(true);
        flightNumTF.setEditable(true);
        dateTF.setEditable(true);
        departureTF.setEditable(true);
        destinationTF.setEditable(true);
        timeCB.setEnabled(true);
        updateBTN.setEnabled(false);
        submitBTN.setEnabled(true);
    }//GEN-LAST:event_updateBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airlinerNameTF;
    private javax.swing.JTextField airplaneNumTF;
    private javax.swing.JButton backBTN;
    private javax.swing.JTextField dateTF;
    private javax.swing.JTextField departureTF;
    private javax.swing.JTextField destinationTF;
    private javax.swing.JTextField flightNumTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton submitBTN;
    private javax.swing.JComboBox timeCB;
    private javax.swing.JButton updateBTN;
    // End of variables declaration//GEN-END:variables
}
