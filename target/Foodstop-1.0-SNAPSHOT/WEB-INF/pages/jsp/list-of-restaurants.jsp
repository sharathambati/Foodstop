<%-- 
    Document   : list-of-restaurants
    Created on : Dec 21, 2013, 5:00:17 PM
    Author     : Sharath
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Restaurants</title>
    </head>
    <body>
        <h1>List of restaurants</h1>
        <table width="30%" border="1" cellpadding="2" cellspacing="2" style="background-color: #ffffff;">
            <thead>
                <tr>
                    <th width="5%">Id</th>
                    <th width="20%">Name</th>
                    <th width="5%">Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="restaurant" items="${restaurants}">
                    <tr>
                        <td width="5%">${restaurant.id}</td>
                        <td width="20%">${restaurant.name}</td>
                        <td width="5%">
                            <a href="#">Edit</a>
                            <a href="#">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <p>
            <a href="${pageContext.request.contextPath}/">Home</a>
        </p>
    </body>
</html>
