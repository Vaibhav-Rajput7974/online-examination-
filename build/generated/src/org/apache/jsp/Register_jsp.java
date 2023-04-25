package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menu1.jsp");
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"link.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      out.write("<div id=\"mymenu\">\n");
      out.write("<ul>\n");
      out.write("<li>\n");
      out.write("<h2>\n");
      out.write("Home\n");
      out.write("</h2>\n");
      out.write("</li>\n");
      out.write("<a href=\"Register.jsp\">\n");
      out.write("<li>\n");
      out.write("<h2>\n");
      out.write("Register\n");
      out.write("</h2>\n");
      out.write("</li>\n");
      out.write("<a href=\"Login.jsp\">\n");
      out.write("<li>\n");
      out.write("<h2>\n");
      out.write("Login\n");
      out.write("</h2>\n");
      out.write("</li>\n");
      out.write("</a>\n");
      out.write("<a href=\"javaAdmin.jsp\">\n");
      out.write("<li>\n");
      out.write("<h2>\n");
      out.write("About\n");
      out.write("</h2>\n");
      out.write("</li>\n");
      out.write("</a>\n");
      out.write("<a href=\"javaAdmin.jsp\">\n");
      out.write("<li>\n");
      out.write("<h2>\n");
      out.write("Admin\n");
      out.write("</h2>\n");
      out.write("</li>\n");
      out.write("</a>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"data\">\n");
      out.write("<center>\n");
      out.write("\n");
      out.write("<Form action=\"Registerdb.jsp\">\n");
      out.write("<table cellpadding=\"10px\">\n");
      out.write("<tr>\n");
      out.write("    <td>Enter Name</td><td><input type=\"text\" name=\"un\" placeholder=\"Enter Name\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Enter password</td><td><input type=\"password\"  placeholder=\"Enter password\" name=\"up\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Enter Contact</td><td><input type=\"number\"  placeholder=\"Enter contact\" name=\"uc\"></td>\n");
      out.write("</tr>\n");
      out.write("<th colspan=\"2\">\n");
      out.write("<input type=\"submit\" class=\"B\"  value=\"regis\" > \n");
      out.write("</th>\n");
      out.write("</table>\n");
      out.write("</Form>\n");
      out.write("</center>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
