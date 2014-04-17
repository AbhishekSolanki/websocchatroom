<%-- 
    Document   : logout
    Created on : Apr 15, 2014, 7:11:10 PM
    Author     : Abhishek Solanki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <title>Logout</title>
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
                <a href="#">
                    <strong></strong>
                </a>
                <span class="right">
                    <a href="#">
                        <strong></strong>
                    </a>
                </span>
            </div><!--/ Codrops top bar -->

            <header>

                <h1>Messaging System <strong>Logout!</strong></h1>
                <h2>a better way to stay connected !</h2>


                <div class="support-note">
                    <span class="note-ie">Sorry, only modern browsers.</span>
                </div>

            </header>

            <section class="main">
                <%
                    if (session.getAttribute("ID") != null) {
                        session.removeAttribute("userName");
                        session.removeAttribute("ID");
                        session.invalidate();
                        out.println("<center><b>Logged out successfully, redirecting to HOME in 5 seconds.....");
                        response.setHeader("Refresh", "5;url=/websocchatroom/signIn");
                    } else {
                        out.println("<center><b>Error, redirecting to HOME in 5 seconds.....");
                        response.setHeader("Refresh", "5;url=/websocchatroom/signIn");
                    }

                %>


            </section>
        </div>
    </body>
</html>
