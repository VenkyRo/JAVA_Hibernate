package com.jlcindia.hibernate;

public class DAOFactory {
	
	static CustmoerDAO custmoerDAO;
	static {
		custmoerDAO  = new CustomerDAOImpl();
		
	}
	public static  CustmoerDAO getCustmoerDAO() {
		return custmoerDAO;
	}

}
