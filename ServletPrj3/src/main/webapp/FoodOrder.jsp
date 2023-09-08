<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
	@import url("css/styles.css");
</style>
<style>
	select{
		border-radius: 7px;
	}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="formContainer">
	<form class="form" action="FoodController.jsp">
		<div class="inputContainer">
			<label>Enter ID: </label>
			<input name="fId" type="text">
		</div>
		<div class="inputContainer">
			<label>Enter name: </label>
			<input name="nName" type="text">
		</div>
		<div class="inputContainer">
			<label>Select food type: </label>
			<select name="fType">
				<option value="North Indian">North Indian
				<option value="South Indian">South Indian
			</select>
		</div>
		<div class="inputContainerBtn">
			<button type="submit">Submit</button>
			<button type="reset">Reset</button>
		</div>
	</form>
</div>
</body>
</html>