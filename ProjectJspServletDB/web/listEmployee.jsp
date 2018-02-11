<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: andrejaskov
  Date: 11.02.2018
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
    <title>Show All Employees</title>
</head>
<body>
<table border=1>
    <thead>
    <tr>
        <th>id</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>DOB</th>
        <th>Email</th>
        <th colspan=2>Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${EmployeesDB}" var="employee">
        <tr>
            <td><c:out value="${employee.id}" /></td>
            <td><c:out value="${employee.firstName}" /></td>
            <td><c:out value="${employee.lastName}" /></td>
            <td><fmt:formatDate pattern="yyyy-MMM-dd" value="${employee.dob}" /></td>
            <td><c:out value="${employee.email}" /></td>
            <td><a href="EmployeeController?action=edit&id=<c:out value="${employee.id}"/>">Update</a></td>
            <td><a href="EmployeeController?action=delete&id=<c:out value="${employee.id}"/>">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<p><a href="EmployeeController?action=insert">Add Employee</a></p>
</body>
</html>
