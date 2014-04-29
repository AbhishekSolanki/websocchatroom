<%-- 
    Document   : adminSessionConstraintNoCache
    Created on : Apr 28, 2014, 8:47:10 PM
    Author     : Abhishek Solanki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%
            response.setHeader("Cache-Control", "no-cache");
            response.setHeader("Cache-Control", "no-store");
            response.setHeader("Pragma", "no-cache");
            response.setDateHeader("Expires", 0);

            if (session.getAttribute("SessionID") == null || !session.getAttribute("userName").equals("admin")) {
                response.sendRedirect("/websocchatroom/error?errorCode=RESTRICTED");
            }
        %>
    </body>
</html>