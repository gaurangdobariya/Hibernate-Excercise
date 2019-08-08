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
        entityManager.getTransaction().commit();
        entityManager.close();
        return null;
    }

    public void deleteById(Long id) {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Student student = entityManager.find(Student.class, id);

        entityManager.remove(student);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void save(String studentName) {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        Student student = new Student(studentName);
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
