<%-- 
    Document   : result.jsp
    Created on : 11 Apr, 2023, 10:22:21 PM
    Author     : hp
--%>
        <%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


        <%@page import="java.sql.*" %>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="link.css" >
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>student Result </title>
    </head>
    <body>
<div id="mymenu">
<center>

<Form >
    <input type="hidden" value="python" name="subject">
<table cellpadding="10px">
<tr>
<th colspan="4"> Name </th>  <th colspan="2"> Contact </th> 
<th colspan="4"> Java   Mark </th>
<th colspan="4"> PHP    Mark </th>
<th colspan="4"> CPP   Mark </th>
<th colspan="4"> PYTHON   Mark </th>
</tr>

<tr></tr>
<tr></tr>
<tr></tr>


<%
    String studentId=(String)session.getAttribute("userId");
    try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidb?useSSL=false","root","akku");
			Statement st=con.createStatement();
		        ResultSet rs=st.executeQuery("select * from online_login where UNAME='"+studentId+"' ") ;
                        if(rs.next())
                        {
%>

<tr>
    <td colspan="4"> <%= rs.getString(1) %></td>  <th colspan="2"> <%= rs.getString(3) %> </th> 
<td colspan="4"> <%= rs.getString(4) %> </td>
<td colspan="4"> <%= rs.getString(5) %> </td>
<td colspan="4"> <%= rs.getString(6) %> </td>
<td colspan="4"> <%= rs.getString(7) %> </td>
</tr>


<%
                            
                        }
                }    
            	catch(Exception e1)
		{
			out.println(e1);
		}
%>
</table>
</Form>
</center>
</div>
    </body>
</html>
