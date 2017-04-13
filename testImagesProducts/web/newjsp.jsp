<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>
<!--
        ustora by freshdesignweb.com
        Twitter: https://twitter.com/freshdesignweb
        URL: https://www.freshdesignweb.com/ustora/
-->
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Admin</title>


        <!-- Google Fonts -->
        <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!-- Bootstrap -->
        <link rel="stylesheet" href="css/bootstrap.min.css">

        <!-- Font Awesome -->
        <link rel="stylesheet" href="css/font-awesome.min.css">

        <!-- Custom CSS -->
        <link rel="stylesheet" href="css/owl.carousel.css">
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="css/responsive.css">
    <body>

        <div class="header-area">
            <div class="container">
                <div class="row">
                </div>
            </div>
        </div> <!-- End header area -->
    </div> <!-- End slider area -->
    <div class="mainmenu-area">
        <div class="container">
            <div class="row">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div> 
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li><a href="adminIndex.html">Home</a></li>
                        <li ><a href="adminShop.html">Shop page</a></li>
                        <li><a href="adminsingle-product.html">Single product</a></li>
                        <li ><a href="AdminAddProduct.jsp">Add Product</a></li>
                        <li class="active"><a href="AdminEditProduct.jsp">Show Products</a></li>


                    </ul>
                </div>  
            </div>
        </div>
    </div>
    <div class="product-big-title-area">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="product-bit-title text-center">
                        <h2>All Products</h2>

                    </div>

                </div>
            </div>
        </div>
    </div>
    <sql:setDataSource
        var="myDS"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/mobiland"
        user="root" password="root"
        />

    <sql:query var="listUsers"   dataSource="${myDS}">
        SELECT * FROM product;
    </sql:query>
    <div class="single-product">
        <div class="product-f-image">
           
            <div class="product-hover">


                <div align="center">
                    <table border="1" cellpadding="5">
                        <caption><h2>List of users</h2></caption>
                        <tr>

                            <th>Name</th>
                            <th>desc</th>
                            <th>image</th>
                            <th>serial</th>
                            <th>price</th>
                            <th>quantity</th>
                            <th>Edit</th>
                            <th>Delete</th>
                        </tr>
                        <c:forEach var="user" items="${listUsers.rows}">
                            <tr>
                                <td><c:out value="${user.name}" /></td>
                                <td><c:out value="${user.desc}" /></td>
                                <td><img src="GetImage?x=${user.productId}" width="40px"/></td>
                                <td><c:out value="${user.serialNumber}" /></td>
                                <td><c:out value="${user.price}" /></td>
                                <td><c:out value="${user.quantity}" /></td>
                                <td><form action="UpdateProduct?u=${user.productId}" method=""><input value="edit" type="submit"/></form></td>
                                <td><form action="DeleteProduct2?u=${user.productId}" method="post"><input value="delete" type="submit"/></form></td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
<!---->