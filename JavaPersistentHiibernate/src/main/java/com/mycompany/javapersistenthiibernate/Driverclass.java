/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
