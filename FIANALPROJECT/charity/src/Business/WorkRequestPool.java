/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Resourse.Resource;
import Business.Resourse.ResourceDirectory;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author MS
 */
public class WorkRequestPool {

    private ArrayList<WorkRequest> workRequestList;
    private WorkRequest request;
    private Network network;
    private Resource res;
    private ResourceDirectory resourceDirectory;

    public WorkRequestPool() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public void setWorkRequestList(ArrayList<WorkRequest> workRequestList) {
        this.workRequestList = workRequestList;
    }

    public WorkRequest createReqeust(int amount) {
        request = new WorkRequest(amount);
        workRequestList.add(request);
        return request;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public ResourceDirectory getResourceDirectory() {
        return resourceDirectory;
    }

    public void setResourceDirectory(ResourceDirectory resourceDirectory) {
        this.resourceDirectory = resourceDirectory;
    }
    
}
