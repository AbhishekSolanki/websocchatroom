//ChatRoom Server
package com.websoc;

import com.google.common.eventbus.Subscribe;
import com.sun.xml.rpc.encoding.soap.CollectionSerializer;
import com.sun.xml.wss.impl.misc.HANonceManager;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.sql.Time;
import java.util.*;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;
import javax.naming.ldap.HasControls;
import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import com.websoc.Handler;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Abhishek Solanki
 */
@ServerEndpoint("/Peer2Peer")
public class Peer2Peer {

    String username=null,arrayListMessage=null;
    Date d = new Date();
    ArrayList<String> allMessages = new ArrayList<>();
    Handler handler = new Handler();
    Set<Session> chatroomUsers = handler.getSession();
            //Collections.synchronizedSet(new HashSet<Session>()
    Iterator<Session> iterator = chatroomUsers.iterator(); 
    Session userSession,temp;
    static Set<Session> tempuser = Collections.synchronizedSet(new HashSet<Session>());

    
    @OnOpen
    public void onOpen(Session userSession) throws IOException
    {
        chatroomUsers.add(userSession);
        this.userSession=userSession;
        Iterator<Session> iterator = chatroomUsers.iterator();
        while(iterator.hasNext()) (iterator.next()).getBasicRemote().sendText(buildJsonUsername());
    }
     
    @OnMessage
    public String onMessage(String message, Session UserSession) throws IOException {
       username = (String)UserSession.getUserProperties().get("username");
       Iterator<Session> iterator = chatroomUsers.iterator(); 
       
       if(username==null) {
            handler.putHash(username, userSession);
            UserSession.getUserProperties().put("username",message);
            UserSession.getBasicRemote().sendText(buildJsonData("System","You are now connected as "+message));
            while(iterator.hasNext()) (iterator.next()).getBasicRemote().sendText(buildJsonUsername());
       } else {
           long msgTime = d.getTime();
           if(userSession.equals(handler.getHash("abhi")))
           {
              tempuser.add(userSession);
           //   tempuser.add()
           }
           arrayListMessage=msgTime+"#$%"+username+"#$%"+message;
           while(iterator.hasNext()) iterator.next().getBasicRemote().sendText(buildJsonData(username, message));
            UserSession.getBasicRemote().sendText(buildJsonUsername());
            //make entries in DB for received message
       }
        return null;
    }
    
    @OnClose
    public void onClose(Session userSession) throws IOException
    {
        
        chatroomUsers.remove(userSession);
        Iterator<Session> iterator = chatroomUsers.iterator(); 
        while(iterator.hasNext()) (iterator.next()).getBasicRemote().sendText(buildJsonUsername());
       
    }
    
    @OnError
    public void onError(Throwable t)
    {
        t.printStackTrace();
    }
    
    private String JsonUsername(String username)
    {
       JsonObject jasonObject1 = Json.createObjectBuilder().add("username",username).build();
        StringWriter stringwriter = new StringWriter(); 
        try(JsonWriter jsonwriter = Json.createWriter(stringwriter)) 
        {
            jsonwriter.write(jasonObject1);
        }
        catch(Throwable t) { t.printStackTrace(); }
        System.out.println("USername: "+stringwriter.toString());
        return stringwriter.toString();
    }
    
    private String buildJsonData(String username, String message) {
        JsonObject jasonObject = Json.createObjectBuilder().add("message",username+": "+message).build();
        StringWriter stringwriter = new StringWriter(); 
        try(JsonWriter jsonwriter = Json.createWriter(stringwriter)) 
        {
            jsonwriter.write(jasonObject);
            // Make entries in database for messages
        }
        catch(Throwable t) { t.printStackTrace(); }
        System.out.println("Json String : "+stringwriter.toString());
        return stringwriter.toString();
    }
    
    private String buildJsonUsername()
    {
        Iterator<String> iterator = getUserName().iterator();
        JsonArrayBuilder jsonArrayBuilder = Json.createArrayBuilder();
        while(iterator.hasNext()) jsonArrayBuilder.add((String)iterator.next());    
        System.out.println("User Array "+Json.createObjectBuilder().add("users", jsonArrayBuilder).build().toString());
        return Json.createObjectBuilder().add("users", jsonArrayBuilder).build().toString();
    }
    
    private Set<String> getUserName()
    {
        HashSet<String> returnset = new HashSet<String>();
        Iterator<Session> iterator = chatroomUsers.iterator(); 
        while(iterator.hasNext()) returnset.add(iterator.next().getUserProperties().get("username").toString());
        System.out.println(returnset);
        return returnset;
    }
    
}
