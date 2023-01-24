package com.service;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteDetails 
{
	
	@SuppressWarnings("deprecation")
	public static int deleteStudent(String name)
	{
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	      Session session = sessionFactory.openSession();
	      
	      Transaction t = session.beginTransaction(); 
	     Query  q =    session.createQuery("delete from Student s where s.name = :e");
	     q.setParameter("e", name );
           
	          int i=q.executeUpdate();
	          
	          System.out.println("Record(s) Deleted.");
	          
	          t.commit();
	          session.clear();
	          session.close();
	      return 1;
	}
	public static int deleteSubject(String name)
	{
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	      Session session = sessionFactory.openSession();
	      
	      Transaction t = session.beginTransaction(); 
	     Query  q =    session.createQuery("delete from Subject s where s.subjectName = :e");
	     q.setParameter("e", name );
           
	          int i=q.executeUpdate();
	          
	          System.out.println("Record(s) Deleted.");
	          
	          t.commit();
	          session.clear();
	          session.close();
	      return 1;
	}
	public static int deleteTeacher(String name)
	{
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	      Session session = sessionFactory.openSession();
	      
	      Transaction t = session.beginTransaction(); 
	     Query  q =    session.createQuery("delete from Teacher s where s.teacherName = :e");
	     q.setParameter("e", name );
           
	          int i=q.executeUpdate();
	          
	          System.out.println("Record(s) Deleted.");
	          
	          t.commit();
	          session.clear();
	          session.close();
	      return 1;
	}
}
