<%@include file="./shared/header.jsp"%>
<%@include file="./shared/menu.jsp"%>


<c:if test="${ifHomeClicked == true}">
	<c:import url="home.jsp"></c:import>
</c:if>

<c:if test="${userRegistered == true}">
	<c:out value="User is Registered"></c:out>
	<c:import url="home.jsp"></c:import>
</c:if>

<c:if test="${ifCategoryClicked==true}">
	<c:import url="category.jsp" />
</c:if>

<c:if test="${ifLoginClicked==true}">
	<c:import url="login.jsp" />
</c:if>

<c:if test="${ifSupplierClicked==true}">
	<c:import url="supplier.jsp" />
</c:if>


<%@include file="./shared/footer.jsp"%>