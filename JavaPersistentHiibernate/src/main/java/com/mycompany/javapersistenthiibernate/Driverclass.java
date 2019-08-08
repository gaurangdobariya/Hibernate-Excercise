package com.mycompany.javapersistenthiibernate;

/**
 *
 * @author gaurang
 */
public class Driverclass {
    public static void main(String[] args) {
        HelloWorldDao helloWorldDao= new HelloWorldDao();
        helloWorldDao.save("First Message");
    }
}
