package com.jlcindia.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.*;
import org.hibernate.query.Query;

import com.mysql.cj.x.protobuf.MysqlxExpr.Object.ObjectFieldOrBuilder;



public class Lab32A {

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
			
			String hQLString = "from Customer cust where cust.city = :mycity";
			
			List<Customer> myCustomers = session.createQuery(hQLString, Customer.class)
					.setParameter("mycity", "Blore").getResultList();
			
			
			for(Customer customer : myCustomers) {
				System.out.println(customer);
			}
			
			
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
