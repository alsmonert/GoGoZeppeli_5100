/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StorageRole;

import Business.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author MS
 */
public class ViewStorageRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewStorageRequestJPanel
     */
    private JPanel container;
    private Network network;
    private UserAccount account;
    private WorkRequest request;
    public ViewStorageRequestJPanel(WorkRequest request,JPanel userProcessContainer,UserAccount account, Network network) {
        initComponents();
        this.network = network;
        this.container = userProcessContainer;
        this.account = account;
        this.request = request;
        StorageReqeustDetailsPopulate(request);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        STxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        FDTxt = new javax.swing.JTextField();
        SchoolTxt = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        IDTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ATxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CharityTxt = new javax.swing.JTextField();
        RDTxt = new javax.swing.JTextField();
        ManuTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        employeeTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(33, 63, 86));

        STxt.setBackground(new java.awt.Color(108, 122, 137));
        STxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        STxt.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Status");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Manufactory");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("School");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Request Details");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Finish Date(If finished)");

        FDTxt.setBackground(new java.awt.Color(108, 122, 137));
        FDTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FDTxt.setForeground(new java.awt.Color(255, 255, 255));

        SchoolTxt.setBackground(new java.awt.Color(108, 122, 137));
        SchoolTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SchoolTxt.setForeground(new java.awt.Color(255, 255, 255));

        backBtn.setBackground(new java.awt.Color(108, 122, 137));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/image/back.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        IDTxt.setBackground(new java.awt.Color(108, 122, 137));
        IDTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IDTxt.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RequestID");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Charity");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Request Date");

        ATxt.setBackground(new java.awt.Color(108, 122, 137));
        ATxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ATxt.setForeground(new java.awt.Color(255, 255, 255));
        ATxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Amount");

        CharityTxt.setBackground(new java.awt.Color(108, 122, 137));
        CharityTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CharityTxt.setForeground(new java.awt.Color(255, 255, 255));

        RDTxt.setBackground(new java.awt.Color(108, 122, 137));
        RDTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RDTxt.setForeground(new java.awt.Color(255, 255, 255));
        RDTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDTxtActionPerformed(evt);
            }
        });

        ManuTxt.setBackground(new java.awt.Color(108, 122, 137));
        ManuTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ManuTxt.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Employee");

        employeeTxt.setBackground(new java.awt.Color(108, 122, 137));
        employeeTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        employeeTxt.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addContainerGap(424, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(158, 158, 158)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ATxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(RDTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FDTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SchoolTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CharityTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(STxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ManuTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employeeTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDTxt))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(IDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ATxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(RDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(STxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(FDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(SchoolTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CharityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(employeeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        Component[] components = container.getComponents();
        StorageWorkAreaJPanel storageWorkAreaJPanel = (StorageWorkAreaJPanel) container.getComponent(components.length - 1);
        storageWorkAreaJPanel.populateStorageTable();
        layout.previous(container);
    }//GEN-LAST:event_backBtnActionPerformed

    private void ATxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ATxtActionPerformed

    private void RDTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RDTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ATxt;
    private javax.swing.JTextField CharityTxt;
    private javax.swing.JTextField FDTxt;
    private javax.swing.JTextField IDTxt;
    private javax.swing.JTextField ManuTxt;
    private javax.swing.JTextField RDTxt;
    private javax.swing.JTextField STxt;
    private javax.swing.JTextField SchoolTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField employeeTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    private void StorageReqeustDetailsPopulate(WorkRequest request) {
        IDTxt.setText(String.valueOf(request.getReqID()));
        ATxt.setText(String.valueOf(request.getAmount()));
        RDTxt.setText(String.valueOf(request.getRequestDate()));
        STxt.setText(request.getStatus());
        if(request.getResolveDate()!=null){
        FDTxt.setText(String.valueOf(request.getResolveDate()));}else{FDTxt.setText("");}
        
        if(request.getCharity()!=null){
        CharityTxt.setText(request.getCharity().getEmployee().getOrganization().getEnterprise().toString());}else{CharityTxt.setText("");}
        
        if(request.getManufacture()!=null){
        ManuTxt.setText(request.getManufacture().getEmployee().getOrganization().getEnterprise().toString());}else{ManuTxt.setText("");}
        
        if(request.getSchool()!=null){
        SchoolTxt.setText(request.getSchool().getEmployee().getOrganization().getEnterprise().toString());}else{SchoolTxt.setText("");}
        if(request.getStorage()!=null){
        employeeTxt.setText(request.getStorage().getEmployee().getName());
        }
        IDTxt.setEnabled(false);
        ATxt.setEnabled(false);
        RDTxt.setEnabled(false);
        STxt.setEnabled(false);
        FDTxt.setEnabled(false);
        CharityTxt.setEnabled(false);
        ManuTxt.setEnabled(false);
        SchoolTxt.setEnabled(false);
        employeeTxt.setEnabled(false);
    }
}
