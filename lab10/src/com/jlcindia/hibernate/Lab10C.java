package com.jlcindia.hibernate;

import org.hibernate.*;



public class Lab10C {

	public static void main(String[] args) {
		
		CustmoerDAO custmoerDAO = DAOFactory.getCustmoerDAO();
		
		Customer customer1 = custmoerDAO.getCustomerByCid(1);
		System.out.println(customer1);
		
		Customer customer2 = custmoerDAO.getCustomerByCid(2);
		System.out.println(customer2);
		
		Customer customer3 = custmoerDAO.getCustomerByCid(3);
		System.out.println(customer3);

		

	}

}
