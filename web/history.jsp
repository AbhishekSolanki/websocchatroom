<%-- 
    Document   : history
    Created on : Apr 29, 2014, 5:34:32 AM
    Author     : Abhishek Solanki
--%>

<%@page import="java.sql.*"%>
<%@page import="com.websoc.DBCredentials"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="sessionConstraintNoCache.jsp"%>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <title>History</title>
        <meta name="description" content="Custom Login Form Styling with CSS3" />
        <meta name="keywords" content="css3, login, form, custom, input, submit, button, html5, placeholder" />
        <meta name="author" content="Codrops" />
        <link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <script src="js/modernizr.custom.63321.js"></script>
        <!--[if lte IE 7]><style>.main{display:none;} .support-note .note-ie{display:block;}</style><![endif]-->
    </head>
    <body>

        <div class="container">

            <!-- Codrops top bar -->
            <div class="codrops-top">
                <a href="home">
                    <strong>&laquo; Previous : </strong>Home
                </a>
                <span class="right">
                    <a href="/websocchatroom/logout">
                        <strong>Logout: <%out.println(session.getAttribute("userName"));%></strong>
                    </a>
                </span>
            </div><!--/ Codrops top bar -->

            <header>
                <h1><strong><% out.println(session.getAttribute("userName"));%>'s</strong> History</h1>
              


                <div class="support-note">
                    <span class="note-ie">Sorry, only modern browsers.</span>
                </div>

            </header>

            <section class="main">
                <br>       
                <nav class="codrops-demos">
                    <br>
                    <%
                        DBCredentials dbObj = new DBCredentials();
                        String key = dbObj.getKEY();
                        String url = dbObj.getDBUrl();
                        String dbUser = dbObj.getDBUser();
                        String dbPass = dbObj.getDBPass();

                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                        Connection con = DriverManager.getConnection(url, dbUser, dbPass);
                        Statement stm = con.createStatement();
                        String id= session.getAttribute("ID").toString();
                        String query = "SELECT * FROM messaging.history where ID='"+id+"'";
                        ResultSet rs = stm.executeQuery(query); 
                     
                       while (rs.next()) {
                           
                            out.println( "IP: "+rs.getString(2) +" <br>Time: " +rs.getString(3)+ "<br>Session ID: "+ rs.getString(4)); %>
                         <br><br> <% } %> 
   
                   
                </nav>

            </section>
        </div>
    </body>
</html>