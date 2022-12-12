/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work.Role;

/**
 *
 * @author jatin
 */

import javax.swing.JPanel;
import work.EcoSystem;
import work.Enterprise.Enterprise;
import work.Network.Network;
import work.Organization.Organization;
import work.Organization.MedicareOrganization;
import userInterface.RoleMedicare.WorkAreaMedicarePanel;
import work.UserAcc.UserAcc;

public class MedicareRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {  
    return new WorkAreaMedicarePanel(userProcessContainer, account, (MedicareOrganization)organization, enterprise, business, network);
    }
    
}
