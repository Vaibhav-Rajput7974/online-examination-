
<%@page import="java.sql.*" %>
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
    
    <script>
const NUM = [];
const Que = [];
const A = [];
const B = [];
const C = [];
const D = [];
const ans=[];
    </script>
    <%@include  file="menu2.jsp" %>
    <div>
<center>
<%
    try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhidb?useSSL=false","root","akku");
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs=st.executeQuery("select * from python");
                        rs.first();
                        //rs.next();
                        %>
                        <script>
                            NUM.push(1);
                            Que.push("<%=rs.getString(2)%>");
                            A.push("<%=rs.getString(3)%>");
                            B.push("<%=rs.getString(4)%>");
                            C.push("<%=rs.getString(5)%>");
                            D.push("<%=rs.getString(6)%>");
                            ans.push("<%=rs.getString(7)%>");
                            
                        </script>
                        <%
                        while(rs.next())
                        {
                            %>
                            <script>
                            Que.push("<%=rs.getString(2)%>");
                            A.push("<%=rs.getString(3)%>");
                            B.push("<%=rs.getString(4)%>");
                            C.push("<%=rs.getString(5)%>");
                            D.push("<%=rs.getString(6)%>");
                            ans.push("<%=rs.getString(7)%>");
                            </script>
                        <%
                        }
                }    
            	catch(Exception e1)
		{
			out.println(e1);
		} 
                        %>
<div id="question">
<Form action='javaexamdb.jsp' >
<table cellpadding="10px">
<tr>
<th colspan="2">Enter Question <input type="text" id="que" name="que" size="100px" readonly></th>
</tr>
<tr>
<td><input type="radio"  name="r" id='ra' >A</td><td><input type="text" id="a" name="A" size="50px"readonly></td>
</tr>
<tr>
<td><input type="radio"  name="r" id="rb">B</td><td><input type="text" id="b" name="B"size="50px"readonly></td>
</tr>
<tr>
<td><input type="radio"  name="r" id="rc">C</td><td><input type="text" id="c"  name="C"size="50px"readonly></td>
</tr> 
<tr>
<td><input type="radio"  name="r" id="rd">D</td><td><input type="text" id="d" name="D"size="50px"readonly></td>
</tr>
<th colspan="2"> 
    
    </th>
</table>
<input type="button" value="prevese" class="b" onclick="prevese();"><input type="button" value="next" class="b" onclick="next();">
<input type="submit" value="submit" class="b">
<input type="hidden" id="ch" name="mar">
<input type="hidden"  value="python" name="subject" >
</Form>
</div>

<p id="rm"></p>
</center>
</div>
 <script type="text/javascript">
        var run=0;
        var mark=0;
        document.getElementById('que').value=Que[run];
        document.getElementById('a').value=A[run];
        document.getElementById('b').value=B[run];
        document.getElementById('c').value=C[run];
        document.getElementById('d').value=D[run];
            
        function next()
        {
            const str=ans[run];
            if(document.getElementById('ra').checked)
            {
                if(str=="A")
                {
                    mark++;
                }
            }
            else if(document.getElementById('rb').checked)
            {
                if(str=="B")
                {
                    mark++;
                }
            }
            else if(document.getElementById('rc').checked)
            {
                if(str=="C")
                {
                    mark++;
                }
            }
            else if(document.getElementById('rd').checked)
            {
                if(str=="D")
                {
                    mark++;
                }
            }
            document.getElementById('ch').value=mark;
            
            if(run+1<Que.length)
            {
               run++;
            }
            document.getElementById('que').value=Que[run];
            document.getElementById('a').value=A[run];
            document.getElementById('b').value=B[run];
            document.getElementById('c').value=C[run];
            document.getElementById('d').value=D[run];
            
            //$("#question").load(window.location.href + "#question");
            console.log(run);
        }
        function prevese()
        {
            const str=ans[run];
            if(document.getElementById('ra').checked)
            {
                if(str=="A")
                {
                    mark++;
                }
            }
            else if(document.getElementById('rb').checked)
            {
                if(str=="B")
                {
                    mark++;
                }
            }
            else if(document.getElementById('rc').checked)
            {
                if(str=="C")
                {
                    mark++;
                }
            }
            else if(document.getElementById('rd').checked)
            {
                if(str=="D")
                {
                    mark++;
                }
            }
            document.getElementById('ch').value=mark;
            if(run>0)
            {
                run--;
            }
            document.getElementById('que').value=Que[run];
            document.getElementById('a').value=A[run];
            document.getElementById('b').value=B[run];
            document.getElementById('c').value=C[run];
            document.getElementById('d').value=D[run];
            //document.getElementById('ch').value="mark";
            console.log(run);
        }
    </script>   
    <% 
}
else{
    response.sendRedirect("Login.jsp");
}
    %>
</body>
</html>