package com.jlcindia.hibernate;

import java.util.Set;

import org.hibernate.*;



public class Lab8E {

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
			Accounts acc=session.load(Accounts.class,3); 
			System.out.println(acc); 
			Customer cust=acc.getCustomer(); 
			System.out.println(cust); 
			

	
			
			
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
