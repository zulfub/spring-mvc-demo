<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Skuld - MVC</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
	
	First Name: <form:input path="firstName"/>
	<br>
	<hr>
	Last Name: <form:input path="lastName"/>
	<br>
	<hr>
	<form:select path="country">
		<form:options items="${student.countryOptions}"/>
	
	</form:select>
	<br>
	<hr>
	<input type="submit" value="Submit"/> 
</form:form>
<br>
<hr>
	<a href="showForm">Form Page</a>
	<hr/><a href="/spring-mvc-demo/">Main Menu</a>
</body>
</html>