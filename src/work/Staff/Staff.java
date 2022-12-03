/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work.Staff;

import work.Role.Role;

/**
 *
 * @author jatin
 */
public class Staff {
    
    private String name;
    private int id;
    private static int count = 1;
    private Role role;
    
    public Staff() {
        id = count;
        count++;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
     
    
    
    @Override
    public String toString() {
        return name;
    }
}
