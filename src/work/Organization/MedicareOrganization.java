/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work.Organization;

import work.Role.MedicareRole;
import work.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author jatin
 */
public class MedicareOrganization extends Organization {
    public MedicareOrganization() {
        super(Organization.Type.Medicare.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MedicareRole());
        return roles;
    }
    
}
