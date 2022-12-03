/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.Client;

import work.Client.Client;

import work.EcoSystem;
import work.Staff.Staff;
import work.Role.ClientRole;
import work.UserAcc.UserAcc;
import work.Utilities.CryptSupp;
import work.Utilities.ValidationUtilities;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import static java.lang.Boolean.TRUE;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import work.UserAcc.UserAccDirectory;

/**
 *
 * @author naiyaadatiya
 */
public class WorkAreaClientRegisterPanel extends javax.swing.JPanel {

    /**
     * Creates new form WorkAreaClientRegisterPanel
     * 
     */
    private JPanel userProcessContainer;
    private UserAcc userAcc;
    private EcoSystem system;
    private static final String secretKey = "9F2H65BYTJ";
    
    
    public WorkAreaClientRegisterPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateCombo();
    }
    private void populateCombo() {
        gendercombobox.removeAllItems();
        for (Client.Gender type : Client.Gender.values()) {
            gendercombobox.addItem("type");
        }
    }

     private void getValuesFromTextField(Client client) {
        if (userNameTextField.getText().isEmpty() || firstNameTextField.getText().isEmpty() || ageTextField.getText().isEmpty()
                || emailtextfield.getText().isEmpty() || mobilenumbertextfield.getText().isEmpty()
                || citytextfield.getText().isEmpty() || passwordtextfield.getText().isEmpty()
                || reenterpasswordtextfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter all the fields");
        } else {
            try {
                if (ValidationUtilities.validateNameAndNumber(userNameTextField.getText())) {
                    client.setUserName(userNameTextField.getText());
                } else {
                    JOptionPane.showMessageDialog(this, "User name should have only aphabets and numbers");
                }
                if (ValidationUtilities.validateFirstName(firstNameTextField.getText())) {
                    client.setFirstName(firstNameTextField.getText());
                } else {
                    JOptionPane.showMessageDialog(this, "First name should only contain alphabets");
                }
                if (ValidationUtilities.validateFirstName(lastnametextfield.getText())) {
                    client.setLastName(lastnametextfield.getText());
                } else {
                    JOptionPane.showMessageDialog(this, "Last name should only contain alphabets");
                }
                client.setAge(Integer.parseInt(ageTextField.getText()));
                if (ValidationUtilities.validateEmail(emailtextfield.getText())) {
                    client.setEmail(CryptSupp.encrypt(emailtextfield.getText(), secretKey));
                } else {
                    JOptionPane.showMessageDialog(this, "Email should contain a valid email");
                }
                client.setCreateDate(new Date());
                if (ValidationUtilities.validateMobnumber(mobilenumbertextfield.getText())) {
                    client.setMobileNumber(mobilenumbertextfield.getText());
                } else {
                    JOptionPane.showMessageDialog(this, "Please enter valid mobile number");
                }
                //client.setMobileNumber(CryptoSupport.encrypt(mobilenumbertextfield.getText(), secretKey));

                if (ValidationUtilities.validateFirstName(citytextfield.getText())) {
                    client.setCity(citytextfield.getText());
                } else {
                    JOptionPane.showMessageDialog(this, "City should only contain alphabets");
                }
                client.setPassword(passwordtextfield.getText());
                client.setReenterPassword(reenterpasswordtextfield.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Input not valid");
                return;
            }
            //JOptionPane.showMessageDialog(this, "User created successfully.");
            
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

        backbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lastnametextfield = new javax.swing.JTextField();
        emailtextfield = new javax.swing.JTextField();
        mobilenumbertextfield = new javax.swing.JTextField();
        firstNameTextField = new javax.swing.JTextField();
        passwordtextfield = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        citytextfield = new javax.swing.JTextField();
        userNameTextField = new javax.swing.JTextField();
        reenterpasswordtextfield = new javax.swing.JTextField();
        gendercombobox = new javax.swing.JComboBox<>();
        registerbutton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backbutton.setBackground(new java.awt.Color(0, 0, 51));
        backbutton.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        backbutton.setForeground(new java.awt.Color(159, 159, 201));
        backbutton.setText("Back");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 20, -1, -1));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Avenir", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(159, 159, 201));
        jLabel1.setText("WELCOME CUSTOMER");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 36, -1, -1));

        jLabel2.setBackground(new java.awt.Color(159, 159, 201));
        jLabel2.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(159, 159, 201));
        jLabel2.setText("First Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 92, -1, -1));

        jLabel3.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(159, 159, 201));
        jLabel3.setText("Last Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 133, -1, -1));

        jLabel4.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(159, 159, 201));
        jLabel4.setText("Email");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 171, 70, -1));

        jLabel5.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(159, 159, 201));
        jLabel5.setText("Mobile No");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 213, -1, -1));

        jLabel6.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(159, 159, 201));
        jLabel6.setText("Password");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(159, 159, 201));
        jLabel7.setText("Age");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 92, -1, -1));

        jLabel8.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(159, 159, 201));
        jLabel8.setText("Gender");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 133, -1, -1));

        jLabel9.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(159, 159, 201));
        jLabel9.setText("City");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 171, -1, -1));

        jLabel10.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(159, 159, 201));
        jLabel10.setText("Username");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 213, -1, -1));

        jLabel11.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(159, 159, 201));
        jLabel11.setText("Re-enter Password");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 258, -1, -1));
        add(lastnametextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 130, 130, -1));

        emailtextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtextfieldActionPerformed(evt);
            }
        });
        add(emailtextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 130, -1));
        add(mobilenumbertextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 212, 130, 19));
        add(firstNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 130, -1));

        passwordtextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtextfieldActionPerformed(evt);
            }
        });
        add(passwordtextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 255, 130, -1));
        add(ageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 89, 140, -1));
        add(citytextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 171, 140, -1));
        add(userNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 212, 140, -1));

        reenterpasswordtextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reenterpasswordtextfieldActionPerformed(evt);
            }
        });
        add(reenterpasswordtextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 255, 140, -1));

        gendercombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(gendercombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 130, 140, -1));

        registerbutton.setBackground(new java.awt.Color(0, 0, 0));
        registerbutton.setForeground(new java.awt.Color(159, 159, 201));
        registerbutton.setText("Register");
        registerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbuttonActionPerformed(evt);
            }
        });
        add(registerbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 341, 180, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/Client/Screenshot 2022-12-02 at 2.59.09 PM.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -3, 770, 510));
    }// </editor-fold>//GEN-END:initComponents

    private void emailtextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtextfieldActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
          userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        WorkAreaClientPanel dwjp = (WorkAreaClientPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbuttonActionPerformed

    private void registerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbuttonActionPerformed
        // TODO add your handling code here:
        String error = "";
        if((firstNameTextField.getText().equalsIgnoreCase("")) ||
            (mobilenumbertextfield.getText().equalsIgnoreCase(""))||
            (lastnametextfield.getText().equalsIgnoreCase("")) ||
                (ageTextField.getText().equalsIgnoreCase("")) ||
                (emailtextfield.getText().equalsIgnoreCase("")) ||
                (citytextfield.getText().equalsIgnoreCase("")) ||
                (userNameTextField.getText().equalsIgnoreCase(""))||
                (passwordtextfield.getText().equalsIgnoreCase(""))||
                (reenterpasswordtextfield.getText().equalsIgnoreCase(""))){
            error="\nAll the fields are Mandatory!!!";
            //Highligting the unfilled blocks to RED
            if((firstNameTextField.getText().equalsIgnoreCase(""))){
                firstNameTextField.setBorder(new LineBorder(Color.RED,2));
            }
            if((lastnametextfield.getText().equalsIgnoreCase(""))){
                lastnametextfield.setBorder(new LineBorder(Color.RED,2));
            }
            if((mobilenumbertextfield.getText().equalsIgnoreCase(""))){
                mobilenumbertextfield.setBorder(new LineBorder(Color.RED,2));
            }
            if((ageTextField.getText().equalsIgnoreCase(""))){
                ageTextField.setBorder(new LineBorder(Color.RED,2));
            }
            if((emailtextfield.getText().equalsIgnoreCase(""))){
                emailtextfield.setBorder(new LineBorder(Color.RED,2));  
            }
            if((citytextfield.getText().equalsIgnoreCase(""))){
                citytextfield.setBorder(new LineBorder(Color.RED,2));
                
            }
             if((userNameTextField.getText().equalsIgnoreCase(""))){
                userNameTextField.setBorder(new LineBorder(Color.RED,2));
                
            }
            if((passwordtextfield.getText().equalsIgnoreCase(""))){
                passwordtextfield.setBorder(new LineBorder(Color.RED,2));
                
            }
            if((reenterpasswordtextfield.getText().equalsIgnoreCase(""))){
                reenterpasswordtextfield.setBorder(new LineBorder(Color.RED,2));
                
            }
        }
        
        if(!error.equals("")){
            JOptionPane.showMessageDialog(null,error);
            return;
        }else{ 
             String pwdRegex = "((?=.*[a-z])(?=.*)(?=.*[@$*#&])(?=.*[A-Z]).{6})";
             Pattern pwdPattern = Pattern.compile(pwdRegex);
             Matcher pwdCheck = pwdPattern.matcher(passwordtextfield.getText());
             boolean checkPwd = pwdCheck.matches();
                if(!(checkPwd == TRUE)){
                    error+="\n\n Password needs to match below criteria:\n"
                    + "Password must be 6 characters only.\nIt Must have atleast one upper character.\nIt must have atleast one lower character."
                            + "\nIt must have atleast one digit.\nIt must have atleast one special character[#$&*]. ";
            passwordtextfield.setBorder(new LineBorder(Color.RED,2));
            }
            /*String pwdRegex1 = "((?=.*[a-z])(?=.*)(?=.*[@$*#&])(?=.*[A-Z]).{6})";
            Pattern pwdPattern1 = Pattern.compile(pwdRegex1);
            Matcher pwdCheck1 = pwdPattern1.matcher(reenterPasswordTextField.getText());
            boolean checkPwd1 = pwdCheck1.matches();
            if(!(checkPwd1 == TRUE)){
                error+="\n\n ReenterPassword needs to match below criteria:\n"
                    + "ReenterPassword must be 6 characters only.\nIt Must have atleast one upper character.\nIt must have atleast one lower character."
                            + "\nIt must have atleast one digit.\nIt must have atleast one special character[#$&*]. ";
                reenterPasswordTextField.setBorder(new LineBorder(Color.RED,2));
                }
            */
            String emailPattern = "^(.+)@(.+)$";
            Pattern emailPat = Pattern.compile(emailPattern);
            Matcher checkEmail = emailPat.matcher(emailtextfield.getText());
            boolean emailMatch = checkEmail.matches();
            if(!(emailMatch == TRUE)){
                error+="\n\nPlease enter valid email address.";
                emailtextfield.setBorder(new LineBorder(Color.RED,2));
                
            }
            
            
            String usernamePattern = "[0-9A-za-z]{8}";
            Pattern userPat = Pattern.compile(usernamePattern);
            Matcher checkUser = userPat.matcher(userNameTextField.getText());
            boolean userMatch = checkUser.matches();
            if(!(userMatch == TRUE)){
                error+="\n\nUsername needs to be 8 characters only-combination of characters and digits!";
                userNameTextField.setBorder(new LineBorder(Color.RED,2));
                
            }
            
            
            String userCheck = userNameTextField.getText();
            boolean check = system.checkIfUserIsUnique(userCheck);
            if(check==false){error+="\nUsername needs to be unique!";
                userNameTextField.setBorder(new LineBorder(Color.RED,2));               
            }
            
            String firstnamePattern = "^[A-Za-z]+$";
            Pattern firstnamePat = Pattern.compile(firstnamePattern);
            Matcher checkfirstname = firstnamePat.matcher(firstNameTextField.getText());
            boolean firstnameMatch = checkfirstname.matches();
            if(!(firstnameMatch == TRUE)){
                error+="\nPlease enter valid First Name";
                firstNameTextField.setBorder(new LineBorder(Color.RED,2));
                
            }
            
            String lastnamePattern = "^[A-Za-z]+$";
            Pattern lastnamePat = Pattern.compile(lastnamePattern);
            Matcher checklastname = lastnamePat.matcher(lastnametextfield.getText());
            boolean lastnameMatch = checklastname.matches();
            if(!(lastnameMatch == TRUE)){
                error+="\nPlease enter valid Last Name";
                lastnametextfield.setBorder(new LineBorder(Color.RED,2));
                
            }
            String agePattern = "^100|[1-9]?\\d$";
            Pattern agePat = Pattern.compile(agePattern);
            Matcher checkage = agePat.matcher(ageTextField.getText());
            boolean ageMatch = checkage.matches();
            if(!(ageMatch == TRUE)){
                error+="\nPlease enter valid age";
                ageTextField.setBorder(new LineBorder(Color.RED,2));
                
            }
      
            
            String cityPattern = "^[A-Za-z]+$";
            Pattern cityPat = Pattern.compile(cityPattern);
            Matcher checkcity = cityPat.matcher(citytextfield.getText());
            boolean cityMatch = checkcity.matches();
            if(!(cityMatch == TRUE)){
                error+="\nPlease enter valid City Name";
                citytextfield.setBorder(new LineBorder(Color.RED,2));
                
            }
            
            String phoneRegex = "^\\d{10}$";
            Pattern phonePattern = Pattern.compile(phoneRegex);       
            Matcher checkPhone = phonePattern.matcher(mobilenumbertextfield.getText());
            boolean checkPhoneMatch = checkPhone.matches();
            if(!(checkPhoneMatch == TRUE)){  
                error="\nFor Phone number - Please enter only 10 digits!";
                mobilenumbertextfield.setBorder(new LineBorder(Color.RED,2));
            }

            
        }
            if(!error.equals("")){
            JOptionPane.showMessageDialog(null,error);
        }else{
                firstNameTextField.setBorder(new LineBorder(Color.WHITE,2));
                lastnametextfield.setBorder(new LineBorder(Color.WHITE,2));
                ageTextField.setBorder(new LineBorder(Color.WHITE,2));
                emailtextfield.setBorder(new LineBorder(Color.WHITE,2));
                userNameTextField.setBorder(new LineBorder(Color.WHITE,2));
                mobilenumbertextfield.setBorder(new LineBorder(Color.WHITE,2));
                citytextfield.setBorder(new LineBorder(Color.WHITE,2));
                passwordtextfield.setBorder(new LineBorder(Color.WHITE,2));
                reenterpasswordtextfield.setBorder(new LineBorder(Color.WHITE,2));

        
        ClientRole clientRole = new ClientRole();
        Client client = new Client();
        //getValuesFromTextField(client);
        client.setFirstName(firstNameTextField.getText());
        client.setLastName(lastnametextfield.getText());
        client.setAge(Integer.parseInt(ageTextField.getText()));
        client.setEmail(emailtextfield.getText());
        client.setUserName(userNameTextField.getText());
        client.setMobileNumber(mobilenumbertextfield.getText());
        client.setCity(citytextfield.getText());
        client.setPassword(passwordtextfield.getText());
        client.setReenterPassword(reenterpasswordtextfield.getText());
        clientRole.setClient(client);
    
        
        Staff staff = system.getStaffDirectory().createStaff(client.getFirstName(), clientRole);
            if(system.getUserAccDirectory().checkIfUsernameIsUnique(client.getUserName())) {
            UserAcc userAccount = system.getUserAccDirectory().createUserAcc(client.getUserName(), client.getPassword(), staff, clientRole);
            //JOptionPane.showMessageDialog(this, "User created successfully.");
            }else {
            //JOptionPane.showMessageDialog(this, "Username already exists");
            error+="\nUsername needs to be unique!";
                userNameTextField.setBorder(new LineBorder(Color.RED,2));  
            }
            JOptionPane.showMessageDialog(this, "User created successfully.");
            firstNameTextField.setText("");
            lastnametextfield.setText("");
            ageTextField.setText("");
            emailtextfield.setText("");
            userNameTextField.setText("");
            mobilenumbertextfield.setText("");
            citytextfield.setText("");
            passwordtextfield.setText("");
            reenterpasswordtextfield.setText("");
            }
            
            
                               
    }//GEN-LAST:event_registerbuttonActionPerformed

    private void passwordtextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtextfieldActionPerformed

    private void reenterpasswordtextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reenterpasswordtextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reenterpasswordtextfieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTextField;
    private javax.swing.JButton backbutton;
    private javax.swing.JTextField citytextfield;
    private javax.swing.JTextField emailtextfield;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JComboBox<String> gendercombobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastnametextfield;
    private javax.swing.JTextField mobilenumbertextfield;
    private javax.swing.JTextField passwordtextfield;
    private javax.swing.JTextField reenterpasswordtextfield;
    private javax.swing.JButton registerbutton;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}