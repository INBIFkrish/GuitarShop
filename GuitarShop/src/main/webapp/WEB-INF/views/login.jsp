<%@include file="./shared/header.jsp"%>

<div class="row">
	<div class="col-sm-6" id="loginbox">

		<form:form action="user/register" method="post" modelAttribute="user">
			<table>
				<tr>
					<td><form:label path="id">
							<spring:message text="User ID" />
						</form:label></td>
					<td><form:input path="id" pattern=".{4,11}" required="true"
							title="ID should contain 4 to 11 characters" /></td>
				</tr>
				<tr>
					<td><form:label path="pass">
							<spring:message text="Password" />
						</form:label></td>
					<td><form:password path="pass" required="true"
							title="Password should not be empty" /></td>
				</tr>

				<tr>
					<td><input type="submit"
						value="<spring:message text="Register"/>" /></td>
					<td><input type="reset" value="<spring:message text="Clear"/>" /></td>
				</tr>
			</table>
		</form:form>


	</div>
	<div class="col-sm-6">
		<form:form action="user/login" modelAttribute="userLogin">
			<table>
				<tr>
					<td><form:label path="id">
							<spring:message text="User ID" />
						</form:label></td>
					<td><form:input path="id" pattern=".{4,11}" required="true"
							title="ID should contain 4 to 11 characters" /></td>
				</tr>
				<tr>
					<td><form:label path="pass">
							<spring:message text="Password" />
						</form:label></td>
					<td><form:password path="pass" required="true"
							title="Password should not be empty" /></td>
				</tr>

				<tr>
					<td><input type="submit"
						value="<spring:message text="Login"/>" /></td>
					<td><input type="reset" value="<spring:message text="Clear"/>" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</div>

