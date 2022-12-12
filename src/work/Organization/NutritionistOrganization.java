/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work.Organization;

import java.util.ArrayList;
import work.Role.NutritionistRole;
import work.Role.Role;

/**
 *
 * @author jatin
 */
public class NutritionistOrganization extends Organization {
    public NutritionistOrganization() {
        super(Organization.Type.Nutritionist.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NutritionistRole());
        return roles;
    }
    
}
