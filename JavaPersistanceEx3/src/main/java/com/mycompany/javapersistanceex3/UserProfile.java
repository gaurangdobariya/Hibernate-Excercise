package com.mycompany.javapersistanceex3;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author gaurang
 */
@Entity
@Table(name= "\"UserProfile\"" , schema = "public",
        uniqueConstraints={@UniqueConstraint(columnNames = {"name", "phone"})
})
public class UserProfile{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name="phone" , length = 10)
    private String phone;
    
    @Column(name="email")
    private String email;

    public UserProfile() {
    }

    public UserProfile(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserProfile{" + "id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + '}';
    }

    
    

    
    
}
