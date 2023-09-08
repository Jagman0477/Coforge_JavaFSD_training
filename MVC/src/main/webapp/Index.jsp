<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	@import url("css/styles.css")
</style>
</head>
<body>
<h1 style="text-align: center;">Loan Application Login</h1>
<div class="formContainer">
	<form action="UserController" class="form">
		
		<div class="inputContainer">
			<label>Enter Id</label> <input id="id" name="id">
		</div>
		<div  class="inputContainer">
			<label>Enter Name</label> <input id="name" name="name">
		</div>

		<div class="inputContainer">
			<label>Enter Salary(Monthly Income)</label> <input id="salary"
				name="salary">
		</div>

		<div class="inputContainer">
			<label>Select Loan Type</label>
			<div>
				<br> <input type="radio" value="homeloan" name="type">HomeLoan<br>
				<input type="radio" value="personalloan" name="type">PersonalLoan
			</div>
		</div>


		<div class="inputContainerBtn">
			<button type="submit">Submit</button> 
			<button type="reset">Reset</button>
		</div>

	</form>
</div>
	
</body>
</html>