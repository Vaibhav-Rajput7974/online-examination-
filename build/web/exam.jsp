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
    <%@include file="menu2.jsp" %>   
    <% 
}
else{
    response.sendRedirect("Login.jsp");
}
    %>
</body>
</html>