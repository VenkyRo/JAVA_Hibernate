package com.jlcindia.hibernate;

import org.hibernate.*;



public class Lab11B {

	public static void main(String[] args) {
		
		CustmoerDAO custmoerDAO = DAOFactory.getCustmoerDAO();
		
		Customer customer = new Customer(4,"hello","hello@gmail.com",35343,"Vempali");
		custmoerDAO.updateCutomer(customer);
	}

}
