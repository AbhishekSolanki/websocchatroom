/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websoc;

/**
 *
 * @author Abhishek Solanki
 */
public class DBCredentials {
    
    String getDBUrl()
    {
        return "jdbc:mysql://localhost:3306/";
    }
    String getDBUser()
    {
        return "root";
    }
    String getDBPass()
    {
        return "krish";
    }
    String getKEY()
    {
        return "messaginSystem";
    }
}
