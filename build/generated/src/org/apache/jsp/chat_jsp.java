package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chat_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!--chatting module frontend-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            var webSocket = new WebSocket(\"ws://localhost:8080/websocchatroom/Peer2Peer\");\n");
      out.write("            webSocket.onopen = function(message){processOpen(message);};\n");
      out.write("            webSocket.onmessage = function(message){processMessage(message);};\n");
      out.write("            webSocket.onclose = function(message){processClose(message);};\n");
      out.write("            webSocket.onerror = function(message){processError(message);};\n");
      out.write("            \n");
      out.write("            function processOpen(message) {\n");
      out.write("                messagesTextArea.value += \"Server Connected...\"+\"\\n\";\n");
      out.write("                WebSocket.send(\"abhi\");\n");
      out.write("            }\n");
      out.write("            function processMessage(message)\n");
      out.write("            {\n");
      out.write("                var jsonData = JSON.parse(message.data);\n");
      out.write("                \n");
      out.write("                if(jsonData.message!=null) messagesTextArea.value +=jsonData.message+\"\\n\";\n");
      out.write("                \n");
      out.write("                if(jsonData.users!=null)\n");
      out.write("                    {\n");
      out.write("                        OnlineUsersTextArea.value=\"\";\n");
      out.write("                        var i=0;\n");
      out.write("                        while(i<Object.keys(jsonData.users).length) OnlineUsersTextArea.value+=jsonData.users[i++]+\"\\n\";\n");
      out.write("                    }\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            function sendMessage()\n");
      out.write("            {\n");
      out.write("                if(textMessage.value!=\"close\")\n");
      out.write("                {\n");
      out.write("                webSocket.send(textMessage.value);\n");
      out.write("                textMessage.value=\"\";\n");
      out.write("                }\n");
      out.write("                else webSocket.close();\n");
      out.write("                    \n");
      out.write("            }\n");
      out.write("             function sendTo()\n");
      out.write("            {\n");
      out.write("                if(sendToText.value!=\"close\")\n");
      out.write("                {\n");
      out.write("                WebSocket.send(sendToText.value);\n");
      out.write("                messagesTextArea.value=\"Please enter your message\";\n");
      out.write("                }\n");
      out.write("                else webSocket.close();\n");
      out.write("                    \n");
      out.write("            }\n");
      out.write("            window.onbeforeunload=function() {\n");
      out.write("             \n");
      out.write("              webSocket.close();\n");
      out.write("            };\n");
      out.write("            function processClose(message) {\n");
      out.write("                webSocket.send(\"Client disconnected...\");\n");
      out.write("                messagesTextArea.value += \"Server Disconnect...\"+\"\\n\";\n");
      out.write("            }\n");
      out.write("            function processError(message) {\n");
      out.write("                messagesTextArea.value += \"error...\"+\"\\n\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Chat Room Test</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form><br>TO: <input type=\"text\" id=\"sendToText\">  <input onclick=\"sendTo();\" value=\"OK\" type=\"button\"/></form>\n");
      out.write("        <br>\n");
      out.write("         <br><textarea id=\"messagesTextArea\" rows=\"20\" cols=\"70\" readonly=\"readonly\"></textarea>\n");
      out.write("         <textarea id=\"OnlineUsersTextArea\" rows=\"20\" cols=\"20\" readonly=\"readonly\"></textarea>\n");
      out.write("        <form>\n");
      out.write("            <input id=\"textMessage\" type=\"text\"/>\n");
      out.write("            <input onclick=\"sendMessage();\" value=\"Send Message\" type=\"button\"/>\n");
      out.write("        </form>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
