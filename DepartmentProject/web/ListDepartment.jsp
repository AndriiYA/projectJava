<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: andrejaskov
  Date: 13.02.2018
  Time: 19:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
    <title>Show All Departments</title>
</head>
<body>
<table border=1>
    <thead>
    <tr>
        <th>Department Id</th>
        <th>Name</th>
        <th colspan=2>Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${department}" var="user">
        <tr>
            <td><c:out value="${department.depId}" /></td>
            <td><c:out value="${department.name}" /></td>
            <td><a href="DepartmentController?action=edit&departmentId=<c:out value="${department.departmentid}"/>">Update</a></td>
            <td><a href="DepartmentController?action=delete&departmentId=<c:out value="${department.departmentid}"/>">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<p><a href="DepartmentController?action=insert">Add Department</a></p>
</body>
</html>