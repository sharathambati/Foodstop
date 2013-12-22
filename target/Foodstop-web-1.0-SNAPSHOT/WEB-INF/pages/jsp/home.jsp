<%-- 
    Document   : home
    Created on : Dec 21, 2013, 12:49:36 PM
    Author     : Sharath
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <p>
            {message}</br>
            <a href="${pageContext.request.contextPath}/restaurant/add.html">Add new restaurant</a><br>
            <a href="${pageContext.request.contextPath}/restaurant/list.html">List Restaurants</a><br>
        </p>    

        
    </body>
</html>
