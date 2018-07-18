<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="ISO-8859-1">
                <title>Categories</title>
                <link rel="stylesheet" href="/css/category.css">
                <link href="https://fonts.googleapis.com/css?family=Song+Myung" rel="stylesheet">
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
            </head>

            <body>
                <div class="container">
                    <div class="nav">
		            <a href="/products"><button class="btn btn-default">Create Product</button></a>
		         	<a href="/join"><button class="btn btn-default">Join Categories & Products</button></a>
		            </div>
                    <div class="box">
                        <h1>Create A New Category</h1>
                        <hr>
                        <form:form action="/categories" method="POST" modelAttribute="category">
                            <div class="form-group">
                                <form:label path="name">Name
                                    <br>
                                    <form:input path="name" class="form-control"></form:input>
                                    <br>
                                    <form:errors path="name"></form:errors>
                                </form:label>
                            </div>

                            <div class="form-group">
                                <button type="submit" class="btn btn-info">Create Category</button>
                            </div>
                        </form:form>
                    </div>
                    <div class="box">
                    
                        <table class="table table-hover">
                            <tr class="info">
                                <th>All Categories</th>
                                <th></th>
                            </tr>

                            <c:forEach items="${categories}" var="i">
                                <tr>
                                    <td>
                                        <a href="/categories/${i.id}">${i.name}</a>
                                    </td>
                                    <td align="right">
                                        <form method="post" action="/categories/${i.id}">
                                            <button type="submit" class="btn btn-danger">Remove</button>
                                        </form>
                                    </td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                </div>
            </body>

            </html>