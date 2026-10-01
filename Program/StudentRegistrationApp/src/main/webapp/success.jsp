<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head><title>Registration Successful</title></head>
<body>
    <h2>Registration Successful!</h2>
    <c:if test="${not empty student}">
        <p><strong>Name:</strong> ${student.name}</p>
        <p><strong>Email:</strong> ${student.email}</p>
        <p><strong>Course:</strong> ${student.course}</p>
    </c:if>
    <a href="index.jsp">Register another student</a>
</body>
</html>