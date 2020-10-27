package cuscuzcomjava.autorizer.entity;

import cuscuzcomjava.autorizer.entity.enumeration.ViolationsEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Violation {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private ViolationsEnum violations;

    public int getId() {
        return id;
    }

    public ViolationsEnum getViolations() {
        return violations;
    }

    public void setViolations(ViolationsEnum violations) {
        this.violations = violations;
    }

}

