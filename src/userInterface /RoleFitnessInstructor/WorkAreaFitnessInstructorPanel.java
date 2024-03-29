/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.RoleFitnessInstructor;

import work.EcoSystem;
import work.Enterprise.Enterprise;
import work.Network.Network;
import work.Organization.FitnessOrganization;
import work.UserAcc.UserAcc;
import work.FlowQueue.FitnessInstructorFlowReq;
import work.FlowQueue.FlowReq;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author keerthanapanyam
 */
public class WorkAreaFitnessInstructorPanel extends javax.swing.JPanel {

    /**
     * Creates new form WorkAreaFitnessInstructorPanel
     */
    private JPanel userProcessContainer;
    private FitnessOrganization organization;
    private Enterprise enterprise;
    private UserAcc userAcc;
    private EcoSystem system;
    private Network sourceNetwork;
    private Network targetNetwork; 
    
    
    
    
    
    
    
    public WorkAreaFitnessInstructorPanel(JPanel userProcessContainer, UserAcc account, FitnessOrganization organization, Enterprise enterprise, EcoSystem system, Network sourceNetwork) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAcc = account;
        this.system = system;
        this.sourceNetwork = sourceNetwork;
        Valuelbl.setText(organization.getName());
        
        populateRequestTable();
    }
    
        public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) FlowReqtbl.getModel();
        
        model.setRowCount(0);
        for (FlowReq request : userAcc.getFlowQueue().getflowReqList()){
            if(request instanceof FitnessInstructorFlowReq){
            Object[] row = new Object[4];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((FitnessInstructorFlowReq) request).getGymInstructorAppointment();
            row[3] = result == null ? "Waiting" : result;
            model.addRow(row);
            }
        }
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Processbtn = new javax.swing.JButton();
        Assignbtn = new javax.swing.JButton();
        Organizationlbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        FlowReqtbl = new javax.swing.JTable();
        Valuelbl = new javax.swing.JLabel();
        Declinebtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Processbtn.setBackground(new java.awt.Color(178, 189, 155));
        Processbtn.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        Processbtn.setText("Process");
        Processbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessbtnActionPerformed(evt);
            }
        });
        add(Processbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 190, 141, 43));

        Assignbtn.setBackground(new java.awt.Color(178, 189, 155));
        Assignbtn.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        Assignbtn.setText("Assign");
        Assignbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignbtnActionPerformed(evt);
            }
        });
        add(Assignbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 132, 141, 40));

        Organizationlbl.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        Organizationlbl.setText("ORGANIZATION");
        add(Organizationlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 67, -1, -1));

        FlowReqtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Reciever", "Status"
            }
        ));
        FlowReqtbl.setToolTipText("");
        jScrollPane2.setViewportView(FlowReqtbl);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 132, 537, 158));
        add(Valuelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 67, 136, 17));

        Declinebtn.setBackground(new java.awt.Color(178, 189, 155));
        Declinebtn.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        Declinebtn.setText("Decline");
        Declinebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeclinebtnActionPerformed(evt);
            }
        });
        add(Declinebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 248, 141, 42));
    }// </editor-fold>//GEN-END:initComponents

    private void ProcessbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessbtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = FlowReqtbl.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select at least one row");
            return;
        }

        FlowReq request = (FlowReq)FlowReqtbl.getValueAt(selectedRow,0);
        request.setReceiver(userAcc);
        request.setStatus("Processed");
        populateRequestTable();
    }//GEN-LAST:event_ProcessbtnActionPerformed

    private void AssignbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignbtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = FlowReqtbl.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select at least one row");
            return;
        }

        FlowReq request = (FlowReq)FlowReqtbl.getValueAt(selectedRow, 0);
        request.setReceiver(userAcc);
        request.setStatus("Confirmed");

        populateRequestTable();
    }//GEN-LAST:event_AssignbtnActionPerformed

    private void DeclinebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeclinebtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = FlowReqtbl.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select at least one row");
            return;
        }

        FlowReq request = (FlowReq)FlowReqtbl.getValueAt(selectedRow, 0);
        request.setReceiver(userAcc);
        request.setStatus("Declined");

        populateRequestTable();
    }//GEN-LAST:event_DeclinebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Assignbtn;
    private javax.swing.JButton Declinebtn;
    private javax.swing.JTable FlowReqtbl;
    private javax.swing.JLabel Organizationlbl;
    private javax.swing.JButton Processbtn;
    private javax.swing.JLabel Valuelbl;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
