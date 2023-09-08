<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	@import url("css/styles.css");
</style>
</head>
<body>
<%@ page errorPage="Error1.jsp" %>
	<%
		int id = Integer.parseInt(request.getParameter("pId"));
		String name = request.getParameter("pName");
		float cost = Float.parseFloat(request.getParameter("pCost"));
	%>

	<div class="formContainer">
	<form class="form">
		<div class="inputContainer">
			<label>Enter product ID: </label><%= id %>
		</div>
		<div class="inputContainer">
			<label>Enter product name: </label><%= name %>
		</div>
		<div class="inputContainer">
			<label>Enter product cost: </label><%= cost %>
		</div>
	</form>
</div>
</body>
</html>