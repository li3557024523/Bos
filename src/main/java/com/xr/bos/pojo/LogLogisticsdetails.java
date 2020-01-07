package com.xr.bos.pojo;


public class LogLogisticsdetails {

  private Integer id;
  private String logisticsInt;
  private String companyName;
  private java.sql.Date expectArrivalDate;
  private java.sql.Date actualArrivalDate;
  private java.sql.Date expectDepartureDate;
  private java.sql.Date actualDepartureDate;
  private String operationPerson;
  private String logisticsType;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getLogisticsInt() {
    return logisticsInt;
  }

  public void setLogisticsInt(String logisticsInt) {
    this.logisticsInt = logisticsInt;
  }


  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public java.sql.Date getExpectArrivalDate() {
    return expectArrivalDate;
  }

  public void setExpectArrivalDate(java.sql.Date expectArrivalDate) {
    this.expectArrivalDate = expectArrivalDate;
  }


  public java.sql.Date getActualArrivalDate() {
    return actualArrivalDate;
  }

  public void setActualArrivalDate(java.sql.Date actualArrivalDate) {
    this.actualArrivalDate = actualArrivalDate;
  }


  public java.sql.Date getExpectDepartureDate() {
    return expectDepartureDate;
  }

  public void setExpectDepartureDate(java.sql.Date expectDepartureDate) {
    this.expectDepartureDate = expectDepartureDate;
  }


  public java.sql.Date getActualDepartureDate() {
    return actualDepartureDate;
  }

  public void setActualDepartureDate(java.sql.Date actualDepartureDate) {
    this.actualDepartureDate = actualDepartureDate;
  }


  public String getOperationPerson() {
    return operationPerson;
  }

  public void setOperationPerson(String operationPerson) {
    this.operationPerson = operationPerson;
  }


  public String getLogisticsType() {
    return logisticsType;
  }

  public void setLogisticsType(String logisticsType) {
    this.logisticsType = logisticsType;
  }

}
