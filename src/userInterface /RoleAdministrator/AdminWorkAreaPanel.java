/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.RoleAdministrator;

import work.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;
/**
 *
 * @author naiyaadatiya
 */
public class AdminWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkAreaPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    public AdminWorkAreaPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        valuelabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        enterpriselabel = new javax.swing.JLabel();
        manageorganizationbutton = new javax.swing.JButton();
        manageuserbutton = new javax.swing.JButton();
        managestaffbutton = new javax.swing.JButton();
        valuelabel = new javax.swing.JLabel();

        jLabel1.setText("Administrative Role");

        enterpriselabel.setText("Enterprise");

        manageorganizationbutton.setText("Manage Organization");
        manageorganizationbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageorganizationbuttonActionPerformed(evt);
            }
        });

        manageuserbutton.setText("Manage User");
        manageuserbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageuserbuttonActionPerformed(evt);
            }
        });

        managestaffbutton.setText("Manage Staff");
        managestaffbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managestaffbuttonActionPerformed(evt);
            }
        });

        valuelabel.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(valuelabel)
                                .addComponent(enterpriselabel))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(manageuserbutton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(manageorganizationbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                .addComponent(managestaffbutton)
                .addGap(184, 184, 184))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addComponent(enterpriselabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valuelabel)
                        .addGap(32, 32, 32)
                        .addComponent(manageorganizationbutton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(managestaffbutton)))
                .addGap(51, 51, 51)
                .addComponent(manageuserbutton)
                .addContainerGap(216, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageuserbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageuserbuttonActionPerformed
        // TODO add your handling code here:
        ManageUserAccPanel muajp = new ManageUserAccPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageuserbuttonActionPerformed

    private void managestaffbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managestaffbuttonActionPerformed
        // TODO add your handling code here:
        ManageStaffPanel manageStaffPanel = new ManageStaffPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageStaffPanel", manageStaffPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managestaffbuttonActionPerformed

    private void manageorganizationbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageorganizationbuttonActionPerformed
        // TODO add your handling code here:
        ManageOrganizationPanel manageOrganizationPanel = new ManageOrganizationPanel(userProcessContainer, enterprise.getOrganizationDirectory(), enterprise);
        userProcessContainer.add("manageOrganizationPanel", manageOrganizationPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageorganizationbuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriselabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageorganizationbutton;
    private javax.swing.JButton managestaffbutton;
    private javax.swing.JButton manageuserbutton;
    private javax.swing.JLabel valuelabel;
    // End of variables declaration//GEN-END:variables
}