package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chatRoom_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/sessionConstraintNoCache.jsp");
  }

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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");

            response.setHeader("Cache-Control","no-cache");
            response.setHeader("Cache-Control","no-store");
            response.setHeader("Pragma","no-cache");
            response.setDateHeader ("Expires", 0);

            if(session.getAttribute("SessionID")==null && session.getAttribute("ID")==null)
            {
                response.sendRedirect("/websocchatroom/error.jsp?errorCode=INVALIDSESS");
            }
            
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("\t\t<meta charset=\"UTF-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\"> \n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n");
      out.write("        <title>ChatRoom</title>\n");
      out.write("        <meta name=\"description\" content=\"Custom Login Form Styling with CSS3\" />\n");
      out.write("        <meta name=\"keywords\" content=\"css3, login, form, custom, input, submit, button, html5, placeholder\" />\n");
      out.write("        <meta name=\"author\" content=\"Codrops\" />\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../favicon.ico\"> \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("        <script src=\"js/modernizr.custom.63321.js\"></script>\n");
      out.write("\t\t<!--[if lte IE 7]><style>.main{display:none;} .support-note .note-ie{display:block;}</style><![endif]-->\n");
      out.write("                   <script type=\"text/javascript\">\n");
      out.write("            var webSocket = new WebSocket(\"ws://localhost:8080/websocchatroom/chatroomserverendpoint\");\n");
      out.write("            webSocket.onopen = function(message){processOpen(message);};\n");
      out.write("            webSocket.onmessage = function(message){processMessage(message);};\n");
      out.write("            webSocket.onclose = function(message){processClose(message);};\n");
      out.write("            webSocket.onerror = function(message){processError(message);};\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            function processOpen(message) {\n");
      out.write("                messagesTextArea.value += \"Server Connected...\"+\"\\n\";\n");
      out.write("                webSocket.send(\"");
      out.print( session.getAttribute("userName") );
      out.write("\");\n");
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
      out.write("    </head>\n");
      out.write("     \n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("              <div class=\"container\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t<!-- Codrops top bar -->\n");
      out.write("            <div class=\"codrops-top\">\n");
      out.write("                <a href=\"/websocchatroom/home.jsp\">\n");
      out.write("                    <strong>&laquo; Previous : </strong>Home\n");
      out.write("                </a>\n");
      out.write("                <span class=\"right\">\n");
      out.write("                    <a href=\"/websocchatroom/logout.jsp\">\n");
      out.write("                         <strong>Logout: ");
out.println(session.getAttribute("userName")); 
      out.write("</strong>\n");
      out.write("                    </a>\n");
      out.write("                </span>\n");
      out.write("            </div><!--/ Codrops top bar -->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<header>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<h1>Messaging System <strong>ChatRoom</strong></h1>\n");
      out.write("\t\t\t\t<h3>Have fun...</h3> \n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"support-note\">\n");
      out.write("\t\t\t\t\t<span class=\"note-ie\">Sorry, only modern browsers.</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</header>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<section class=\"main\">\n");
      out.write("                             <nav class=\"codrops-demos\">\n");
      out.write("         <br><textarea id=\"messagesTextArea\" rows=\"20\" cols=\"70\" readonly=\"readonly\"></textarea>\n");
      out.write("         <textarea id=\"OnlineUsersTextArea\" rows=\"20\" cols=\"20\" readonly=\"readonly\"></textarea>\n");
      out.write("        <form>\n");
      out.write("            <input id=\"textMessage\" type=\"text\"/>\n");
      out.write("            <input onclick=\"sendMessage();\" value=\"Send Message\" type=\"button\"/>\n");
      out.write("        </form>\n");
      out.write("      \n");
      out.write("                                <br>\n");
      out.write("\t\t\t\t\t<a class=\"current-demo\" href=\"signup.html\">Join Us</a>\n");
      out.write("\t\t\t\t\t<a href=\"index2.html\">Sign In trouble</a>\n");
      out.write("\t\t\t\t\t<a href=\"index3.html\">About</a>\n");
      out.write("\t\t\t\t\t<!--  <a href=\"index4.html\"></a> -->\n");
      out.write("\t\t\t\t\t<!--  <a href=\"index5.html\"></a> -->\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\n");
      out.write("\t\t\t</section>\n");
      out.write("        </div>\n");
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
