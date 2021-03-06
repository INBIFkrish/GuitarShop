<%@include file="./shared/header.jsp" %>

<div class="row">
		<div class="col-sm-6" id="loginbox">

			<form:form action="admin/category" method="post" commandName="category">
				<table>
					<tr>
						<td><form:label path="id">
								<spring:message text="Category ID" />
							</form:label></td>
						<td><form:input path="id" required="true"
								title="ID is required" /></td>
					</tr>
					<tr>
						<td><form:label path="name">
								<spring:message text="Category Name" />
							</form:label></td>
						<td><form:input path="name" required="true"
								title="A name is required" /></td>
					</tr>
					
					<tr>
						<td><form:label path="description">
								<spring:message text="Category Description" />
							</form:label></td>
						<td><form:input path="description" required="true"
								title="A description is required" /></td>
					</tr>
					
					<tr>
						<td><input type="submit"
							value="<spring:message text="Register"/>" /></td>
						<td><input type="reset"
							value="<spring:message text="Clear"/>" /></td>
					</tr>
				</table>
			</form:form>


		</div>
		<div class="col-sm-6">Right</div>
	</div>



