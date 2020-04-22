/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Network;

import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import userinterface.ManufactureRole.ManufactureWorkAreaJPanel;

/**
 *
 * @author MS
 */
public class ManufactureRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business,Network network) {
        return new ManufactureWorkAreaJPanel(userProcessContainer, account,network);
    }

}
