<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
.GFG {
	background-color: white;
	border: 2px solid black;
	color: green;
	padding: 5px 10px;
	text-align: center;
	display: inline-block;
	font-size: 20px;
	margin: 10px 30px;
	cursor: pointer;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#E7BFB7">

	<div style="margin-left: 27%; border: 3px solid black; width: 50%; margin-top: 10%; border-radius: 5px;">
		<h1 style="margin-left: 10%">Welcome to Learner's Academy Admin
			Portal</h1>

		<button class="GFG">
			<a style="text-decoration: none" href="setSubject.jsp" /a> Set
				Subject 
		</button>

		<button class="GFG">
			<a style="text-decoration: none" href="setTeacher.jsp" /a> Set
				Teacher 
		</button>


		<button class="GFG">
			<a style="text-decoration: none" href="setClass.jsp" /a> Set
				Class 
		</button>


		<button class="GFG">
			<a style="text-decoration: none" href="setStudent.jsp" /a> Set
				Student 
		</button>
		<br>
		<button class="GFG">
			<a style="text-decoration: none" href="getAllStudent.jsp" /a> Get
				All Student 
		</button>
		
		<button class="GFG">
			<a style="text-decoration: none" href="getAllSubject.jsp" /a> Get
				All Subjects 
		</button>
		
		<button class="GFG">
			<a style="text-decoration: none" href="getAllTeacher.jsp" /a> Get
				All Teachers 
		</button>
		
		<br>
		
		<button style="position:relative; margin-left:40%;" class="GFG">
			<a style="text-decoration: none" href="getAllDatas.jsp" /a> Get
				All Data 
		</button>
		

	</div>
	
	<div style="margin-left: 27%; border: 3px solid black; width: 50%; margin-top: 10%; border-radius: 5px;">
		<h1 style="margin-left: 10%">Delete Records Panel</h1>

		<button class="GFG">
			<a style="text-decoration: none" href="deleteStudent.jsp" /a>
				Delete Student
		</button>

		<button class="GFG">
			<a style="text-decoration: none" href="deleteSubject.jsp" /a> 
				Delete Subject 
		</button>


		<button class="GFG">
			<a style="text-decoration: none" href="deleteTeacher.jsp" /a>
				Delete Teacher 
		</button>


		

	</div>
</body>
</html>