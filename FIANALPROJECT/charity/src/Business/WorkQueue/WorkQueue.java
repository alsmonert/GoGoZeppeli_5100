/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Resourse.Resource;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author MS
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;
    private WorkRequest request;
    private Resource res;
     

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public void setWorkRequestList(ArrayList<WorkRequest> workRequestList) {
        this.workRequestList = workRequestList;
    }
    
    public WorkRequest createReqeust( int amount){
        request = new WorkRequest( amount);
        workRequestList.add(request);
        return request;
    }
}