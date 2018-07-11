<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
			<!DOCTYPE html>
			<html>

			<head>
				<meta charset="UTF-8">
				<title>Update</title>
				<link rel="stylesheet" href="/css/update.css">
				<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
				<link href="https://fonts.googleapis.com/css?family=Encode+Sans+Condensed:600" rel="stylesheet">
			</head>

			<body>
				<div class="container">
															<h1>${language.name}</h1>
							<hr>
				<div class="navbar">
						<div class="form-group">

							<a href="/languages" class="btn btn-success">Dashboard</a>
							<form method="post" action="/languages/${language.id}">
								<button type="submit" class="btn btn-success">Delete</button>
							</form>
						</div>
				</div>
						<br><div class="main">
						<form:form action="/languages/${language.id}/update" method="POST" modelAttribute="language">
						<div class="form-group">
							<form:label path="name">Update Name
								<br>
								<form:input path="name" style="color:palevioletred;"></form:input>
								<form:errors path="name"></form:errors>
								<br>
							</form:label>
						</div>
						<br>
						<div class="form-group">
							<form:label path="creator">Update Creator
								<br>
								<form:input path="creator" style="color:palevioletred;"></form:input>
								<form:errors path="creator"></form:errors>
							</form:label>
						</div>
						<br>
						<div class="form-group">
							<form:label path="version">Update Version
								<br>
								<form:input path="version" style="color:palevioletred;"></form:input>
								<form:errors path="version"></form:errors>
							</form:label>
						</div>
						<br>
						<br>
						<button type="submit" class="btn btn-info" value="Update">Update Language</button>
						<hr>
					</form:form>
</div>
				</div>
			</body>

			</html>