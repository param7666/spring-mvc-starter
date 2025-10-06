<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Actor List</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            padding: 20px;
        }
        h2 {
            text-align: center;
            color: #333;
        }
        table {
            width: 90%;
            margin: 20px auto;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
        }
        th, td {
            padding: 12px;
            text-align: center;
            border: 1px solid #ccc;
        }
        th {
            background-color: #4CAF50;
            color: white;
        }
        tr:hover {
            background-color: #f1f1f1;
        }
        a.btn {
            padding: 6px 12px;
            text-decoration: none;
            border-radius: 5px;
            color: white;
            font-weight: bold;
        }
        .edit {
            background-color: #2196F3;
        }
        .delete {
            background-color: #f44336;
        }
    </style>
</head>
<body>
    <h2>All Actors</h2>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Address</th>
            <th>Fees</th>
            <th>Category</th>
            <th>Operations</th>
        </tr>
        <c:forEach var="actor" items="${actors}">
            <tr>
                <td>${actor.id}</td>
                <td>${actor.name}</td>
                <td>${actor.addrs}</td>
                <td>${actor.fees}</td>
                <td>${actor.category}</td>
                <td>
                    <a href="edit?id=${actor.id}" class="btn edit">Edit</a>
                    <a href="delete?id=${actor.id}" class="btn delete">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <p>${msg} </p> <br>
</body>
</html>
