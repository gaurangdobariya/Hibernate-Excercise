package com.mycompany.excercise.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author gaurang
 */
@Entity
@Table(name = "bankAccount", schema = "public")
@PrimaryKeyJoinColumn(name = "id")
public class BankAccount extends BillingDetails {

    @Column(name = "number")
    private String number;

    @Column(name = "bankName")
    private String bankName;

    @Column(name = "swift")
    private String swift;

    public BankAccount() {
    }

    public BankAccount(String number, String bankName, String swift, String ownername) {
        super(ownername);
        this.number = number;
        this.bankName = bankName;
        this.swift = swift;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getSwift() {
        return swift;
    }

    public void setSwift(String swift) {
        this.swift = swift;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "number=" + number + ", bankName=" + bankName + ", swift=" + swift + '}';
    }

}
