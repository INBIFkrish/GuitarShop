<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<c:set value="${pageContext.request.contextPath}" var="contextPath" />

<spring:url var="css" value="resources/css" />
<spring:url var="img" value="resources/Images" />

<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta name="viewport" content="width-device-width, initial-scale=1">

<title>Buy all the guitars</title>

<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<link href="resources/css/mystyle.css" rel="stylesheet" />

</head>

<body>