package com.mycompany.javapersistanceex3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 *
 * @author gaurang
 */
public class UserProfileDao {

    public void save(String name,String mobileNo,String email) {
        SessionFactory sessionFactory = HibernetUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        UserProfile message = new UserProfile(name,mobileNo,email);
        session.saveOrUpdate(message);
        session.getTransaction().commit();
    }
}
