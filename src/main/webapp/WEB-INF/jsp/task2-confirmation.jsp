<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <title>Task 2 Register</title>
    <link rel="stylesheet" href="styles.css">
</head>
    <body>
        <h1>Confirmation</h1>
        <p>fname    ${person.fname}</p>
        <p>lname    ${person.lname}</p>
        <p>year     ${person.year}</p>
        <p>areaCode ${person.areaCode}</p>
        <p>phone    ${person.phone}</p>
        <p>email    ${person.email}</p>
        <a href="${pageContext.request.contextPath}index.html">Return to index</a>
    </body>
</html>
