/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author MS
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;
    private Organization organization;
    private Enterprise enterprise;
    private SchoolOrg schorg;
    private Manufacture manuorg;
    private Sell sellorg;
    private CharityOrg chaorg;
    private StorageOrg storg;

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();

    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }

    public Organization createOrganization(Type type) {
        organization = null;
        if (type.getValue().equals(Type.Manufacture.getValue())) {
            manuorg = new Manufacture();
            organization = manuorg;
            organization.setType(type);
            organizationList.add(organization);
            //manuorgList.add(manuorg);
        } else if (type.getValue().equals(Type.Storage.getValue())) {

            storg = new StorageOrg();
            organization = storg;
            organization.setType(type);
            organizationList.add(organization);
            //storgList.add(storg);
        } else if (type.getValue().equals(Type.Charity.getValue())) {

            chaorg = new CharityOrg();
            organization = chaorg;
            organization.setType(type);
            organizationList.add(organization);
            //chaorgList.add(chaorg);
        } else if (type.getValue().equals(Type.School.getValue())) {

            schorg = new SchoolOrg();
            organization = schorg;
            organization.setType(type);
            organizationList.add(organization);
            //schorgList.add(schorg);
        } else if (type.getValue().equals(Type.Sell.getValue())) {

            sellorg = new Sell();
            organization = sellorg;
            organization.setType(type);
            organizationList.add(organization);
            //sellorgList.add(sellorg);
        }
        return organization;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public SchoolOrg getSchorg() {
        return schorg;
    }

    public void setSchorg(SchoolOrg schorg) {
        this.schorg = schorg;
    }

    public Manufacture getManuorg() {
        return manuorg;
    }

    public void setManuorg(Manufacture manuorg) {
        this.manuorg = manuorg;
    }

    public Sell getSellorg() {
        return sellorg;
    }

    public void setSellorg(Sell sellorg) {
        this.sellorg = sellorg;
    }

    public CharityOrg getChaorg() {
        return chaorg;
    }

    public void setChaorg(CharityOrg chaorg) {
        this.chaorg = chaorg;
    }

    public StorageOrg getStorg() {
        return storg;
    }

    public void setStorg(StorageOrg storg) {
        this.storg = storg;
    }

}
