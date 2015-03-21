<%-- 
    Document   : stats
    Created on : Apr 28, 2014, 10:20:29 PM
    Author     : Abhishek Solanki
--%>

<%@page import="java.sql.*"%>
<%@page import="com.websoc.DBCredentials"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="adminSessionConstraintNoCache.jsp"%>
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
                <h1><strong>Stats</strong></h1>



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
                        String query = "SELECT count(id) FROM messaging.main";
                        ResultSet rs = stm.executeQuery(query);
                        out.println("No of Users: "+rs.getInt("count(id)"));
                        
                        %>

                </nav>

            </section>
        </div>
    </body>
</html>