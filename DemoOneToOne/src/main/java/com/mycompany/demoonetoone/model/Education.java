package com.mycompany.demoonetoone.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author gaurang
 */
@Entity
@Table(name = "education")
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "degree_type")
    private String degreeType;

    @Column(name = "degree")
    private String degree;

    @Column(name = "description")
    private String description;

    @Column(name = "graduationYear")
    private Integer graduationYear;

    @Column(name = "school")
    private String school;

    @OneToOne(mappedBy = "education")
    private Student student;

    public Education(String degreeType, String degree, String description, Integer graduationYear, String school) {
        this.degreeType = degreeType;
        this.degree = degree;
        this.description = description;
        this.graduationYear = graduationYear;
        this.school = school;
    }

    public Education() {
    }

    public Education(Long id, String degreeType, String degree, String description, Integer graduationYear, String school, Student student) {
        this.degreeType = degreeType;
        this.degree = degree;
        this.description = description;
        this.graduationYear = graduationYear;
        this.school = school;
        this.student = student;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(Integer graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
