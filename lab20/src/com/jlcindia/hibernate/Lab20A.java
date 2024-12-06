package com.jlcindia.hibernate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.*;



public class Lab20A {

	public static void main(String[] args) {
		
		Transaction tx=null; 
		try { 
			//Step 1: get the SessionFactory Object. 
			SessionFactory sessionFactory= HibernateUtil.getSessionFactory(); 
			//Step 2: Open the Session 
			Session session = sessionFactory.openSession(); 
			//Step 3: Begin Transaction 
			tx = session.beginTransaction(); 
			//Step4: Do Your Ops 
			Book b1=new Book(" Angular-8.",500,1,2019,"Available"); 
			session.save(b1); 
		    Book b2=new Book(" Spring-5.4",500,1,2019,"Available"); 
			session.save(b2); 
			Book b3=new Book(" Spring Boot-2",500,1,2019,"Available"); 
			session.save(b3);
			
			
					Set<String> skills=new HashSet<>(); 
					skills.add("Hibernate5"); 
					skills.add("Angular8"); 
					skills.add("Spring5"); 
					List<String> quals=new ArrayList<>(); 
					quals.add("B.Tech"); quals.add("M.Tech"); 
					quals.add("P.hd"); 
					Map<String,Integer> exps=new HashMap<>(); 
					exps.put("Google",5); exps.put("Oracle",5); 
					/*	
					Author a1=new Author("Sri", "sri@jlc", 12345, skills, quals, exps); 
							session.save(a1); 
							Author a2=new Author("vas", "vas@jlc", 111, skills, quals, exps); 
							session.save(a2); 
							Author a3=new Author("sd", "sd@jlc", 999, skills, quals, exps); 
							session.save(a3); 
							Set<Author> authors=new HashSet<>(); 
							authors.add(a1); 
							b1.setMyauthors(authors); 
							authors=new HashSet<>(); 
							authors.add(a1); authors.add(a2); 
							b2.setMyauthors(authors); 
							authors=new HashSet<>(); 
							authors.add(a1); authors.add(a2); 
							authors.add(a3); 
							b3.setMyauthors(authors); 
*/
			
			//Step 5: End Tx 
			tx.commit(); 
			//Step 6: Close Session 
			session.close(); 
		}catch(Exception ex) { 
		ex.printStackTrace(); 
		if(tx!=null) 
		tx.rollback(); 
		}

		

	}

}
