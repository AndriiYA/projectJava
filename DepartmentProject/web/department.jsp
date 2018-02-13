<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: andrejaskov
  Date: 12.02.2018
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <c:forEach items="${departments}" var="dep">
        <c:out value="${dep.name}"/><a href="?page='editDepartment'&departmentId='${dep.id}'">Edit</a>
    </c:forEach>



</body>
</html>
