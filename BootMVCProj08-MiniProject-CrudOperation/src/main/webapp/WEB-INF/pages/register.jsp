<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="a" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Actor</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #f5f5f5;
        padding: 0;
        margin: 0;
    }
    .container {
        max-width: 500px;
        margin: 30px auto;
        background-color: #ffffff;
        padding: 30px;
        border-radius: 10px;
        box-shadow: 0 4px 10px rgba(0,0,0,0.1);
    }
    h1 {
        text-align: center;
        color: #333;
        margin-bottom: 20px;
    }
    h3 {
        margin: 10px 0 5px;
        color: #555;
    }
    a:input {
        width: 100%;
        padding: 8px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 5px;
        box-sizing: border-box;
    }
    input[type="submit"],
    input[type="reset"] {
        width: 48%;
        padding: 10px;
        margin-top: 10px;
        border: none;
        border-radius: 5px;
        color: white;
        background-color: #4CAF50;
        cursor: pointer;
        font-weight: bold;
    }
    input[type="reset"] {
        background-color: #f44336;
        float: right;
    }
    input[type="submit"]:hover {
        background-color: #45a049;
    }
    input[type="reset"]:hover {
        background-color: #e53935;
    }
</style>
</head>
<body>
    <div class="container">
        <h1>Register Actor</h1>
        <a:form modelAttribute="act" action="register">
            <h3>Enter Name</h3>
            <a:input path="name" />

            <h3>Enter Address</h3>
            <a:input path="addrs" />

            <h3>Enter Fees</h3>
            <a:input path="fees" />

            <h3>Enter Category</h3>
            <a:input path="category" />

            <input type="submit" value="Submit">
            <input type="reset" value="Cancel">
        </a:form>
    </div>
</body>
</html>
