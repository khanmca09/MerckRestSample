<%@ include file="header.jsp"%>

<div class="container">

	<c:if test="${successMsg!=null}">
		<h2>
			<c:out value="${successMsg}"></c:out>

		</h2>
	</c:if>

	<a href="getAllEmployee" type="button" class="btn btn-primary">Get
		All Employee List</a>

</div>

<%@ include file="footer.jsp"%>