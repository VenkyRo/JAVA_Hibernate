package com.jlcindia.hibernate;

import java.util.Iterator;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.*;
import org.hibernate.stat.SecondLevelCacheStatistics;

import com.mysql.cj.xdevapi.Schema.CreateCollectionOptions;



public class Lab36E {

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
			
			CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
			CriteriaQuery<Customer> criteriaQuery = criteriaBuilder.createQuery(Customer.class);
			Root<Customer> root = criteriaQuery.from(Customer.class);
			
			criteriaQuery.select(root);
			
			criteriaQuery.where(
					criteriaBuilder.between(root.get("balance"), 15000.0,25000.0), 
					criteriaBuilder.equal(root.get("city"), "Blore") );
			
			List<Customer> myCustomers = session.createQuery(criteriaQuery).getResultList();
			
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
