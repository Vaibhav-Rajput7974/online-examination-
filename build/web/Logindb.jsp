        <%@page import="java.sql.*" %>
<%
    String s1=request.getParameter("un");
    String s2=request.getParameter("up");
    try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidb?useSSL=false","root","akku");
			Statement st=con.createStatement();
		        ResultSet rs=st.executeQuery("select * from online_login where UNAME='"+s1+"' AND UPASS='"+s2+"'");
                        if(rs.next())
                        {
                           String id=rs.getString(1);
                            session.setAttribute("userId", id );
                            response.sendRedirect("LoginMenu.jsp");
                        }
                        else
                        {
                          response.sendRedirect("Login.jsp?s1=invalid user and password");
                          //String sp="Invalid User And Paddword";
                        }
                }    
            	catch(Exception e1)
		{
			out.println(e1);
		}
    
//		response.sendRedirect("login.html");		
%>