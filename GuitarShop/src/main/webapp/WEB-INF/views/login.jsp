<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta name="viewport" content="width-device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login or Register</title>
<link rel="stylesheet" type="text/css" href="mystyle.css">
</head>
<body>

	<nav id="nav" class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#"> <img class="logo"
				src="Images/logo.png">
			</a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="#">Acoustic</a></li>
			<li><a href="#">Ukulele</a></li>
			<li><a href="#">Electric</a></li>
		</ul>
		<ul class="nav navbar-nav" id="login">
			<li><a href="login.jsp">Login or Sign up</a></li>
		</ul>
	</div>
	</nav>
	<div class="row">
		<div class="col-sm-6">

			<form:form action="user/register" method="post" commandName="user">
				<table>
					<tr>
						<td><form:label path="id">
								<spring:message text="ID" />
							</form:label></td>
						<td><form:input path="id" pattern=".{4,7}" required="true"
								title="ID should contain 4 to 7 characters" /></td>
					</tr>
					<tr>
						<td><form:label path="pass">
								<spring:message text="Password" />
							</form:label></td>
						<td><form:password path="password" required="true"
								title="Password should not be empty" /></td>
					</tr>
					<tr>
						<td><input type="submit"
							value="<spring:message text="Register"/>" /></td>
						<td><input type="reset"
							value="<spring:message text="Register"/>" /></td>
					</tr>
				</table>
			</form:form>


		</div>
		<div class="col-sm-6">Right</div>
	</div>

</body>
</html>