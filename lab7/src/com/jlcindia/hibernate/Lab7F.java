package com.jlcindia.hibernate;

import org.hibernate.*;



public class Lab7F {

	public static void main(String[] args) {
		
		Transaction tx=null; 
		try { 
			//Step 1: get the SessionFactory Object. 
			SessionFactory sessionFactory= HibernateUtil.getSessionFactory(); 
			//Step 2: Open the Session 
			Session session = sessionFactory.openSession(); 
			//Step 3: Begin Transaction 
			tx = session.beginTransaction(); 
			Customer cust = session.load(Customer.class, 1); 
			System.out.println(cust); 
			Address add=cust.getAddress(); 
			System.out.println(add); 


			
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