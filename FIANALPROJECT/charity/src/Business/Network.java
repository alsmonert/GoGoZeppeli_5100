/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.Organization;
import Business.Resourse.ResourceDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author MS
 */
public class Network{

    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private ArrayList<String> enterpriseNameList;
    private UserAccountDirectory userAccountDirectory;
    private EmployeeDirectory employeeDirectory;
    private int networkID;
    private static int nct = 1;
    private WorkRequestPool pool;
    private EcoSystem system;
    private ResourceDirectory resourceDirectory;

    public ResourceDirectory getResourceDirectory() {
        return resourceDirectory;
    }

    public void setResourceDirectory(ResourceDirectory resourceDirectory) {
        this.resourceDirectory = resourceDirectory;
    }

    public ArrayList<String> getEnterpriseNameList() {
        enterpriseNameList = new ArrayList<String>();
        for(Enterprise ep : enterpriseDirectory.getEnterpriseList()){
            enterpriseNameList.add(ep.getName());}
        return enterpriseNameList;
    
    }


    public UserAccountDirectory getUserAccountDirectory() {
        ///userAccountDirectory.getUserAccountList().clear();
        //for (Enterprise ep : enterpriseDirectory.getEnterpriseList()) {
            //for (UserAccount ua : ep.getUserAccountDirectory().getUserAccountList()) {
             //   userAccountDirectory.createUserAccount(ua.getUsername(),ua.getPassword(),ua.getEmployee(),ua.getRole());
            //}
        //}
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        //employeeDirectory.getEmployeeList().clear();
        //for (Enterprise ep : enterpriseDirectory.getEnterpriseList()) {
            //for (Employee eplyee : ep.getEmployeeDirectory().getEmployeeList()) {
            //    employeeDirectory.createEmployee(eplyee.getName());
           // }
       // }
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public Network() {
        enterpriseDirectory = new EnterpriseDirectory();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        pool = new WorkRequestPool();
        networkID = nct;
        nct++;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getNetworkID() {
        return networkID;
    }

    public void setNetworkID(int networkID) {
        this.networkID = networkID;
    }

    public WorkRequestPool getPool() {
        return pool;
    }

    public void setPool(WorkRequestPool pool) {
        this.pool = pool;
    }

    public EcoSystem getSystem() {
        return system;
    }

    public void setSystem(EcoSystem system) {
        this.system = system;
    }

    
}
