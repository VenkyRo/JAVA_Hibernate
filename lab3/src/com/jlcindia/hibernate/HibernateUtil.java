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
            myprops.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver"); // Updated driver class
            myprops.put(Environment.URL, "jdbc:mysql://localhost:3306/myjlchdb"); 
            myprops.put(Environment.USER, "root"); 
            myprops.put(Environment.PASS, "Vk@18172"); 
            myprops.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect"); 
            myprops.put(Environment.SHOW_SQL, "true"); 
            myprops.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread"); 
            myprops.put(Environment.HBM2DDL_AUTO, "update"); 
            
            cfg.setProperties(myprops);
            
            // Add annotated classes here
            cfg.addAnnotatedClass(Student.class); 
            
            // Service registry and session factory creation
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(cfg.getProperties()).build();
            
            sessionFactory = cfg.buildSessionFactory(serviceRegistry);
            
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    } 

    public static SessionFactory getSessionFactory() { 
        return sessionFactory; 
    } 
}
