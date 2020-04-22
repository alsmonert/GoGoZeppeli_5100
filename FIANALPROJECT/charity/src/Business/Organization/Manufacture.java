/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ManufactureRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author MS
 */
public class Manufacture extends Organization{
    private ArrayList<Role> roles;
    public Manufacture()
    {
        super(Organization.Type.Manufacture.getValue());
        roles = new ArrayList();
        roles.add(new ManufactureRole());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return roles; //To change body of generated methods, choose Tools | Templates.
    }
}
