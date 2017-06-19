<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title><spring:message code="user.registration.title"/></title>

<script type="text/javascript">
	function registerWithPost() {
		alert('registerWithPost called');
		this.form.action = "<%= request.getContextPath() %>/user/registerUser";
		this.form.method = 'post';
		alert('Before called');
		this.form.submit();
		alert('after called');
	}
	
	function registerWithGet() {
		alert('registerWithGet called');
		this.form.action = "<%= request.getContextPath() %>/user/registerUserInfo";
		this.form.method = 'get';
		alert('Before called');
		this.form.submit();
		alert('after called');
	}
</script>

<style>
.error {
	color: #ff0000;
}

.errorblock{
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding:8px;
	margin:16px;
}
</style>
</head>
<body>
<div class="jumbotron text-center" >
  <h1 colour="black">User Registration</h1>
 </div>
	<div class ="topright">
<h4>SEARCH EMPLOYEE DETAILS</h4>
<form action="/EmployeeInformation.do"  method ="post">
Employer ID:&nbsp<input type="text" name="employeeId"/><br/><br/> 
<!-- <input  type="submit" value="login"/>  -->
<button type="submit" class="btn btn-success">Login</button>
</form>
</div>
<div align ="center">
	<form:form action="/register" commandName="employee" >
		<form:errors path="*" cssClass="errorblock" element="div"/>
	
		${message}
	
	    <table>
	    	<tr>
	    		<td><spring:message code="user.employeenumber.lbl"/>: </td> 
	    		<td><form:input path="employeeNo" /></td>
	    		<td><form:errors path="employeeNo" /></td>
	    	</tr>
	    	<tr>
	    		<td><spring:message code="user.Hiredate.lbl" />: </td> 
	    		<td><form:input path="birthdate" />(MM-DD-YYYY) </td>
        		<td><form:errors path="birthdate" cssClass="error" /></td>
	    	</tr>  
	    	<tr>
	    		<td><spring:message code="user.firstName.lbl"/>: </td> 
	    		<td><form:input path="firstNAme" /></td>
	    		<td><form:errors path="firstNAme" cssClass="error" /></td>
	    	</tr>	    	
	    	<tr>
	    		<td><spring:message code="user.lastName.lbl"/>: </td> 
	    		<td><form:input path="lastName" /> </td>
	    		<td><form:errors path="lastName" cssClass="error" /></td>
	    	</tr>
	    	<tr>
	    		<td><spring:message code="user.gender.lbl" />: </td> 
	    		<td>
	    			<form:checkbox path="gender" value="M" />Male 
        			<form:checkbox path="gender" value="F" />Female 
        		</td>
        		<td><form:errors path="gender" cssClass="error" /></td>
	    	</tr>
	    	
 	      	<tr>
	    		<td><spring:message code="user.Hiredate.lbl" />: </td> 
	    		<td><form:input path="hireDate" />(MM-DD-YYYY) </td>
        		<td><form:errors path="hireDate" cssClass="error" /></td>
	    	</tr>  
	    	

			<tr>
				<td colspan="3">
					<input type="submit" value="Register"/>
				</td>
			</tr>
		</table>
	</form:form>
	</div>

</body>
</html>