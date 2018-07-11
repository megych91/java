<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
			<!DOCTYPE html>
			<html>

			<head>
				<meta charset="UTF-8">
				<title>Language Profile</title>
				<link rel="stylesheet" href="/css/profile.css">
				<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
				<link href="https://fonts.googleapis.com/css?family=Encode+Sans+Condensed:600" rel="stylesheet">
			</head>

			<body>
				<div class="container">
					<div class="navbar">
						<a href="/languages" class="btn btn-success">Dashboard</a>
						<a href="/languages/${language.id}/update" class="btn btn-success">Edit</a>
						<form method="post" action="/languages/${language.id}">
								<button type="submit" class="btn btn-success"" value="Delete ${i.name}">Delete</button>
						</form>
					</div>
					<div class="profile">
						<hr>
						<h1 style="color:palevioletred;">Language</h1>
						<h4>${language.name}</h4>
						<br>
						<h1 style="color:palevioletred;">Creator</h1>
						<h4>${language.creator}</h4>
						<br>
						<h1 style="color:palevioletred;">Version</h1>
						<h4>${language.version}</h4>
					</div>
				</div>
			</body>

			</html>