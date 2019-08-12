/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.excercise;

import com.mycompany.excercise.model.Address;
import com.mycompany.excercise.model.BankAccount;
import com.mycompany.excercise.model.Bid;
import com.mycompany.excercise.model.BillingDetails;
import com.mycompany.excercise.model.Category;
import com.mycompany.excercise.model.Comment;
import com.mycompany.excercise.model.CreditCard;
import com.mycompany.excercise.model.Item;
import com.mycompany.excercise.model.Shipment;
import com.mycompany.excercise.model.User;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;

/**
 *
 * @author gaurang
 */
public class UserDao {
    
    public void save() {
        Session session = HibernetUtil.getSessionFactory().openSession();
        session.beginTransaction();
        User user = new User("firstName", "middleName", "lastName", "userName", "password", "email", 0, true, null, null);
        Address ad = new Address("street", "zipcode", "city");
        Address ad1 = new Address("street", "zipcode", "city");
        Address ad2 = new Address("street", "zipcode", "city");
        Set<Address> addList = new HashSet<Address>();
        addList.add(ad);
        addList.add(ad1);
        addList.add(ad2);
        BillingDetails billingdetails = new BillingDetails("ownername");
        Set<BillingDetails> billingDetailses = new HashSet<BillingDetails>();
        billingDetailses.add(billingdetails);
        user.setBillingDetailses(billingDetailses);
        user.setAddresses(addList);
        session.save(user);
        session.getTransaction().commit();
        session.close();
        
    }
    
    public void findById() {
        Session session = HibernetUtil.getSessionFactory().openSession();
        session.beginTransaction();
        User user = session.find(User.class, 1L);
        session.getTransaction().commit();
        System.out.println("\n\n" + user);
        session.close();
        
    }
    
    public void deleteById() {
        Session session = HibernetUtil.getSessionFactory().openSession();
        session.beginTransaction();
        User user = session.find(User.class, 1L);
        session.remove(user);
        session.getTransaction().commit();
        session.close();
    }
    
    public void saveCategory() {
        Session session = HibernetUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Set<Category> childrens = new HashSet<Category>();
        Category main = new Category("firstName", new Date(), null, childrens);
        Category sub1 = new Category("sub1", new Date(), main, null);
        Category sub2 = new Category("sub2", new Date(), main, null);
        
        childrens.add(sub2);
        childrens.add(sub1);
        session.save(main);
        session.getTransaction().commit();
        session.close();
    }
    
    public void saveBillingDetail() {
        Session session = HibernetUtil.getSessionFactory().openSession();
        session.beginTransaction();
        CreditCard creditCard = new CreditCard("VISA", "123445677890", "2035", "Gaurang");
        creditCard.setUser(session.find(User.class, 1L));
        BankAccount bankAccount = new BankAccount("VISA", "123445677890", "2035", "Gaurang");
        session.save(creditCard);
        session.save(bankAccount);
        session.getTransaction().commit();
        session.close();
    }
    
    public void saveComment() {
        Session session = HibernetUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Item i = new Item("firstName", "description", 0, 0, new Date(), new Date(), "state", new Date(), null);
        User user = session.find(User.class, 1L);
        Comment comment = new Comment("5", "text", i, user);
        session.save(comment);
        session.getTransaction().commit();
        session.close();
    }
    
    public void saveItem() {
        Session session = HibernetUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Item i = new Item("firstName", "description", 0, 0, new Date(), new Date(), "state", new Date(), null);
        Category category = session.find(Category.class, 1L);
        i.setCategory(category);
        session.save(i);
        session.getTransaction().commit();
        session.close();
    }
    
    public void saveBid() {
        Session session = HibernetUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Item item = session.find(Item.class, 1L);
        User user = session.find(User.class, 1L);
        Bid bid = new Bid(5000, new Date());
        bid.setItem(item);
        bid.setUser(user);
        session.save(bid);
        session.getTransaction().commit();
        session.close();
    }
    
    public void saveShipment() {
        Session session = HibernetUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Shipment shipment = new Shipment(500, "state", new Date());
        Item item1 = session.find(Item.class, 1L);
        Address address = session.find(Address.class, 1L);
        User buyer = session.find(User.class, 1L);
        User seller = session.find(User.class, 1L);
        shipment.setAddress(address);
        shipment.setBuyer(buyer);
        shipment.setSeller(seller);
        shipment.setItems(item1);
        session.save(shipment);
        session.getTransaction().commit();
        session.close();
    }
}
