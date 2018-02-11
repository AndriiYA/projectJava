<%--
  Created by IntelliJ IDEA.
  User: andrejaskov
  Date: 10.02.2018
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>

<body>
<h2>Information</h2>
<div>

    <form:form  action="/addDepartment" method="POST">
        <table>
            <tr>
                <td><form:label path = "id">id</form:label></td>
                <td><form:input path = "id" /></td>
            </tr>

            <tr>
                <td><form:label path = "name">Name</form:label></td>
                <td><form:input path = "name" /></td>
            </tr>

            <tr>
                <td colspan = "2">
                    <input type = "submit" value = "Submit"/>
                </td>
            </tr>
        </table>
    </form:form>


</div>
</body>

</html>

<a href="/" target="_blank">Departments</a>
