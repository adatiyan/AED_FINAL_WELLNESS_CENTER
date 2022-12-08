/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author jatin
 */

import work.Organization.Organization;
import work.Organization.OrganizationDirectory;


public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    
    
    public enum EnterpriseType{
        SelfCareEnt("Self Care Enterprise"), MentalWellbeingEnt("Mental Welbeing Enterprise"),
        MedicalWellnessEnt("Medical Wellness Enterprise"), PhysicalWellbeingEnt("Physical Wellbeing Enterprise");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
}
