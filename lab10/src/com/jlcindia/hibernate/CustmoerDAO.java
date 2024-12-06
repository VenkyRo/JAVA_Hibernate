package com.jlcindia.hibernate;

public interface CustmoerDAO {
	
	public void addCustomer(Customer cust);
	public void updateCutomer(Customer cust);
	public Customer getCustomerByCid(int cid);
	public void delteCustomer(int cid);
	
}
