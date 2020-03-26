<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AllEmployeesPage</title>
</head>
<body>
<h2>Employees:</h2>
<table>
<tr>
    <th>employeeId</th>
    <th>lastName</th>
    <th>firstName</th>
    <th>job</th>
    <th>managerId</th>
    <th>hireDate</th>
    <th>salary</th>
    <th>comm</th>
    <th>departmentId</th>
</tr>

<c:forEach items="${employees}" var="employee">
<tr>
    <td>${employee.employeeId}</td>
    <td>${employee.lastName}</td>
    <td>${employee.firstName}</td>
    <td>${employee.job}</td>
    <td>${employee.managerId}</td>
    <td>${employee.hireDate}</td>
    <td>${employee.salary}</td>
    <td>${employee.comm}</td>
    <td>${employee.departmentId}</td>
</tr>
</c:forEach>
</table>
</body>
</html>