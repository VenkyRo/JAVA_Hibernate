package com.jlcindia.hibernate;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class CustomerDAOImpl implements CustmoerDAO {

	@Override
	public void addCustomer(Customer cust) {
		System.out.println("Add customer()");
		Transaction tx=null; 
		Session session = null;
		try { 
			
			SessionFactory sessionFactory= HibernateUtil.getSessionFactory(); 
			session = sessionFactory.openSession(); 
			tx = session.beginTransaction(); 
			session.save(cust);
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

	@Override
	public void updateCutomer(Customer cust) {
		System.out.println("update customer()");
		Transaction tx=null; 
		Session session = null;
		try { 
			
			SessionFactory sessionFactory= HibernateUtil.getSessionFactory(); 
			session = sessionFactory.openSession(); 
			tx = session.beginTransaction(); 
			session.update(cust);
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

	@Override
	public Customer getCustomerByCid(int cid) {
		System.out.println("get customer()");
		Transaction tx=null; 
		Session session = null;
		Customer cust = null;
		try { 
			
			SessionFactory sessionFactory= HibernateUtil.getSessionFactory(); 
			session = sessionFactory.openSession(); 
			tx = session.beginTransaction(); 
			//cust = session.load(Customer.class, cid);
			cust = session.get(Customer.class, cid);
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
		return cust;
	}

	@Override
	public void delteCustomer(int cid) {
		System.out.println("delete customer()");
		Transaction tx=null; 
		Session session = null;
		try { 
			
			SessionFactory sessionFactory= HibernateUtil.getSessionFactory(); 
			session = sessionFactory.openSession(); 
			tx = session.beginTransaction(); 
			Customer customer =session.load(Customer.class, cid);
			session.delete(customer);
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
