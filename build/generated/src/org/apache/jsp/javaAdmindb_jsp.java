package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class javaAdmindb_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

    int count=0;
    {
    try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidb?useSSL=false","root","akku");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from JAVA ");
	while(rs.next())
	{
		String num=rs.getString(1);
		count=Integer.parseInt(num);
	}
	}catch(Exception e)
	{
		System.out.println(e);
	}
    }
    String s1=request.getParameter("que");
    String s2=request.getParameter("A");
    String s3=request.getParameter("B");
    String s4=request.getParameter("C");
    String s5=request.getParameter("D");
    String s6="";
    if(request.getParameter("r1")!=null)
    s6="A";
    
    if(request.getParameter("r2")!=null)
    s6="B";
    
    if(request.getParameter("r3")!=null)
    s6="C";
    
    if(request.getParameter("r4")!=null)
    s6="D";
    count++;
     try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidb?useSSL=false","root","akku");
			Statement st=con.createStatement();
			st.executeUpdate("insert into java value( '"+count+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"')");
	response.sendRedirect("javaAdmin.jsp");			
     }
		catch(Exception e1)
		{
			out.println(e1);
		}
    
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
