/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work.Role;

/**
 *
 * @author jatin
 */

import work.EcoSystem;
import work.Enterprise.Enterprise;
import work.Network.Network;
import work.Organization.Organization;
import work.Organization.Organization.Type;
import work.Organization.CounsellorOrganization;
import work.Role.Role.RoleType;
import work.UserAcc.UserAcc;
import userInterface.RoleCounsellor.WorkAreaCounsellorPanel;
import javax.swing.JPanel;



public class Counsellor extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {  
    return new WorkAreaCounsellorPanel(userProcessContainer, account, (CounsellorOrganization)organization, enterprise, business, network);
    }    
}
