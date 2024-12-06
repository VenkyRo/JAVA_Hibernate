package com.jlcindia.hibernate;

import org.hibernate.*;



public class Lab10B {

	public static void main(String[] args) {
		
		CustmoerDAO custmoerDAO = DAOFactory.getCustmoerDAO();
		
		Customer customer = new Customer(3,"pavan","pavan@gmail.com",35343,"Vempali");
		custmoerDAO.updateCutomer(customer);
	}

}
