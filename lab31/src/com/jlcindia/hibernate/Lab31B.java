package com.jlcindia.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.*;
import org.hibernate.stat.SecondLevelCacheStatistics;



public class Lab31B {

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
			
			/*
			String HQl = "from Customer cust where cust.city = ?1";
			List<Customer> mylList = session.createQuery(HQl,Customer.class).setParameter(1, "Delhi").getResultList();
			*/
			
			/*
			String HQl = "from Customer cust where cust.accType = ?1";
			List<Customer> mylList = session.createQuery(HQl,Customer.class).setParameter(1, "SA").getResultList();
			*/
			/*
			String HQl = "from Customer cust where cust.status = ?1";
			List<Customer> mylList = session.createQuery(HQl,Customer.class).setParameter(1, "Active").getResultList();
			*/
			
			/*
			String HQl = "from Customer cust where cust.email = ?1";
			Customer mylList = session.createQuery(HQl,Customer.class).setParameter(1, "ds@jlc.com").uniqueResult();
			
			System.out.println(mylList);
			
			*/
			
			/*
			String hQLString = "from Customer cust where cust.city = ?1 and cust.status=?2";
			List<Customer> customers = session.createQuery(hQLString,Customer.class).setParameter(1, "Blore").setParameter(2, "Inactive").getResultList();
			*/
			
			/*
			String HQL="from Customer cust where cust.balance>=?1"; 
			 List<Customer> customers=session.createQuery(HQL,Customer.class) 
			 .setParameter(1,20000.0) 
			 .getResultList();
			 */
			 String HQL="from Customer cust where cust.city=?1 and cust.balance between ?2 and ?3"; 
			 List<Customer> customers=session.createQuery(HQL,Customer.class) 
			 .setParameter(1,"Blore") 
			 .setParameter(2,15000.0) 
			 .setParameter(3,25000.0) 
			 .getResultList();

			for(Customer customer : customers) {
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
