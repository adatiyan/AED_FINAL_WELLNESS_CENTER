/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.RoleSalon;

import work.EcoSystem;
import work.Enterprise.Enterprise;
import work.Enterprise.SelfCareEnterprise;
import work.Network.Network;
import work.Organization.Organization;
import work.Organization.SalonOrganization;
import work.UserAcc.UserAcc;
import work.FlowQueue.SalonFlowReq;
import userInterface.Client.ClientLoginWorkAreaPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author keerthanapanyam
 */
public class RequestSalonPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestSalonPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAcc userAcc;
    private EcoSystem system;
    private Network sourceNetwork;
    private Network targetNetwork;
    
    
    
    
    
    
    public RequestSalonPanel(JPanel userProcessContainer, UserAcc account, Enterprise enterprise, EcoSystem system, Network sourceNetwork, Network targetNetwork) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAcc = account;
        this.system = system;
        this.sourceNetwork = sourceNetwork;
        this.targetNetwork = targetNetwork;
        if(null != enterprise) {
            Valuelbl.setText(enterprise.getName());
    }
    }

    public RequestSalonPanel(JFrame userProcessContainer, UserAcc userAcc, Enterprise enterprise, EcoSystem system, Network sourceNetwork, Network network) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Messagelbl = new javax.swing.JLabel();
        Messagetxt = new javax.swing.JTextField();
        RequestSalonbtn = new javax.swing.JButton();
        Valuelbl = new javax.swing.JLabel();
        Backbtn = new javax.swing.JButton();
        Enterpriselbl = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Messagelbl.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        Messagelbl.setText("Add message text:");
        add(Messagelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 286, -1, -1));

        Messagetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MessagetxtActionPerformed(evt);
            }
        });
        add(Messagetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 286, 191, 45));

        RequestSalonbtn.setBackground(new java.awt.Color(178, 189, 155));
        RequestSalonbtn.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        RequestSalonbtn.setText("Book Appointment");
        RequestSalonbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestSalonbtnActionPerformed(evt);
            }
        });
        add(RequestSalonbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 411, 159, 38));

        Valuelbl.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        Valuelbl.setText("-");
        add(Valuelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 228, -1, -1));

        Backbtn.setBackground(new java.awt.Color(178, 189, 155));
        Backbtn.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        Backbtn.setText("Back");
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });
        add(Backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 35, -1, -1));

        Enterpriselbl.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        Enterpriselbl.setText("Enterprise:");
        add(Enterpriselbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 228, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void MessagetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MessagetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MessagetxtActionPerformed

    private void RequestSalonbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestSalonbtnActionPerformed
        // TODO add your handling code here:
        String message = Messagetxt.getText();
        if (!message.isEmpty()) {
            SalonFlowReq request = new SalonFlowReq();
            request.setMessage(message);
            request.setSender(userAcc);
            request.setStatus("Sent");

            Organization org = null;
            Enterprise ent = null;
            if (sourceNetwork != targetNetwork) {
                for (Enterprise enterprise : targetNetwork.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise instanceof SelfCareEnterprise) {
                        ent = enterprise;
                    }
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof SalonOrganization) {
                            org = organization;
                            break;
                        }
                    }
                }
            } else {
                for (Enterprise enterprise : sourceNetwork.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise instanceof SelfCareEnterprise) {
                        ent = enterprise;
                    }
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof SalonOrganization) {
                            org = organization;
                            break;
                        }
                    }
                }
            }
            if (org != null) {
                org.getWorkQueue().getflowReqList().add(request);
                userAcc.getFlowQueue().getflowReqList().add(request);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter correct input");
        }
        Messagetxt.setText("");
        
    }//GEN-LAST:event_RequestSalonbtnActionPerformed

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ClientLoginWorkAreaPanel clwjp = (ClientLoginWorkAreaPanel) component;
        clwjp.populateRequestTable(sourceNetwork);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbtn;
    private javax.swing.JLabel Enterpriselbl;
    private javax.swing.JLabel Messagelbl;
    private javax.swing.JTextField Messagetxt;
    private javax.swing.JButton RequestSalonbtn;
    private javax.swing.JLabel Valuelbl;
    // End of variables declaration//GEN-END:variables
}
