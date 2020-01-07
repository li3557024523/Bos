package com.xr.bos.pojo;


public class SorOutbound {

  private String outBoundId;
  private String handoverType;
  private String line;
  private Integer direction;
  private Integer acceptPerson;
  private Integer carriers;
  private Integer deliveryPerson;
  private java.sql.Date deliveryDate;
  private String deliveryCompany;
  private Integer enterPerson;
  private java.sql.Date enterDate;


  public String getOutBoundId() {
    return outBoundId;
  }

  public void setOutBoundId(String outBoundId) {
    this.outBoundId = outBoundId;
  }


  public String getHandoverType() {
    return handoverType;
  }

  public void setHandoverType(String handoverType) {
    this.handoverType = handoverType;
  }


  public String getLine() {
    return line;
  }

  public void setLine(String line) {
    this.line = line;
  }


  public Integer getDirection() {
    return direction;
  }

  public void setDirection(Integer direction) {
    this.direction = direction;
  }


  public Integer getAcceptPerson() {
    return acceptPerson;
  }

  public void setAcceptPerson(Integer acceptPerson) {
    this.acceptPerson = acceptPerson;
  }


  public Integer getCarriers() {
    return carriers;
  }

  public void setCarriers(Integer carriers) {
    this.carriers = carriers;
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


  public String getDeliveryCompany() {
    return deliveryCompany;
  }

  public void setDeliveryCompany(String deliveryCompany) {
    this.deliveryCompany = deliveryCompany;
  }


  public Integer getEnterPerson() {
    return enterPerson;
  }

  public void setEnterPerson(Integer enterPerson) {
    this.enterPerson = enterPerson;
  }


  public java.sql.Date getEnterDate() {
    return enterDate;
  }

  public void setEnterDate(java.sql.Date enterDate) {
    this.enterDate = enterDate;
  }

}
