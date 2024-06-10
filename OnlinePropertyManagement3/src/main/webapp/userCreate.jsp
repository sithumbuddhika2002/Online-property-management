<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Sample Form</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 0;
      padding: 0;
      overflow: hidden;
      position: relative;
    }

    body::before {
      content: "";
      position: fixed;
      top: 0;
      left: 0;
      width: 100%;
      height: 100%;
      background-image: url('https://media.licdn.com/dms/image/C5612AQHlkD5MQYzxXA/article-cover_image-shrink_720_1280/0/1649006363728?e=2147483647&v=beta&t=eNT7-jq4zkd1UcBQ_JuQEyBKhIovW3lPmQQ2uKdRWeY');
      background-size: cover;
      background-position: center;
      background-repeat: no-repeat;
      filter: blur(8px); /* Adjust the blur level as needed */
      z-index: -1;
    }

    .container {
      max-width: 500px;
      margin: 50px auto;
      padding: 20px;
      background-color: rgba(255, 255, 255, 0.9); /* Adds a white background with some transparency */
      border-radius: 10px;
      box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
      position: relative; /* Ensure the container is above the blurred background */
      z-index: 1;
    }

    .form-label {
      font-weight: bold;
    }

    .form-control {
      border: 1px solid #ced4da;
      border-radius: 5px;
      padding: 10px;
      width: 100%;
      margin-bottom: 15px;
      box-sizing: border-box;
    }

    .btn-primary {
      background-color: #007bff;
      border: none;
      border-radius: 5px;
      padding: 10px 20px;
      cursor: pointer;
      color: #fff;
      transition: background-color 0.3s ease;
    }

    .btn-primary:hover {
      background-color: #0056b3;
    }
  </style>
</head>
<body>

<div class="container">
  <form class="row g-3" method="post" action="addCustomer">
    <div class="col-md-6">
      <label for="inputName" class="form-label">Name</label>
      <input type="text" class="form-control" id="inputName" name="name">
    </div>
    <div class="col-md-6">
      <label for="inputEmail4" class="form-label">Email</label>
      <input type="email" class="form-control" id="inputEmail4" name="email">
    </div>
    <div class="col-md-6">
      <label for="inputPassword4" class="form-label">Password</label>
      <input type="password" class="form-control" id="inputPassword4" name="password">
    </div>
    <div class="col-12">
      <label for="inputAddress" class="form-label">Address</label>
      <input type="text" class="form-control" id="inputAddress" name="address" placeholder="1234 Main St">
    </div>
    <div class="col-12">
      <label for="inputAddress2" class="form-label">Address 2</label>
      <input type="text" class="form-control" id="inputAddress2" name="address2" placeholder="Apartment, studio, or floor">
    </div>
    <div class="col-md-6">
      <label for="inputCity" class="form-label">City</label>
      <input type="text" class="form-control" id="inputCity" name="city">
    </div>
    <div class="col-md-4">
      <label for="inputState" class="form-label">State</label>
      <select id="inputState" class="form-control" name="state">
        <option selected>Choose...</option>
        <option>...</option>
      </select>
    </div>
    <div class="col-md-2">
      <label for="inputZip" class="form-label">Zip</label>
      <input type="text" class="form-control" id="inputZip" name="zip">
    </div>
    <div class="col-12">
      <div class="form-check">
        <input class="form-check-input" type="checkbox" id="gridCheck" name="checkMe">
        <label class="form-check-label" for="gridCheck">
          Check me out
        </label>
      </div>
    </div>
    <div class="col-12">
      <button type="submit" class="btn btn-primary">Create Account</button>
    </div>
  </form>
</div>

</body>
</html>
