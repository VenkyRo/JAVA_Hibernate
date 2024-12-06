package com.jlcindia.hibernate;

import org.hibernate.*;



public class Lab10A {

	public static void main(String[] args) {
		
		//DAO Client
		CustmoerDAO custmoerDAO = DAOFactory.getCustmoerDAO();
		
		Customer customer = new Customer("aaa","aaa@gmail.com",78932,"banglore");
		custmoerDAO.addCustomer(customer);
		
		

		

	}

}
