/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websoc;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.websoc.signupDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Abhishek Solanki
 */
@WebServlet(name = "signup", urlPatterns = {"/signup"})
public class signup extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name,email,userName,password,bMonth,bDate,bYear,gender,mobile;
        name=request.getParameter("name");
        email=request.getParameter("email");
        userName=request.getParameter("userName");
        password=request.getParameter("password");
        bMonth=request.getParameter("bMonth");
        bDate=request.getParameter("bDate");
        bYear=request.getParameter("bYear");
        gender=request.getParameter("gender");
        mobile=request.getParameter("mobile"); 
        String birthDate = bDate+"-"+bMonth+"-"+bYear;
        signupDAO signupObject = new signupDAO(name, email, userName, password, birthDate, gender, mobile);
        
        try {
            signupObject.execute();
            System.out.println("Registration Completed Successfully: signup.java Servlet");
        } catch (Exception ex) {
            System.out.println(ex+"\n Error in Signup Servlets");
        }   
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
