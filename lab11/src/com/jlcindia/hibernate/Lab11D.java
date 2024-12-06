package com.jlcindia.hibernate;

import org.hibernate.*;



public class Lab11D {

	public static void main(String[] args) {
		
		CustmoerDAO custmoerDAO = DAOFactory.getCustmoerDAO();
		
		custmoerDAO.delteCustomer(3);
	}

}
