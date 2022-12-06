/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work.Role;

import work.EcoSystem;
import work.Enterprise.Enterprise;
import work.Network.Network;
import work.Organization.FitnessOrganization;
import work.Organization.Organization;
import work.UserAcc.UserAcc;
import javax.swing.JPanel;
import userInterface.RoleFitnessInstructor.WorkAreaFitnessInstructorPanel;

/**
 *
 * @author jatin
 */
public class FitnessInstructor extends Role {
    
    @Override
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {  
    return new WorkAreaFitnessInstructorPanel(userProcessContainer, account, (FitnessOrganization)organization, enterprise, business, network);
    }    
    
}
