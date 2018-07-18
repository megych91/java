<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="UTF-8">
                <title>New License</title>
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
                <link href="https://fonts.googleapis.com/css?family=Knewave|Raleway" rel="stylesheet">
            </head>

            <body>
                <div class="container">
                    <h1>New License</h1>

                    <form:form action="/licenses/process" method="POST" modelAttribute="license" class="form-group">
                        <select name="person">
                            <option>Select A Person</option>
                            <c:forEach items="${persons}" var="person">
                                <option value="${person.id}">${person.fname}</option>
                            </c:forEach>
                        </select>
                        <br>
                        <br>
                        <form:label path="state">State</form:label>
                        <br>
                        <form:input path="state"></form:input>
                        <br>
                        <form:errors path="state"></form:errors>

                        <form:label path="expiration_date">Expiration Date</form:label>
                        <br>
                        <form:input path="expiration_date"></form:input>
                        <br>
                        <form:errors path="expiration_date"></form:errors>

                        <form:label path="number">License No.</form:label>
                        <br>
                        <form:input path="number"></form:input>
                        <br>
                        <form:errors path="number"></form:errors>


                        <br>
                        <button type="submit" class="btn btn-info">Create</button>
                    </form:form>
                </div>
            </body>

            </html>