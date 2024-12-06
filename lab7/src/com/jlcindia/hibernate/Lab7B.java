package com.jlcindia.hibernate;

import org.hibernate.*;



public class Lab7B {

	public static void main(String[] args) {
		
		Transaction tx=null; 
		try { 
			//Step 1: get the SessionFactory Object. 
			SessionFactory sessionFactory= HibernateUtil.getSessionFactory(); 
			//Step 2: Open the Session 
			Session session = sessionFactory.openSession(); 
			//Step 3: Begin Transaction 
			tx = session.beginTransaction(); 
			Address address  = new Address("NgRoad","kadapa","Adnhrapradesh");
			session.save(address);
			
			Customer customer = new Customer("venky","venky@gmail",534234,address);
			session.save(customer);
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
