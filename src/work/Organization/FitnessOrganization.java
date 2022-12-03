/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work.Organization;

import java.util.ArrayList;
import work.Role.AdminRole;
import work.Role.FitnessInstructor;
import work.Role.Role;

/**
 *
 * @author jatin
 */
public class FitnessOrganization extends Organization {
    public FitnessOrganization() {
        super(Organization.Type.Fitness.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FitnessInstructor());
        return roles;
    }
    
}
