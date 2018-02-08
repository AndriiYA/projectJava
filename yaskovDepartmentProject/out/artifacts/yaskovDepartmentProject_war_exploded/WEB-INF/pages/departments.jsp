<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<div>
    <table>
        <tbody>
        <c:forEach items="${allDepartments}" var="department">
        <tr>
            <td>${department.id}</td>
            <td>${department.name}</td>

        </tr>
        </c:forEach>
        </tbody>
    </table>

<a href="/department">Create New Department</a>

</div>

<style type="text/css">

</style>