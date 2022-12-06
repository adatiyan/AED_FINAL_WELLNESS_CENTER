/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work.Role;

import work.EcoSystem;
import work.Enterprise.Enterprise;
import work.Network.Network;
import work.Organization.Organization;
import userInterface.RoleAdministrator.AdminWorkAreaPanel;  
import javax.swing.JPanel;
import work.UserAcc.UserAcc;
/**
 *
 * @author jatin
 */
public class AdminRole extends Role {
 

    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new AdminWorkAreaPanel(userProcessContainer, enterprise);
    }

//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, Object account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    
    
    
}

