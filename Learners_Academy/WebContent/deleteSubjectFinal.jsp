<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="com.service.SetDetails"%>
<%@ page import="com.service.DeleteDetails"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String studentName = request.getParameter("name");
     
      int res= DeleteDetails.deleteSubject(studentName);
      
      if(res==1)
      {
%>
	<h2 style="text-align: center; color: green">Data deleted
		successfully</h2>
	<%
    	  request.getRequestDispatcher("deleteSubject.jsp").include(request, response);
      }

%>
</body>
</html>