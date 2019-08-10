package com.mycompany.demoonetomany.model;

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
@Table(name = "personnel")
public class Personnel {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;

    @Column(name = "name", length = 60)
    String name;

    @Column(name = "phone")
    String phone;

    @Column(name = "qualificationLevel")
    QualificationLevel qualification_Level;

    @Override
    public String toString() {
        return "Personnel{" + "Id=" + Id + ", name=" + name + ", phone=" + phone + ", qualification_Level=" + qualification_Level + '}';
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public QualificationLevel getQualification_Level() {
        return qualification_Level;
    }

    public void setQualification_Level(QualificationLevel qualification_Level) {
        this.qualification_Level = qualification_Level;
    }

    public Personnel(String name, String phone, QualificationLevel qualification_Level) {
        this.name = name;
        this.phone = phone;
        this.qualification_Level = qualification_Level;
    }

    public Personnel() {
    }

}
