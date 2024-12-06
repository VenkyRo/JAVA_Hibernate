package com.jlcindia.hibernate;

import org.hibernate.*;
import org.hibernate.stat.SecondLevelCacheStatistics;



public class Lab28A {

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
			
			String cid=(String)CIDGenerator.getNextCustomerID(session); 
			Customer stu=new Customer(cid,"sri","sri@cc.com",99999); 
			session.save(stu); 

			
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