/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work;

import java.util.ArrayList;
import work.Network.Network;
import work.Role.Role;
import work.Role.SystemAdminRole;
import work.Organization.Organization;
import work.Staff.Staff;


/**
 *
 * @author jatin
 */
public class EcoSystem extends Organization {
    
    private static EcoSystem work;
    private ArrayList<Network> networkList;
    
    public static EcoSystem getInstance(){
        if(work==null){
            work=new EcoSystem();
        }
        return work;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    public Network deleteNetwork(){
        Network network=new Network();
        networkList.remove(network);
        return network;
    }
    
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
    }
    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
   public boolean checkIfUserIsUnique(String userName){
       
        if(!this.getUserAccDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
    
    public boolean checkifNetworkIsUnique(String networkName) {
        for(Network network : networkList) {
            if(network.getName().equals(networkName)) {
                return false;
            }
        }
        return true;
    }

    
}
