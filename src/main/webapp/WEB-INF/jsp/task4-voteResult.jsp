<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring"  uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form"    uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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

        <a href="/task4-voteAgain">Vote again</a>
        <a href="${pageContext.request.contextPath}index.html">Return to index</a>
    </body>
</html>
