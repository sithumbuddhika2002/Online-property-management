<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin - User Details</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
    }
    .container {
        width: 80%;
        margin: 20px auto;
    }
    table {
        width: 100%;
        border-collapse: collapse;
    }
    th, td {
        border: 1px solid #ddd;
        padding: 12px;
        text-align: left;
    }
    th {
        background-color: #f2f2f2;
        font-weight: bold;
    }
    tr:nth-child(even) {
        background-color: #f9f9f9;
    }
</style>
</head>
<body>

<div class="container">
    <h2>Users Details</h2>

    <table>
        <thead>
            <tr>
                <th>User Name</th>
                <th>Email</th>
                <th>Password</th>
                <th>Address</th>
                <th>Address 2</th>
                <th>City</th>
                <th>State</th>
                <th>Zipcode</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="us" items="${user}">
                <tr>
                    <td>${us.name}</td>
                    <td>${us.email}</td>
                    <td>${us.password}</td>
                    <td>${us.address}</td>
                    <td>${us.address2}</td>
                    <td>${us.city}</td>
                    <td>${us.state}</td>
                    <td>${us.zip}</td>    
                    <td>
                        <form action="singlebutton" method="post">
                            <input type="hidden" name="email" value="${us.email}" >
                            <button type="submit">Edit</button>
                        </form>
                    </td>
                    <td>
                        <form action="deleteUser" method="post">
                            <input type="hidden" name="email" value="${us.email}" >
                            <button type="submit">Delete</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
