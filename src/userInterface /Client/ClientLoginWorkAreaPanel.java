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
