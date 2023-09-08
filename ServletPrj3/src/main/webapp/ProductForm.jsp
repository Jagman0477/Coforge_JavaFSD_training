<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./css/styles.css">
</head>
<body>
<%@ page errorPage="Error1.jsp" %>
<div class="formContainer">
	<form class="form" action="ProductResult.jsp">
		<div class="inputContainer">
			<label>Enter product ID: </label>
			<input name="pId" type="text">
		</div>
		<div class="inputContainer">
			<label>Enter product name: </label>
			<input name="pName" type="text">
		</div>
		<div class="inputContainer">
			<label>Enter product cost: </label>
			<input name="pCost" type="text">
		</div>
		<div class="inputContainerBtn">
			<button type="submit">Submit</button>
			<button type="reset">Reset</button>
		</div>
	</form>
</div>

</body>
</html>