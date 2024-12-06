package com.jlcindia.hibernate;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateTemplate {
	
	public static void save(Object obj) {

		Transaction tx=null; 
		Session session = null;
		try { 
			
			SessionFactory sessionFactory= HibernateUtil.getSessionFactory(); 
			session = sessionFactory.openSession(); 
			tx = session.beginTransaction(); 
			session.save(obj);
			tx.commit(); 
		} 
		catch(Exception ex) { 
		if(tx!=null) {
			tx.rollback(); 
		}
		ex.printStackTrace(); 
		}finally {
			if(session !=null) {
				session.close();
			}
		}
		
	}

	
	 public static void update(Object obj) {


		 Transaction tx=null; 
			Session session = null;
			try { 
				
				SessionFactory sessionFactory= HibernateUtil.getSessionFactory(); 
				session = sessionFactory.openSession(); 
				tx = session.beginTransaction(); 
				session.update(obj);
				tx.commit(); 
			} 
			catch(Exception ex) { 
			if(tx!=null) {
				tx.rollback(); 
			}
			ex.printStackTrace(); 
			}finally {
				if(session !=null) {
					session.close();
				}
			}
	 }

	 
	 public static Object load(Class myClass,Serializable id) {


		 Transaction tx=null; 
			Session session = null;
			Object obj  = null;
			
			try { 
				
				SessionFactory sessionFactory= HibernateUtil.getSessionFactory(); 
				session = sessionFactory.openSession(); 
				tx = session.beginTransaction(); 
				 obj = session.load(myClass,id);
				System.out.println(obj);
				tx.commit(); 
			} 
			catch(Exception ex) { 
			if(tx!=null) {
				tx.rollback(); 
			}
			ex.printStackTrace(); 
			}finally {
				if(session !=null) {
					session.close();
				}
				
			}
			return obj;
	 }
	 
	 public static void delete(Class myClass,  Serializable id) {

		 Transaction tx=null; 
			Session session = null;
			
			try { 
				
				SessionFactory sessionFactory= HibernateUtil.getSessionFactory(); 
				session = sessionFactory.openSession(); 
				tx = session.beginTransaction(); 
				Object obj = session.load(myClass,id);
				session.delete(obj);
				tx.commit(); 
			} 
			catch(Exception ex) { 
			if(tx!=null) {
				tx.rollback(); 
			}
			ex.printStackTrace(); 
			}finally {
				if(session !=null) {
					session.close();
				}
				
			}
	 }


	
	 
	 
}

