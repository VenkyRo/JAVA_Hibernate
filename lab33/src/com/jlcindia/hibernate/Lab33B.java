package com.jlcindia.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.*;
import org.hibernate.stat.SecondLevelCacheStatistics;



public class Lab33B {

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
			
			System.out.println("-----2.Display Customers By CIty-----"); 
			 String SQL="select * from bankcustomers where city=?"; 
			 List<Customer> mylist=session.createNativeQuery(SQL, Customer.class) 
			 .setParameter(1,"Blore") 
			 .getResultList();
			for(Customer customer : mylist) {
				System.out.println(customer);
			}
			
			
			
			
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
