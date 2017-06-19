<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<style type="text/css">
body {
    background-color: lightblue;
}
.topright {
    position: absolute;
    top: 150px;
    right: 16px;
    font-size: 18px;
}
</style>
<body>
<script type="text/javascript">
function validateForm(){
	var name = document.getElementById('validname').value;
	var salary = document.getElementById('validsalary').value;
	var flag = true;
	if(name.length<9){
		alert("Name should be 8 characters");
		flag = false;
		return flag;
	}
	if(salary<1000){
		alert("Salary should be grater than 1000");
		flag = false;
		return flag;
	}
	return flag;
}
</script>
<div class="jumbotron text-center" >
  <h1 colour="black">Login Page</h1>
 
</div>
<h4>LOGIN DETAILS</h4>
 <form action="/Applications/userlogin.do" method="post">  
UserName:&nbsp<input type="text" name="username"/><br/><br/>  
Password:&nbsp<input type="password" name="password"/><br/><br/>  
<button type="submit" class="btn btn-success" >Login</button>
</form>
<div class ="topright">
<h4>SEARCH EMPLOYEE DETAILS</h4>
<form action="/EmployeeInformation.do"  method ="post">
Employer ID:&nbsp<input type="text" name="employeeId"/><br/><br/> 
<!-- <input  type="submit" value="login"/>  -->
<button type="submit" class="btn btn-success">Login</button>
</form>
</div>




</body>
</html>