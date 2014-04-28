package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class error_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    Throwable exception = org.apache.jasper.runtime.JspRuntimeLibrary.getThrowable(request);
    if (exception != null) {
      response.setStatus((Integer)request.getAttribute("javax.servlet.error.status_code"));
    }
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\"> \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n");
      out.write("        <title>Error</title>\n");
      out.write("        <meta name=\"description\" content=\"Custom Login Form Styling with CSS3\" />\n");
      out.write("        <meta name=\"keywords\" content=\"css3, login, form, custom, input, submit, button, html5, placeholder\" />\n");
      out.write("        <meta name=\"author\" content=\"Codrops\" />\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../favicon.ico\"> \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("        <script src=\"js/modernizr.custom.63321.js\"></script>\n");
      out.write("        <!--[if lte IE 7]><style>.main{display:none;} .support-note .note-ie{display:block;}</style><![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <!-- Codrops top bar -->\n");
      out.write("            <div class=\"codrops-top\">\n");
      out.write("                <a href=\"signIn\">\n");
      out.write("                    <strong>&laquo; Previous : </strong>SIGN IN\n");
      out.write("                </a>\n");
      out.write("                <span class=\"right\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <strong></strong>\n");
      out.write("                    </a>\n");
      out.write("                </span>\n");
      out.write("            </div><!--/ Codrops top bar -->\n");
      out.write("\n");
      out.write("            <header>\n");
      out.write("\n");
      out.write("                <h1>Messaging System <strong>Error</strong></h1>\n");
      out.write("                <h3>Oops there's some problem...</h3>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"support-note\">\n");
      out.write("                    <span class=\"note-ie\">Sorry, only modern browsers.</span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <section class=\"main\">\n");
      out.write("                <br>\n");
      out.write("                ");


                    String errorCode = request.getParameter("errorCode");

                    if (errorCode.equals("UPNULL")) {
                        out.println("<center><h3>It seems you have left the username or password field blank, Please click <b><u><a href=signIn>here</a></u></b> to try again</center></h3>");
                    } else if (errorCode.equals("LOGINERR")) {
                        out.println("<center><h3>It seems you provided false login credentials, Please click <b><u><a href=signIn>here</a></u></b> to try again </center></h3>");
                    } else if (errorCode.equals("RESTRICTED")) {
                        out.println("<center><h3>Access Denied ! <br>Admins only, Please click <b><u><a href=signIn>here</a></u></b> to try again </center></h3>");
                    } else if (errorCode.equals("INVALIDSESS")) {
                        out.println("<center><h3>This session does not exist !, Please click <b><u><a href=signIn>here</a></u></b> to try again </center></h3>");
                    } else if (errorCode.equals("404")) {
                        out.println("<center><img src=\"images/404.png\"</center>");
                    } else if (errorCode.equals("405")) {
                        out.println("<center><h3>405 &nbsp:( <br><br>don't hack with our server<br>GET method is not supported !<br><br><img src=\"images/405.png\" height=\"250\"</img></center>");
                    } else if (errorCode.equals("500")) {
                        out.println("<center><h3>500 &nbsp:( <br><br>Internal Server Error<br><br><img src=\"images/500.jpg\"</center>");
                    } else {
                        out.println("<center><h3>Our server failed to track down your error ! Please click <b><u><a href=signIn>here</a></u></b> to try again</center></h3>");
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("                <nav class=\"codrops-demos\">\n");
      out.write("                    <br>\n");
      out.write("                    <a class=\"current-demo\" href=\"signup.html\">Join Us</a>\n");
      out.write("                    <a href=\"index2.html\">Sign In trouble</a>\n");
      out.write("                    <a href=\"index3.html\">About</a>\n");
      out.write("                    <!--  <a href=\"index4.html\"></a> -->\n");
      out.write("                    <!--  <a href=\"index5.html\"></a> -->\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
