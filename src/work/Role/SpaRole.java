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
import work.Organization.SpaOrganization;
import userInterface.RoleSpa.WorkAreaSpaPanel;
import javax.swing.JPanel;
import work.UserAcc.UserAcc;

/**
 *
 * @author jatin
 */
public class SpaRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {  
    return new WorkAreaSpaPanel(userProcessContainer, account, (SpaOrganization)organization, enterprise, business, network);
    }    
   
}
