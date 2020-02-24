/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.MasterFlightSchedule;

import Business.Airliner.Airliner;
import Business.Airliner.AirlinerDirectory;
import Business.Schedule.FlightSchedule;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author dell
 */
public class FlightLoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form FlightLoginPanel
     */
    private AirlinerDirectory ad;
    private JPanel travelAgencyCL;
    private FlightSchedule fs;

    public FlightLoginPanel(JPanel travelAgencyCL, FlightSchedule fs, AirlinerDirectory ad) {
        initComponents();
        this.ad = ad;
        this.fs = fs;
        this.travelAgencyCL = travelAgencyCL;
        refreshComboBox();
    }

    public void refreshComboBox() {
        airlinerCB.removeAllItems();
        airlinerCB.addItem("master schedule");
        for (Airliner a : ad.getAirlinerDir()) {
            airlinerCB.addItem(a);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        airlinerCB = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(681, 483));

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel1.setText("Select Your Airliner");

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        jLabel2.setText("Login");

        airlinerCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        airlinerCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlinerCBActionPerformed(evt);
            }
        });

        jButton1.setText("Comfirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1)
                        .addGap(141, 141, 141)
                        .addComponent(airlinerCB, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(149, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(airlinerCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(151, 151, 151)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void airlinerCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlinerCBActionPerformed

    }//GEN-LAST:event_airlinerCBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Airliner selectedAirliner = null;
        if (!airlinerCB.getSelectedItem().equals("master schedule")) {
            selectedAirliner = (Airliner) airlinerCB.getSelectedItem();
            ManageFlightSchedulePanel MFSP = new ManageFlightSchedulePanel(travelAgencyCL, fs, selectedAirliner);
            travelAgencyCL.add("ManageFlightSchedulePanel", MFSP);
            CardLayout cl = (CardLayout) travelAgencyCL.getLayout();
            cl.next(travelAgencyCL);
        }
        else{ManagerFlightSchedulePanel MFSP = new ManagerFlightSchedulePanel(travelAgencyCL, fs);
            travelAgencyCL.add("ManagerFlightSchedulePanel", MFSP);
            CardLayout cl = (CardLayout) travelAgencyCL.getLayout();
            cl.next(travelAgencyCL);}
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox airlinerCB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
