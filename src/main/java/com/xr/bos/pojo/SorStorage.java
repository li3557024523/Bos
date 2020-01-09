package com.xr.bos.pojo;


import java.util.List;

public class SorStorage {

  private Integer id;
  private java.sql.Date acceptDate;
  private SyEmp acceptPerson;
  private String acceptCompany;
  private SyEmp deliveryPerson;
  private String deliveryCompany;
  private List<SorStoragedetails> SOR_StorageDetails;


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


  public SyEmp getAcceptPerson() {
    return acceptPerson;
  }

  public void setAcceptPerson(SyEmp acceptPerson) {
    this.acceptPerson = acceptPerson;
  }


  public String getAcceptCompany() {
    return acceptCompany;
  }

  public void setAcceptCompany(String acceptCompany) {
    this.acceptCompany = acceptCompany;
  }


  public SyEmp getDeliveryPerson() {
    return deliveryPerson;
  }

  public void setDeliveryPerson(SyEmp deliveryPerson) {
    this.deliveryPerson = deliveryPerson;
  }


  public String getDeliveryCompany() {
    return deliveryCompany;
  }

  public void setDeliveryCompany(String deliveryCompany) {
    this.deliveryCompany = deliveryCompany;
  }

}
