/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Network;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ChariryManagerRole.CharityManagerWorkAreaJPanel;

/**
 *
 * @author MS
 */
public class CharityManagerRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business,Network network) {
        return new CharityManagerWorkAreaJPanel(userProcessContainer,account,network);
    }
}
