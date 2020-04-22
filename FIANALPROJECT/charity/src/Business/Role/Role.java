/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author MS
 */
public abstract class Role {

    public enum RoleType {
        Manufacture("Manufacture"),
        School("School"),
        Storage("Storage"),
        SysAdmin("Sysadmin"),
        CharityManager("CharityManager"),
        Sell("Sell");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            EcoSystem business,
            Network network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

}
