/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work;

import work.Role.SystemAdminRole;
import work.Staff.Staff;
import work.UserAcc.UserAcc;
import work.Organization.Organization;
import work.UserAcc.UserAccDirectory;



/**
 *
 * @author jatin
 */
public class ConfigureSystem {
    
    public static EcoSystem configure(){


        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Staff staff = system.getStaffDirectory().createStaff("RRH", null);
        
        
        UserAcc ua = system.getUserAccDirectory().createUserAcc("sysadmin", "sysadmin", staff, new SystemAdminRole());
        
        return system;



    }    
}
