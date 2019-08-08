package com.mycompany.javapersistenthiibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author gaurang
 */
public class HibernetUtil {

    private static SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration().configure().addAnnotatedClass(Message.class).buildSessionFactory();
        } catch (Throwable th) {
            System.err.println("Enitial SessionFactory creation failed" + th);
            throw new ExceptionInInitializerError(th);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

   
}
