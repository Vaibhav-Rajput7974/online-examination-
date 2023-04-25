  
<html>
<head>
<link rel="stylesheet" href="link.css">
</head>
<body>
    <% 
    String s2=(String)session.getAttribute("userId");
if(s2 != null)
{
%>

    <%@include file="menu1.jsp" %>
<div id="data">
<center>
    <a href="exam.jsp">
<h2>
Exam
</h2>
</a>
    <a href="profile.jsp">
<h2>
Profile
</h2>
        </a>
<a href="result.jsp">
<h2>
Result
</h2>
</a>
    
        <%= s2 %>
</center>
</div>
    <% 
}
else{
    response.sendRedirect("Login.jsp");
}
    %>
    
</body>
</html>

