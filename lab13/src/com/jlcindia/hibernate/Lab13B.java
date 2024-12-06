package com.jlcindia.hibernate;

import org.hibernate.*;



public class Lab13B {

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
			
			cust.setEmail("venkateshRoayl@gmail.com");
			cust.setCname("venkateshRoayl");
			cust.setPhone(392749333);
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
