package com.websoc;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhishek Solanki
 */
public class Handler {
   
    public static Set<Session> chatroomUsers = Collections.synchronizedSet(new HashSet<Session>());
    
    public Set<Session> getSession()
    {
        return chatroomUsers;
        
    }
}
