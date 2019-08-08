package com.mycompany.javapersistanceex3;

/**
 *
 * @author gaurang
 */
public class DriverClass {
    public static void main(String[] args) {
            UserProfileDao userProfileDao= new UserProfileDao();
        userProfileDao.save("nfame","1234567890","a@gmail.com");
    }
}
