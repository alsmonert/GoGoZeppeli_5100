/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.ConfigureASystem;
import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Network;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Panel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ms
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private Network network;
    private Network network_ini;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        //system = ConfigureASystem.configure();
        network_ini = new Network();
        network_ini.setName("initial_network");
        if(system.getNetworkList()==null){
        system.getNetworkList().add(network_ini);}
        else{
            for(Network netw:system.getNetworkList()){
                if(netw.getName()=="initial_network")
                {break;}
            }
        }
        
        CBinitialize();
        network = (Network) NetworkCB.getSelectedItem();
        UserInitialize();
        this.setSize(1680, 1050);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        loginJLabel = new javax.swing.JLabel();
        NetworkCB = new javax.swing.JComboBox<>();
        loginJButton = new javax.swing.JButton();
        logoutJButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        userNameJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(33, 63, 86));

        NetworkCB.setBackground(new java.awt.Color(143, 169, 189));
        NetworkCB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NetworkCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        NetworkCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetworkCBActionPerformed(evt);
            }
        });

        loginJButton.setBackground(new java.awt.Color(255, 255, 255));
        loginJButton.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        loginJButton.setForeground(new java.awt.Color(33, 63, 86));
        loginJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/image/denglu.png"))); // NOI18N
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        logoutJButton.setBackground(new java.awt.Color(255, 255, 255));
        logoutJButton.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        logoutJButton.setForeground(new java.awt.Color(33, 63, 86));
        logoutJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/image/tuichu.png"))); // NOI18N
        logoutJButton.setEnabled(false);
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        passwordField.setBackground(new java.awt.Color(108, 122, 137));
        passwordField.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));

        userNameJTextField.setBackground(new java.awt.Color(108, 122, 137));
        userNameJTextField.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        userNameJTextField.setForeground(new java.awt.Color(255, 255, 255));
        userNameJTextField.setMaximumSize(new java.awt.Dimension(500, 300));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Name");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(passwordField, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(userNameJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(loginJLabel))
                    .addComponent(NetworkCB, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(logoutJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(NetworkCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginJLabel)
                .addContainerGap(556, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        container.setBackground(new java.awt.Color(33, 63, 86));
        container.setLayout(new java.awt.CardLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/image/微信图片_20200421014537.png"))); // NOI18N
        container.add(jLabel3, "card2");

        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NetworkCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NetworkCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NetworkCBActionPerformed

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // Get user name
        String inputUserName = userNameJTextField.getText();
        char[] passwordCharArray = passwordField.getPassword();
        String inputPassword = String.valueOf(passwordCharArray);
        //String inputPassword = passwordField.getText();
        UserAccount ua = system.getUserAccountDirectory().authenticateUser(inputUserName, inputPassword);
        if (ua != null) {
            JPanel workAreaJPanel = ua.getRole().createWorkArea(container, ua, system, network);
            container.add("WorkAreaJPanel", workAreaJPanel);
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);
            logoutJButton.setEnabled(true);
            userNameJTextField.setEnabled(false);
            passwordField.setEnabled(false);
            loginJButton.setEnabled(false);
            userNameJTextField.setText("");
            passwordField.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Your username or password is incorrect!");
        }
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        logoutJButton.setEnabled(false);
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
        loginJButton.setEnabled(true);
        userNameJTextField.setText("");
        passwordField.setText("");
        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);

        CBinitialize();
        UserInitialize();dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> NetworkCB;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables

    private void CBinitialize() {
        NetworkCB.removeAllItems();
        if (system.getNetworkList().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No network!There's something wrong!");
        } else {
            for (Network i : system.getNetworkList()) {
                NetworkCB.addItem(i);
            }
        }
    }

    private void UserInitialize() {
        for (Network nt : system.getNetworkList()) {
                for (UserAccount account : nt.getUserAccountDirectory().getUserAccountList()) {
                    System.out.println(account.getUsername());
                    if(!system.getUserAccountDirectory().getUserAccountList().contains(account)){
                    system.getUserAccountDirectory().getUserAccountList().add(account);}
                }
        }
    }

}
