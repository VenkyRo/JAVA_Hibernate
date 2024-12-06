package com.jlcindia.hibernate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.*;

import net.sf.ehcache.writer.writebehind.CastingOperationConverter;



public class Lab6A {

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
			
			//1. Save Student - 1 record 
			int stuId=PKGenerator.getNextStudentId(); 
			Student stu = new Student(stuId,"Sri", "Sri@jlc", 12345); 
			session.save(stu); 

			//2.Save CurrentStudent - 1 record 
			int currentStuId = PKGenerator.getNextCurrentStudentId(); 
			CurrentStudent cstu= new 
			CurrentStudent(currentStuId,"aa","aa@jlc",111,5000,"11.00A.M","Srinivas"); 
			session.save(cstu); 
			//3.Save OldStudent - 1 record 
			int oldStuId = PKGenerator.getNextOldStudentId(); 
			OldStudent ostu= new OldStudent(oldStuId,"bb", "bb@jlc",222, 999, "Google", "bb@google.com"); 
			session.save(ostu); 
			//4.Save WeekdayStudent - 1 record 
			int wdStuId = PKGenerator.getNextWDStudentId(); 
			WeekdayStudent wdstu= new WeekdayStudent(wdStuId,"cc", 
			"cc@jlc",333,9000,"5.00P.M","Dandes",2020,65,"B.Tech"); 
			session.save(wdstu); 
			//5.Save WeekendStudent - 1 record 
			int weStuId = PKGenerator.getNextWEStudentId(); 
			WeekendStudent westu= new WeekendStudent(weStuId,"dd", 
			"dd@jlc",444,7500,"7.30A.M","Dandes",19,"TCS","dd@tcs.com"); 
			session.save(westu); 

			
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
