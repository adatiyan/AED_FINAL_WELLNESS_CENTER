/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work.Enterprise;

import java.util.ArrayList;
import work.Role.Role;

/**
 *
 * @author jatin
 */
public class SelfCareEnterprise extends Enterprise{
    public SelfCareEnterprise(String name){
        super(name,Enterprise.EnterpriseType.SelfCareEnt);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
