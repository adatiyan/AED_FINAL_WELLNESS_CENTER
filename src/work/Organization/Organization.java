/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work.Organization;

import work.Staff.StaffDirectory;
import work.Role.Role;
import work.FlowQueue.FlowQueue;
import java.util.ArrayList;
import work.UserAcc.UserAccDirectory;

/**
 *
 * @author jatin
 */
public abstract class Organization {
    private String name;
    private FlowQueue flowQueue;
    private StaffDirectory staffDirectory;
    private UserAccDirectory userAccDirectory;
    private int organizationID;
    private static int counter=0;
    
    
    public enum Type{
        Admin("Admin Organization"), Salon("Salon Organization"), Spa("Spa/Massage Organization")
        ,Meditation("Meditation Organization"), Counsellor("Counsellor Organization"), Medicare("Medicare Organization"),
        Nutritionist("Nutritionist Organization"), Fitness("Fitness Organization"), Yoga("Yoga Organization"),
        Client("Customer");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    public Organization(String name) {
        this.name = name;
        flowQueue = new FlowQueue();
        staffDirectory = new StaffDirectory();
        userAccDirectory = new UserAccDirectory();
        organizationID = counter;
        ++counter;
    }
    
    public abstract ArrayList<Role> getSupportedRole();

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StaffDirectory getStaffDirectory() {
        return staffDirectory;
    }

    public void setStaffDirectory(StaffDirectory staffDirectory) {
        this.staffDirectory = staffDirectory;
    }

    public FlowQueue getWorkQueue() {
        return flowQueue;
    }

    public void setWorkQueue(FlowQueue workQueue) {
        this.flowQueue = workQueue;
    }

    public UserAccDirectory getUserAccDirectory() {
        return userAccDirectory;
    }

    public void setUserAccDirectory(UserAccDirectory userAccDirectory) {
        this.userAccDirectory = userAccDirectory;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
