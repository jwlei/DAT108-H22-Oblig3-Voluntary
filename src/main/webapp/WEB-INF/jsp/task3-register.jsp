<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring"  uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form"    uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <title>Task 3 Register</title>
    <link rel="stylesheet" href="styles.css">
</head>
    <body>
        <fieldset>
            <legend>Register</legend>
            <form:form action="/task3-submit" method="post" modelAttribute="person">

                <form:label path="fname">First name</form:label>
                <form:input path="fname" type="text"/>
                <form:errors path="fname" cssClass="error"> </form:errors><br>

                <form:label path="lname">Last name</form:label>
                <form:input path="lname" type="text"/>
                <form:errors path="lname" cssClass="error"> </form:errors><br>

                <input type="submit" value="Submit"/>
            </form:form>
        </fieldset>
        <a href="${pageContext.request.contextPath}index.html">Return to index</a>
        <a href="/task3-clearCookies">Delete cookie</a>
    </body>
</html>
