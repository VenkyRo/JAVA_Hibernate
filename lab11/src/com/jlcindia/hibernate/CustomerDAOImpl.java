package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustomerDAOImpl implements CustmoerDAO {

	@Override
	public void addCustomer(Customer cust) {
		System.out.println("Add customer()");
		HibernateTemplate.save(cust);
		
	}

	@Override
	public void updateCutomer(Customer cust) {
		System.out.println("update customer()");
		HibernateTemplate.update(cust);
		
	}

	@Override
	public Customer getCustomerByCid(int cid) {
		System.out.println("get customer()");
		 Customer customer = (Customer) HibernateTemplate.load(Customer.class,cid);
		
		return customer;
	}

	@Override
	public void delteCustomer(int cid) {
		System.out.println("delete customer()");
		HibernateTemplate.delete(Customer.class, cid);
		
	}
	

}
