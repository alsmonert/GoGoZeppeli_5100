/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Resourse;

import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author MS
 */
public class ResourceDirectory {

    private Resource res;
    private ArrayList<Resource> resourceList;

    public ResourceDirectory() {
        resourceList = new ArrayList<>();
    }


    public ArrayList<Resource> getResourceList() {
        return resourceList;
    }

    public void setResourceList(ArrayList<Resource> resourceList) {
        this.resourceList = resourceList;
    }
    
    public Resource CreateResource( WorkRequest request){
        res = new Resource(request);
        resourceList.add(res);
        return res;
    }
    
}
