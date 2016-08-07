<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

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
	<div class="row">
		<div class="col-sm-6">

			<form:form method="POST" commandName="user">
<table>
    <tr>
        <td>User Name :</td>
        <td><form:input path="name" /></td>
    </tr>
    <tr>
        <td>Password :</td>
        <td><form:password path="password" /></td>
    </tr>
    <tr>
        <td>Gender :</td>
        <td>
            <form:radiobutton path="gender" value="M" label="M" /> 
            <form:radiobutton path="gender" value="F" label="F" />
        </td>
    </tr>
    <tr>
        <td>Country :</td>
        <td>
            <form:select path="country">
            <form:option value="0" label="Select" />
            <form:options items="${countryList}" itemValue="countryId" itemLabel="countryName" />
            </form:select>
        </td>
    </tr>
    <tr>
        <td>About you :</td>
        <td><form:textarea path="aboutYou" /></td>
    </tr>
    <tr>
        <td>Community :</td>
        <td><form:checkboxes path="communityList" items="${communityList}" itemValue="key" itemLabel="value" /></td>
    </tr>
    <tr>
        <td></td>
        <td>
        <form:checkbox path="mailingList" label="Would you like to join our mailinglist?" />
        </td>
    </tr>
    <tr>
        <td colspan="2"><input type="submit" value="Register"></td>
    </tr>
</table>
</form:form>


		</div>
		<div class="col-sm-6">Right</div>
	</div>

</body>
</html>