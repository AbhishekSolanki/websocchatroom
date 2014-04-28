<%-- 
    Document   : signIn
    Created on : Apr 17, 2014, 1:33:30 PM
    Author     : Abhishek Solanki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <title>Sign In</title>
        <meta name="description" content="Custom Login Form Styling with CSS3" />
        <meta name="keywords" content="css3, login, form, custom, input, submit, button, html5, placeholder" />
        <meta name="author" content="Codrops" />
        <link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <script src="js/modernizr.custom.63321.js"></script>
        <!--[if lte IE 7]><style>.main{display:none;} .support-note .note-ie{display:block;}</style><![endif]-->
    </head>
    <body>
        <%
            if (session.getAttribute("userName") != null) {
                response.sendRedirect("/websocchatroom/home");
            }

        %>
        <div class="container">

            <!-- Codrops top bar -->
            <div class="codrops-top">
                <a href="#">
                    <strong>&laquo; Previous Demo: </strong>
                </a>
                <span class="right">
                    <a href="#">
                        <strong></strong>
                    </a>
                </span>
            </div><!--/ Codrops top bar -->

            <header>

                <h1>Messaging System <strong>Sign In</strong></h1>
                <h2>a better way to stay connected !</h2>


                <div class="support-note">
                    <span class="note-ie">Sorry, only modern browsers.</span>
                </div>

            </header>

            <section class="main">
                <form class="form-1" action="/websocchatroom/signin" method="post">
                    <p class="field">

                        <input type="text" name="userName" placeholder="Username or email">
                        <i class="icon-user icon-large"></i>
                    </p>
                    <p class="field">
                        <input type="password" name="password" placeholder="Password">
                        <i class="icon-lock icon-large"></i>
                    </p>
                    <p class="submit">
                        <button type="submit" name="submit"><i class="icon-arrow-right icon-large"></i></button>
                    </p>
                </form>
                <nav class="codrops-demos">
                    <a class="current-demo" href="signup.html">Join Us</a>
                    <a href="index2.html">Sign In trouble</a>
                    <a href="index3.html">About</a>
                    <!--  <a href="index4.html"></a> -->
                    <!--  <a href="index5.html"></a> -->
                </nav>

            </section>
        </div>
    </body>
</html>