<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="g" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Girl Friend Form Page</title>
</head>
<body>
<h3 style="color: pink;text-align: center;">Girl Friend Form Page</h3>
<div>
<g:form action="gf" modelAttribute="gf" method="post">
<h3> Enter Number </h3>
<g:input path="gno"/> <br>
<h3> Enter Name </h3>
<g:input path="gname"/> <br>
<h3> Enter Address </h3>
<g:input path="gaddrs"/> <br>
<h3> Enter Phone </h3>
<g:input path="gphone"/> <br>
<h3> Enter NickName </h3>
<g:input path="nickName"/> <br>
<input type="submit" value="submit">
<input type="reset" value="cancel">
</g:form>


</div>

</body>
</html>