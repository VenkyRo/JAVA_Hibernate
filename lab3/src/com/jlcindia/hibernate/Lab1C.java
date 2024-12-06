package com.jlcindia.hibernate;

import java.util.List;
import java.util.Set;

import org.hibernate.*;



public class Lab1C {

	public static void main(String[] args) {
		
		Transaction tx=null; 
		try { 
			//Step 1: get the SessionFactory Object. 
			SessionFactory sessionFactory= HibernateUtil.getSessionFactory(); 
			//Step 2: Open the Session 
			Session session = sessionFactory.openSession(); 
			//Step 3: Begin Transaction 
			tx = session.beginTransaction(); 
			//Step4: Do Your Ops 
			Student stu = session.load(Student.class,1);
			System.out.println(stu);
			
			stu.setEmail("venky@gmail.com");
			stu.setPhone(2324143);
			
			//update marks
			List<Integer>marksIntegers = stu.getMarks();
			marksIntegers.add(323);
			
			//update interviews
			Set<String>interviewStrings  = stu.getInteview();
			interviewStrings.add("zebra");
			
			//update skills
			List<String>skillStrings = stu.getSkill();
			skillStrings.add("nodejs");
			
			
			
			//Step 5: End Tx 
			tx.commit(); 
			//Step 6: Close Session 
			session.close(); 
		} 
		catch(Exception ex) { 
		tx.rollback(); 
		ex.printStackTrace(); 
		} 

		

	}

}
