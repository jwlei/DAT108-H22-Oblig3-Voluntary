<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring"  uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form"    uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <title>Task 3 register confirmation</title>
    <link rel="stylesheet" href="styles.css">
</head>
    <body>
        <h1>Task 3 Confirmation</h1>
        <p>fname    ${person.fname}</p>
        <p>lname    ${person.lname}</p>
        <a href="${pageContext.request.contextPath}index.html">Return to index</a>
        <a href="task3-register">Back to register</a>
        <a href="/task3-clearCookies">Delete cookie</a>
    </body>
</html>
