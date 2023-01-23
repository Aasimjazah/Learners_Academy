<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="com.service.SetDetails"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String teacherName = request.getParameter("name");
     
      int res= SetDetails.setTeacherDetails(teacherName);
      
      if(res==1)
      {
%>
	<h2 style="text-align: center; color: green">Data Store
		successfully</h2>
	<%
    	  request.getRequestDispatcher("setTeacher.jsp").include(request, response);
      }

%>
</body>
</html>