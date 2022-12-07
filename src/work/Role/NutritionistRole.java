/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work.Role;

import work.EcoSystem;
import work.Enterprise.Enterprise;
import work.Network.Network;
import work.Organization.NutritionistOrganization;
import work.Organization.Organization;
import work.UserAcc.UserAcc;
import userInterface.RoleNutritionist.WorkAreaNutritionistPanel;
import javax.swing.JPanel;

/**
 *
 * @author jatin
 */
public class NutritionistRole extends Role  {


    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {  
    return new WorkAreaNutritionistPanel(userProcessContainer, account, (NutritionistOrganization)organization, enterprise, business, network);
    }
    
}
