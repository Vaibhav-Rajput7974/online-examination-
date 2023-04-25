<%@page import="java.sql.*" %>
<%
     try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidb?useSSL=false","root","akku");
			Statement st=con.createStatement();
			st.executeUpdate("update user set JAVAM='"+mark+"' ");
     }catch(Exception e)
     {
         out.println(e);
     }
    %>