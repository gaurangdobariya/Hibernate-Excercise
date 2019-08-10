/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demoonetomany;

import com.mycompany.demoonetomany.model.Attachment;
import com.mycompany.demoonetomany.model.JPAUtil;
import com.mycompany.demoonetomany.model.Personnel;
import com.mycompany.demoonetomany.model.Proposal;
import com.mycompany.demoonetomany.model.QualificationLevel;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author gaurang
 */
public class ProposalDao {

    private static final Logger LOG = Logger.getLogger(ProposalDao.class.getName());

    private EntityManager entityManager;
    private EntityTransaction entityTransaction;

    public ProposalDao() {
        entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityTransaction = entityManager.getTransaction();
    }

    /**
     * return void
     */
    public void save() {

        entityTransaction.begin();
        Attachment attachment = new Attachment("my file 1", "22kb", new Timestamp(System.currentTimeMillis()), "file".getBytes());
        Attachment attachment2 = new Attachment("my file 2", "11kb", new Timestamp(System.currentTimeMillis()), "file1".getBytes());
        Personnel personnel = new Personnel("abc", "1234567890", QualificationLevel.INTERMEDIATE);
        Personnel personnel2 = new Personnel("Gaurnag", "1234567890", QualificationLevel.INTERMEDIATE);
        List<Personnel> per = new ArrayList<>();
        Set<Attachment> att = new HashSet<>();
        per.add(personnel);
        per.add(personnel2);
        att.add(attachment);
        att.add(attachment2);
        att.add(attachment2);
        Proposal proposal = new Proposal("my title", "my comment", per, att);
        entityManager.persist(proposal);
        LOG.info("\nProposanal Saved");
        entityManager.getTransaction().commit();
    }

    /**
     *
     * @param Id
     * @param Comment
     */
    public void update(Long Id, String Comment) {

        entityTransaction.begin();
        Proposal proposal = entityManager.find(Proposal.class, Id);
        proposal.setComment(Comment);
        entityManager.persist(proposal);
        entityManager.getTransaction().commit();
        LOG.info("\n" + Id + "Proposanal Comment Updated");

    }

    /**
     *
     * @param Id
     */
    public void delete(Proposal p) {
        entityTransaction.begin();
        Proposal proposal = entityManager.find(Proposal.class, p.getDocID());
        entityManager.remove(proposal);
        entityTransaction.commit();
        LOG.info("\n" + p.getDocID() + "Proposanal Deleted");
    }

    /**
     *
     * @param Id
     * @return Proposal
     */
    public Proposal findById(Long Id) {
        entityTransaction.begin();
        Proposal proposal = entityManager.find(Proposal.class, Id);
        entityTransaction.commit();
        LOG.info("\nProposal" + proposal);
        return proposal;
    }

}
