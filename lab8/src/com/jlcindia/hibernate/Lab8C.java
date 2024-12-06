package com.jlcindia.hibernate;

import org.hibernate.*;



public class Lab8C {

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
			Accounts acc1=new Accounts("DA","BC-190",5000); 
			session.save(acc1); 
			acc1.setCustomer(cust); 

	
			
			
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
