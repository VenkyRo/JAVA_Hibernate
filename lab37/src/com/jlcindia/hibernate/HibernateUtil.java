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
            // Create Configuration
            Configuration cfg = new Configuration();

            // Hibernate settings equivalent to hibernate.cfg.xml properties
            Properties settings = new Properties();
            settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
            settings.put(Environment.URL, "jdbc:mysql://localhost:3306/myjlchdb");
            settings.put(Environment.USER, "root");
            settings.put(Environment.PASS, "Vk@18172"); // Replace with env variable for production
            settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
            settings.put(Environment.SHOW_SQL, "true");
            settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
            settings.put(Environment.HBM2DDL_AUTO, "update");

            // Enable second-level cache
            settings.put(Environment.USE_SECOND_LEVEL_CACHE, "true");
            settings.put(Environment.USE_QUERY_CACHE, "true");
            settings.put(Environment.CACHE_REGION_FACTORY, "org.hibernate.cache.ehcache.EhCacheRegionFactory");

            cfg.setProperties(settings);

            // Add annotated classes
            cfg.addAnnotatedClass(Customer.class);
            cfg.addAnnotatedClass(InsertData.class);

            // Build ServiceRegistry
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(cfg.getProperties()).build();

            // Create SessionFactory
            sessionFactory = cfg.buildSessionFactory(serviceRegistry);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }
}
