package com.jlcindia.hibernate;

import org.hibernate.*;



public class Lab25B {

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
			Customer cust = session.load(Customer.class,1);
			System.out.println(cust);
			
			System.out.println(cust.getCid());
			System.out.println(cust.getPhone());
			System.out.println(cust.getEmail());
			System.out.println(cust.getCname());
		
			
			
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
