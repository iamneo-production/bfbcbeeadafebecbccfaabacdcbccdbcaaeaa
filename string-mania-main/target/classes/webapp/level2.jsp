<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" href="./assets/style.css" /> 
		<title>String Mania</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	</head>
	<body>
	
		
	<form action="/jspservlet-app-stringmania/level2" method="post">
	
<div id="container">
<h1>LEVEL 2</h1>
   <div id="inc">
		<h1>STRINGMANIA</h1>
		<div id="box">
		<label id="btext">ENTER A STRING OF YOUR CHOICE</label>
		<input type="text" name="input1" placeholder="ENTER ANY SENTENCE">
		<label id="btext">ENTER A STRING OF YOUR CHOICE</label>
		<input type="text" name="input2" id="txt2" placeholder="ENTER ANY SENTENCE">
		<label id="btext">Choose an operation you would like to perform on your string</label>
		<div id="choice">		
		<div><input type="checkbox" name="contains" value="contacts"><label>CONTAINS</label></div>
		<div><input type="checkbox" name="startsWith" value="starts-with"><label>STARTS WITH</label></div>
		<div><input type="checkbox" name="equalsIgnoreCase" value="equal"><label>EQUAL_SIGN_OR_CASE</label></div>
		<div><input type="checkbox" name="endsWith" value="ends-with"><label>ENDS WITH</label></div>
		<div><input type="checkbox" name="equals" value="equal"><label>EQUAL</label></div>
		<div></div>
		</div>
		
		<button name="seeanswer">SEE ANSWER</button>
		
		<h3><%out.print(request.getAttribute("output")); %></h3>
		
		<button><a href="./level3.jsp">THIRD LEVEL</a></button>
	
	</div>
  </div>
</div>
	</form>
	</body>
</html>