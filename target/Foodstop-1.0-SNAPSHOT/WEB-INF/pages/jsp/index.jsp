<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <h1>Home JSP Page</h1>
        <p>
            <a href="${pageContext.request.contextPath}/restaurant/add.html">Add new restaurant</a><br>
            <a href="${pageContext.request.contextPath}/restaurant/list.html">List Restaurants</a><br>
        </p>    
    </body>
</html>
