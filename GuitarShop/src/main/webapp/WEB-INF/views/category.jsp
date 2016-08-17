<%@include file="./shared/header.jsp" %>
<%@include file="./shared/menu.jsp"%>

<h2>Student Information</h2>
<form:form method="POST" action="/GuitarShop/addCategory" commandName="categoryForm">
	<table>
		<tr>
			<td><form:label path="id">ID:</form:label></td>
			<td><form:input path="id" /></td>
		</tr>
		<tr>
			<td><form:label path="name">Name:</form:label></td>
			<td><form:input path="name" /></td>
		</tr>
		<tr>
			<td><form:label path="description">Description:</form:label></td>
			<td><form:input path="description" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Submit" /></td>
		</tr>
	</table>
</form:form>

<%@include file="./shared/footer.jsp"%>

