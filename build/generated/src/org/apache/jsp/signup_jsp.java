package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <title>Sign Up</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1> </h1>\n");
      out.write("  \n");
      out.write("        <form class=\"centered\"action=\"signup\" method=\"post\">\n");
      out.write("\t\t<h1>Join US</h1>\n");
      out.write("\t\t<table>\n");
      out.write("                <tr>\n");
      out.write("\t\t<td><b>First name<b></td><td><input type=\"text\" name=\"firstname\"/></td>\n");
      out.write("\t\t</tr>\n");
      out.write("                <tr>\n");
      out.write("\t\t<td><b>Last name<b></td><td><input type=\"text\" name=\"lastname\"/></td>\n");
      out.write("\t\t</tr>\n");
      out.write("                 <tr>\n");
      out.write("                     <td><b>Gender<b></td><td>Male <input type=\"radio\" name=\"gender\" value=\"male\"/>&nbsp;Female <input type=\"radio\" name=\"gender\" value=\"female\"/></td>\n");
      out.write("\t\t</tr>\n");
      out.write("                <tr>\n");
      out.write("\t\t<td><b>Username<b></td><td><input type=\"text\" name=\"username\"/></td>\n");
      out.write("\t\t</tr>\n");
      out.write("                <tr>\n");
      out.write("                <td><b>Password<b></td><td><input type=\"password\" name=\"password\"/></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td><b>Repeat Password<b></td><td><input type=\"password\" name=\"repeatPassword\"/></td>\n");
      out.write("\t\t<tr>\n");
      out.write("                <tr>\n");
      out.write("\t\t<td><b>Email Address<b></td><td><input type=\"text\" name=\"email\"/></td>\n");
      out.write("\t\t</tr>\n");
      out.write("                <tr>\n");
      out.write("\t\t<td><b>Repeat Email<b></td><td><input type=\"text\" name=\"repeatEmail\"/></td>\n");
      out.write("\t\t</tr>\n");
      out.write("                <tr>\n");
      out.write("\t\t<td><b>Location<b></td><td><input type=\"text\" name=\"location\"/></td>\n");
      out.write("\t\t</tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td><td><input type=\"checkbox\" name=\"tc\"/><a href=\"\" >Accept Terms and Conditions</a></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t\n");
      out.write("\t\t<td></td>\n");
      out.write("                <td><input type=\"submit\" value=\"Sign Up !\" onClick=\"\" />&nbsp; &nbsp;<input type=\"button\" value=\"Reset\" onClick=\"\" /></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t\t</form>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
