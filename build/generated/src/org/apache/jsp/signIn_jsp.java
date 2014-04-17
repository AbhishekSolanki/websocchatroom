package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signIn_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("\t\t<meta charset=\"UTF-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\"> \n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n");
      out.write("        <title>Sign In</title>\n");
      out.write("        <meta name=\"description\" content=\"Custom Login Form Styling with CSS3\" />\n");
      out.write("        <meta name=\"keywords\" content=\"css3, login, form, custom, input, submit, button, html5, placeholder\" />\n");
      out.write("        <meta name=\"author\" content=\"Codrops\" />\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../favicon.ico\"> \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("\t\t<script src=\"js/modernizr.custom.63321.js\"></script>\n");
      out.write("\t\t<!--[if lte IE 7]><style>.main{display:none;} .support-note .note-ie{display:block;}</style><![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t<!-- Codrops top bar -->\n");
      out.write("            <div class=\"codrops-top\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <strong>&laquo; Previous Demo: </strong>\n");
      out.write("                </a>\n");
      out.write("                <span class=\"right\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <strong></strong>\n");
      out.write("                    </a>\n");
      out.write("                </span>\n");
      out.write("            </div><!--/ Codrops top bar -->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<header>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<h1>Messaging System <strong>Sign In</strong></h1>\n");
      out.write("\t\t\t\t<h2>a better way to stay connected !</h2>\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"support-note\">\n");
      out.write("\t\t\t\t\t<span class=\"note-ie\">Sorry, only modern browsers.</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</header>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<section class=\"main\">\n");
      out.write("                            <form class=\"form-1\" action=\"/websocchatroom/signin\" method=\"post\">\n");
      out.write("\t\t\t\t\t<p class=\"field\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"userName\" placeholder=\"Username or email\">\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-user icon-large\"></i>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t<p class=\"field\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" placeholder=\"Password\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icon-lock icon-large\"></i>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p class=\"submit\">\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" name=\"submit\"><i class=\"icon-arrow-right icon-large\"></i></button>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t<nav class=\"codrops-demos\">\n");
      out.write("\t\t\t\t\t<a class=\"current-demo\" href=\"signup.html\">Join Us</a>\n");
      out.write("\t\t\t\t\t<a href=\"index2.html\">Sign In trouble</a>\n");
      out.write("\t\t\t\t\t<a href=\"index3.html\">About</a>\n");
      out.write("\t\t\t\t\t<!--  <a href=\"index4.html\"></a> -->\n");
      out.write("\t\t\t\t\t<!--  <a href=\"index5.html\"></a> -->\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\n");
      out.write("\t\t\t</section>\n");
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
