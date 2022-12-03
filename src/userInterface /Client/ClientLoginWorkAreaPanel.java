/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.Client;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userInterface.RoleCounsellor.RequestCounsellorPanel;
import userInterface.RoleFitnessInstructor.RequestFitnessInstructorPanel;
import userInterface.RoleMedicare.RequestMedicarePanel;
import userInterface.RoleMeditationInstructor.RequestMeditationInstructorPanel;
import userInterface.RoleNutritionist.RequestNutritionistPanel;
import userInterface.RoleSalon.RequestSalonPanel;
import userInterface.RoleSpa.RequestSpaPanel;
import userInterface.RoleYogaInstructor.RequestYogaInstructorPanel;
import work.EcoSystem;
import work.Enterprise.Enterprise;
import work.Network.Network;
import work.UserAcc.UserAcc;
import work.FlowQueue.DoctorFlowReq;
import work.FlowQueue.MeditationInstructorFlowReq;
import work.FlowQueue.SalonFlowReq;
import work.FlowQueue.SpaFlowReq;
import work.FlowQueue.FitnessInstructorFlowReq;
import work.FlowQueue.NutritionistFlowReq;
import work.FlowQueue.YogaInstructorFlowReq;
import work.FlowQueue.CounsellorFlowReq;
import work.FlowQueue.FlowReq;




/**
 *
 * @author jatin
 */
public class ClientLoginWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form ClientLoginWorkAreaPanel
     * 
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private Enterprise enterprise;
    private Network sourceNetwork;
    private Network targetNetwork;
    private UserAcc userAcc;
    
    public ClientLoginWorkAreaPanel(JPanel userProcessContainer, EcoSystem system, UserAcc userAcc, Network sourceNetwork) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAcc = userAcc;
        this.sourceNetwork = sourceNetwork;
        populateNetworkComboBox();
        populateRequestTable(sourceNetwork);    }


   private void populateNetworkComboBox() {
        NetworkComboBox.removeAllItems();
        for (Network network : system.getNetworkList()) {
            NetworkComboBox.addItem(network.getName());
        }
    }
     public void populateRequestTable(Network sourceNetwork1){
        DefaultTableModel model = (DefaultTableModel) FlowReqTbl.getModel();
        
        model.setRowCount(0);
        for (FlowReq request : userAcc.getFlowQueue().getflowReqList()){
            if(request instanceof DoctorFlowReq){
                Object[] row = new Object[3];
                row[0] = request.getMessage();
                row[1] = request.getReceiver();
                row[2] = request.getStatus();
                model.addRow(row);
            } else {
            }
            if(request instanceof SalonFlowReq){
            Object[] row = new Object[3];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            model.addRow(row);
            }
            if(request instanceof SpaFlowReq){
            Object[] row = new Object[3];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            model.addRow(row);
            }
            if(request instanceof MeditationInstructorFlowReq){
            Object[] row = new Object[3];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            model.addRow(row);
            }
            if(request instanceof FitnessInstructorFlowReq){
            Object[] row = new Object[3];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            model.addRow(row);
            }
            if(request instanceof YogaInstructorFlowReq){
            Object[] row = new Object[3];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            model.addRow(row);
            }
            if(request instanceof NutritionistFlowReq){
            Object[] row = new Object[3];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            model.addRow(row);
            }
            if(request instanceof CounsellorFlowReq){
            Object[] row = new Object[3];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FlowReqTbl = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        NetworkComboBox = new javax.swing.JComboBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(178, 189, 155));
        jLabel1.setFont(new java.awt.Font("Avenir", 1, 18)); // NOI18N
        jLabel1.setText("Welcome to Wellness Center");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 379, 35));

        jLabel2.setBackground(new java.awt.Color(178, 189, 155));
        jLabel2.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel2.setText("Select Network");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 99, 20));

        jScrollPane1.setBackground(new java.awt.Color(178, 189, 155));

        FlowReqTbl.setBackground(new java.awt.Color(159, 159, 201));
        FlowReqTbl.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        FlowReqTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(FlowReqTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 530, 110));

        jPanel1.setBackground(new java.awt.Color(159, 159, 201));

        jLabel3.setBackground(new java.awt.Color(178, 189, 155));
        jLabel3.setFont(new java.awt.Font("Avenir", 1, 18)); // NOI18N
        jLabel3.setText("Self Care Services");

        jButton1.setBackground(new java.awt.Color(175, 171, 179));
        jButton1.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jButton1.setText("Book SPA Service");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(175, 171, 179));
        jButton2.setText("Book Salon Service");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 299, -1));

        jPanel2.setBackground(new java.awt.Color(159, 159, 201));

        jLabel4.setBackground(new java.awt.Color(178, 189, 155));
        jLabel4.setFont(new java.awt.Font("Avenir", 1, 18)); // NOI18N
        jLabel4.setText("Mental Wellbeing");

        jButton3.setBackground(new java.awt.Color(175, 171, 179));
        jButton3.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jButton3.setText("Book Meditation Service");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(175, 171, 179));
        jButton4.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jButton4.setText("Book Counsellor Service");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton3))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(24, 24, 24)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 340, 150));

        jPanel3.setBackground(new java.awt.Color(159, 159, 201));

        jLabel5.setBackground(new java.awt.Color(178, 189, 155));
        jLabel5.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        jLabel5.setText("Medical Wellness");

        jButton5.setBackground(new java.awt.Color(175, 171, 179));
        jButton5.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jButton5.setText("Book Doctor Service");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(175, 171, 179));
        jButton6.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jButton6.setText("Book Nutritionist Service ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(84, 84, 84))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, -1, -1));

        jPanel4.setBackground(new java.awt.Color(159, 159, 201));

        jLabel6.setBackground(new java.awt.Color(178, 189, 155));
        jLabel6.setFont(new java.awt.Font("Avenir", 1, 18)); // NOI18N
        jLabel6.setText("Physical Wellbeing");

        jButton7.setBackground(new java.awt.Color(175, 171, 179));
        jButton7.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jButton7.setText("Book Fitness Service");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(175, 171, 179));
        jButton8.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jButton8.setText("Book Yoga Service");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel6)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 340, 140));

        NetworkComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        NetworkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetworkComboBoxActionPerformed(evt);
            }
        });
        add(NetworkComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        Component add = userProcessContainer.add("RequestSpaPanel", new RequestSpaPanel(userProcessContainer, userAcc, enterprise, system, sourceNetwork, (Network)NetworkComboBox.getSelectedItem()));
//        layout.next(userProcessContainer);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
//        userProcessContainer.add("workArea", new RequestSpaPanel(userProcessContainer, null, system, null));
//        layout.next(userProcessContainer);
//        
// 
userProcessContainer.add("RequestSpaPanel", new RequestSpaPanel(userProcessContainer, userAcc, enterprise, system, sourceNetwork, (Network)NetworkComboBox.getSelectedItem()));
 layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestSalonPanel", new RequestSalonPanel(userProcessContainer, userAcc, enterprise, system, sourceNetwork, (Network)NetworkComboBox.getSelectedItem()));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestMeditationInstructorPanel", new RequestMeditationInstructorPanel(userProcessContainer, userAcc, enterprise, system, sourceNetwork, (Network)NetworkComboBox.getSelectedItem()));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestCounsellorPanel", new RequestCounsellorPanel(userProcessContainer, userAcc, enterprise, system, sourceNetwork, (Network)NetworkComboBox.getSelectedItem()));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestMedicarePanel", new RequestMedicarePanel(userProcessContainer, userAcc, enterprise, system, sourceNetwork, (Network)NetworkComboBox.getSelectedItem()));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestNutritionistPanel", new RequestNutritionistPanel(userProcessContainer, userAcc, enterprise, system, sourceNetwork, (Network)NetworkComboBox.getSelectedItem()));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestFitnessInstructorPanel", new RequestFitnessInstructorPanel(userProcessContainer, userAcc, enterprise, system, sourceNetwork, (Network)NetworkComboBox.getSelectedItem()));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestYogaInstructorPanel", new RequestYogaInstructorPanel(userProcessContainer, userAcc, enterprise, system, sourceNetwork, (Network)NetworkComboBox.getSelectedItem()));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void NetworkComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NetworkComboBoxActionPerformed
        // TODO add your handling code here:
        if (sourceNetwork != null) {
            populateRequestTable(sourceNetwork);
        }
    }//GEN-LAST:event_NetworkComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable FlowReqTbl;
    private javax.swing.JComboBox NetworkComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
