package com.jlcindia.hibernate;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.*;




public class Lab10D {

	public static void main(String[] args) {
		
		Transaction tx=null; 
		try { 
			//Step 1: get the SessionFactory Object. 
			SessionFactory sessionFactory= HibernateUtil.getSessionFactory(); 
			//Step 2: Open the Session 
			Session session = sessionFactory.openSession(); 
			//Step 3: Begin Transaction 
			tx = session.beginTransaction(); 
			
			
			Courses courses1 = session.load(Courses.class, 3);
			
			
			
			Set<Student> students = courses1.getStudents();
			for(Student stu: students) {
				System.out.println(stu);
			}
			
			
			
			
			
			
			
			//Step 5: End Tx 
			tx.commit(); 
			//Step 6: Close Session 
			session.close(); 
		} 
		catch(Exception ex) { 
			if(tx!=null) 
				tx.rollback(); 
		ex.printStackTrace(); 
		} 

		

	}

}
