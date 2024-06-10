<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login/Register Buttons</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .button-container {
            text-align: center;
        }

        .button-container button {
            padding: 10px 20px;
            margin: 0 10px;
            border: none;
            border-radius: 3px;
            cursor: pointer;
            font-size: 16px;
            text-transform: uppercase;
            transition: background-color 0.3s ease;
        }

        .button-container button:hover {
            background-color: #007bff;
            color: #fff;
        }
    </style>
</head>
<body>
    <div class="button-container">
        <button onclick="location.href='login.jsp'">Login</button>
        <button onclick="location.href='userCreate.jsp'">Register</button>
    </div>
    
    <form action="AddCustomer" method="post">
    
    <button type="submit">All Users</button>
    
    </form>
</body>
</html>