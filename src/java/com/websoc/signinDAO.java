
package com.websoc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Abhishek Solanki
 */
public class signinDAO {
    
     private String userName,password;
     
         
    DBCredentials dbObj = new DBCredentials();
    String key = dbObj.getKEY();
    String url = dbObj.getDBUrl();
    String dbUser = dbObj.getDBUser();
    String dbPass = dbObj.getDBPass();
 
    public signinDAO(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
     
   int exeute() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        
       Class.forName("com.mysql.jdbc.Driver").newInstance();
       Connection con = DriverManager.getConnection(url,dbUser,dbPass);
       Statement stm = con.createStatement();
       String query = "SELECT ID FROM messaging.main where userName='"+userName+"' and password=aes_encrypt('"+password+"','"+key+"');";
       ResultSet rs =  stm.executeQuery(query);
       if(rs.next()) {System.out.println("TRUE");}
       return 0;
    }
     
}
