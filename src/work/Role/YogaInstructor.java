/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work.Role;
import work.EcoSystem;
import work.Enterprise.Enterprise;
import work.Network.Network;
import work.Organization.MedicareOrganization;
import work.Organization.Organization;
import work.Organization.YogaOrganization;
import userInterface.RoleYogaInstructor.WorkAreaYogaInstructorPanel;
//import UserInterface.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;
import work.UserAcc.UserAcc;

/**
 *
 * @author jatin
 */
public class YogaInstructor extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {  
    return new WorkAreaYogaInstructorPanel(userProcessContainer, account, (YogaOrganization)organization, enterprise, business, network);    
    }
}
