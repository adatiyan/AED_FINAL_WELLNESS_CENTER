/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work.Staff;

import java.util.ArrayList;
import work.Role.Role;

/**
 *
 * @author jatin
 */
public class StaffDirectory {
    
     private ArrayList<Staff> staffList;

    public StaffDirectory() {
        staffList = new ArrayList();
    }

    public ArrayList<Staff> getStaffList() {
        return staffList;
    }
    
    public Staff createStaff(String name, Role role){
        Staff employee = new Staff();
        employee.setName(name);
        employee.setRole(role);
        staffList.add(employee);
        return employee;
    }
}
