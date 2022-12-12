/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work.Role;

import work.EcoSystem;
import work.Enterprise.Enterprise;
import work.Network.Network;
import work.Organization.Organization;
import javax.swing.JPanel;
import work.UserAcc.UserAcc;
/**
 *
 * @author jatin
 */
public abstract class Role {


    public enum RoleType{
        Admin("Admin"),
        Medicare("Medicare"),
        Client("Client"),
        Nutritionist("Nutritionist"),
        Counsellor("Counsellor"),
        FitnessInstructor("Fitness Instructor"),
        YogaInstructor("Yoga Instructor"),
        Salon("Salon"),
        Spa("Spa"),
        MeditationInstructor("Meditation Instructor");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAcc account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business, Network network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }    

 
}

