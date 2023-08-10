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
	
		
	<form action="/jspservlet-app-stringmania/level1" method="post">
	
<div id="container">
<h1>LEVEL 1</h1>
   <div id="inc">
		<h1>STRINGMANIA</h1>
		<div id="box">
		<label id="btext">ENTER A STRING OF YOUR CHOICE</label>
		<input type="text" name="input" placeholder="ENTER ANY SENTENCE">
		
		<label id="btext">Choose an operation you would like to perform on your string</label>
		<div id="choice">		
		<div><input type="checkbox" name="lowercase" value="lowercase"><label>LOWERCASE</label></div>
		<div><input type="checkbox" name="uppercase" value="uppercase"><label>UPPERCASE</label></div>
		<div><input type="checkbox" name="length" value="stringlength"><label>STRING LENGTH</label></div>
		<div><input type="checkbox" name="trim" value="trim"><label>TRIM</label></div>
		<div><input type="checkbox" name="firstcharacter" value="firstchar"><label>FIRST CHARACTER</label></div>
		<div></div>
		</div>
		
		<button name="seeanswer">SEE ANSWER</button>
		
		<h3><%out.print(request.getAttribute("output")); %></h3>
				
		<button name="secondlevel"><a href="./level2.jsp">SECOND LEVEL</a></button>
	
	</div>
  </div>
</div>
	</form>
	</body>
</html>