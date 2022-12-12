/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work.Organization;

import work.Role.AdminRole;
import work.Role.ClientRole;
import work.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jatin
 */
public class ClientOrganization extends Organization{
    public ClientOrganization() {
        super(Organization.Type.Client.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ClientRole());
        return roles;
    }
    
}
