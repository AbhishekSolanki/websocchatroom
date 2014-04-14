package com.websoc;

import com.websoc.signinDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Abhishek Solanki
 */
public class signin extends HttpServlet {

    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        String userName="",password="";
        userName = request.getParameter("userName");
        password = request.getParameter("password");

        if(userName.equals("") || password.equals("")) {
            out.println("Please don't fool our Server :-) !"); 
        }
        else {
             out.println("Plase wait a moment while we are trying to connect");
             signinDAO signinObject = new signinDAO(userName, password);
             try {
             signinObject.exeute();
             }
             catch(Exception e)
             {
                 System.out.println("Error in signin.java unable to communicate with signinDAO");
                 out.println("Error while login, please try again !");
             }
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
