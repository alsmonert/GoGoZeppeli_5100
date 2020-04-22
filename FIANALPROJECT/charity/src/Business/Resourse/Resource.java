/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Resourse;

import Business.Employee.Employee;
import Business.WorkQueue.WorkRequest;
import java.util.Date;

/**
 *
 * @author MS
 */
public class Resource {

    private String name;
    private int ID;
    private Date prodate;
    private Employee employee;
    private WorkRequest request;private int amount;
    private static int rescount = 1;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Resource(WorkRequest request) {

        
        this.request = request;
        ID = rescount;
        rescount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getProdate() {
        return prodate;
    }

    public void setProdate(Date prodate) {
        this.prodate = prodate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public WorkRequest getRequest() {
        return request;
    }

    public void setRequest(WorkRequest request) {
        this.request = request;
    }
    @Override
    public String toString() {
        return name;
    }

}
