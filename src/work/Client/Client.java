/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work.Client;

import java.util.Date;

/**
 *
 * @author jatin
 */
public class Client {
    
    private static int clientID=0;
    private String userName;
    private String firstName;
    private String lastName;
    private String password;
    private String reenterPassword;
    private String email;
    private int age;
    private String mobileNumber;
    private String city;
    private Date createDate;
    
    public enum Gender{
        Male("Male"), Female("Female"), Other("Other");
        private String value;
        Gender(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public Client() {
        ++clientID;
    }

    public static int getClientId() {
        return clientID;
    }

    public static void setClientId(int customerId) {
        Client.clientID = customerId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getReenterPassword() {
        return reenterPassword;
    }

    public void setReenterPassword(String reenterPassword) {
        this.reenterPassword = reenterPassword;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
