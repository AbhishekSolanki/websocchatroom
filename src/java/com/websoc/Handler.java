package com.websoc;

import java.util.Collections;
import java.util.HashMap;
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
    public static HashMap<String,Session> hash = new HashMap<>(20);
    
    public Set<Session> getSession()
    {
        return chatroomUsers;
        
    }
    public void putHash(String username,Session userSession)
    {
        hash.put(username, userSession);
    }
    
    public Session getHash(String userName)
    {
        return hash.get("abhi");
    }
   
}
