package com.xr.bos.pojo;


public class PacStock {

  private String warehouseNo;
  private String reservoirType;
  private String transport;
  private String subordinateUnit;
  private Integer drawerNo;
  private String drawerName;
  private java.sql.Date drawerTime;
  private Integer produceTypeId;
  private String stats;
  private String remark;


  public String getWarehouseNo() {
    return warehouseNo;
  }

  public void setWarehouseNo(String warehouseNo) {
    this.warehouseNo = warehouseNo;
  }


  public String getReservoirType() {
    return reservoirType;
  }

  public void setReservoirType(String reservoirType) {
    this.reservoirType = reservoirType;
  }


  public String getTransport() {
    return transport;
  }

  public void setTransport(String transport) {
    this.transport = transport;
  }


  public String getSubordinateUnit() {
    return subordinateUnit;
  }

  public void setSubordinateUnit(String subordinateUnit) {
    this.subordinateUnit = subordinateUnit;
  }


  public Integer getDrawerNo() {
    return drawerNo;
  }

  public void setDrawerNo(Integer drawerNo) {
    this.drawerNo = drawerNo;
  }


  public String getDrawerName() {
    return drawerName;
  }

  public void setDrawerName(String drawerName) {
    this.drawerName = drawerName;
  }


  public java.sql.Date getDrawerTime() {
    return drawerTime;
  }

  public void setDrawerTime(java.sql.Date drawerTime) {
    this.drawerTime = drawerTime;
  }


  public Integer getProduceTypeId() {
    return produceTypeId;
  }

  public void setProduceTypeId(Integer produceTypeId) {
    this.produceTypeId = produceTypeId;
  }


  public String getStats() {
    return stats;
  }

  public void setStats(String stats) {
    this.stats = stats;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
