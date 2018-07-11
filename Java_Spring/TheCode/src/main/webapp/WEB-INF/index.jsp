<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
		<!DOCTYPE html>
		<html>

		<head>

			<meta charset="UTF-8">
			<title>Secret Code</title>
			<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
			<link rel="stylesheet" type="text/css" href="/css/index.css">
			<link href="https://fonts.googleapis.com/css?family=Russo+One" rel="stylesheet">

		</head>

		<body>
			<div class="container">
				<p>
					<c:out value="${error}"></c:out>
				</p>
				<form method="POST" action="/process">
					<div class="form-group">
						<h1>Input Code</h1>
						<br>
						<input type="text" class="form-control" name="code">
					</div>
						<button type="submit" class="btn btn-info">Try Code</button>
					</a>
				</form>

			</div>
		</body>

		</html>