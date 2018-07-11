<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "java.io.*,java.util.*" %>
<%@ page import = "javax.servlet.*,java.text.*" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Time</title>
	<link href="css/time.css" rel="stylesheet">
</head>
<body>
	<p>
      <%
         Date dNow = new Date( );
         SimpleDateFormat ft = 
         new SimpleDateFormat ("hh:mm a");
         out.print( "<h2 align=\"center\">" + ft.format(dNow) + "</h2>");
      %>
      </p>
      <a href="/"><button>Home</button></a>
      
<!--       		<div>
			<script src="js/time.js"></script>
		</div> -->

   </body>
</html>