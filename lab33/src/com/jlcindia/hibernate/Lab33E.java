package com.jlcindia.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.*;
import org.hibernate.stat.SecondLevelCacheStatistics;



public class Lab33E {

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
			
			System.out.println("-----5.Display Customers By Email-----"); 
			 String SQL="select * from bankcustomers where email=?"; 
			 Customer cust=session.createNativeQuery(SQL, Customer.class) 
			 .setParameter(1,"Sri@jlc.com") 
			 .getSingleResult(); 
			 System.out.println(cust);
			
			
			
			
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
