
<html>
    <head>
        <script type="text/javascript">
            var webSocket = new WebSocket("ws://localhost:8080/websocchatroom/chatroomserverendpoint");
            webSocket.onopen = function(message){processOpen(message);};
            webSocket.onmessage = function(message){processMessage(message);};
            webSocket.onclose = function(message){processClose(message);};
            webSocket.onerror = function(message){processError(message);};
            
            function processOpen(message) {
                messagesTextArea.value += "Server Connected..."+"\n";
            }
            function processMessage(message)
            {
                var jsonData = JSON.parse(message.data);
                
                if(jsonData.message!=null) messagesTextArea.value +=jsonData.message+"\n";
                
                if(jsonData.users!=null)
                    {
                        OnlineUsersTextArea.value="";
                        var i=0;
                        while(i<Object.keys(jsonData.users).length) OnlineUsersTextArea.value+=jsonData.users[i++]+"\n";
                    }
                
            }
            function sendMessage()
            {
                if(textMessage.value!="close")
                {
                webSocket.send(textMessage.value);
                textMessage.value="";
                }
                else webSocket.close();
                    
            }
            window.onbeforeunload=function() {
             
              webSocket.close();
            };
            function processClose(message) {
                webSocket.send("Client disconnected...");
                messagesTextArea.value += "Server Disconnect..."+"\n";
            }
            function processError(message) {
                messagesTextArea.value += "error..."+"\n";
            }
        </script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chat Room Test</title>
    </head>
    <body>
         <br><textarea id="messagesTextArea" rows="20" cols="70" readonly="readonly"></textarea>
         <textarea id="OnlineUsersTextArea" rows="20" cols="20" readonly="readonly"></textarea>
        <form>
            <input id="textMessage" type="text"/>
            <input onclick="sendMessage();" value="Send Message" type="button"/>
        </form>
       
        
    </body>
</html>

