<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align: center;">Profile Page</h1>
<h3>${sessionScope.admin.id}</h3>
<h3>${sessionScope.admin.name}</h3>
<h3>${sessionScope.admin.addrs}</h3>
<h3>${sessionScope.admin.fees}</h3>

<a href="logout">Log Out</a>
</body>
</html>