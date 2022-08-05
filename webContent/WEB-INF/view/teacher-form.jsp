<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>New Teacher information</title>
<style type="text/css">
	.error {color:red}
	.error2{color:green}
	.error3{color:yellow}
</style>
</head>
<body>
<form:form action="processForm" modelAttribute="teacher">

First Name 	*:: 	<form:input path="firstName"/>
	<form:errors path="firstName" cssClass="error"/>
<hr>
Last Name 	*:: 	<form:input path="lastName"/>
	<form:errors path="lastName" cssClass="error"/>
<hr>
Department 	*::		<form:input path="department"/>
	<form:errors path="department" cssClass="error"/>
<hr>
Email		*::		<form:input path="emailAddress"/>
	<form:errors path="emailAddress" cssClass="error"/>
<hr>
Country 	*::		<form:select path="country">
					<form:options items="${teacher.countryOptions}"/>
					</form:select>
<hr>
Free Passes *:: 	<form:input path="freePasses"/>
	<form:errors path="freePasses" cssClass="error2"/>
<hr>
Course Code *::		<form:input path="courseCode"/>
	<form:errors path="courseCode" cssClass="error3"/>
<hr>
	<input type="submit" value="Submit">
</form:form>
<br>
<hr>
 	<a href="showForm">Form Page</a>
<hr/>
	<a href="/spring-mvc-demo/">Main Menu</a>
</body>
</html>