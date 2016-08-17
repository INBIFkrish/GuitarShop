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

<%@include file="./shared/footer.jsp"%>