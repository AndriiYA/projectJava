<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: andrejaskov
  Date: 11.02.2018
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
    <link type="text/css"
          href="css/ui-lightness/jquery-ui-1.8.18.custom.css" rel="stylesheet" />
    <script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
    <script type="text/javascript" src="js/jquery-ui-1.8.18.custom.min.js"></script>
    <title>Add new employee</title>
</head>
<body>
<script>
    $(function() {
        $('input[name=dob]').datepicker();
    });
</script>

<form method="POST" action='EmployeeController' name="frmAddEmployee">
    User ID : <input type="text" readonly="readonly" name="id"
                     value="<c:out value="${employee.id}" />" /> <br />
    First Name : <input
        type="text" name="firstName"
        value="<c:out value="${employee.firstName}" />" /> <br />
    Last Name : <input
        type="text" name="lastName"
        value="<c:out value="${employee.lastName}" />" /> <br />
    DOB : <input
        type="text" name="dob"
        value="<fmt:formatDate pattern="MM/dd/yyyy" value="${employee.dob}" />" /> <br />
    Email : <input type="text" name="email"
                   value="<c:out value="${employee.email}" />" /> <br /> <input
        type="submit" value="Submit" />
</form>
</body>
</html>
