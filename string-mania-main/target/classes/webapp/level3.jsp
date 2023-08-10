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
	
		
	<form action="/jspservlet-app-stringmania/level3"  method="post">
	
<div id="container">
<h1>LEVEL 3</h1>
   <div id="inc">
		<h1>STRINGMANIA</h1>
		<div id="box">
		<label id="btext">ENTER A STRING OF YOUR CHOICE</label>
		<input name="input1" type="text" placeholder="ENTER ANY SENTENCE">
		<label id="btext">ENTER A STRING OF YOUR CHOICE</label>
		<input name="input2" type="text" id="txt2" placeholder="ENTER ANY SENTENCE">
		<label id="btext">Choose an operation you would like to perform on your string</label>
		<div id="choice">		
		<div><input type="checkbox" name="concatenation" value="concatenate"><label>CONCATENATE</label></div>
		<div><input type="checkbox" name="split" value="split"><label>SPLIT</label></div>
		<div><input type="checkbox" name="indexOf" value="indexof"><label>INDEX OF</label></div>
		<div></div>
		<div></div>
		</div>
		
		<button name="seeanswer">SEE ANSWER</button>
		
		<h3><%out.print(request.getAttribute("output")); %></h3>
		
		<button name="end">END</button>
	
	</div>
  </div>
</div>
	</form>
	</body>
</html>