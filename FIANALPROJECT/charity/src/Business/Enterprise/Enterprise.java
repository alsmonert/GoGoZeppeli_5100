/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author MS
 */
public abstract class Enterprise {

    private EnterpriseType enterpriseType;
    private String Name;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private OrganizationDirectory organizationDirectory;
    private Network network;
    private String address;
    private String phonenum;
    private WorkQueue queue;

    public WorkQueue getQueue() {
        return queue;
    }

    public void setQueue(WorkQueue queue) {
        this.queue = queue;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public enum EnterpriseType {
        Manufactory("Manufactory"),
        School("School"),
        Storage("Storage"),
        SystemAdmin("SystemAdmin"),
        Charity("Charity");

        private String value;

        private EnterpriseType(String value) {
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

    public Enterprise(String name) {
        this.Name = name;
        organizationDirectory = new OrganizationDirectory();
        userAccountDirectory = new UserAccountDirectory();
        employeeDirectory = new EmployeeDirectory();
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        for (Employee emp : network.getEmployeeDirectory().getEmployeeList()) {
            if (!employeeDirectory.getEmployeeList().contains(emp) && emp.getOrganization().getEnterprise().getName().equals(Name)) {
                employeeDirectory.getEmployeeList().add(emp);
            }
        }
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        for (UserAccount acc : network.getUserAccountDirectory().getUserAccountList()) {
            if (!userAccountDirectory.getUserAccountList().contains(acc) && acc.getEmployee().getOrganization().getEnterprise().getName().equals(Name)) {
                userAccountDirectory.getUserAccountList().add(acc);
            }
        }
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    @Override
    public String toString() {
        return Name;
    }
}
