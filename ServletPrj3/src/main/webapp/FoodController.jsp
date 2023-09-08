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
	String foodType = request.getParameter("fType");

	if(foodType.equals("North Indian")){
	%>
		<jsp:forward page="NorthIndian.jsp"></jsp:forward>
	<%
		} else if(foodType.equals("South Indian")){
	%>
		<jsp:forward page="SouthIndian.jsp"></jsp:forward>
	<%	
		}
	%>
	
</body>
</html>