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
        <h1>VOTE FOR ZE FRUIT</h1>
        <label for="voteBox">Vote for your favourite fruit</label>
        <form id="voteBox" action="/task4-submit" method="post" modelAttribute="vote" name="voteBox">
            <label for="check_1"><fmt:message key="check_1"/></label>
            <input type="radio" id="check_1" name="radioButtons">

            <label for="check_1"><fmt:message key="check_2"/></label>
            <input type="radio" id="check_2" name="radioButtons">

            <label for="check_1"><fmt:message key="check_1"/></label>
            <input type="radio" id="check_3" name="radioButtons">

            <input type="submit" value="Submit">
        </form>
        <a href="${pageContext.request.contextPath}index.html">Return to index</a>
    </body>
</html>
