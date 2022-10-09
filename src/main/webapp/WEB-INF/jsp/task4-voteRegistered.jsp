<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring"  uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form"    uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>Task 2 Register</title>
    <link rel="stylesheet" href="styles.css">
</head>
    <body>
        <h1>TALLY FRUIT</h1>
        <p><fmt:message key="check_1"/>${check_1} votes</p>
        <p><fmt:message key="check_2"/>${check_2} votes</p>
        <p><fmt:message key="check_3"/>${check_3} votes</p>

        <a href="/task4">Vote again</a>
        <a href="${pageContext.request.contextPath}index.html">Return to index</a>
    </body>
</html>
