<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Task 1 result</title>
		<link rel="stylesheet" href="styles.css">
	</head>

	<body>
			<h1>Task 1 result</h1>
			<p>Default language was german</p>
			<p>${header}</p>
			<h2><fmt:message key="greeting"/> ${name}</h2>
			<a href="${pageContext.request.contextPath}index.html">Return to index</a>
	</body>
</html>