package com.jlcindia.hibernate;

import org.hibernate.*;



public class InsertData {

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
			
			Customer cust=new Customer("Sri","Sri@jlc.com","Blore",10000,"SA","Active"); 
			session.save(cust); 
			cust=new Customer("vas","vas@jlc.com","Blore",15000,"SA","Active"); 
			session.save(cust); 
			cust=new Customer("sd","sd@jlc.com","Delhi",25000,"SA","Active"); 
			session.save(cust); 
			cust=new Customer("ds","ds@jlc.com","Blore",12000,"SA","Active"); 
			session.save(cust); 
			cust=new Customer("aa","aa@jlc.com","Delhi",28000,"CA","Inactive"); 
			session.save(cust); 
			cust=new Customer("dd","dd@jlc.com","Delhi",22000,"CA","Active"); 
			session.save(cust); 
			cust=new Customer("ss","ss@jlc.com","Blore",18000,"SA","Inactive"); 
			session.save(cust); 
			cust=new Customer("zz","zz@jlc.com","Blore",35000,"CA","Active"); 
			session.save(cust); 
			cust=new Customer("pp","pp@jlc.com","Hyd",18000,"SA","Active"); 
			session.save(cust); 
			cust=new Customer("qq","qq@jlc.com","Blore",5000,"SA","Active"); 
			session.save(cust); 

			
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
