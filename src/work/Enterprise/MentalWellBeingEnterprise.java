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
public class MentalWellBeingEnterprise  extends Enterprise{
     public MentalWellBeingEnterprise(String name){
        super(name,Enterprise.EnterpriseType.MentalWellbeingEnt);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
