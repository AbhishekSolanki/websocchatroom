// Database Access Object for Signup
package com.websoc;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.j2ee.statistics.JDBCConnectionPoolStats;
/**
 
 * @author Abhishek Solanki
 */
public class signupDAO {
    
    private String name,email,userName,password,bDate,gender,mobile,lastAccessed,IP;
    String key = "Messaging";
    String url = "jdbc:mysql://localhost:3306/";
    String dbUser = "root";
    String dbPass ="krish";
    signupDAO(String name,String email,String userName,String password,String bDate,String gender,String mobile)
    {
        this.key = "messaginSystem";
        this.name=name;
        this.email=email;
        this.userName=userName;
        this.password=password;
        this.bDate=bDate;
        this.gender=gender;
        this.mobile=mobile;
    }

    void execute() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
       Class.forName("com.mysql.jdbc.Driver").newInstance();
       Connection con = DriverManager.getConnection(url,dbUser,dbPass);
       Statement stm = con.createStatement();
         String query = "insert into messaging.main values(default,'"+userName+"','"+email+"',aes_encrypt('"+password+"','"+key+"'),"
               + "'"+lastAccessed+"','"+IP+"','"+name+"','"+bDate+"','"+gender+"',default,'"+mobile+"');";
       stm.executeUpdate(query);
       System.out.println("Success in signupDAO");
       
    }      
  
}
