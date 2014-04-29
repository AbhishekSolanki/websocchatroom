<%-- 
    Document   : removeUser
    Created on : Apr 28, 2014, 2:31:20 PM
    Author     : Abhishek Solanki
--%>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="adminSessionConstraintNoCache.jsp"%>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <title>Remove User</title>
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
                <a href="admin">
                    <strong>&laquo; Previous : </strong>Dashboard
                </a>
                <span class="right">
                    <a href="/websocchatroom/logout">
                        <strong>Logout: <%out.println(session.getAttribute("userName"));%></strong>
                    </a>
                </span>
            </div><!--/ Codrops top bar -->

            <header>
                <h1>Welcome <strong><% out.println(session.getAttribute("userName"));%></strong></h1>
                <h2>Good to see you again...</h2>


                <div class="support-note">
                    <span class="note-ie">Sorry, only modern browsers.</span>
                </div>

            </header>

            <section class="main">
                <br>       
                <nav class="codrops-demos">
                    <br>
                    <form action="removeUser" method="post" />
                     Id <input type="text" name ="ID" />
                     username <input type="text" name="userName" />
                <input type="submit" value="Remove" />
                </form>
                  

            </section>
        </div>
    </body>
</html>
