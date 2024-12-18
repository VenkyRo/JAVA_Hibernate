package com.jlcindia.hibernate;

import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
    
    private static SessionFactory sessionFactory;

    static {
        try {
            Configuration cfg = new Configuration();
            Properties myprops = new Properties();
            
            // Hibernate settings equivalent to hibernate.cfg.xml properties
            myprops.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver"); // MySQL driver class
            myprops.put(Environment.URL, "jdbc:mysql://localhost:3306/myjlchdb?useSSL=false&serverTimezone=UTC"); // Added serverTimezone
            myprops.put(Environment.USER, "root"); // Database username
            myprops.put(Environment.PASS, "Vk@18172"); // Database password
            myprops.put(Environment.DIALECT, "org.hibernate.dialect.MySQL57InnoDBDialect"); // MySQL dialect
            myprops.put(Environment.SHOW_SQL, "true"); // Show SQL in the console
            myprops.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread"); // Current session context
            myprops.put(Environment.HBM2DDL_AUTO, "update"); // Automatically update schema on startup

            cfg.setProperties(myprops);
            
            // Add annotated classes here (ensure Customer.class is annotated properly)
            cfg.addAnnotatedClass(Customer.class);

            // Create service registry
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(cfg.getProperties()).build();
            
            // Build session factory
            sessionFactory = cfg.buildSessionFactory(serviceRegistry);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
