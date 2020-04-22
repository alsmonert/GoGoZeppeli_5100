/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.CharityManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author MS
 */
public class CharityOrg extends Organization {

    private ArrayList<Role> roles;

    public CharityOrg() {
        super(Type.Charity.getValue());
        roles = new ArrayList();
        roles.add(new CharityManagerRole());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return roles; //To change body of generated methods, choose Tools | Templates.
    }

}
