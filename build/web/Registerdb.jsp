        <%@page import="java.sql.*" %>
<%
    String s1=request.getParameter("un");
    String s2=request.getParameter("up");
    String s3=request.getParameter("uc");
    try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidb?useSSL=false","root","akku");
			Statement st=con.createStatement();
			st.executeUpdate("insert into online_login value('"+s1+"','"+s2+"','"+s3+"','"+0+"','"+0+"','"+0+"','"+0+"','"+0+"')");
		}
		catch(Exception e1)
		{
			out.println(e1);
		}response.sendRedirect("Login.jsp");		
%>