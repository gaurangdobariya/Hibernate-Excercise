package com.mycompany.excercise;

import com.mycompany.excercise.model.User;

/**
 *
 * @author gaurang
 */
public class DriverClass {

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        userDao.save();
        userDao.findById();
        userDao.deleteById();
        userDao.saveCategory();
        userDao.saveBillingDetail();
        userDao.saveComment();
        userDao.saveItem();
        userDao.saveBid();
        userDao.saveShipment();

    }
}
