<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
			<!DOCTYPE html>
			<html>

			<head>
				<meta charset="UTF-8">
				<title>Languages</title>
				<link rel="stylesheet" href="/css/index.css">
				<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
				<link href="https://fonts.googleapis.com/css?family=Encode+Sans+Condensed:600" rel="stylesheet">
			</head>

			<body>
				<div class="container">
					<div class="box1">
						<h1>Languages</h1>
						<br>

						<form:form action="/languages" method="POST" modelAttribute="language">
							<div class="form-group">
								<form:label path="name">Name of Language
									<br>
									<form:input path="name"></form:input>
									<br>
									<form:errors path="name"></form:errors>
								</form:label>
							</div>
							<br>
							<div class="form-group">
								<form:label path="creator">Creator's Name
									<br>
									<form:input path="creator"></form:input>
									<br>
									<form:errors path="creator"></form:errors>
								</form:label>
							</div>
							<br>
							<div class="form-group">
								<form:label path="version">Language Version
									<br>
									<form:input path="version"></form:input>
									<br>
									<form:errors path="version"></form:errors>
								</form:label>
							</div>
							<br>
							<button type="submit" class="btn btn-success">Create Language</button>
						</form:form>
					</div>


					<div class="box2">
						<c:forEach items="${languages}" var="i">
							<h1>
								<a href="/languages/${i.id}">${i.name}</a>
								</h1>
									<p>Creator
										<br>
										<i>${i.creator}</i>
									</p>
									<p>Version ${i.version}</p>
									<a href="/languages/${i.id}/update">Edit</a>
									<br>
									<form method="post" action="/languages/${i.id}">
										<button type="submit" class="btn btn-info" value="Delete ${i.name}">Delete</button>
									</form>
									<br>
									<hr>
						</c:forEach>
					</div>
				</div>
			</body>

			</html>