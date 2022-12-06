/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work.Role;

import work.EcoSystem;
import work.Enterprise.Enterprise;
import work.Network.Network;
import work.Organization.Organization;
import userInterface.SysAdminWorkArea.SysAdminWorkAreaPanel;
import javax.swing.JPanel;
import work.UserAcc.UserAcc;

/**
 *
 * @author Simran
 */
public class SystemAdminRole extends Role{

    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account, Organization organization, Enterprise enterprise, EcoSystem system, Network network) {
        return new SysAdminWorkAreaPanel(userProcessContainer, system);
    }
        
 
    
}
