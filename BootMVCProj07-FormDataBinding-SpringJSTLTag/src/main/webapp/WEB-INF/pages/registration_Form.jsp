<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Hello from Form Page</h3>

<div>
<frm:form modelAttribute="stud" action="register" method="post">
<h3>Enter ID</h3>
<frm:input type="text" path="id"  title="Enter id" /><br>
<h3>Enter Name</h3>
<frm:input type="text" path="name" title="Enter Name" /> <br>
<h3>Enter Address</h3>
<frm:input type="text"  path="addrs" title="Enter Address" /> <br>
<h3>Enter Grade</h3>
<frm:input type="text" path="grade" title="Enter Grade" /> <br>
<input type="submit" value="Submit">
<input type="reset" value="Cancel">


</frm:form>

</div>


<a href="./"></a>
</body>
</html>