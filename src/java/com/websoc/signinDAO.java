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

    private String userName, password;
    DBCredentials dbObj = new DBCredentials();
    String key = dbObj.getKEY();
    String url = dbObj.getDBUrl();
    String dbUser = dbObj.getDBUser();
    String dbPass = dbObj.getDBPass();

    public signinDAO(String userName, String password) {
        this.userName = userName;
        this.password = password; //or security key
    }

    int exeute() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection con = DriverManager.getConnection(url, dbUser, dbPass);
        Statement stm = con.createStatement();
        String query = "SELECT ID FROM messaging.main where userName='" + userName + "' and password=aes_encrypt('" + password + "','" + key + "');";
        ResultSet rs = stm.executeQuery(query);
        if (rs.next()) {
            System.out.println("User " + userName + " with ID " + rs.getInt(1) + " has logged in");
        }
        return rs.getInt(1);
    }

    String forgotPass() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection con = DriverManager.getConnection(url, dbUser, dbPass);
        Statement stm = con.createStatement();
        String q2 = "SELECT aes_decrypt(password,'" + key + "') FROM messaging.main where userName='" + userName + "' and securityKey=aes_encrypt('" + password + "','" + key + "');";
        ResultSet rs2 = stm.executeQuery(q2);
        if (rs2.next()) {
            System.out.println("User " + userName + " with ID " + rs2.getString(1) + " has logged in");
        }
        return rs2.getString(1);
    }

    void history(int ID, String IP, String time, String sessionID) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection con = DriverManager.getConnection(url, dbUser, dbPass);
        Statement stm = con.createStatement();
        String query = "INSERT INTO messaging.history values('" + ID + "','" + IP + "','" + time + "','" + sessionID + "');";
        stm.executeUpdate(query);
    }
}
