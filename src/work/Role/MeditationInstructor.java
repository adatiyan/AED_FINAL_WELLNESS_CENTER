/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work.Role;

import work.EcoSystem;
import work.Enterprise.Enterprise;
import work.Network.Network;
import work.Organization.MeditationOrganization;
import work.Organization.Organization;
import work.UserAcc.UserAcc;
import userInterface.RoleMeditationInstructor.WorkAreaMeditationInstructorPanel;
import javax.swing.JPanel;

/**
 *
 * @author jatin
 */
public class MeditationInstructor extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {  
    return new WorkAreaMeditationInstructorPanel(userProcessContainer, account, (MeditationOrganization)organization, enterprise, business, network);
    }    

}
