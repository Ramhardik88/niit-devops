<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><%
if(session.getAttribute("username")==null){
	response.sendRedirect("page.jsp");
	
}
%>


<form action="Secondpage" method="post">
NAME:<input type="text" name="userName" ><br/></br>
PASSWORD:<input type="password" name="userPass"><br/></br>
Email:<input type="email" name="userEmail"><br/></br>
COUNTRY:<select name="userCountry"><option>india</option><option>usa</option><option>england</option><option>other</option>
</select>
<input type="submit" value=submit>





</form>
</body>
</html>