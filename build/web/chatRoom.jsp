<!--chatting module frontend-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="sessionConstraintNoCache.jsp"%>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <title>ChatRoom</title>
        <meta name="description" content="Custom Login Form Styling with CSS3" />
        <meta name="keywords" content="css3, login, form, custom, input, submit, button, html5, placeholder" />
        <meta name="author" content="Codrops" />
        <link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <script src="js/modernizr.custom.63321.js"></script>
        <!--[if lte IE 7]><style>.main{display:none;} .support-note .note-ie{display:block;}</style><![endif]-->
        <script type="text/javascript">
            var webSocket = new WebSocket("ws://localhost:8080/websocchatroom/chatroomserverendpoint");
            webSocket.onopen = function(message) {
                processOpen(message);
            };
            webSocket.onmessage = function(message) {
                processMessage(message);
            };
            webSocket.onclose = function(message) {
                processClose(message);
            };
            webSocket.onerror = function(message) {
                processError(message);
            };


            function processOpen(message) {
                messagesTextArea.value += "Server Connected..." + "\n";
                webSocket.send("<%= session.getAttribute("userName")%>");
            }
            function processMessage(message)
            {
                var jsonData = JSON.parse(message.data);

                if (jsonData.message != null)
                    messagesTextArea.value += jsonData.message + "\n";

                if (jsonData.users != null)
                {
                    OnlineUsersTextArea.value = "";
                    var i = 0;
                    while (i < Object.keys(jsonData.users).length)
                        OnlineUsersTextArea.value += jsonData.users[i++] + "\n";
                }

            }
            function sendMessage()
            {
                if (textMessage.value != "close")
                {
                    webSocket.send(textMessage.value);
                    textMessage.value = "";
                }
                else
                    webSocket.close();

            }
            window.onbeforeunload = function() {

                webSocket.close();
            };
            function processClose(message) {
                webSocket.send("Client disconnected...");
                messagesTextArea.value += "Server Disconnect..." + "\n";
            }
            function processError(message) {
                messagesTextArea.value += "error..." + "\n";
            }
        </script>
    </head>


    <body>
        <div class="container">

            <!-- Codrops top bar -->
            <div class="codrops-top">
                <a href="home">
                    <strong>&laquo; Previous : </strong>Home
                </a>
                <span class="right">
                    <a href="logout">
                        <strong>Logout: <%out.println(session.getAttribute("userName"));%></strong>
                    </a>
                </span>
            </div><!--/ Codrops top bar -->

            <header>

                <h1>Messaging System <strong>ChatRoom</strong></h1>
                <h3>Have fun...</h3> 


                <div class="support-note">
                    <span class="note-ie">Sorry, only modern browsers.</span>
                </div>

            </header>

            <section class="main">
                <nav class="codrops-demos">
                    <br><textarea id="messagesTextArea" rows="20" cols="70" readonly="readonly"></textarea>
                    <textarea id="OnlineUsersTextArea" rows="20" cols="20" readonly="readonly"></textarea>
                    <form>
                        <input id="textMessage" type="text"/>
                        <input onclick="sendMessage();" value="Send Message" type="button"/>
                    </form>

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

