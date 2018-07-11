<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Date</title>
	<link href="css/date.css" rel="stylesheet">
</head>
<body>

      <c:set var = "now" value = "<%= new java.util.Date()%>" />

      
      <p><fmt:formatDate type = "date" pattern = " EEEEEE', the' d'th of 'MMMM',' YYYY"
         value = "${now}" /></p>
      
      
   		<div>
			<script src="js/date.js"></script>
		</div>

   </body>
</html>