
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Form</title>
</head>
<body>

    <h2>Registration Form</h2>

    <form action="jsf" method="post">
        <label>Full Name:</label><br>
        <input type="text" name="name"><br><br>

        <label>Email:</label><br>
        <input type="email" name="email"><br><br>

        <label>Password:</label><br>
        <input type="password" name="password"><br><br>

        <label>Gender:</label><br>
        <input type="radio" name="gender" value="Male"> Male
        <input type="radio" name="gender" value="Female"> Female<br><br>

        <label>Skills:</label><br>
        <input type="checkbox" name="skills" value="Java"> Java
        <input type="checkbox" name="skills" value="Spring"> Spring
        <input type="checkbox" name="skills" value="React"> React<br><br>

        <label>Country:</label><br>
        <select name="country">
            <option value="India">India</option>
            <option value="USA">USA</option>
            <option value="UK">UK</option>
        </select><br><br>

        <input type="submit" value="Register">
    </form>

</body>
</html>

</body>
</html>