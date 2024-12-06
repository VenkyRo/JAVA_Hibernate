package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab37A {

    public static void main(String[] args) {

        Transaction tx1 = null;
        Transaction tx2 = null;
        Session session1 = null;
        Session session2 = null;

        try {
            // Step 1: Get the SessionFactory object.
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

            // Step 2: Open the first session.
            session1 = sessionFactory.openSession();
            // Step 3: Begin the first transaction.
            tx1 = session1.beginTransaction();

            // Step 4: Perform operations in the first session.
            System.out.println("Load First Time");
            Customer customer1 = session1.load(Customer.class, 3);
            System.out.println(customer1);

            System.out.println("Load Second Time");
            Customer customer2 = session1.load(Customer.class, 3);
            System.out.println(customer2);

            // Commit the first transaction.
            tx1.commit();
            session1.close();

            System.out.println("-------------------------------------------");

            // Step 2: Open the second session.
            session2 = sessionFactory.openSession();
            // Step 3: Begin the second transaction.
            tx2 = session2.beginTransaction();

            System.out.println("Load Second Time");
            Customer customer3 = session2.load(Customer.class, 3);
            System.out.println(customer3);

            System.out.println("Load Third Time");
            Customer customer4 = session2.load(Customer.class, 3);
            System.out.println(customer4);

            // Commit the second transaction.
            tx2.commit();
            session2.close();
        } catch (Exception ex) {
            // Rollback the first transaction if active.
            if (tx1 != null && tx1.getStatus().canRollback()) {
                tx1.rollback();
            }

            // Rollback the second transaction if active.
            if (tx2 != null && tx2.getStatus().canRollback()) {
                tx2.rollback();
            }

            ex.printStackTrace();
        } finally {
            // Ensure sessions are closed even in case of an exception.
            if (session1 != null && session1.isOpen()) {
                session1.close();
            }
            if (session2 != null && session2.isOpen()) {
                session2.close();
            }
        }
    }
}
