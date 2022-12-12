/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work.Organization;
import work.Role.AdminRole;
import work.Role.Role;
import work.Role.SalonRole;
import java.util.ArrayList;
/**
 *
 * @author anky
 */

public class SalonOrganization extends Organization {
    public SalonOrganization() {
        super(Organization.Type.Salon.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SalonRole());
        return roles;
    }
}