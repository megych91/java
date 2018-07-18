<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="ISO-8859-1">
                <title>Products</title>
                <link rel="stylesheet" href="/css/product.css">
                <link href="https://fonts.googleapis.com/css?family=Song+Myung" rel="stylesheet">
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
            </head>

            <body>
            <div class="nav">
            <a href="/categories"><button class="btn btn-default">Create Category</button></a>
            <a href="/join"><button class="btn btn-default">Join Categories & Products</button></a>
            </div>
            <div class="box">
                <h1>Products</h1>
				<hr>
                <form:form action="/products" method="POST" modelAttribute="product">
                    <div class="form-group">
                        <form:label path="name">Name
                            <form:input path="name" class="form-control" type="text"></form:input>
                            <br>
                            <form:errors path="name"></form:errors>
                        </form:label>
                    </div>
                     <div class="form-group">
                        <form:label path="cost">Cost
                            <form:input path="cost" class="form-control" type="text" value="$0.00" ></form:input>
                            <br>
                            <form:errors path="cost"></form:errors>
                        </form:label>
                    </div>
                     <div class="form-group">
                        <form:label path="description">Description
                            <form:input path="description" class="form-control" type="text"></form:input>
                            <br>
                            <form:errors path="description"></form:errors>
                        </form:label>
                    </div>
                    <div class="form-group">
                        <button type="submit" class="btn btn-info">Create Product</button>
                    </div>
                </form:form>
                
                </div>
                <div class="box">
				<h3>All Products</h3>
				<hr>
                <table class="table table-hover">
                    <tr class="info">
                        <th>Name</th>
                        <th>Cost</th>
                        <th align="right">Action</th>
                    </tr>

                    <c:forEach items="${products}" var="i">
                        <tr>
                            <td>
                                <a href="/products/${i.id}">${i.name}</a>
                            </td>
                            <td>$ ${ i.cost }</td>
                            <td>
                                <form method="post" action="/products/${i.id}">
                                	<button type="submit" class="btn btn-danger">Remove</button>
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
			</div>
            </body>

            </html>