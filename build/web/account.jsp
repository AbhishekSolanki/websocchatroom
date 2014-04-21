<%-- 
    Document   : account
    Created on : Apr 20, 2014, 8:58:41 PM
    Author     : Abhishek Solanki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="sessionConstraintNoCache.jsp"%>

<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <title>Account</title>
        <meta name="description" content="Custom Login Form Styling with CSS3" />
        <meta name="keywords" content="css3, login, form, custom, input, submit, button, html5, placeholder" />
        <meta name="author" content="Codrops" />
        <link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="style.css" media="all" /> <!-- signup css-->
        <link rel="stylesheet" type="text/css" href="demo.css" media="all" /> <!-- signup css-->
        <link rel="stylesheet" type="text/css" href="css/style.css" /> <!-- home css-->
        <script src="js/modernizr.custom.63321.js"></script>

        <!--[if lte IE 7]><style>.main{display:none;} .support-note .note-ie{display:block;}</style><![endif]-->
    </head>
    <body>

        <div class="container">

            <!-- Codrops top bar -->
            <div class="codrops-top">
                <a href="home">
                    <strong>&laquo; Previous : </strong>HOME
                </a>
                <span class="right">
                    <a href="/websocchatroom/logout">
                        <strong>Logout: <%out.println(session.getAttribute("userName"));%></strong>
                    </a>
                </span>
            </div><!--/ Codrops top bar -->

            <header>
                <h1><strong><% out.println(session.getAttribute("userName") + "'s");%></strong> Account</h1>
                <h2>personalize yourself...!</h2>

             

                <div class="support-note">
                    <span class="note-ie">Sorry, only modern browsers.</span>
                </div>

            </header>
            <div  class="form">
                <form id="contactform" method="post" action="/websocchatroom/signup"> 
                    <p class="contact"><label for="name">Name:</label></p> 
                    <input id="name" name="name" placeholder="change your name" required="" tabindex="1" type="text"> 

                    <p class="contact"><label for="email">Email</label></p> 
                    <input id="email" name="email" placeholder="Change email id" required="" tabindex="2"type="email"> 

                    <p class="contact"><label for="username">Avatar</label></p> 
                    <input id="username" name="userName" placeholder="username" required="" tabindex="3" type="file"> 

                    <p class="contact"><label for="password">Change password</label></p> 
                    <input type="password" id="password" name="password" required="" tabindex="4"> 
                    <p class="contact"><label for="repassword">Confirm your password</label></p> 
                    <input type="password" id="repassword" name="repassword" required="" tabindex="5"> 

                    <fieldset>
                        <label>Birthday</label>
                        <label class="month"> 
                            <select class="select-style" name="bMonth" tabindex="6">
                                <option value="00">Month</option>
                                <option value="01">January</option>
                                <option value="02">February</option>
                                <option value="03" >March</option>
                                <option value="04">April</option>
                                <option value="05">May</option>
                                <option value="06">June</option>
                                <option value="07">July</option>
                                <option value="08">August</option>
                                <option value="09">September</option>
                                <option value="10">October</option>
                                <option value="11">November</option>
                                <option value="12" >December</option>
                            </select>    
                            <label>Day<input class="birthday" maxlength="2" name="bDate"  placeholder="Day" required="" tabindex="7"></label>
                            <label>Year <input class="birthyear" maxlength="4" name="bYear" placeholder="Year" required="" tabindex="8"></label>
                    </fieldset>
                    <p class="contact"><label for="email">Bio</label></p> 
                    <textarea id="email" name="email" placeholder="about yourself....." required="" tabindex="2" rows="3" cols="45"></textarea>
                    <br><br>

                    <p class="contact"><label for="mobile">Mobile phone</label></p> 
                    <input id="phone" name="mobile" placeholder="update your contact number" required="" type="text" tabindex="10"> <br>
                    <input class="buttom" name="submit" id="submit" tabindex="11" value="Save!" type="submit"> 	 
                </form> 
            </div>      
            <section class="main">
                <br>       
                <nav class="codrops-demos">
                    <br>
                    <a class="current-demo" href="chatRoom">Chat Room</a>
                    <a href="index2.html">Chat</a>
                    <a href="index3.html">File Transfer</a>
                    <a href="index4.html">History</a>
                    <a href="index5.html">Account</a>
                </nav>

            </section>
        </div>
    </body>
</html>
