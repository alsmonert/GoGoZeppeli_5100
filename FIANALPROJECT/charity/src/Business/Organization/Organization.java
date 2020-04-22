/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import Business.Network;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author MS
 */
public abstract class Organization {
    private Type type;
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter = 1;
    private Enterprise enterprise;
    private String address;
    private String phonenum;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    
    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public enum Type {
        Manufacture("Manufacture"),
        School("School"),
        Storage("Storage"),
        SysAdmin("Sysadmin"),
        Charity("Charity"),
        Sell("Sell");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue(Organization org,Network network) {
        ArrayList<WorkRequest> pool = network.getPool().getWorkRequestList();
        for(WorkRequest req:pool){
            if(req.getSchool().getEmployee().getOrganization().equals(org)){workQueue.getWorkRequestList().add(req);}
            else if(req.getCharity().getEmployee().getOrganization().equals(org)){workQueue.getWorkRequestList().add(req);}
            else if(req.getManufacture().getEmployee().getOrganization().equals(org)){workQueue.getWorkRequestList().add(req);}
            else if(req.getStorage().getEmployee().getOrganization().equals(org)){workQueue.getWorkRequestList().add(req);}
            else if(req.getSell().getEmployee().getOrganization().equals(org)){workQueue.getWorkRequestList().add(req);}
            }    
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

}
