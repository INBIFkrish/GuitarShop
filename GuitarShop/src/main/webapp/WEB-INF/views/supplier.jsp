<%@include file="./shared/header.jsp" %>


<div class="row">
		<div class="col-sm-6" id="loginbox">

			<form:form action="admin/supplier" method="post" commandName="supplier">
				<table>
					<tr>
						<td><form:label path="id">
								<spring:message text="Supplier ID" />
							</form:label></td>
						<td><form:input path="id" required="true"
								title="ID is required" /></td>
					</tr>
					<tr>
						<td><form:label path="name">
								<spring:message text="Supplier Name" />
							</form:label></td>
						<td><form:input path="name" required="true"
								title="A name is required" /></td>
					</tr>
					
					<tr>
						<td><form:label path="address">
								<spring:message text="Supplier Address" />
							</form:label></td>
						<td><form:input path="address" required="true"
								title="An address is required" /></td>
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



