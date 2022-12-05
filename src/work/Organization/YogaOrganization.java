/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work.Organization;
import work.Role.AdminRole;
import work.Role.Role;
import work.Role.YogaInstructor;
import java.util.ArrayList;

/**
 *
 * @author anky
 */
public class YogaOrganization extends Organization {
    public YogaOrganization() {
        super(Organization.Type.Yoga.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new YogaInstructor());
        return roles;
    }
}

