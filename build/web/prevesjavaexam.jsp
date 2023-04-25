<%@page import="java.sql.*" %>
<html>
<head>
<link rel="stylesheet" href="link.css">
</head>
<body>
    <%@include  file="menu2.jsp" %>>
    <%!int x=0; 
    int mark=0;
    %>
    <div>
<center>
    
<h2>
    <%=x %>
    <%=mark %>
    
</h2>
<% 
    try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidb?useSSL=false","root","akku");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from java where NUM='"+x+"'");
		       if(rs.next())
                       {
                       %>
<Form action="javaexam.jsp">
<table cellpadding="10px">
<tr>
<th colspan="2">Enter Question <input type="text" id="a" name="que" value="<%=rs.getString(2)%>" size="100px"></th>
</tr>
<tr>
<td><input type="radio"name="r"  >A</td><td><input type="text" name="A" value="<%=rs.getString(3)%>"size="50px"></td>
</tr>
<tr>
<td><input type="radio" name="r" >B</td><td><input type="text" name="B"value="<%=rs.getString(4)%>" size="50px"></td>
</tr>
<tr>
<td><input type="radio" name="r" >C</td><td><input type="text" name="C" value="<%=rs.getString(5)%>"size="50px"></td>
</tr> 
<tr>
<td><input type="radio" name="r" >D</td><td><input type="text" name="D"value="<%=rs.getString(6)%>" size="50px"></td>
</tr>
<tr>
<th colspan="2"> 
    <input type="submit" class="B" value="next" name="b1">
</th>
</table>
</Form>
    <form action="prevesjavaexam.jsp">
<input type="submit" class="B" value="submit" name="b2"> 
    </form>
<%
                       }
                       else
                       {
                        %>
<Form action="javaexam.jsp">
<table cellpadding="10px">
    <th colspan="2"> 
<input type="submit" class="B" value="next" name="b1"> 
</th>
</table>
</Form>
<form action="prevesjavaexam.jsp">
<input type="submit" class="B" value="submit" name="b2"> 
</form>
<%
                       
                       
                       }
                       }    
            	catch(Exception e1)
		{
			out.println(e1);
		} 
    
%>
</center>
</div>
</body>
</html>