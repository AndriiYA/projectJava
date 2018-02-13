<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
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
                    <--input type = "submit" value = "Submit"/>
                    <a href="departments.jsp">All departments</a>
                </td>
            </tr>
        </table>
    </form:form>


</div>
</body>

</html>

<a href="/" target="_blank">Departments</a>
