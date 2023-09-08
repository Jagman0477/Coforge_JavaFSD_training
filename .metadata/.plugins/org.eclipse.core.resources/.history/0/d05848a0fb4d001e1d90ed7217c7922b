<%@page import="org.apache.catalina.connector.Response"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div
		style="color: brown; border: solid 3px brown; border-radius: 7px; text-align: center; padding: 6px; width: 10%; margin-left: 45%;">
		Date is
		<%=LocalDate.now()%>
	</div>
	
	<!-- Declaration --> 
	<%!
		int count = 1;
		int a = 10, b=20;
		int add(int a, int b){
			return a+b;
		}
	%>
	
	<!-- Scriplet -->
	<%
		out.print("<br>Count is "+count+"<br>");
	%>
	
	<!-- Expression -->
	No. 1 = <%= a %><br>
	No. 2 = <%= b %><br>
	Sum of <%= a %> and <%= b %> = <%= add(a,b) %><br>
	
</body>
</html>