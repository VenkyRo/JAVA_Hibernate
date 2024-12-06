package com.jlcindia.hibernate;

import org.hibernate.*;

import antlr.debug.NewLineListener;



public class Lab10A {

	public static void main(String[] args) {
		
		Transaction tx=null; 
		try { 
			//Step 1: get the SessionFactory Object. 
			SessionFactory sessionFactory= HibernateUtil.getSessionFactory(); 
			//Step 2: Open the Session 
			Session session = sessionFactory.openSession(); 
			//Step 3: Begin Transaction 
			tx = session.beginTransaction(); 
			
			
			Student student1 = new Student("st1","st1@gmail",3323);
			session.save(student1);
			
			Student student2 = new Student("st2","st2@gmail",3423);
			session.save(student2);
			
			Student student3 = new Student("st3","st3@gmail",33143);
			session.save(student3);
			
			
			
			/*
			Courses courses1 = new Courses("java","venky",10000.8);
			session.save(courses1);
			
			Courses courses2 = new Courses("javaFSD","harsish",13335.8);
			session.save(courses2);
			
			Courses courses3 = new Courses("Mern","pavan",102525.8);
			session.save(courses3);
			*/
			
			
			
			
			
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
