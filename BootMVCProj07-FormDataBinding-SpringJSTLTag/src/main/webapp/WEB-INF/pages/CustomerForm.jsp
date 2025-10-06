<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Form Page </title>
</head>
<body>

<div>
<f:form modelAttribute="cust" method="post" action="custReg">
<h3>Enter Custome Id</h3>
<f:input path="id" title="Enter id"/> <br>
<h3>Enter Custome Name</h3>
<f:input path="name" title="Enter Name"/><br>
<h3>Enter Custome Phone</h3>
<f:input path="phone" title="Enter Phone Number"/><br>
<h3>Enter Custome Age</h3>
<f:input path="age" title="Enter age"/><br>

<input type="submit" value="submit">
<input type="reset" value="Cancel">

</f:form>

<a href="./"> Home</a>

</div>
</body>
</html>