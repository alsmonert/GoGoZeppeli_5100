/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Network;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import userinterface.SchoolRole.ViewSchoolRequestJPanel;

/**
 *
 * @author MS
 */
public class ManageRequestJPanel extends javax.swing.JPanel {

    private Network network;
    private JPanel container;

    /**
     * Creates new form ManageRequestJPanel
     *
     * @param container
     * @param network
     */
    public ManageRequestJPanel(JPanel container, Network network) {
        initComponents();
        this.container = container;
        this.network = network;
        populateRequest();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        RequestTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        ViewDetails = new javax.swing.JButton();

        setBackground(new java.awt.Color(33, 63, 86));

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        RequestTable.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        RequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "RequestID", "Amount", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(RequestTable);

        backBtn.setBackground(new java.awt.Color(108, 122, 137));
        backBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/image/back.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        ViewDetails.setBackground(new java.awt.Color(44, 62, 80));
        ViewDetails.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ViewDetails.setForeground(new java.awt.Color(255, 255, 255));
        ViewDetails.setText("View Details");
        ViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 110, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(ViewDetails)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewDetails)
                .addContainerGap(98, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        Component[] components = container.getComponents();
        SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel = (SystemAdminWorkAreaJPanel) container.getComponent(components.length - 1);
        systemAdminWorkAreaJPanel.populateTree();
        layout.previous(container);
    }//GEN-LAST:event_backBtnActionPerformed

    private void ViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDetailsActionPerformed
        int selectedRow = RequestTable.getSelectedRow();
        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) RequestTable.getValueAt(selectedRow, 0);
            ViewRequestJPanel viewRequestJPanel = new ViewRequestJPanel(request, container, network);
            container.add("ViewRequestJPanel", viewRequestJPanel);
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ViewDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable RequestTable;
    private javax.swing.JButton ViewDetails;
    private javax.swing.JButton backBtn;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void populateRequest() {
        DefaultTableModel dtm1 = (DefaultTableModel) RequestTable.getModel();
        dtm1.setRowCount(0);
        for (WorkRequest request : network.getPool().getWorkRequestList()) {
            Object[] row1 = new Object[3];
            row1[0] = request;
            row1[1] = request.getAmount();
            row1[2] = request.getStatus();
            dtm1.addRow(row1);
        } //To change body of generated methods, choose Tools | Templates.
    }
}
