<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Dojo Survey Index</title>
        <link rel="stylesheet" type="text/css" href="/css/index.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    </head>

    <body>
        <div class="container">
            <form class="form-horizontal" method="POST" action="/process">
            <h1>Dojo Survey!</h1><br>
                <div class="form-group form-group-lg">
                    <label for="name" class="col-sm-2 control-label">Name</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="name" placeholder="Enter Name">
                    </div>
                </div>
                <div class="form-group form-group-sm">
                    <label for="location" class="col-sm-2 control-label">Dojo Location</label>
                    <div class="col-sm-10">
                        <select class="form-control" name="location">
                            <option>Los Angeles</option>
                            <option>Chicago</option>
                            <option>Tyson's Corner</option>
                            <option>Dallas</option>
                            <option>Silicon Valley</option>
                          </select>
                    </div>
                </div>
                <div class="form-group form-group-sm">
                    <label for="language" class="col-sm-2 control-label">Favorite Language</label>
                    <div class="col-sm-10">
                        <select class="form-control" name="language">
                            <option>Python</option>
                            <option>M.E.A.N.</option>
                            <option>HTML</option>
                            <option>Java</option>
                          </select>
                    </div>
                </div>
                <div class="form-group form-group-sm">
                    <label for="comments" class="col-sm-2 control-label">Comments</label>
                    <div class="col-sm-10">
                        <textarea class="form-control" rows="3" name="comments"></textarea>
                    </div>
                </div>
                <div class="form-group form-group-sm">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-info">Submit</button>
                    </div>
                </div>
            </form>
        </div>
    </body>

    </html>