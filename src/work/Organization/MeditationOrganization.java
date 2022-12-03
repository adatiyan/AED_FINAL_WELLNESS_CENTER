/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work.Organization;

import work.Role.AdminRole;
import work.Role.MeditationInstructor;
import work.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anky
 */
public class MeditationOrganization extends Organization{
     public MeditationOrganization() {
        super(Organization.Type.Meditation.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MeditationInstructor());
        return roles;
    }
    
    
}
