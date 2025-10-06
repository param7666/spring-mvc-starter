<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="a" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Edit Actor</h2>

<a:form action="edit" modelAttribute="actor">
<h3>Enter id</h3>
<a:input path="id" readonly="true"/>
<h3>Enter Name</h3>
<a:input path="name"/>
<h3>Enter addrs</h3>
<a:input path="addrs"/>
<h3>Enter fees</h3>
<a:input path="fees"/>
<h3>Enter category</h3>
<a:input path="category"/>
<input type="submit" value="submit">
<input type="reset" value="cancel">



</a:form>
</body>
</html>