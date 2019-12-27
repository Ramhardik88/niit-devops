<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
if(session.getAttribute("username")==null)
{
	response.sendRedirect("Login.jsp");
}
%>
<table>
	<tr><td colspan="4"><center><b>REGISTRATION FORM</b></center></td></tr>
	<tr><td>NAME:</td><td><input type="text" placeholder="Enter your name" required></td></tr>
	<tr><td>FATHER'S NAME:</td><td><input type="text" placeholder="Enter your father's name" required></td></tr>
	<tr><td>COLLEGE NAME:</td><td><input type="text" placeholder="Enter your college name" required></td></tr>
	<tr><td>AGE:</td><td><input type="number" name="quantity" min="0" max="50" required></td></tr>
	<tr><td>DOB:</td><td><input type="date" name="date" required></td></tr>
	<tr><td>EMAIL ID:</td><td><input type="email" name="usremail" placeholder="Enter your email id" required></td></tr>
	<tr><td>CONTACT NUMBER:</td><td><input type="tel" name="usrtel" placeholder="Enter your phone number"></td></tr>
	<tr><td>SEX:</td><td><input type="radio" name="rd1">Male<input type="radio" name="rd2">Female</td></tr>
	<tr><td>ADDRESS:</td><td><textarea rows="3" cols="16">Enter your address here </textarea></td></tr>
	<tr><td>STATE:</td><td><select><option>Select your state</option><option>Tamilnadu</option><option>Gujarat</option><option>Kerala</option><option>Karnataka</option><option>Madhya pradesh</option></select></td></tr>
	<tr><td>LANGUAGES KNOWN:</td><td><select><option>Select the languages you know</option><option>Tamil</option><option>English</option><option>Hindi</option></select></td></tr>
	<tr><td>EDU. QUA.:</td><td><input type="text" placeholder="Enter edu. quali."></td></tr>
	
</table>
<a href="NewFile.jsp"><button>submit</button></a>


</body>
</html>