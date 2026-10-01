<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head><title>Registration Error</title></head>
<body>
    <h2 style="color:red;">Registration Failed</h2>
    <p>${errorMsg}</p>
    <a href="index.jsp">Go back</a>
</body>
</html>