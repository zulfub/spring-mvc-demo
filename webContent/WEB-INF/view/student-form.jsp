<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Skuld - MVC</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
	
	First Name ::: <form:input path="firstName"/>
	<br>
	<hr>
	Last Name ::: <form:input path="lastName"/>
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
	<br>
	<hr>
	Linux <form:checkbox path="operatingSystems" value="GUI"/>
	<hr>
	Windows <form:checkbox path="operatingSystems" value="WNDS"/>
	<hr>
	MACOS <form:checkbox path="operatingSystems" value="MACOS"/>
	<hr>
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