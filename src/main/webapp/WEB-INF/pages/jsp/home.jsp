<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
        <form method="GET" commmandName="restaurant" action="${pageContext.request.contextPath}/" id="form1"> 
            {message}</br>
            <a href="${pageContext.request.contextPath}/restaurant/add.html">Add new restaurant</a><br>
            <a href="${pageContext.request.contextPath}/restaurant/list.html">List Restaurants</a><br>
            <table>
                <thead>
                    <tr>
                        <th>Search By</th>
                        <th></th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>All</td>
                        <td></td>
                        <td>
                            <input type="button" value="Search" onclick="javascript:searchRestaurant('all');"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Name</td>
                        <td><form:input path="restaurant.name"></form:input></td>
                        <td>
                            <input type="button" value="Search" onclick="searchRestaurant('name');"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Id</td>
                        <td><form:input path="restaurant.id"></form:input></td>
                    <td>
                        <a role="button" title="Search" href="javascript:void(0);" onclick="searchRestaurant('id');">
                            <span>Search</span>
                        </a>
                    </td>
                  </tr>
                </tbody>
            </table> 

            </form>
                    
        </p>    
    </body>
                                <script type="text/javascript">
                
            function searchRestaurant(searchType)
            {
                var url = "${pageContext.request.contextPath}/restaurant/";
                if(searchType == 'all')
                {
                    url = url + "list.html";
                }else if (searchType == 'name')   
                {
                    var nameValue = document.getElementById("name").value;
                    url = url + "/name/"+nameValue;
                }else if (searchType == 'id')
                {
                    var idValue = document.getElementById("id").value;
                    url = url+idValue ;
                }
                
                var form = document.getElementById('form1');
                
                form.action=url;
                form.submit();
            }

        </script>

</html>
