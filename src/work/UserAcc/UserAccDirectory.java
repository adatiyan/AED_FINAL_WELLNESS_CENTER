/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package work.UserAcc;

import work.Staff.Staff;
import work.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author naiyaadatiya
 */
public class UserAccDirectory {
    private ArrayList<UserAcc> userAccList;

    public UserAccDirectory() {
        userAccList = new ArrayList();
    }

    public ArrayList<UserAcc> getUserAccList() {
        return userAccList;
    }
    
    public UserAcc authenticateUser(String username, String password){
        for (UserAcc ua : userAccList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAcc createUserAcc(String username, String password, Staff staff, Role role){
        UserAcc userAcc = new UserAcc();
        userAcc.setUsername(username);
        userAcc.setPassword(password);
        userAcc.setStaff(staff);
        userAcc.setRole(role);
        userAccList.add(userAcc);
        return userAcc;
    }
    
    public void deleteUserAcc(UserAcc u){
        
        userAccList.remove(u);
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAcc ua : userAccList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }    
}



   
     
