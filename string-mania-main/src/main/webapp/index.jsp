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
	
		
	<form action="/jspservlet-app-stringmania" method="post">
	
<div id="container">
<h1>CHOOSE A LEVEL TO EXPLORE</h1>
   <div id="inc">
		<h1>STRINGMANIA</h1>
		<div id="box">
		<button><a href="./level1.jsp">BASIC</a></button>
		<button><a href="./level2.jsp">MEDIUM</a></button>
		<button><a href="./level3.jsp">ADVANCED</a></button>
	</div>
  </div>
</div>
	</form>
	</body>
</html>