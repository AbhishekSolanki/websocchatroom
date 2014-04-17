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
public class signin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        String userName = "", password = "";
        userName = request.getParameter("userName");
        password = request.getParameter("password");

        if (userName.equals("") || password.equals("")) {
            response.sendRedirect("/websocchatroom/error?errorCode=UPNULL");
            //out.println("Please don't fool our Server :-) !"); 
        } else {
            out.println("Plase wait a moment while we are trying to connect");
            signinDAO signinObject = new signinDAO(userName, password);
            try {
                int ID = signinObject.exeute();
                HttpSession session = request.getSession(true);
                Handler handler = new Handler();
                request.setAttribute("ID", ID);
                request.setAttribute("userName", userName);
                session.setAttribute("SessionID", session.getId());
                session.setAttribute("ID", ID);
                session.setAttribute("userName", userName);
                response.sendRedirect("/websocchatroom/home");

                // getServletContext().getRequestDispatcher("/home.jsp").forward(request,response);

            } catch (Exception e) {
                //  System.out.println("Error in signin.java unable to communicate with signinDAO" +e);
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
