<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>

<head>
	<title>Home Page</title>
</head>

<body>
	
	
	<hr>
	
	<!-- display user name and role -->
	<security:authorize access="hasRole('EMPLOYEE')">
	<p>
		User: <security:authentication property="principal.username" />
		<br><br>
		Role(s): <security:authentication property="principal.authorities" />
	</p>
	</security:authorize>
	<hr>
	<a href="/list-todos">Click Here</a> to add todo's
	<security:authorize access="hasRole('ADMIN')">
	<p>
	<a href="/admin">ADMIN</a> to add and update todo's
	</p>
	</security:authorize>
	
	<!-- Add a logout button -->
	<form:form action="${pageContext.request.contextPath}/logout"   method="POST">
	
		<input type="submit" value="Logout" />
	
	</form:form>
	
</body>

</html>









