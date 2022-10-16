<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Task 2 Register</title>
    <link rel="stylesheet" href="styles.css">
</head>
    <body>
        <h1>TALLY FRUIT</h1>
        <c:forEach var="fruit" items="${fruitList.fruits}">
            <ul>
                <li>${fruit.name}: ${fruit.votes}</li>
            </ul>
        </c:forEach>

        <a href="/task4">Vote again</a>
        <a href="${pageContext.request.contextPath}index.html">Return to index</a>
    </body>
</html>
