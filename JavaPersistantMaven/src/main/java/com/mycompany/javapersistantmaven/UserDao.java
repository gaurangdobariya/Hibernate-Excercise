/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javapersistantmaven;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author gaurang
 */
public class UserDao {

    public Student findById(Long  id) {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Student student = entityManager.find(Student.class, id);
        System.out.println("student id :: " + student.getId());
        System.out.println("student name :: " + student.getStudentName());
        entityManager.getTransaction().commit();
        entityManager.close();
        return null;
    }

    public void deleteById(Long id) {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Student student = entityManager.find(Student.class, id);
        System.out.println("student id :: " + student.getId());
        System.out.println("student name :: " + student.getStudentName());

        entityManager.remove(student);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("\n+++++++++Deleted" + student.getStudentName());
    }

    public void save(String studentName) {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        Student student = new Student(studentName);
        try {
            entityManager.persist(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
        entityManager.getTransaction().commit();
        System.out.println("\n+++++++++saved.." + student);
        entityManager.close();
    }
}
