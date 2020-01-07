package com.xr.bos.pojo;


public class IaeArrival {

  private String id;
  private String sendCompany;
  private String cargoAddress;
  private String issuePerson;
  private java.sql.Date issueDate;
  private String workAddress;
  private java.sql.Date storageDate;
  private java.sql.Date outBoundDate;
  private java.sql.Date timeLimit;
  private java.sql.Date batch;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getSendCompany() {
    return sendCompany;
  }

  public void setSendCompany(String sendCompany) {
    this.sendCompany = sendCompany;
  }


  public String getCargoAddress() {
    return cargoAddress;
  }

  public void setCargoAddress(String cargoAddress) {
    this.cargoAddress = cargoAddress;
  }


  public String getIssuePerson() {
    return issuePerson;
  }

  public void setIssuePerson(String issuePerson) {
    this.issuePerson = issuePerson;
  }


  public java.sql.Date getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(java.sql.Date issueDate) {
    this.issueDate = issueDate;
  }


  public String getWorkAddress() {
    return workAddress;
  }

  public void setWorkAddress(String workAddress) {
    this.workAddress = workAddress;
  }


  public java.sql.Date getStorageDate() {
    return storageDate;
  }

  public void setStorageDate(java.sql.Date storageDate) {
    this.storageDate = storageDate;
  }


  public java.sql.Date getOutBoundDate() {
    return outBoundDate;
  }

  public void setOutBoundDate(java.sql.Date outBoundDate) {
    this.outBoundDate = outBoundDate;
  }


  public java.sql.Date getTimeLimit() {
    return timeLimit;
  }

  public void setTimeLimit(java.sql.Date timeLimit) {
    this.timeLimit = timeLimit;
  }


  public java.sql.Date getBatch() {
    return batch;
  }

  public void setBatch(java.sql.Date batch) {
    this.batch = batch;
  }

}
