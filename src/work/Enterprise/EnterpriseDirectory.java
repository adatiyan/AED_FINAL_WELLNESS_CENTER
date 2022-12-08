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
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
        public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.SelfCareEnt){
            enterprise=new SelfCareEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if(type==Enterprise.EnterpriseType.MentalWellbeingEnt){
            enterprise=new MentalWellBeingEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if(type==Enterprise.EnterpriseType.MedicalWellnessEnt){
            enterprise=new MedicalWellnessEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if(type==Enterprise.EnterpriseType.PhysicalWellbeingEnt){
            enterprise=new PhysicalWellbeingEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
}
