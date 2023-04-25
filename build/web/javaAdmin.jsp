<html>
<head>
<link rel="stylesheet" href="link.css">
</head>
<body>
    <div id="mymenu">
<ul>
    <a  href="javaAdmin.jsp">
    <li>
        JAVA
    </li>
    </a>
    
    <a href="phpAdmin.jsp">
    <li>
        PHP
    </li>
    </a>
    
    <a href="cppAdmin.jsp">
    <li>
        C++
    </li>
    </a>
    
    
    <a href="pythonadmin.jsp">
    <li>
        Phyton
    </li>
    </a>
    
</ul>
        </div>

    <div id="mymenu">
<center>

<Form action="javaAdmindb.jsp">
    
<table cellpadding="10px">
<tr>
<th colspan="2">Enter Question <input type="text" name="que" size="100px"></th>
</tr>
<tr>
    <td><input type="radio" name="r" value ="a">A</td><td><input type="text" name="A" size="50px"></td>
</tr>
<tr>
<td><input type="radio" name="r"value ="b">B</td><td><input type="text" name="B" size="50px"></td>
</tr>
<tr>
<td><input type="radio" name="r" value ="c">C</td><td><input type="text" name="C" size="50px"></td>
</tr> 
<tr>
<td><input type="radio" name="r" value ="d">D</td><td><input type="text" name="D" size="50px"></td>
</tr>
<tr>
<th colspan="2"> 
<input type="submit" class="B" value="submit" name="b1"> 
</th>
</table>
<input type="hidden" value="java" name="subject">
</Form>
</center>
</div>
</body>
</html>