/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demoonetomany;

/**
 *
 * @author gaurang
 */
public class DriverClass {

    public static void main(String[] args) {
        ProposalDao proposalDao = new ProposalDao();
        proposalDao.save();
        proposalDao.update(1L, "new Comment");
        proposalDao.delete(proposalDao.findById(1L));
    }
}
