<%-- 
    Document   : home
    Created on : Feb 20, 2017, 10:30:50 PM
    Author     : shibo
--%>
<%@page import="java.util.Locale.Category"%>
<%@page import="controller.Person"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">

        <link rel='stylesheet prefetch' href='https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css'>

        <link rel="stylesheet" href="css/style_1.css">
    </head>
    <body>
        <form  action="Search">
            <div class="search-wrapper">
                <input class="search-input" type="text" placeholder="Search" name="username"/><i class="ion ion-search"></i>
                <input type="submit" value="search">
            </div>
        </form>

        <script src="js/index_1.js"></script>
        <%--  <c:forEach var="j" begin="1" end="3">  
              Item <c:out value="${j}"/><p>  
              </c:forEach> --%>

        <table border="2px">
            <c:forEach items="${servletName}" var="element"> 
                <tr>
                    <td>${element.username}</td>
                    <td>${element.password}</td>
                    <td>${element}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
