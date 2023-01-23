package com.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Classs;
import com.entity.Student;
import com.entity.Subject;
import com.entity.Teacher;

public class SetDetails 
{
	
	public static int setSubjectDetails(String name)
	{
		String subjectName =   name; 
		 Subject sub = new Subject(); 
		 sub.setSubjectName(subjectName);
		
		  SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	      Session session = sessionFactory.openSession();
		
	     
	     Transaction t = session.beginTransaction(); 
	     session.save(sub); 
	     t.commit();
	     session.close();
	     
	     return 1;
	}

	public static int setTeacherDetails(String name)
	{
		 String teacherName =   name;
		 Teacher teacher = new Teacher(); 
		 teacher.setTeacherName(teacherName);
		
		  SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	      Session session = sessionFactory.openSession();
		
	     
	     Transaction t = session.beginTransaction(); 
	     session.save(teacher); 
	     t.commit();
	     session.close();
	     
	     return 1;
	}
	
	public static int setStudentDetails(String name)
	{
		
		 Student student = new Student(); 
		 student.setName(name);
		
		  SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	      Session session = sessionFactory.openSession();
		
	     
	     Transaction t = session.beginTransaction(); 
	     session.save(student); 
	     t.commit();
	     session.close();
	     
	     return 1;
	}
	
	public static int setClassData(String name,List<Student> students, List<Subject> subjects, List<Teacher> teachers)
	{
		
		
		Classs c = new Classs(name, students, subjects, teachers);
		
		 SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	      Session session = sessionFactory.openSession();
		
	     
	     Transaction t = session.beginTransaction(); 
	     session.save(c); 
	     t.commit();
	     session.close();
	     
		
		return 1;
	}
	
	public static int updateClassData(String name,List<Student> students, List<Subject> subjects, List<Teacher> teachers)
	{
		
		
		Classs c = new Classs(name, students, subjects, teachers);
		
		 SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	      Session session = sessionFactory.openSession();
		
	     
	      Transaction t = session.beginTransaction();
          
          session.update(c);
         
   t.commit();
   
   session.close();

	     
		
		return 1;
	}
	
	
}
