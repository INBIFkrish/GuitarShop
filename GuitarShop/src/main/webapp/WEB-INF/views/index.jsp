<%@include file="./shared/header.jsp"%>
<%@include file="./shared/menu.jsp"%>


<c:if test="${ifHomeClicked == true}">
	<c:import url="home.jsp"></c:import>
</c:if>

<c:if test="${ifElectricClicked == true}">
	<c:import url="electric.jsp"></c:import>
</c:if>

<c:if test="${ifAcousticClicked == true}">
	<c:import url="acoustic.jsp"></c:import>
</c:if>

<c:if test="${ifUkuleleClicked == true}">
	<c:import url="ukulele.jsp"></c:import>
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

<c:if test="${ifProdcutClicked==true}">
	<c:import url="product.jsp" />
</c:if>


<%@include file="./shared/footer.jsp"%> 