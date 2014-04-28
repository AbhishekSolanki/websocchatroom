// Database Access Object for Signup
package com.websoc;

import java.sql.*;
import com.websoc.DBCredentials;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.j2ee.statistics.JDBCConnectionPoolStats;
/**
 
 * @author Abhishek Solanki
 */
public class signupDAO {
    
    private String name,email,userName,password,bDate,gender,mobile,securityKey;
    DBCredentials dbObj = new DBCredentials();
    String key = dbObj.getKEY();
    String url = dbObj.getDBUrl();
    String dbUser = dbObj.getDBUser();
    String dbPass = dbObj.getDBPass();
    signupDAO(String name,String email,String userName,String password,String bDate,String gender,String mobile,String securityKey)
    {
        this.name=name;
        this.email=email;
        this.userName=userName;
        this.password=password;
        this.bDate=bDate;
        this.gender=gender;
        this.mobile=mobile;
        this.securityKey=securityKey;
    }

    void execute() throws Exception {
       Class.forName("com.mysql.jdbc.Driver").newInstance();
       Connection con = DriverManager.getConnection(url,dbUser,dbPass);
       Statement stm = con.createStatement();
         String query = "insert into messaging.main values(default,'"+userName+"','"+email+"',aes_encrypt('"+password+"','"+key+"'),"
                 + "'"+name+"','"+bDate+"','"+gender+"',default,'"+mobile+"',default,aes_encrypt('"+securityKey+"','"+key+"'));";
       stm.executeUpdate(query);
             System.out.println("Success in signupDAO");
      
 
       //Code to create a user table for storing messages and file names
    }      
  
}
