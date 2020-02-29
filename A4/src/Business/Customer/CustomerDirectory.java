/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;
import Business.Customer.Customer;
import java.util.ArrayList;
/**
 *
 * @author dell
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerDir;
    
    public CustomerDirectory() {
        this.customerDir = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomerDir() {
        return customerDir;
    }

    public void setCustomerDir(ArrayList<Customer> customerDir) {
        this.customerDir = customerDir;
    }   
    
    public void addcustomer(Customer customer) {
        customerDir.add(customer);
    }
    
    private int size() {
        return customerDir.size();
    }
    
    public void deleteCustomer(Customer c) {
        int i = customerDir.indexOf(c);
        customerDir.remove(i);
    }
    
    public CustomerDirectory filterPassport(String id) {
        CustomerDirectory result = new CustomerDirectory();
        for (Customer c : this.customerDir) {
            if (c.getUniqID().equals(id)) {
                result.addcustomer(c);
            }
        }
        if (result.size() == 0) {
            result = null;
        }
        return result;
    }
}
