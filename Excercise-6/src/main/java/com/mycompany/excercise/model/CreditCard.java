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
@Table(name = "creditCard", schema = "public")
@PrimaryKeyJoinColumn(name = "id")
public class CreditCard extends BillingDetails {

    @Column(name = "type")
    private String type;

    @Column(name = "number")
    private String number;

    @Column(name = "expMonth")
    private String expMonth;

    @Column(name = "expYear")
    private String expYear;

    public CreditCard(String type, String number, String expYear, String ownername) {
        super(ownername);
        this.type = type;
        this.number = number;
        this.expYear = expYear;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExpMonth() {
        return expMonth;
    }

    public void setExpMonth(String expMonth) {
        this.expMonth = expMonth;
    }

    public String getExpYear() {
        return expYear;
    }

    public void setExpYear(String expYear) {
        this.expYear = expYear;
    }

    @Override
    public String toString() {
        return "CreditCard{" + "type=" + type + ", number=" + number + ", expMonth=" + expMonth + ", expYear=" + expYear + '}';
    }

}
