package com.jlcindia.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.*;
import org.hibernate.stat.SecondLevelCacheStatistics;



public class Lab32B {

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
			
			 String HQL="from Customer cust where cust.city=:mycity and cust.accType=:myaccType"; 
			 List<Customer> mylist=session.createQuery(HQL,Customer.class) 
			 .setParameter("mycity","Blore") 
			 .setParameter("myaccType","CA") 
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
