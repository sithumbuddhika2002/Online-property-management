<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<style>
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }

    body {
        font-family: Arial, sans-serif;
        background-image: url("[IMAGE URL]"); 
        background-size: cover;  
        background-position: center; 
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .login-container {
        background-color: #fff;
        padding: 20px;
        border-radius: 5px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        width: 300px;
    }

    .login-container h2 {
        text-align: center;
        margin-bottom: 20px;
        color: #007bff;
    }

    .input-group {
        margin-bottom: 20px;
    }

    .input-group label {
        display: block;
        margin-bottom: 5px;
        color: #555;
    }

    .input-group input {
        width: 100%;
        padding: 8px;
        border: 1px solid #ccc;
        border-radius: 3px;
        transition: border-color 0.3s ease;
    }

    .input-group input:focus {
        outline: none;
        border-color: #007bff;
    }

    .error-message {
        color: red;
        font-size: 12px;
        margin-top: 5px;
    }

    .remember-me {
        display: flex;
        align-items: center;
    }

    .remember-me input {
        margin-right: 5px;
    }

    .btn {
        background-color: #007bff;
        color: #fff;
        padding: 10px 20px;
        border: none;
        border-radius: 3px;
        cursor: pointer;
        width: 100%;
        transition: background-color 0.3s ease;
    }

    .btn:hover {
        background-color: #0056b3;
    }
</style>
<script>
    function validateForm() {
        var email = document.getElementById("email").value;
        var password = document.getElementById("password").value;
        var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

        if (!emailRegex.test(email)) {
            document.getElementById("email-error").innerText = "Please enter a valid email address";
            return false;
        } else {
            document.getElementById("email-error").innerText = "";
        }

        if (password.length < 6) {
            document.getElementById("password-error").innerText = "Password must be at least 6 characters long";
            return false;
        } else {
            document.getElementById("password-error").innerText = "";
        }

        return true;
    }
</script>
</head>
<body>
<div class="login-container">
    <h2>Login</h2>
    <form action="log" method="POST" onsubmit="return validateForm()">
        <div class="input-group">
            <label for="username">E-mail</label>
            <input type="email" id="email" name="email" required>
            <div id="email-error" class="error-message"></div>
        </div>
        <div class="input-group">
            <label for="password">Password</label>
            <input type="password" id="password" name="password" required>
            <div id="password-error" class="error-message"></div>
        </div>

        <button type="submit" class="btn">Login</button>
    </form>
    <div id="error-message" class="error-message"></div>
</div>
</body>
</html>
