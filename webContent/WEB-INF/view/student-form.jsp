<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Skuld - MVC</title>
<style type="text/css">
	.error {color:red}
</style>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
	
	First Name * ::: <form:input path="firstName"/>
	<form:errors path="firstName" cssClass="error"/>
	<br>
	<hr>
	Last Name * ::: <form:input path="lastName"/>
	<form:errors path="lastName" cssClass="error"/>
	<br>
	<hr>
	Country :::
	<form:select path="country">
		<form:options items="${student.countryOptions}"/>	
	</form:select>
	<br>
	<hr>
	Favorite Coding Language ::: 
	<br>
	<hr>
	<form:radiobuttons path="codingLang" items="${student.codingLanguages }"/>
	<br>
	<hr>
	Operating Systems experienced with :::
	<br><br>
	Linux <form:checkbox path="operatingSystems" value="GUI"/>
	Windows <form:checkbox path="operatingSystems" value="WNDS"/>
	MACOS <form:checkbox path="operatingSystems" value="MACOS"/>
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