<!DOCTYPE html>
<html>
<head>
	<title>Hello World - Form</title>
</head>
<body>
<h2>Student Name Form - RequestMapping</h2>
	<form action="processForm" method="GET">
		<input type="text" name="studentName"
		placeholder="Your Name"/>
				
		<input type="submit"/>
		
	</form>
<h2>Convert All UpperCase - getParameter</h2>
	<form action="converToAllCaps" method="GET">
		<input type="text" name="studentName" placeholder="Helloo"/>
		<input type="submit"> 
	</form>
	
<h2>Student Name and Last Form - RequestParam</h2>
	<form action="getNameLastName" method="GET">
		<input type="text" name="studentNameInfos" placeholder="John Doe"/>
		<input type="submit"/>
	</form>
</body>
</html>