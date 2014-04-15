package com.websoc;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map.Entry;
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
    public static Hashtable<Session,Session> hash = new Hashtable<>(20);
     
    public Set<Session> getSession()
    {
        return chatroomUsers;
        
    }
    public void putHash(Session userSession,Session partySession)
    {
        hash.put(userSession,partySession);
    }
    
    public Session getHash(Session userName)
    {
       // Set<Entry<Session, Session>> entires = hash.entrySet();
        return hash.get(userName);
    }
    
    public void removeHash(String userName)
    {
        hash.remove(userName);
    }
   
}
