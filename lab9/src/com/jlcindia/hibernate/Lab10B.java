package com.jlcindia.hibernate;

import java.util.HashSet;

import java.util.Set;

import org.hibernate.*;




public class Lab10B {

	public static void main(String[] args) {
		
		Transaction tx=null; 
		try { 
			//Step 1: get the SessionFactory Object. 
			SessionFactory sessionFactory= HibernateUtil.getSessionFactory(); 
			//Step 2: Open the Session 
			Session session = sessionFactory.openSession(); 
			//Step 3: Begin Transaction 
			tx = session.beginTransaction(); 
			
			Courses courses1 = session.load(Courses.class, 1);
			System.out.println(courses1);
			Courses courses2 = session.load(Courses.class, 2);
			System.out.println(courses2);
			Courses courses3 = session.load(Courses.class, 3);
			System.out.println(courses3);
			
			Student student1 = new Student("st1","st1@gmail",3323);
			session.save(student1);
			
			
			
			Set<Courses> cour1 = new HashSet<>();
			cour1.add(courses1);
			cour1.add(courses2);
			cour1.add(courses3);
			
			student1.setCourses(cour1);
			
			
			
			
			
			Student student2 = new Student("st2","st2@gmail",3423);
			session.save(student2);
			
			Set<Courses> cour2 = new HashSet<>();
			cour2.add(courses1);
			cour2.add(courses2);
			
			student2.setCourses(cour2);
			
			Student student3 = new Student("st3","st3@gmail",33143);
			session.save(student3);
			
			Set<Courses> cour3 = new HashSet<>();
			cour3.add(courses3);
			
			
			student3.setCourses(cour3);
			
			
			
			
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
