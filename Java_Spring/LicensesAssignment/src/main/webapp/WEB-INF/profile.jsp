<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Profile Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link href="https://fonts.googleapis.com/css?family=Knewave|Raleway" rel="stylesheet">
    </head>

    <body>
        <div class="container">
            <h1> ${person.fname}'s Profile</h1>
            <table class="table table-hover">
                <tr class="info">
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>License No.</th>
                    <th>State</th>
                    <th>Expiration Date</th>
                </tr>
                <tr>
                    <td>${person.fname}</td>
                    <td>${person.lname}</td>
                    <td>${person.license.number}</td>
                    <td>${person.license.state}</td>
                    <td>${person.license.expiration_date}</td>
                </tr>
            </table>
            
            
        </div>
    </body>

    </html>