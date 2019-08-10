/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demoonetomany.model;

import java.sql.Timestamp;
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
@Table(name = "attachment")
public class Attachment {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "fileName")
    private String fileName;
    @Column(name = "fileSize")
    private String fileSize;
    @Column(name = "crated")
    private Timestamp crated;
    @Column(name = "attachmentBytes")
    private byte[] attachmentBytes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Attachment() {
    }

    public Attachment(String fileName, String fileSize, Timestamp crated, byte[] attachmentBytes) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.crated = crated;
        this.attachmentBytes = attachmentBytes;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public Timestamp getCrated() {
        return crated;
    }

    public void setCrated(Timestamp crated) {
        this.crated = crated;
    }

    public byte[] getAttachmentBytes() {
        return attachmentBytes;
    }

    public void setAttachmentBytes(byte[] attachmentBytes) {
        this.attachmentBytes = attachmentBytes;
    }

    @Override
    public String toString() {
        return "Attachment{" + "id=" + id + ", fileName=" + fileName + ", fileSize=" + fileSize + ", crated=" + crated + ", attachmentBytes=" + attachmentBytes + '}';
    }

}
