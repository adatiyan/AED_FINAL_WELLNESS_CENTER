/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work.UserAcc;

import work.Staff.Staff;
import work.Role.Role;
import work.FlowQueue.FlowQueue;
/**
 *
 * @author naiyaadatiya
 */
public class UserAcc {
    private String username;
    private String password;
    private Staff staff;
    private Role role;
    private FlowQueue flowQueue;

    public UserAcc() {
        flowQueue = new FlowQueue();
    } 
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Staff getStaff() {
        return staff;
    }

    public FlowQueue getFlowQueue() {
        return flowQueue;
    }

    
    @Override
    public String toString() {
        return username;
    }    
}
    

