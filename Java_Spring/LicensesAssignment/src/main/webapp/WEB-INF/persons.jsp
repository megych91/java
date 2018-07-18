<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="UTF-8">
                <title>New Person</title>
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
                <link href="https://fonts.googleapis.com/css?family=Knewave|Raleway" rel="stylesheet">
            </head>

            <body>
                <div class="container">
                    <h1>New Person</h1>

                    <form:form action="/persons/process" method="POST" modelAttribute="person" class="form-group">
                        <form:label path="fname">First Name</form:label>
                        <br>
                        <form:input path="fname"></form:input>
                        <br>
                        <form:errors path="fname"></form:errors>
                        <br>

                        <form:label path="lname">Last Name</form:label>
                        <br>
                        <form:input path="lname"></form:input>
                        <br>
                        <form:errors path="lname"></form:errors>
                        <br>
                        <button type="submit" class="btn btn-info">Create</button>
                    </form:form>
                </div>
            </body>

            </html>