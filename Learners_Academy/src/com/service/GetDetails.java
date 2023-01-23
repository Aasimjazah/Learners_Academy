package com.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Classs;
import com.entity.Student;
import com.entity.Subject;
import com.entity.Teacher;

public class GetDetails 
{
	
	public static Set<String> getAllSubjects()
	{
		
		  SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	      Session session = sessionFactory.openSession();
	      
	      
	     List<Subject> subjects = session.createQuery("from Subject").list();
	     
	     Set<String> hSet = new HashSet<String>();
	     
	     for(Subject subject: subjects)
	     {
	    	 hSet.add(subject.getSubjectName());
	     }
	     
	     Transaction t = session.beginTransaction(); 
	   
	     t.commit();
	     session.close();
	    return hSet;
	 
	}
	
	public static Set<String> getAllTeachers()
	{
		
		  SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	      Session session = sessionFactory.openSession();
	     List<Teacher> teachers =  session.createQuery("from Teacher").list();      
	     
	     Set<String> hSet = new HashSet<String>();
	     for(Teacher teacher: teachers)
	     {
	    	 hSet.add(teacher.getTeacherName());
	     }
	     
	     Transaction t = session.beginTransaction(); 
	   
	     t.commit();
	     session.close();
	    return hSet;
	 
	}
	public static Set<String> getAllStudents()
	{
		
		  SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	      Session session = sessionFactory.openSession();
	      List<Student> students =  session.createQuery("from Student").list();      
	     
	      Set<String> hSet = new HashSet<String>();
	      
	     for(Student student: students)
	     {
	    	 hSet.add(student.getName());
	     }
	     
	     Transaction t = session.beginTransaction(); 
	   
	     t.commit();
	     session.close();
	    return hSet;
	 
	}
	
	public static List<Student> getStudent()
	{
		  SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	      Session session = sessionFactory.openSession();
	      List<Classs> clas =  session.createQuery("from Classs").list();  
		   
	      for(Classs stu: clas)
	      {
	    	  System.out.println(stu);
	      }
	      Transaction t = session.beginTransaction(); 
		   
		     t.commit();
		     session.close();
		return null;
	}


}
