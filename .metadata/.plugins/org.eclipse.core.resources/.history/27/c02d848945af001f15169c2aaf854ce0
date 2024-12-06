package com.jlcindia.hibernate;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CIDGenerator implements IdentifierGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor sessionImpl, Object obj) throws HibernateException {
        System.out.println("CIDGenerator-generate()");
        String cid = "C-001"; // Default ID
        try {
            // Query to get the maximum ID
            String HQL = "select max(cust.cid) from Customer cust";
            String id = sessionImpl.createQuery(HQL, String.class).uniqueResult();

            if (id != null && !id.isEmpty()) { // Check for non-null result
                int x = Integer.parseInt(id.substring(2)); // Extract numeric part
                x = x + 1;

                
                if (x <= 9)
                    cid = "C-00" + x;
                else if (x <= 99)
                    cid = "C-0" + x;
                else if (x <= 999)
                    cid = "C-" + x;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new HibernateException("Error generating custom ID", ex); // Throw detailed exception
        }
        return cid;
    }
}
