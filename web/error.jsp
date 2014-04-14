<%-- 
    Document   : Error
    Created on : Apr 14, 2014, 10:08:42 PM
    Author     : Abhishek Solanki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Oops there's some problem !</h1>
        <% 
            String errorCode = request.getParameter("errorCode");
            
            if(errorCode.equals("UPNULL"))
            {
                out.println("It seems you have left the username or password field blank, Please click here to try it again ");
            }
            else
            {
                out.println("Our server failed to track down your error !");
            }
        %>
    </body>
</html>
