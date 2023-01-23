<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="com.service.SetDetails"%>
<%@ page import="com.service.GetDetails"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String subjectName = request.getParameter("name");
     
      int res= SetDetails.setSubjectDetails(subjectName);
      
      if(res==1)
      {
%>
	<h2 style="text-align: center; color: green">Data Store
		successfully</h2>
	<%
    	  request.getRequestDispatcher("setSubject.jsp").include(request, response);
      }

%>
</body>
</html>