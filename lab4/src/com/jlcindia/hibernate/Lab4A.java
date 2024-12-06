package com.jlcindia.hibernate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.*;

import net.sf.ehcache.writer.writebehind.CastingOperationConverter;



public class Lab4A {

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
			
			// Save Student
            Student student = new Student("Sri", "sri@jlc", 12345);
            session.save(student);

            // Save CurrentStudent
            CurrentStudent currentStudent = new CurrentStudent("Ram", "ram@jlc", 23456, 5000, "9:00AM", "Java");
            session.save(currentStudent);

            // Save OldStudent
            OldStudent oldStudent = new OldStudent("Sam", "sam@jlc", 34567, 20000, "Google", "sam@google.com");
            session.save(oldStudent);

            // Save WeekdayStudent
            WeekdayStudent weekdayStudent = new WeekdayStudent("John", "john@jlc", 45678, 7000, "10:00AM", "Spring", 2024, 80, "B.Tech");
            session.save(weekdayStudent);

            // Save WeekendStudent
            WeekendStudent weekendStudent = new WeekendStudent("Mike", "mike@jlc", 56789, 6000, "11:00AM", "Hibernate", 5, "TCS", "mike@tcs.com");
            session.save(weekendStudent);

			
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
