<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>New Teacher information</title>
<style type="text/css">
	.error {color:red}
</style>
</head>
<body>
<form:form action="processForm" modelAttribute="teacher">

First Name *:: 	<form:input path="firstName"/>
	<form:errors path="firstName" cssClass="error"/>
<hr>
Last Name *:: 	<form:input path="lastName"/>
	<form:errors path="lastName" cssClass="error"/>
<hr>
Department *::	<form:input path="department"/>
	<form:errors path="department" cssClass="error"/>
<hr>
Country *::		<form:select path="country">
					<form:options items="${teacher.countryOptions}"/>
				</form:select>
<hr>
	<input type="submit" value="Submit">
</form:form>
<br>
<hr>
 	<a href="showForm">Form Page</a>
	<hr/><a href="/spring-mvc-demo/">Main Menu</a>
</body>
</html>