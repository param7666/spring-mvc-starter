<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Actor Report Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }
        h1, h2, h3 {
            color: #ff69b4;
            text-align: center;
        }
        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
            background-color: #ffffcc;
        }
        th, td {
            padding: 10px;
            text-align: center;
            border: 1px solid #000;
        }
        th {
            background-color: #008000;
            color: #fff;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        .center {
            text-align: center;
        }
        .add-link {
            display: block;
            margin: 20px auto;
            text-decoration: none;
            color: #ff69b4;
            font-weight: bold;
        }
        .home-link img {
            width: 40px;
            height: 40px;
            border-radius: 50%;
        }
    </style>
</head>
<body>

<h1>Actor Report Page</h1>

<c:choose>
    <c:when test="${not empty Actors}">
        <table>
            <thead>
                <tr>
                    <th>Actor ID</th>
                    <th>Actor Name</th>
                    <th>Actor Address</th>
                    <th>Actor Fees</th>
                    <th>Actor Category</th>
                    <th>Operation</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="actor" items="${Actors}">
                    <tr>
                        <td>${actor.aId}</td>
                        <td>${actor.aName}</td>
                        <td>${actor.addrs}</td>
                        <td>${actor.fee}</td>
                        <td>${actor.category}</td>
                        <td>
                            <a href="edit?no=${actor.aId}">Edit</a>
                            &nbsp; &nbsp;
                            <a href="delete?no=${actor.aId}" onclick=" return confirm('Are you sure...')">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </c:when>
    <c:otherwise>
        <h3>NO Record Found</h3>
    </c:otherwise>
</c:choose>

<c:if test="${not empty msg}">
    <h2>${msg}</h2>
</c:if>

<a href="register" class="add-link">Add Actor</a>

<div class="center home-link">
    <a href="./">
        <img src="images/home_icon.jpg" alt="Home">
    </a>
</div>

</body>
</html>
