/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.StorageRole;
import java.util.ArrayList;

/**
 *
 * @author MS
 */
public class StorageOrg extends Organization {

    private ArrayList<Role> roles;

    public StorageOrg() {
        super(Organization.Type.Storage.getValue());
        roles = new ArrayList();
        roles.add(new StorageRole());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return roles; //To change body of generated methods, choose Tools | Templates.
    }

}
