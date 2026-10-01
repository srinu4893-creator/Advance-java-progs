<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Registration</title>
</head>
<body>
    <h2>Student Registration Form</h2>
    <form action="RegisterServlet" method="post">
        <label>Name:</label>
        <input type="text" name="name" required/><br/><br/>

        <label>Email:</label>
        <input type="email" name="email" required/><br/><br/>

        <label>Course:</label>
        <select name="course">
            <option value="BCA">BCA</option>
            <option value="BTech">B.Tech</option>
            <option value="MCA">MCA</option>
        </select><br/><br/>

        <input type="submit" value="Register"/>
    </form>
</body>
</html>