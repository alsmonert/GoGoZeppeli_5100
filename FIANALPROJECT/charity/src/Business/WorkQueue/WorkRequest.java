/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Charity;
import Business.Enterprise.Manufactory;
import Business.Enterprise.Storage;
import Business.Resourse.Resource;
import Business.Resourse.ResourceDirectory;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author MS
 */
public class WorkRequest {

    private String message;
    private UserAccount school;
    private UserAccount manufacture;
    private UserAccount Sell;
    private String status;
    private Date requestDate;
    private Date resourceDate;
    private Date resolveDate;
    private String comment;
    private UserAccount storage;
    private UserAccount charity;
    private ArrayList<Resource> resources;
    private ResourceDirectory resourceDirectory;
    private int amount;
    private int reqID;
    private static int reqcount= 1;
    private Charity charityTodo;
    private Manufactory manufactoryTodo;
    private Storage storageTodo;

    @Override
    public String toString(){
        return Integer.toString(reqID);
    }
    public Charity getCharityTodo() {
        return charityTodo;
    }

    public Date getResourceDate() {
        return resourceDate;
    }

    public void setResourceDate(Date resourceDate) {
        this.resourceDate = resourceDate;
    }

    public void setCharityTodo(Charity charityTodo) {
        this.charityTodo = charityTodo;
    }

    public Manufactory getManufactoryTodo() {
        return manufactoryTodo;
    }

    public void setManufactoryTodo(Manufactory manufactoryTodo) {
        this.manufactoryTodo = manufactoryTodo;
    }

    

    public Storage getStorageTodo() {
        return storageTodo;
    }

    public void setStorageTodo(Storage storageTodo) {
        this.storageTodo = storageTodo;
    }

    public WorkRequest(int amount) {
        this.amount = amount;
        reqID = reqcount;
        reqcount++;
    }

    public UserAccount getSell() {
        return Sell;
    }

    public void setSell(UserAccount Sell) {
        this.Sell = Sell;
    }

    public int getReqID() {
        return reqID;
    }
    
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSchool() {
        return school;
    }

    public void setSchool(UserAccount school) {
        this.school = school;
    }

    public UserAccount getManufacture() {
        return manufacture;
    }

    public void setManufacture(UserAccount manufactory) {
        this.manufacture = manufactory;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public UserAccount getStorage() {
        return storage;
    }

    public void setStorage(UserAccount storage) {
        this.storage = storage;
    }

    public UserAccount getCharity() {
        return charity;
    }

    public void setCharity(UserAccount charity) {
        this.charity = charity;
    }

    

    

    public ResourceDirectory getResourceDirectory() {
        return resourceDirectory;
    }

    public void setResourceDirectory(ResourceDirectory resourceDirectory) {
        this.resourceDirectory = resourceDirectory;
    }

}
