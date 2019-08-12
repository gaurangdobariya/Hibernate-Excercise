package com.mycompany.excercise.model;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

/**
 *
 * @author gaurang
 */
@Entity
@Table(name = "user", schema = "public")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "firstName", length = 20)
    private String firstName;

    @Column(name = "middleName", length = 20)
    private String middleName;

    @Column(name = "lastName", length = 20)
    private String lastName;

    @Column(name = "userName", length = 20)
    private String userName;

    @Column(name = "password", length = 20)
    private String password;

    @Column(name = "email", length = 30)
    @Email
    @Pattern(regexp = "/^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$/")
    private String email;

    @Column(name = "ranking")
    private int ranking;

    @Column(name = "admin")
    private boolean admin;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "user_address",
            joinColumns = {
                @JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {
                @JoinColumn(name = "address_id", referencedColumnName = "id")})
    private Set<Address> addresses;

    @OneToMany(cascade = {CascadeType.ALL}, mappedBy = "user")
    private Set<BillingDetails> billingDetailses;

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", userName=" + userName + ", password=" + password + ", email=" + email + ", ranking=" + ranking + ", admin=" + admin + ", addresses=" + addresses + '}';
    }

    public User() {
    }

    public User(String firstName, String middleName, String lastName, String userName, String password, String email, int ranking, boolean admin, Set<Address> addresses, Set<BillingDetails> billingDetailses) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.ranking = ranking;
        this.admin = admin;
        this.addresses = addresses;
        this.billingDetailses = billingDetailses;
    }

    public Set<BillingDetails> getBillingDetailses() {
        return billingDetailses;
    }

    public void setBillingDetailses(Set<BillingDetails> billingDetailses) {
        this.billingDetailses = billingDetailses;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

}
