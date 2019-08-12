package com.mycompany.excercise.model;

import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author gaurang
 */
@Entity
@Table(name = "item", schema = "public")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 20)
    private String firstName;

    @Column(name = "description", length = 200)
    private String description;

    @Column(name = "initialPrice")
    private long initialPrice;

    @Column(name = "reservePrice")
    private long reservePrice;

    @Column(name = "startDate")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date startDate;

    @Column(name = "endDate")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date endDate;

    @Column(name = "state")
    private String state;

    @Column(name = "approvalDateTime")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date approvalDateTime;

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "item_id", referencedColumnName = "id")
    private Set<Comment> comments;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Item(String firstName, String description, long initialPrice, long reservePrice, Date startDate, Date endDate, String state, Date approvalDateTime, Set<Comment> comments) {
        this.firstName = firstName;
        this.description = description;
        this.initialPrice = initialPrice;
        this.reservePrice = reservePrice;
        this.startDate = startDate;
        this.endDate = endDate;
        this.state = state;
        this.approvalDateTime = approvalDateTime;
        this.comments = comments;
    }

    public Item() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getInitialPrice() {
        return initialPrice;
    }

    public void setInitialPrice(long initialPrice) {
        this.initialPrice = initialPrice;
    }

    public long getReservePrice() {
        return reservePrice;
    }

    public void setReservePrice(long reservePrice) {
        this.reservePrice = reservePrice;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getApprovalDateTime() {
        return approvalDateTime;
    }

    public void setApprovalDateTime(Date approvalDateTime) {
        this.approvalDateTime = approvalDateTime;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

}
