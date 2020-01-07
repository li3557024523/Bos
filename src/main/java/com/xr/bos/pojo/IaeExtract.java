package com.xr.bos.pojo;


public class IaeExtract {

  private String id;
  private String vehicleInt;
  private String transportWay;
  private String waybillId;
  private java.sql.Date estimateDate;
  private Integer cargoN;
  private String importantHints;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getVehicleInt() {
    return vehicleInt;
  }

  public void setVehicleInt(String vehicleInt) {
    this.vehicleInt = vehicleInt;
  }


  public String getTransportWay() {
    return transportWay;
  }

  public void setTransportWay(String transportWay) {
    this.transportWay = transportWay;
  }


  public String getWaybillId() {
    return waybillId;
  }

  public void setWaybillId(String waybillId) {
    this.waybillId = waybillId;
  }


  public java.sql.Date getEstimateDate() {
    return estimateDate;
  }

  public void setEstimateDate(java.sql.Date estimateDate) {
    this.estimateDate = estimateDate;
  }


  public Integer getCargoN() {
    return cargoN;
  }

  public void setCargoN(Integer cargoN) {
    this.cargoN = cargoN;
  }


  public String getImportantHints() {
    return importantHints;
  }

  public void setImportantHints(String importantHints) {
    this.importantHints = importantHints;
  }

}
