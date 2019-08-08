/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javapersistenthiibernate;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author gaurang
 */
public class HelloWorldDao {

    public void save(String messageText) {
        SessionFactory sessionFactory = HibernetUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Message message = new Message(messageText);
        session.saveOrUpdate(message);
        session.getTransaction().commit();
        System.out.println("\n+++++++++saved.." + message.getMessage());
      

    }
}
