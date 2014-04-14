<!DOCTYPE html>
<html lang="en">
    <head>
		<meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
		<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <title>Custom Login Form Styling</title>
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
                <a href="signIn.html">
                    <strong>&laquo; Previous : </strong>SIGN IN
                </a>
                <span class="right">
                    <a href="#">
                        <strong>Back to the Codrops Article</strong>
                    </a>
                </span>
            </div><!--/ Codrops top bar -->
			
			<header>
			
				<h1>Messaging System <strong>Error</strong></h1>
				<h3>Oops there's some problem...</h3>
				

				<div class="support-note">
					<span class="note-ie">Sorry, only modern browsers.</span>
				</div>
				
			</header>
			
			<section class="main">
                            <br>
                            <% 
                                
            String errorCode = request.getParameter("errorCode");
            
            if(errorCode.equals("UPNULL"))
            {
                out.println("<center><h3>It seems you have left the username or password field blank, Please click <b><u><a href=signIn.html>here</a></u></b> to try it again</center></h3>");
            }
            else if(errorCode.equals("LOGINERR")) 
            {
                 out.println("<center><h3>It seems you provided false login credentials, Please click <b><u><a href=signIn.html>here</a></u></b> to try it again </center></h3>");
            }
            else
            {
                out.println("<center><h3>Our server failed to track down your error ! Please click <b><u><a href=signIn.html>here</a></u></b> to try it again</center></h3>");
            }
        %>
                            
                            <nav class="codrops-demos">
                                <br>
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