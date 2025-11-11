<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>

<!DOCTYPE html>
<html>
<head>
    <title>Actor Registration Form</title>
    <style>
        .form-group {
            margin-bottom: 1rem;
        }
        .form-group label {
            display: inline-block;
            width: 150px; /* Adjust as needed */
            font-weight: bold;
        }
        .form-group input {
            width: 250px; /* Adjust as needed */
            padding: 0.5rem;
            font-size: 1rem;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        .form-actions {
            margin-top: 1rem;
        }
        .form-actions input {
            margin-right: 1rem;
        }
    </style>
</head>
<body>
    <h1>Actor Registration Form</h1>
    <frm:form action="edit" method="POST" modelAttribute="actor">
        
        <div class="form-group">
            <label for="aname">Actor Id:</label>
            <frm:input type="text" id="aname" path="aId" readonly="true" />
        </div>
        
        <div class="form-group">
            <label for="aname">Actor Name:</label>
            <frm:input type="text" id="aname" path="aName" />
        </div>
        
        <div class="form-group">
            <label for="addrs">Actor Address:</label>
            <frm:input type="text" id="addrs" path="addrs" />
        </div>
        
        <div class="form-group">
            <label for="category">Actor Category:</label>
            <frm:input type="text" id="category" path="category" />
        </div>
        
        <div class="form-group">
            <label for="fee">Actor Fee:</label>
            <frm:input type="text" id="fee" path="fee" />
        </div>
        
        <div class="form-actions">
            <input type="submit" value="Edit" />
            <input type="reset" value="Reset" />
        </div>
        
    </frm:form>
</body>
</html>
