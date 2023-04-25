<html>
<head>
<link rel="stylesheet" href="link.css">
</head>
<body>
    <%@include file="menu1.jsp" %>
<div id="data">
<center>
<Form action="Logindb.jsp">
<table cellpadding="10px">
<tr>
<td>Enter Name</td><td><input type="text" name="un" placeholder="Enter Name"></td>
</tr>
<tr>
<td>Enter password</td><td><input type="password"  placeholder="Enter password" name="up"></td>
</tr>
<th colspan="2">
<input type="submit" class="B" class="B" value="login" > 
</th>
</table>
</Form>
    <% 
        String s1=request.getParameter("s1");
        if(s1!=null)
        {
        %>
        <h2><%= s1%></h2>
        <%
        }
        %>
</center>
</div>
</body>
</html>