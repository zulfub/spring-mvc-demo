 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="C"%>
 <!DOCTYPE html>
 <html>
 <head><title>Skuld - Student Confirmation Page</title></head>
 <body>
 
 The Student is confirmation = ${student.firstName} ${student.lastName}
 <br>
 	Country of Student  ::: ${student.country}
 <br>
 	Favorite Coding Language ::: ${student.codingLang }
 <br>
 	Operating with Know-How ::: 
 	<ul>
 		<C:forEach var="temp" items=" ${student.operatingSystems}"></C:forEach>
 		
 		<li>${temp}</li>
 	</ul>
 <br>
 
 	<a href="showForm">Form Page</a>
	<hr/><a href="/spring-mvc-demo/">Main Menu</a>
 </body>
 </html>