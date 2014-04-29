package com.websoc;

import com.websoc.signinDAO;
import com.websoc.Handler;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 *
 * @author Abhishek Solanki
 */
public class forgotPass extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        String userName = "", password = "";
        userName = request.getParameter("userName");
        password = request.getParameter("securityKey");

        if (userName.equals("") || password.equals("")) {
            response.sendRedirect("/websocchatroom/error?errorCode=UPNULL");
            //out.println("Please don't fool our Server :-) !"); 
        } else {
            signinDAO signinObject = new signinDAO(userName, password);
            try {
                String pass = signinObject.forgotPass();
                Handler handler = new Handler();
                out.println("Your Password is: " + pass);
                // getServletContext().getRequestDispatcher("/home.jsp").forward(request,response);

            } catch (Exception e) {
                System.out.println("Error in signin.java unable to communicate with signinDAO" + e);
                response.sendRedirect("/websocchatroom/error?errorCode=LOGINERR");
                //  out.println("Error while login, please try again !");

            }
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
