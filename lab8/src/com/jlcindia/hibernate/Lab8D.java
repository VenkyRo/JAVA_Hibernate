package com.jlcindia.hibernate;

import java.util.Set;

import org.hibernate.*;



public class Lab8D {

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
			Customer cust=session.load(Customer.class,1); 
			System.out.println(cust); 
			
			Set<Accounts> accounts = cust.getAccounts();
			for(Accounts accounts2:accounts) {
				System.out.println(accounts2);
			}
			

	
			
			
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
