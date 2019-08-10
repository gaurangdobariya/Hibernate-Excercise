/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demoonetomany.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author gaurang
 */
public enum QualificationLevel {

    BEGINNER(1),
    INTERMEDIATE(2),
    PRO(3);
    private int value;

    private QualificationLevel(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static QualificationLevel getBEGINNER() {
        return BEGINNER;
    }

    public static QualificationLevel getINTERMEDIATE() {
        return INTERMEDIATE;
    }

    public static QualificationLevel getPRO() {
        return PRO;
    }

}
