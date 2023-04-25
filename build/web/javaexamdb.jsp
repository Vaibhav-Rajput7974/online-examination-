        <%@page import="java.sql.*" %>
<%
    String s1=request.getParameter("mar");
    String d=request.getParameter("subject");
    String studentId=(String)session.getAttribute("userId");
    //String s2=request.getParameter("up");
    //String s3=request.getParameter("uc");
    try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		 	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidb?useSSL=false","root","akku");
			Statement st=con.createStatement();
			st.executeUpdate("update online_login set "+d+"='"+s1+"' where UNAME='"+studentId+"' ");
		}
		catch(Exception e1) 
		{
			out.println(e1);
		}
    response.sendRedirect("result.jsp");
%>
<%= d %>