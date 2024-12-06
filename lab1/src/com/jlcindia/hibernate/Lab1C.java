package com.jlcindia.hibernate;

import org.hibernate.*;



public class Lab1C {

	public static void main(String[] args) {
		
		Transaction tx=null; 
		try { 
			//Step 1: get the SessionFactory Object. 
			SessionFactory sessionFactory= XHibernateUtil.getSessionFactory(); 
			//Step 2: Open the Session 
			Session session = sessionFactory.openSession(); 
			//Step 3: Begin Transaction 
			tx = session.beginTransaction(); 
			//Step4: Do Your Ops 
			Customer cust = session.load(Customer.class,102);
			System.out.println(cust);
			cust.setEmail("hariesh@gmail.com");
			cust.setPhone(939054874);
			cust.setCity("kadapa");
			session.update(cust);
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
