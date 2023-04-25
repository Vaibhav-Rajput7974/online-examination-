<%@page import="java.sql.*" %>
<%
    String sub=request.getParameter("subject");
    int count=0;
    {
    try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidb?useSSL=false","root","akku");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from  "+sub+"");
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
    s6=request.getParameter("r");
    count++;
     try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidb?useSSL=false","root","akku");
			Statement st=con.createStatement();
			st.executeUpdate("insert into "+sub+" value( '"+count+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"')");
	response.sendRedirect("javaAdmin.jsp");			
     }
		catch(Exception e1)
		{
			out.println(e1);
		}
    %>
    <% request.getParameter("r"); %>