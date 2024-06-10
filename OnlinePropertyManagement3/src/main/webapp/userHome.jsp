<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Customer</title>
    <style>
        /* Inline CSS styles */
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
        }
        .container {
            margin: 20px auto;
            background-color: #fff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
            max-width: 600px;
        }
        .form-group {
            margin-bottom: 20px;
        }
        .form-label {
            font-weight: bold;
            display: block;
            margin-bottom: 5px;
        }
        .form-control {
            width: calc(100% - 10px);
            padding: 10px;
            font-size: 16px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }
        .form-control:focus {
            outline: none;
            border-color: #007bff;
        }
        .btn-container {
            text-align: right;
        }
        .btn {
            padding: 12px 24px;
            font-size: 16px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
            text-decoration: none;
            background-color: #007bff;
            color: #fff;
        }
        .btn-primary {
            background-color: #007bff;
        }
        .btn-primary:hover {
            background-color: #0056b3;
        }
        .btn-danger {
            background-color: #dc3545;
        }
        .btn-danger:hover {
            background-color: #c82333;
        }
        .btn-cancel {
            background-color: #ccc;
            color: #000;
        }
        .btn-cancel:hover {
            background-color: #999;
        }
    </style>
</head>
<body>

<c:set var="cus" value="${user}"/>

<div class="container">
    <form method="post" action="update">
        <div class="form-group">
            <label for="inputName" class="form-label">Name:</label>
            <input type="text" class="form-control" id="inputName" name="name" value="${cus.name}" required>
        </div>
        <div class="form-group">
            <label for="inputEmail" class="form-label">Email:</label>
            <input type="email" class="form-control" id="inputEmail" name="email" value="${cus.email}" required>
        </div>
        <div class="form-group">
            <label for="inputPassword" class="form-label">Password:</label>
            <input type="password" class="form-control" id="inputPassword" name="password" value="${cus.password}" required>
        </div>
        <div class="form-group">
            <label for="inputAddress" class="form-label">Address:</label>
            <input type="text" class="form-control" id="inputAddress" name="address" value="${cus.address}" placeholder="1234 Main St" required>
        </div>
        <div class="form-group">
            <label for="inputAddress2" class="form-label">Address 2:</label>
            <input type="text" class="form-control" id="inputAddress2" name="address2" value="${cus.address2}" placeholder="Apartment, studio, or floor">
        </div>
        <div class="form-group">
            <label for="inputCity" class="form-label">City:</label>
            <input type="text" class="form-control" id="inputCity" name="city" value="${cus.city}" required>
        </div>
        <div class="form-group">
            <label for="inputState" class="form-label">State:</label>
            <select id="inputState" class="form-control" name="state" required>
                <option selected>Choose...</option>
                <option>...</option>
            </select>
        </div>
        <div class="form-group">
            <label for="inputZip" class="form-label">Zip:</label>
            <input type="text" class="form-control" id="inputZip" name="zip" value="${cus.zip}" required>
        </div>
        <div class="btn-container">
            <button type="submit" class="btn btn-primary">Update</button>

        </div>
    </form>

    <form method="get" action="delete">
        <input type="hidden" name="email" value="${cus.email}">
        <div class="btn-container">
            <button type="submit" class="btn btn-danger">Delete</button>
        </div>
        
    </form>
    
</div>



</body>
</html>
