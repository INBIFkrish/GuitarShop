<%@include file="./shared/header.jsp" %>
<%@include file="./shared/menu.jsp"%>

<c:if test="${ifHomeClicked == true}">
		<%@include file="home.jsp"%>
	</c:if>

<c:if test="${ifCategoryClicked==true}">
		<%@include file="category.jsp"%>
	</c:if>

<c:if test="${ifLoginClicked==true}">
		<%@include file="login.jsp"%>
	</c:if>
</body>
</html>

<%@include file="./shared/footer.jsp"%>