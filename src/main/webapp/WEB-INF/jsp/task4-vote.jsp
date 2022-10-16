<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring"  uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form"    uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Task 4 Vote</title>
    <link rel="stylesheet" href="styles.css">
</head>
    <body>
    <fieldset>
        <legend>Task 4 Vote</legend>
        <form action="/task4-submit" method="post">
            <c:forEach var="fruit" items="${fruitList.fruits}">
                <input type="radio" name="fruit" value="${fruit.name}">${fruit.name}<br>
            </c:forEach>
            <input type="submit" value="Submit">
        </form>
    </fieldset>

    <a href="${pageContext.request.contextPath}index.html">Return to index</a>
    </body>
</html>
