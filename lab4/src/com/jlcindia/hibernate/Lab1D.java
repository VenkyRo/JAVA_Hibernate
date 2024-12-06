package com.jlcindia.hibernate;

import org.hibernate.*;



public class Lab1D {

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
			//Student cust = session.load(Student.class,2);
			Student stu = session.get(Student.class, 1);
			System.out.println(stu);
			
			if(stu!=null) {
				session.delete(stu);
			}
			else {
				System.out.println("oops Student not found!");
			}
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
