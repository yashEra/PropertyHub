/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.sql.*;

/**
 *
 * @author shach
 */
public class User {
    private String role ;
    private String firstName ;
    private String lastName ;
    private String email ;
    private String contactNumber ;
    private String username ;
    private String password ;
    private String address ;
    private String shop_address;
    private String acc_number;
    private String acc_type;
    private String acc_bank_name;
    private String acc_bank_branch;
    private String userType;
    private int user_id;
    
    public User(){
        
    }
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConatcNumber() {
        return contactNumber;
    }

    public void setConatcNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getShopAddress() {
        return shop_address;
    }

    public void setShopAddress(String shop_address) {
        this.shop_address = shop_address;
    }

    public String getAccountNumber() {
        return acc_number;
    }

    public void setAccountNumber(String acc_number) {
        this.acc_number = acc_number;
    }

    public String getAccountType() {
        return acc_type;
    }

    public void setAccountType(String acc_type) {
        this.acc_type = acc_type;
    }

    public String getBankName() {
        return acc_bank_name;
    }

    public void setBankName(String acc_bank_name) {
        this.acc_bank_name = acc_bank_name;
    }

    public String getBranchName() {
        return acc_bank_branch;
    }

    public void setBranchName(String acc_bank_branch) {
        this.acc_bank_branch = acc_bank_branch;
    }
    
    public String getUserType() {
        return userType;
    }
    public void setUserId(int user_id){
        this.user_id = user_id;
    }
    public int getUserId(){
        return user_id;
    }
     
    public boolean register(Connection con) throws Exception{
        String query="";
        if("buyer".equals(role)){
            query = "INSERT INTO buyer(firstName,lastName,email,contactNo,address,username,password) VALUES(?,?,?,?,?,?,?)";
        }
        else if("seller".equals(role)){
            query = "INSERT INTO seller(firstName,lastName,email,contactNo,shop_address,acc_number,acc_type,acc_bank_name,acc_bank_branch,username,password) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        }
        PreparedStatement pstmt = con.prepareStatement(query);
        
        if ("buyer".equals(role)) {
            pstmt.setString(1, firstName);
            pstmt.setString(2, lastName);
            pstmt.setString(3, email);
            pstmt.setString(4, contactNumber);
            pstmt.setString(5, address);
            pstmt.setString(6, username);
            pstmt.setString(7, password);
        }
        else if("seller".equals(role)){
            pstmt.setString(1, firstName);
            pstmt.setString(2, lastName);
            pstmt.setString(3, email);
            pstmt.setString(4, contactNumber);
            pstmt.setString(5, shop_address);
            pstmt.setString(6, acc_number);
            pstmt.setString(7, acc_type);
            pstmt.setString(8, acc_bank_name);
            pstmt.setString(9, acc_bank_branch);
            pstmt.setString(10, username);
            pstmt.setString(11, password);
        }
        int a = pstmt.executeUpdate();
        
        return (a>0);
        
    }   
    
    public boolean login(Connection con) throws SQLException {
        String hashedPassword = MD5.getMd5(password);
        
        String query = "SELECT * FROM login WHERE username = ?";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, username);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            String db_password = rs.getString("password");
            
            
            if (hashedPassword.equals(db_password)) {
                userType = rs.getString("user_type");
                user_id = rs.getInt("user_id");
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }
        
}
