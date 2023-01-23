<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.entity.*"%>
<%@ page import="com.service.*"%>
<%@ page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
          String classs = request.getParameter("class");
           String[] sub = request.getParameterValues("subjects");
           String[] tea = request.getParameterValues("teachers");
           String[] stu = request.getParameterValues("students");
           
           List<Subject> subject = new ArrayList<Subject>();
           List<Teacher> teacher = new ArrayList<Teacher>();
           List<Student> student = new ArrayList<Student>();
            
           
           System.out.println(classs);
           for(String subj: sub)
           {
        	 subject.add(new Subject(subj));
           }
           
           
           for(String teach: tea)
           {
        	   teacher.add(new Teacher(teach));
           }
           
           
           for(String stud: stu)
           {
        	 student.add(new Student(stud));
           }
           
           System.out.println(subject);
           System.out.println(teacher);
           System.out.println(student);
           
         int res =   SetDetails.setClassData(classs, student, subject, teacher);

         if(res==1)
         {
        	 System.out.println("Data Stored successfully");
         }
%>
</body>
</html>