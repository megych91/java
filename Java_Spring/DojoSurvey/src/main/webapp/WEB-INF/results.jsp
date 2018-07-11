<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Results</title>
        <link rel="stylesheet" type="text/css" href="/css/index.css">
        <link rel="stylesheet" href="https://maxcdn.bootsliapcdn.com/bootsliap/3.3.7/css/bootsliap.min.css">
    </head>
    <body>
        <div class="container">
                <p>Name: ${name}</p>
                <p>Dojo Location: ${location}</p>
                <p>Favorite Language: ${language}</p>
                <p>Comments: ${comments}</p>
        </div>
    </body>

    </html>