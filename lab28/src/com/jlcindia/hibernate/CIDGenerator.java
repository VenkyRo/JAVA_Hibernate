
package com.jlcindia.hibernate;

import java.io.Serializable;

import org.hibernate.Session;







public class CIDGenerator {
	
	public static Serializable getNextCustomerID(Session 
			session){ 
			System.out.println("CIDGenerator-getNextCustomerID()"); 
			String cid="C-001"; 
			try { 
			String HQL="select max(cust.cid) from Customer cust"; 
			
			String id = session.createQuery(HQL, String.class).uniqueResult(); 
			

			if(id!=null) { 
			String p2=id.substring(2); 
			int x=Integer.parseInt(p2); 
			x=x+1; 
			if(x<=9) 
			cid="C-00"+x; 
			else if(x<=99) 
			cid="C-0"+x; 
			else if(x<=999) 
			cid="C-"+x; 
			} 
			}catch(Exception ex) { 
			ex.printStackTrace(); 
			} 
			return cid; 
			} 

}
