<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="css/date.css">
<!--         <script type="text/javascript" src="js/date.js"></script> -->
</head>
<body>
        
      <c:set var = "now" value = "<%= new java.util.Date()%>" />

      
      <p><fmt:formatDate type = "date" pattern = " EEEEEE', the' d'th of 'MMMM',' YYYY"
         value = "${now}" /></p>
      
      
<!--    		<div>
			<script src="js/date.js"></script>
		</div> -->

         <a href="/"><button>Home</button></a>
</body>
</html>