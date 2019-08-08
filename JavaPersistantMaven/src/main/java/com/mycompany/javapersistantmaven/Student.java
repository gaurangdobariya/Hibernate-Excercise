package com.mycompany.javapersistantmaven;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author gaurang
 */
@Entity
@Table(name= "student")
public class Student implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "studentname")
    private String studentName;

    public Student() {
    }

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public Student(Long id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", studentName=" + studentName + '}';
    }

    
    
}
