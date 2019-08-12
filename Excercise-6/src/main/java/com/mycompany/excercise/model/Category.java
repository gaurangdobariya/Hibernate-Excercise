package com.mycompany.excercise.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author gaurang
 */
@Entity
@Table(name = "category", schema = "public")
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 20)
    private String firstName;

    @Column(name = "created")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date created;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "parent_id")
    private Category parent;

    @OneToMany(mappedBy = "parent", cascade = {CascadeType.ALL})
    private Set<Category> childrens;

    public Category() {
    }

    public Category(String firstName, Date created, Category parent, Set<Category> childrens) {
        this.firstName = firstName;
        this.created = created;
        this.parent = parent;
        this.childrens = childrens;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }

    public Set<Category> getChildrens() {
        return childrens;
    }

    public void setChildrens(Set<Category> childrens) {
        this.childrens = childrens;
    }

//    @Override
//    public String toString() {
//        return "Category{" + "id=" + id + ", firstName=" + firstName + ", created=" + created + ", parent=" + parent + ", childrens=" + childrens + '}';
//    }
}
