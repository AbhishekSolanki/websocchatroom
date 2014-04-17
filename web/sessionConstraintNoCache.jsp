<%-- 
    Document   : sessionConstraintNoCache
    Created on : Apr 17, 2014, 1:18:53 PM
    Author     : Abhishek Solanki
    Summary    : Cache control mechanism that prevents unauthorized sessions and access to previous sessions
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
         <%
            response.setHeader("Cache-Control","no-cache");
            response.setHeader("Cache-Control","no-store");
            response.setHeader("Pragma","no-cache");
            response.setDateHeader ("Expires", 0);

            if(session.getAttribute("SessionID")==null && session.getAttribute("ID")==null)
            {
                response.sendRedirect("/websocchatroom/error.jsp?errorCode=INVALIDSESS");
            }
            %>
    </body>
</html>
