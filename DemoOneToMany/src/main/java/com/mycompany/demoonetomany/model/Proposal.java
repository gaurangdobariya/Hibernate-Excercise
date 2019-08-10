package com.mycompany.demoonetomany.model;

import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author gaurang
 */
@Entity
@Table(name = "proposal")
public class Proposal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Long docID;

    @Column(name = "title", length = 100)
    String title;

    @Column(name = "comment", length = 1000)
    String comment;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "proposal_id", referencedColumnName = "id")
    List<Personnel> personnel;
//   

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "proposal_id", referencedColumnName = "id")
    Set<Attachment> attachments;

    public Proposal() {
    }

    public Proposal(String title, String comment, List<Personnel> personnel, Set<Attachment> attachments) {
        this.title = title;
        this.comment = comment;
        this.personnel = personnel;
        this.attachments = attachments;
    }

    public Long getDocID() {
        return docID;
    }

    public void setDocID(Long docID) {
        this.docID = docID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<Personnel> getPersonnel() {
        return personnel;
    }

    public void setPersonnel(List<Personnel> personnel) {
        this.personnel = personnel;
    }

    public Set<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(Set<Attachment> attachments) {
        this.attachments = attachments;
    }

    @Override
    public String toString() {
        return "Proposal{" + "docID=" + docID + ", title=" + title + ", comment=" + comment + ", personnel=" + personnel + ", attachments=" + attachments + '}';
    }

}
