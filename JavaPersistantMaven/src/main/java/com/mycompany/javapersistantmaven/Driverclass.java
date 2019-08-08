/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javapersistantmaven;

/**
 *
 * @author gaurang
 */
public class Driverclass {
    public static void main(String[] args) {
        UserDao userDao= new UserDao();
        userDao.save("Student Name");
        userDao.findById(3L);
        userDao.deleteById(3L);
    }
}
