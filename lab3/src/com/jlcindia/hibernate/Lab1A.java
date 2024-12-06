package com.jlcindia.hibernate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.*;

import net.sf.ehcache.writer.writebehind.CastingOperationConverter;



public class Lab1A {

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
			
			
			String course[] = {"jdbc","Spring","SpringBoot","Angular","react"};
			
			List<String> skill = new ArrayList<>();
			skill.add("java8");
			skill.add("fullStack");
			skill.add("mysql");
			skill.add("mernstack");
			
			List<Integer> marks = new ArrayList<>();
			marks.add(88);
			marks.add(97);
			marks.add(92);
			marks.add(22);
			marks.add(32);
			
			Set<String> interviews = new HashSet<>();
			interviews.add("Infosys");
			interviews.add("google");
			interviews.add("faceBook");
			interviews.add("microsoft");
			
			Map<String, Integer> refersnces = new HashMap<>();
			refersnces.put("aa",998);
			refersnces.put("bb", 22);
			refersnces.put("cc", 322);
			
			Student stu = new Student("venkatesh","venkatesh@gmail.com" ,9354854,"Blore");
			stu.setCourse(course);
			stu.setSkill(skill);
			stu.setMarks(marks);
			stu.setInteview(interviews);
			//stu.setReferneces(refersnces);
			session.save(stu); 
			
			//Step 5: End Tx 
			tx.commit(); 
			//Step 6: Close Session 
			session.close(); 
		} 
		catch(Exception ex) { 
		tx.rollback(); 
		ex.printStackTrace(); 
		} 

		

	}

}
