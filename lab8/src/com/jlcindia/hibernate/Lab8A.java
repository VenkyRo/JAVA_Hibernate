package com.jlcindia.hibernate;

import org.hibernate.*;



public class Lab8A {

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
			Customer cust = new Customer("venkatesh","venky@gmail",12345); 
			session.save(cust); 
			
			Accounts acc1 = new Accounts("SA","BC-101",5000);
			session.save(acc1);
			
			Accounts acc2 = new Accounts("Sa","BC-102",5000);
			session.save(acc2);
			
			
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
