package com.jlcindia.hibernate;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.*;
import org.hibernate.stat.SecondLevelCacheStatistics;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;



public class Lab1B {

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
			Student stu = session.load(Student.class,1);
			System.out.println(stu);
			
			System.out.println(stu.getPhone()+"\t"+stu.getCname());
			String cour[] = stu.getCourse();
			for(String mycour : cour) {
				System.out.println(mycour);
			}
			System.out.println("------------------------------------------");
			List<String> myskillStrings =stu.getSkill();
			for (String skill : myskillStrings) {
				System.out.println(skill);
				
			}
			System.out.println("--------------------------------------");
			List<Integer>marksIntegers = stu.getMarks();
			for (Integer marks : marksIntegers) {
				System.out.println(marks);
				
			}
			
			Set<String>interviewStrings = stu.getInteview();
			for (String inteviews : interviewStrings) {
				System.out.println(inteviews);
			}
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
