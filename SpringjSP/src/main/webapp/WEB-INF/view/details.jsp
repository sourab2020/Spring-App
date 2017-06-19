<%@page import="com.example.springjsp.SpringjSP.DAO.EmployeeDetails" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<body>
<table border=1 class =table>
<tr>
   <th>EmployeeID</th><br><th>EmployeeFirstName</th><br><th>EmployeeLastName</th><br><th>Gender</th><th>Action</th>
</tr>

<c:set var="employee" value="${requestScope.Employee }"></c:set>
<tr class=success>
<td><c:out value="${employee.getEmployeeNo()}"></c:out></td>
<td><c:out value="${employee.getFirstName()}"></c:out></td>
<td><c:out value="${employee.getLastName()}"></c:out></td>
<td><c:out value="${employee.getGender()}"></c:out></td>
<td><button ><a  href="edit?id=<c:out value='${employee.getEmployeeNo()}'/>">Update</a></button></td>
</tr>

    

</table>
</body>
</html>