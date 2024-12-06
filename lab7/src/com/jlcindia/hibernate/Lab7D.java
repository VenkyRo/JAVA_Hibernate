package com.jlcindia.hibernate;

import org.hibernate.*;



public class Lab7D {

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
			/*
			Customer customer = new Customer("venky","venky@gmail",534234);
			session.save(customer);
			
			*/
			
			//Provided Address Later 
			Address add = new Address("BTM Layout", "Blore", "KA"); 
			session.save(add); 
			Customer cust = session.load(Customer.class, 1); 
			cust.setAddress(add); //IMP 

			
			
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
