/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Network;
import java.util.ArrayList;

/**
 *
 * @author MS
 */
public  class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;
    private Enterprise enterprise;
    private Charity charity;
    private Manufactory manufactory;
    private Storage storage;
    private School school;
    private Network network;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
      
    }

    public Enterprise createEnterprise(String name, Enterprise.EnterpriseType type) {
        enterprise=null;
        if(null != type)switch (type) {
            case Charity:
                charity = new Charity(name);
                enterprise = charity;
                enterpriseList.add(charity);
                break;
            case School:
                school = new School(name);
                enterprise = school;
                enterpriseList.add(school);
                break;
            case Storage:
                storage = new Storage(name);
                enterprise = storage;
                enterpriseList.add(storage);
                break;
            case Manufactory:
                manufactory = new Manufactory(name);
                enterprise = manufactory;
                enterpriseList.add(manufactory);
                break;
            default:
                break;
        }
        return enterprise;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    

    
    
}
