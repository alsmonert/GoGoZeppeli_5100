/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SchoolRole;

import Business.Employee.Employee;
import Business.Enterprise.Charity;
import Business.Enterprise.Enterprise;
import Business.Enterprise.School;
import Business.Network;
import Business.Resourse.Resource;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author MS
 */
public class CreateSchoolRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateSchoolRequestJPanel
     */
    private String message;
    private int amount;
    private WorkRequest request;
    private JPanel container;
    private Network network;
    private UserAccount account;

    public CreateSchoolRequestJPanel(JPanel userProcessContainer,UserAccount account, Network network) {
        initComponents();
        this.network = network;
        this.container = userProcessContainer;
        this.account = account;
        CBinitialize();
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AmountTXT = new javax.swing.JTextField();
        DateTXT = new javax.swing.JTextField();
        CreateBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CharityCB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(33, 63, 86));

        BackBtn.setBackground(new java.awt.Color(108, 122, 137));
        BackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/image/back.png"))); // NOI18N
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Amount");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date");

        AmountTXT.setBackground(new java.awt.Color(108, 122, 137));
        AmountTXT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AmountTXT.setForeground(new java.awt.Color(255, 255, 255));

        DateTXT.setBackground(new java.awt.Color(108, 122, 137));
        DateTXT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DateTXT.setForeground(new java.awt.Color(255, 255, 255));

        CreateBtn.setBackground(new java.awt.Color(44, 62, 80));
        CreateBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CreateBtn.setForeground(new java.awt.Color(255, 255, 255));
        CreateBtn.setText("Create");
        CreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Form:yyyy-MM-dd");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Charity to work");

        CharityCB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CharityCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create Request");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AmountTXT)
                                    .addComponent(DateTXT)
                                    .addComponent(CharityCB, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addComponent(jLabel2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(CreateBtn)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(AmountTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(DateTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(39, 39, 39)
                        .addComponent(jLabel5))
                    .addComponent(CharityCB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(CreateBtn)
                .addGap(116, 116, 116))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        Component[] components = container.getComponents();
        SchoolWorkAreaJPanel schoolWorkAreaJPanel = (SchoolWorkAreaJPanel) container.getComponent(components.length - 1);
        schoolWorkAreaJPanel.populateSchoolTable();
        layout.previous(container);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void CreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBtnActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Charity charity = (Charity) CharityCB.getSelectedItem();
        if(AmountTXT.getText().isEmpty()||DateTXT.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill in all fields!!");
            return;}
        else{
            amount = Integer.parseInt(AmountTXT.getText());
            request = new WorkRequest(amount);
            try {
                sdf.parse(DateTXT.getText());
            } catch (Exception exc) {
                JOptionPane.showMessageDialog(this, "Please fill date in yyyy-MM-dd format into date field!!");
                return;
            }
            try {
                sdf.setLenient(false);
                sdf.parse(DateTXT.getText());
            } catch (Exception exc) {
                JOptionPane.showMessageDialog(this, "Date is illegal!!!");
                return;
            }
            try {
                request.setRequestDate(sdf.parse(DateTXT.getText()));
            } catch (Exception e) {JOptionPane.showMessageDialog(this, "Fail to create request!");
                return;
            }
            request.setStatus("Pending");
            request.setSchool(account);
            request.setCharityTodo(charity);
            network.getPool().getWorkRequestList().add(request);
            JOptionPane.showMessageDialog(null,"Request successfully created!");
            AmountTXT.setText("");
            DateTXT.setText("");
        }
    }//GEN-LAST:event_CreateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmountTXT;
    private javax.swing.JButton BackBtn;
    private javax.swing.JComboBox<Object> CharityCB;
    private javax.swing.JButton CreateBtn;
    private javax.swing.JTextField DateTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

    private void CBinitialize() {
        CharityCB.removeAllItems();
        for(Enterprise ep:network.getEnterpriseDirectory().getEnterpriseList()) {
            if(ep instanceof Charity){CharityCB.addItem(ep);}
            else{}
        }
    }

    
}
