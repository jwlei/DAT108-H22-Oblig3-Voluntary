<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring"  uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form"    uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <title>Task 2 Register</title>
    <link rel="stylesheet" href="styles.css">
</head>
    <body>
        <h1>Register</h1>
            <form:form action="/task2-submit" method="post" modelAttribute="person">

                <form:label path="fname">First Name</form:label>
                <form:input path="fname" type="text"/>
                <form:errors path="fname" cssClass="error"/><br>

                <form:label path="lname">Last Name</form:label>
                <form:input path="lname" type="text"/>
                <form:errors path="lname"/><br>

                <form:label path="year">Birthyear</form:label>
                <form:input path="year" type="number"/>
                <form:errors path="year" cssClass="error"/><br>

                <form:label path="areaCode">Areacode</form:label>
                <form:input path="areaCode" type="text"/>
                <form:errors path="areaCode" cssClass="error"/><br>

                <form:label path="phone">Phone</form:label>
                <form:input path="phone" type="text"/>
                <form:errors path="phone" cssClass="error"/><br>

                <form:label path="email">Email</form:label>
                <form:input path="email" type="text"/>
                <form:errors path="email" cssClass="error"/><br>

                <input type="submit" value="Submit"/>
            </form:form>
        <a href="${pageContext.request.contextPath}index.html">Return to index</a>
    </body>
</html>
