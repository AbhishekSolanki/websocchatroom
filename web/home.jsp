<%-- 
    Document   : home
    Created on : Apr 14, 2014, 11:25:38 AM
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
        <% 
        %>
        <h3><center>Welcome <% out.println(session.getAttribute("userName")); %></center></h3>
        <%
           out.println(session.getAttribute("ID"));
            %>
        
    </body>
</html>
