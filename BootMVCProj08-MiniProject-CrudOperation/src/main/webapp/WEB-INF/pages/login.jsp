<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Login Form</h2>
<div>
<form action="login" method="post">

<h4>Enter Email</h4>
<input type="text" name="email">
<h4>Enter Password</h4>
<input type="text" name="password"> <br>
<input type="submit" value="login">
</form>

<h2>${msg}</h2> <br>
</div>
</body>
</html>