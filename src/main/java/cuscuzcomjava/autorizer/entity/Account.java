package cuscuzcomjava.autorizer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Account {

  @Id
  @GeneratedValue
  @Column
  private int id;

  @Column
  private boolean activeCard;

  @Column
  private int availableLimit;

  @Column
  private List<Violation> violationList;


  public int getId() {
    return id;
  }

  public boolean isActiveCard() {
    return activeCard;
  }

  public void setActiveCard(boolean activeCard) {
    this.activeCard = activeCard;
  }

  public int getAvailableLimit() {
    return availableLimit;
  }

  public void setAvailableLimit(int availableLimit) {
    this.availableLimit = availableLimit;
  }

  public List<Violation> getViolationList() {
    return violationList;
  }

  public void setViolationList(List<Violation> violationList) {
    this.violationList = violationList;
  }
}
