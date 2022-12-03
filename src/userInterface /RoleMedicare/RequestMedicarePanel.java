/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.RoleMedicare;


import work.EcoSystem;
import work.Enterprise.Enterprise;
import work.Enterprise.MedicalWellnessEnterprise;
import work.Network.Network;
import work.Organization.MedicareOrganization;
import work.Organization.Organization;
import work.UserAcc.UserAcc;
import work.FlowQueue.DoctorFlowReq;
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
public class RequestMedicarePanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAcc userAcc;
    private EcoSystem system;
    private Network sourceNetwork;
    private Network targetNetwork;
    
    
    public RequestMedicarePanel(JPanel userProcessContainer, UserAcc account, Enterprise enterprise, EcoSystem system, Network sourceNetwork, Network targetNetwork) {
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

    public RequestMedicarePanel(JFrame userProcessContainer, UserAcc userAcc, Enterprise enterprise, EcoSystem system, Network sourceNetwork, Network network) {
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
        Enterpriselbl = new javax.swing.JLabel();
        Backbtn = new javax.swing.JButton();
        Valuelbl = new javax.swing.JLabel();
        RequestMedicarebtn = new javax.swing.JButton();
        Messagetxt = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Messagelbl.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        Messagelbl.setText("Add message text:");
        add(Messagelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 221, -1, -1));

        Enterpriselbl.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        Enterpriselbl.setText("Enterprise:");
        add(Enterpriselbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 163, -1, -1));

        Backbtn.setBackground(new java.awt.Color(178, 189, 155));
        Backbtn.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        Backbtn.setText("Back");
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });
        add(Backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 35, -1, -1));

        Valuelbl.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        Valuelbl.setText("-");
        add(Valuelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 163, -1, -1));

        RequestMedicarebtn.setBackground(new java.awt.Color(178, 189, 155));
        RequestMedicarebtn.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        RequestMedicarebtn.setText("Book Appointment");
        RequestMedicarebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestMedicarebtnActionPerformed(evt);
            }
        });
        add(RequestMedicarebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 346, 159, 38));

        Messagetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MessagetxtActionPerformed(evt);
            }
        });
        add(Messagetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 221, 191, 45));
    }// </editor-fold>//GEN-END:initComponents

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

    private void RequestMedicarebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestMedicarebtnActionPerformed
        // TODO add your handling code here:
        String message = Messagetxt.getText();
        if (!message.isEmpty()) {
            DoctorFlowReq request = new DoctorFlowReq();
            request.setMessage(message);
            request.setSender(userAcc);
            request.setStatus("Sent");

            Organization org = null;
            Enterprise ent = null;
            if (sourceNetwork != targetNetwork) {
                for (Enterprise enterprise : targetNetwork.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise instanceof MedicalWellnessEnterprise) {
                        ent = enterprise;
                    }
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof MedicareOrganization) {
                            org = organization;
                            break;
                        }
                    }
                }
            } else {
                for (Enterprise enterprise : sourceNetwork.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise instanceof MedicalWellnessEnterprise) {
                        ent = enterprise;
                    }
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof MedicareOrganization) {
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
        
    }//GEN-LAST:event_RequestMedicarebtnActionPerformed

    private void MessagetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MessagetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MessagetxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbtn;
    private javax.swing.JLabel Enterpriselbl;
    private javax.swing.JLabel Messagelbl;
    private javax.swing.JTextField Messagetxt;
    private javax.swing.JButton RequestMedicarebtn;
    private javax.swing.JLabel Valuelbl;
    // End of variables declaration//GEN-END:variables
}
