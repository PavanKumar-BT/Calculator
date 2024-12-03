<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	Welcome to My Calculator.
	
	<form action="Addition">
		
		<br><br><br>
		<label for="num1">Enter The values Number </label>
        <input type="text" id="num1" name="num1"><br><br>
		<input type="submit" value="Addition">
		<br>
	</form>
	<form action="Multiplication">
		
		<br><br><br>
		<label for="num1">Enter The values Number </label>
        <input type="text" id="num1" name="num1"><br><br>
		<input type="submit" value="Multiplication">
	</form>
	
	<form action="Division">
		<br><br><br>
		<label for="num1">Enter The Two values and separated by comma</label>
		<input type="text" id="num1" name="num1"><br><br>
		<input type="submit" value="Dividion">
	</form>
	<form action="Subtraction">
		<br><br><br>
		<label for="num1">Enter the Two numbers saparated by comma</label>
		<input type="text" id="num1" name="num1"><br><br>
		<input type="submit" value="Subtraction">
	
		
	</form>

</body>
</html>