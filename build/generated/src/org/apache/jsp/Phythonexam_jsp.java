package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Phythonexam_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menu2.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"link.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
 
    String s2=(String)session.getAttribute("userId");
if(s2 != null)
{

      out.write("    \n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("const NUM = [];\n");
      out.write("const Que = [];\n");
      out.write("const A = [];\n");
      out.write("const B = [];\n");
      out.write("const C = [];\n");
      out.write("const D = [];\n");
      out.write("const ans=[];\n");
      out.write("    </script>\n");
      out.write("    ");
      out.write(" <div id=\"mymenu\">\n");
      out.write("<ul>\n");
      out.write("    <a href=\"javaexam.jsp\">\n");
      out.write("    <li>\n");
      out.write("        JAVA\n");
      out.write("    </li>\n");
      out.write("    </a>\n");
      out.write("    \n");
      out.write("    <a href=\"phpexam.jsp\">\n");
      out.write("    <li>\n");
      out.write("        PHP\n");
      out.write("    </li>\n");
      out.write("    </a>\n");
      out.write("    \n");
      out.write("    <a href=\"cppexam.jsp\">\n");
      out.write("    <li>\n");
      out.write("        C++\n");
      out.write("    </li>\n");
      out.write("    </a>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <a href=\"Phythonexam.jsp\">\n");
      out.write("    <li>\n");
      out.write("        Phyton\n");
      out.write("    </li>\n");
      out.write("    </a>\n");
      out.write("    \n");
      out.write("</ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    <div>\n");
      out.write("<center>\n");

    try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidb?useSSL=false","root","akku");
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs=st.executeQuery("select * from python");
                        rs.first();
                        //rs.next();
                        
      out.write("\n");
      out.write("                        <script>\n");
      out.write("                            NUM.push(1);\n");
      out.write("                            Que.push(\"");
      out.print(rs.getString(2));
      out.write("\");\n");
      out.write("                            A.push(\"");
      out.print(rs.getString(3));
      out.write("\");\n");
      out.write("                            B.push(\"");
      out.print(rs.getString(4));
      out.write("\");\n");
      out.write("                            C.push(\"");
      out.print(rs.getString(5));
      out.write("\");\n");
      out.write("                            D.push(\"");
      out.print(rs.getString(6));
      out.write("\");\n");
      out.write("                            ans.push(\"");
      out.print(rs.getString(7));
      out.write("\");\n");
      out.write("                            \n");
      out.write("                        </script>\n");
      out.write("                        ");

                        while(rs.next())
                        {
                            
      out.write("\n");
      out.write("                            <script>\n");
      out.write("                            Que.push(\"");
      out.print(rs.getString(2));
      out.write("\");\n");
      out.write("                            A.push(\"");
      out.print(rs.getString(3));
      out.write("\");\n");
      out.write("                            B.push(\"");
      out.print(rs.getString(4));
      out.write("\");\n");
      out.write("                            C.push(\"");
      out.print(rs.getString(5));
      out.write("\");\n");
      out.write("                            D.push(\"");
      out.print(rs.getString(6));
      out.write("\");\n");
      out.write("                            ans.push(\"");
      out.print(rs.getString(7));
      out.write("\");\n");
      out.write("                            </script>\n");
      out.write("                        ");

                        }
                }    
            	catch(Exception e1)
		{
			out.println(e1);
		} 
                        
      out.write("\n");
      out.write("<div id=\"question\">\n");
      out.write("<Form action='javaexamdb.jsp' >\n");
      out.write("<table cellpadding=\"10px\">\n");
      out.write("<tr>\n");
      out.write("<th colspan=\"2\">Enter Question <input type=\"text\" id=\"que\" name=\"que\" size=\"100px\" readonly></th>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><input type=\"radio\"  name=\"r\" id='ra' >A</td><td><input type=\"text\" id=\"a\" name=\"A\" size=\"50px\"readonly></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><input type=\"radio\"  name=\"r\" id=\"rb\">B</td><td><input type=\"text\" id=\"b\" name=\"B\"size=\"50px\"readonly></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><input type=\"radio\"  name=\"r\" id=\"rc\">C</td><td><input type=\"text\" id=\"c\"  name=\"C\"size=\"50px\"readonly></td>\n");
      out.write("</tr> \n");
      out.write("<tr>\n");
      out.write("<td><input type=\"radio\"  name=\"r\" id=\"rd\">D</td><td><input type=\"text\" id=\"d\" name=\"D\"size=\"50px\"readonly></td>\n");
      out.write("</tr>\n");
      out.write("<th colspan=\"2\"> \n");
      out.write("    \n");
      out.write("    </th>\n");
      out.write("</table>\n");
      out.write("<input type=\"button\" value=\"prevese\" class=\"b\" onclick=\"prevese();\"><input type=\"button\" value=\"next\" class=\"b\" onclick=\"next();\">\n");
      out.write("<input type=\"submit\" value=\"submit\" class=\"b\">\n");
      out.write("</Form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<p id=\"rm\"></p>\n");
      out.write("</center>\n");
      out.write("</div>\n");
      out.write(" <script type=\"text/javascript\">\n");
      out.write("        var run=0;\n");
      out.write("        var mark=0;\n");
      out.write("        document.getElementById('que').value=Que[run];\n");
      out.write("        document.getElementById('a').value=A[run];\n");
      out.write("        document.getElementById('b').value=B[run];\n");
      out.write("        document.getElementById('c').value=C[run];\n");
      out.write("        document.getElementById('d').value=D[run];\n");
      out.write("            \n");
      out.write("        function next()\n");
      out.write("        {\n");
      out.write("            const str=ans[run];\n");
      out.write("            if(document.getElementById('ra').checked)\n");
      out.write("            {\n");
      out.write("                if(str==\"A\")\n");
      out.write("                {\n");
      out.write("                    mark++;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            else if(document.getElementById('rb').checked)\n");
      out.write("            {\n");
      out.write("                if(str==\"B\")\n");
      out.write("                {\n");
      out.write("                    mark++;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            else if(document.getElementById('rc').checked)\n");
      out.write("            {\n");
      out.write("                if(str==\"C\")\n");
      out.write("                {\n");
      out.write("                    mark++;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            else if(document.getElementById('rd').checked)\n");
      out.write("            {\n");
      out.write("                if(str==\"D\")\n");
      out.write("                {\n");
      out.write("                    mark++;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            document.getElementById('ch').value=mark;\n");
      out.write("            \n");
      out.write("            if(run+1<Que.length)\n");
      out.write("            {\n");
      out.write("               run++;\n");
      out.write("            }\n");
      out.write("            document.getElementById('que').value=Que[run];\n");
      out.write("            document.getElementById('a').value=A[run];\n");
      out.write("            document.getElementById('b').value=B[run];\n");
      out.write("            document.getElementById('c').value=C[run];\n");
      out.write("            document.getElementById('d').value=D[run];\n");
      out.write("            \n");
      out.write("            //$(\"#question\").load(window.location.href + \"#question\");\n");
      out.write("            console.log(run);\n");
      out.write("        }\n");
      out.write("        function prevese()\n");
      out.write("        {\n");
      out.write("            const str=ans[run];\n");
      out.write("            if(document.getElementById('ra').checked)\n");
      out.write("            {\n");
      out.write("                if(str==\"A\")\n");
      out.write("                {\n");
      out.write("                    mark++;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            else if(document.getElementById('rb').checked)\n");
      out.write("            {\n");
      out.write("                if(str==\"B\")\n");
      out.write("                {\n");
      out.write("                    mark++;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            else if(document.getElementById('rc').checked)\n");
      out.write("            {\n");
      out.write("                if(str==\"C\")\n");
      out.write("                {\n");
      out.write("                    mark++;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            else if(document.getElementById('rd').checked)\n");
      out.write("            {\n");
      out.write("                if(str==\"D\")\n");
      out.write("                {\n");
      out.write("                    mark++;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            document.getElementById('ch').value=mark;\n");
      out.write("            if(run>0)\n");
      out.write("            {\n");
      out.write("                run--;\n");
      out.write("            }\n");
      out.write("            document.getElementById('que').value=Que[run];\n");
      out.write("            document.getElementById('a').value=A[run];\n");
      out.write("            document.getElementById('b').value=B[run];\n");
      out.write("            document.getElementById('c').value=C[run];\n");
      out.write("            document.getElementById('d').value=D[run];\n");
      out.write("            //document.getElementById('ch').value=\"mark\";\n");
      out.write("            console.log(run);\n");
      out.write("        }\n");
      out.write("    </script>   \n");
      out.write("    ");
 
}
else{
    response.sendRedirect("Login.jsp");
}
    
      out.write("\n");
      out.write("</body>\n");
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
