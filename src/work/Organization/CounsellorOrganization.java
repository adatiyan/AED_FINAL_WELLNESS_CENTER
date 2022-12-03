/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work.Organization;

import work.Role.AdminRole;
import work.Role.Role;
import work.Role.Counsellor;

import java.util.ArrayList;

/**
 *
 * @author jatin
 */
public class CounsellorOrganization extends Organization {
    public CounsellorOrganization() {
        super(Organization.Type.Counsellor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Counsellor());
        return roles;
    }
    
}
