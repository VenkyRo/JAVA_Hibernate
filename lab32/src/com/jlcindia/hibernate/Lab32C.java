package com.jlcindia.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.*;
import org.hibernate.stat.SecondLevelCacheStatistics;



public class Lab32C {

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
			
			String []cityStrings = new String[] {"Hyd", "Delhi"};
			
			String []cities=new String[] {"Hyd","Delhi"}; 
			 String HQL="from Customer cust where cust.city in (:mycities)"; 
			 List<Customer> myCustomers=session.createQuery(HQL,Customer.class) 
			 .setParameterList("mycities",cities) 
			 .getResultList();


			for(Customer customer : myCustomers) {
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
