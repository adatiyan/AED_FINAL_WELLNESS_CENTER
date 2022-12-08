/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.SysAdminWorkArea;


import work.EcoSystem;
import work.Staff.Staff;
import work.Enterprise.Enterprise;
import work.Network.Network;
import work.Role.AdminRole;
import work.UserAcc.UserAcc;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author keerthanapanyam
 */
public class ManageEnterpriseAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseAdminPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    
    
    public ManageEnterpriseAdminPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        
        populateTable();
        populateNetworkComboBox();
       
    }
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) Enterprisetbl.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAcc userAcc : enterprise.getUserAccDirectory().getUserAccList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getName();
                    row[2] = userAcc.getUsername();

                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox() {
        Networkcb.removeAllItems();
    

        for (Network network : system.getNetworkList()) {
            Networkcb.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Network network){
        Enterprisecb.removeAllItems();

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            Enterprisecb.addItem(enterprise);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Enterprisetbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Usernametxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Passwordpass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        Nametxt = new javax.swing.JTextField();
        Submitbtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Networkcb = new javax.swing.JComboBox();
        Enterprisecb = new javax.swing.JComboBox();

        setLayout(null);

        Enterprisetbl.setBackground(new java.awt.Color(220, 227, 204));
        Enterprisetbl.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        Enterprisetbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Type"
            }
        ));
        jScrollPane1.setViewportView(Enterprisetbl);

        add(jScrollPane1);
        jScrollPane1.setBounds(500, 122, 485, 99);

        jLabel1.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel1.setText("Network:");
        add(jLabel1);
        jLabel1.setBounds(105, 141, 52, 18);

        jLabel2.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel2.setText("Enterprise:");
        add(jLabel2);
        jLabel2.setBounds(47, 167, 62, 18);

        jLabel3.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel3.setText("Username:");
        add(jLabel3);
        jLabel3.setBounds(47, 205, 62, 18);

        Usernametxt.setBackground(new java.awt.Color(220, 227, 204));
        Usernametxt.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        add(Usernametxt);
        Usernametxt.setBounds(115, 202, 140, 24);

        jLabel4.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel4.setText("Password:");
        add(jLabel4);
        jLabel4.setBounds(47, 235, 59, 18);

        Passwordpass.setBackground(new java.awt.Color(220, 227, 204));
        Passwordpass.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        add(Passwordpass);
        Passwordpass.setBounds(112, 232, 143, 24);

        jLabel5.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel5.setText("Name:");
        add(jLabel5);
        jLabel5.setBounds(47, 265, 39, 18);

        Nametxt.setBackground(new java.awt.Color(220, 227, 204));
        Nametxt.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        Nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NametxtActionPerformed(evt);
            }
        });
        add(Nametxt);
        Nametxt.setBounds(112, 262, 143, 24);

        Submitbtn.setBackground(new java.awt.Color(178, 189, 155));
        Submitbtn.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        Submitbtn.setText("Submit");
        Submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitbtnActionPerformed(evt);
            }
        });
        add(Submitbtn);
        Submitbtn.setBounds(320, 423, 72, 24);

        jButton2.setBackground(new java.awt.Color(178, 189, 155));
        jButton2.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(27, 20, 72, 24);

        Networkcb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(Networkcb);
        Networkcb.setBounds(183, 138, 72, 23);

        Enterprisecb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(Enterprisecb);
        Enterprisecb.setBounds(121, 167, 134, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitbtnActionPerformed
        // TODO add your handling code here:
        
        Enterprise enterprise = (Enterprise) Enterprisecb.getSelectedItem();

        String username = Usernametxt.getText();
        String password = String.valueOf(Passwordpass.getPassword());
        String name = Nametxt.getText();
        if (!username.isEmpty() && !password.isEmpty() && !name.isEmpty()) {
            if (enterprise.getUserAccDirectory().checkIfUsernameIsUnique(username)) {
                Staff staff = enterprise.getStaffDirectory().createStaff(name,null);
                UserAcc account = enterprise.getUserAccDirectory().createUserAcc(username, password, staff, new AdminRole());
                populateTable();
            } else {
                JOptionPane.showMessageDialog(this, "Username already exists");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter correct input");
        }
        Usernametxt.setText("");
        Passwordpass.setText("");
        Nametxt.setText("");
    }//GEN-LAST:event_SubmitbtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SysAdminWorkAreaPanel sysAdminwjp = (SysAdminWorkAreaPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        //layout.previous(container);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void NametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NametxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Enterprisecb;
    private javax.swing.JTable Enterprisetbl;
    private javax.swing.JTextField Nametxt;
    private javax.swing.JComboBox Networkcb;
    private javax.swing.JPasswordField Passwordpass;
    private javax.swing.JButton Submitbtn;
    private javax.swing.JTextField Usernametxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
