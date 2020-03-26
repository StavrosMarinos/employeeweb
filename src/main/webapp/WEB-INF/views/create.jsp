<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Page</title>
</head>
<body>
<H1>Add Employee</H1>
<form action="saveEmployee" method="post">
<pre>
     <!--Id: <input type="text" name="employeeId">-->
     LastName: <input type="text" name="lastName">
     FirstName: <input type="text" name="firstName">
     Job: <input type="text" name="job">
     ManagerId: <input type="text" name="managerId">
     HireDate: <input type="date" name="hireDate">
     Salary: <input type="text" name="salary">
     Comm: <input type="text" name="comm">
     DepartmentId: <input type="text" name="departmentId">

     <input type="submit" value="save"/>
</pre>
</form>
${msg}

<a href="displayEmployees">View All</a>
</body>
</html>