package com.xr.bos.pojo;


public class LogLogisticstransfer {

  private Integer id;
  private String transferInt;
  private String startStation;
  private String endStation;
  private String dispatcher;
  private String driver;
  private Integer deliveryPerson;
  private java.sql.Date deliveryDate;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getTransferInt() {
    return transferInt;
  }

  public void setTransferInt(String transferInt) {
    this.transferInt = transferInt;
  }


  public String getStartStation() {
    return startStation;
  }

  public void setStartStation(String startStation) {
    this.startStation = startStation;
  }


  public String getEndStation() {
    return endStation;
  }

  public void setEndStation(String endStation) {
    this.endStation = endStation;
  }


  public String getDispatcher() {
    return dispatcher;
  }

  public void setDispatcher(String dispatcher) {
    this.dispatcher = dispatcher;
  }


  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }


  public Integer getDeliveryPerson() {
    return deliveryPerson;
  }

  public void setDeliveryPerson(Integer deliveryPerson) {
    this.deliveryPerson = deliveryPerson;
  }


  public java.sql.Date getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(java.sql.Date deliveryDate) {
    this.deliveryDate = deliveryDate;
  }

}
