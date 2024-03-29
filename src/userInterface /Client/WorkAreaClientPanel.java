/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.Client;

import work.EcoSystem;
import work.Network.Network;
import work.Organization.ClientOrganization;
import work.UserAcc.UserAcc;
import work.Utilities.otp;
import work.Utilities.SendEmail;
import work.Utilities.ValidationUtilities;
import java.awt.CardLayout;
import static java.time.Clock.system;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import work.UserAcc.UserAcc;
import work.UserAcc.UserAccDirectory;

/**
 *
 * @author naiyaadatiya
 */
public class WorkAreaClientPanel extends javax.swing.JPanel {

    /**
     * Creates new form WorkAreaClientPanel
     */
    private JPanel userProcessContainer;
    private UserAcc userAcc;
    private EcoSystem system;
    private Network network;

    public WorkAreaClientPanel(JPanel userProcessContainer, ClientOrganization organization, EcoSystem system, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.network = network;
        jButton2.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usernametextfield = new javax.swing.JTextField();
        passwordtextfield = new javax.swing.JPasswordField();
        emailText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(178, 189, 155));
        jLabel2.setFont(new java.awt.Font("Avenir", 1, 18)); // NOI18N
        jLabel2.setText("WELCOME TO WELLNESS CENTER");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jLabel3.setBackground(new java.awt.Color(159, 159, 201));
        jLabel3.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel3.setText("Username");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 117, -1, -1));

        jLabel4.setBackground(new java.awt.Color(159, 159, 201));
        jLabel4.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel4.setText("Password");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 158, -1, -1));

        jLabel5.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel5.setText("Email");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 201, 55, -1));

        usernametextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametextfieldActionPerformed(evt);
            }
        });
        add(usernametextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 114, 99, -1));

        passwordtextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtextfieldActionPerformed(evt);
            }
        });
        add(passwordtextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 155, 99, -1));
        add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 196, 99, -1));

        jButton1.setBackground(new java.awt.Color(159, 159, 201));
        jButton1.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jButton1.setText("Generate OTP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 237, -1, -1));

        jButton2.setBackground(new java.awt.Color(159, 159, 201));
        jButton2.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 288, -1, -1));

        jButton3.setBackground(new java.awt.Color(159, 159, 201));
        jButton3.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jButton3.setText("Register");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 288, -1, -1));

        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -3, 800, 400));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (emailText.getText().isEmpty() || !ValidationUtilities.validateEmail(emailText.getText())) {

            JOptionPane.showMessageDialog(this, "Email not correct");
            return;
        }
        otp otp = new otp();
        String otpGenerated = otp.getOTP(4);
        SendEmail.sendMail(otpGenerated, emailText.getText());
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("OtpPanel", new otpPanel(userProcessContainer, otpGenerated));
        layout.next(userProcessContainer);
    }

    public void validateOtp(boolean f) {
        if (f) {
            jButton1.setEnabled(true);
        } else {
            jButton1.setEnabled(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        UserAcc userAccount = system.getUserAccDirectory().authenticateUser(usernametextfield.getText(), passwordtextfield.getText());
        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Login successful");
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("RequestLabTestJPanel", new ClientLoginWorkAreaPanel(userProcessContainer, system, userAccount, network));

            //  userProcessContainer.add("RequestLabTestJPanel", new WorkAreaClientPanel(userProcessContainer, system, userAcc, network));
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new WorkAreaClientRegisterPanel(userProcessContainer, system));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void usernametextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametextfieldActionPerformed

    private void passwordtextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtextfieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField passwordtextfield;
    private javax.swing.JTextField usernametextfield;
    // End of variables declaration//GEN-END:variables
}
