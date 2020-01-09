package com.xr.bos.pojo;


public class SorStorage {

  private Integer id;
  private java.sql.Date acceptDate;
  private Integer acceptPerson;
  private String acceptCompany;
  private Integer deliveryPerson;
  private String deliveryCompany;
  private SyEmp syEmp;
public SorStorage(){

}
  @Override
  public String toString() {

    return "SorStorage{" +
            "id=" + id +
            ", acceptDate=" + acceptDate +
            ", acceptPerson=" + acceptPerson +
            ", acceptCompany='" + acceptCompany + '\'' +
            ", deliveryPerson=" + deliveryPerson +
            ", deliveryCompany='" + deliveryCompany + '\'' +
            ", syEmp=" + syEmp +
            '}';
  }

  public SyEmp getSyEmp() {
    return syEmp;
  }

  public void setSyEmp(SyEmp syEmp) {
    this.syEmp = syEmp;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public java.sql.Date getAcceptDate() {
    return acceptDate;
  }

  public void setAcceptDate(java.sql.Date acceptDate) {
    this.acceptDate = acceptDate;
  }


  public Integer getAcceptPerson() {
    return acceptPerson;
  }

  public void setAcceptPerson(Integer acceptPerson) {
    this.acceptPerson = acceptPerson;
  }


  public String getAcceptCompany() {
    return acceptCompany;
  }

  public void setAcceptCompany(String acceptCompany) {
    this.acceptCompany = acceptCompany;
  }


  public Integer getDeliveryPerson() {
    return deliveryPerson;
  }

  public void setDeliveryPerson(Integer deliveryPerson) {
    this.deliveryPerson = deliveryPerson;
  }


  public String getDeliveryCompany() {
    return deliveryCompany;
  }

  public void setDeliveryCompany(String deliveryCompany) {
    this.deliveryCompany = deliveryCompany;
  }

}
