/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.TravelAgency;

import Business.Airliner.AirlinerDirectory;
import Business.Airliner.Airliner;
import Business.Airliner.Airplane;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class AirlinerAddPanel extends javax.swing.JPanel {

    /**
     * Creates new form AirlinerAddPanel
     */
    private AirlinerDirectory alDir;
    private JPanel travelAgencyCL;

    public AirlinerAddPanel(JPanel travelAgencyCL, AirlinerDirectory alDir) {
        initComponents();
        this.travelAgencyCL = travelAgencyCL;
        this.alDir = alDir;
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
        nameTF = new javax.swing.JTextField();
        submitBTN = new javax.swing.JButton();
        backBTN = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        airplaneNumTF = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(681, 483));

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        jLabel1.setText("Add Airliners");

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel2.setText("Name");

        submitBTN.setText("Submit");
        submitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBTNActionPerformed(evt);
            }
        });

        backBTN.setText("<< Back");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel5.setText("Airplane Numbers (use , to split)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(backBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(submitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(airplaneNumTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addGap(37, 37, 37)
                .addComponent(airplaneNumTF, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBTN)
                    .addComponent(submitBTN))
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBTNActionPerformed
        if (nameTF.getText().isEmpty() || airplaneNumTF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields!!");
            return;
        } else {
            String[] airplaneNum = null;
            airplaneNum = airplaneNumTF.getText().split(",");

            for (int i = 0; i < airplaneNum.length; i++) {
                for (int j = i + 1; j < airplaneNum.length; j++) {
                    if (airplaneNum[i].equals(airplaneNum[j])) {
                        JOptionPane.showMessageDialog(this, "Airplane number is illegal!");
                        return;
                    }
                }
            }
            Airliner al = alDir.addAirliner();
            al.setName(nameTF.getText());
            
            for (String airplaneName : airplaneNum) {
                Airplane ap = al.addAirplane();
                ap.setAirlinerName(nameTF.getText());
                ap.setAirplaneNum(airplaneName);
            }

            JOptionPane.showMessageDialog(this, "Airliner Created Successfully");

            nameTF.setText("");

            airplaneNumTF.setText("");
        }
    }//GEN-LAST:event_submitBTNActionPerformed

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        travelAgencyCL.remove(this);
        CardLayout cl = (CardLayout) travelAgencyCL.getLayout();
        Component[] comps = travelAgencyCL.getComponents();
        for (Component comp : comps) {
            if (comp instanceof ManageTravelAgencyPanel) {
                ManageTravelAgencyPanel MTAP = (ManageTravelAgencyPanel) comp;
                MTAP.populate();
            }
        }
        cl.previous(travelAgencyCL);
    }//GEN-LAST:event_backBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airplaneNumTF;
    private javax.swing.JButton backBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton submitBTN;
    // End of variables declaration//GEN-END:variables
}
