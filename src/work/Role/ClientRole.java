/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work.Role;


import work.Client.Client;
import work.EcoSystem;
import work.Enterprise.Enterprise;
import work.Network.Network;
import work.Organization.ClientOrganization;
import work.Organization.Organization;
import userInterface.Client.WorkAreaClientPanel;
import javax.swing.JPanel;
import work.UserAcc.UserAcc;
import javax.swing.JPanel;

/**
 *
 * @author jatin
 */
public class ClientRole extends Role {

    private Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
         return new WorkAreaClientPanel(userProcessContainer, (ClientOrganization)organization, business, network);
    } 
}
