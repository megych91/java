<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="ISO-8859-1">
                <title>Join Page</title>
                <link rel="stylesheet" href="/css/join.css">
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
            </head>

            <body>
            	<div class="nav">
		            <a href="/products"><button class="btn btn-default">Create Product</button></a>
		            <a href="/categories"><button class="btn btn-default">Create Category</button></a>
		        </div>
                <div class="box">
                <h1>Join Products & Categories</h1>
                <hr>
                    <form action="/join" method="POST">
                     <div class="form-group">
                        <h4>Select A Product</h4>
                            <select name="productId">
                                <c:forEach items="${ products }" var="product">
                                    <option value="${product.id}">${product.name}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <br>
                        <div class="form-group">
                        <h4>Select A Category</h4>
                            <select name="categoryId">
                                <c:forEach items="${ categories }" var="category">
                                    <option value="${category.id}">${category.name}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="form-group">
                            <button type="submit" class="btn btn-info">Join</button>
                        </div>
                    </form>

                </div>
            </body>

            </html>