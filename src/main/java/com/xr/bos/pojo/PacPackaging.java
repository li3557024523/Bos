package com.xr.bos.pojo;


public class PacPackaging {

  private Integer id;
  private String itemCode;
  private String itemName;
  private double plannedPrice;
  private String specifications;
  private String type;
  private String measurementUnit;
  private String status;
  private Integer operatorId;
  private Integer operationUnitId;
  private java.sql.Date operationTime;
  private Integer invalidateJobInt;
  private Integer invalidateName;
  private java.sql.Date invalidateTime;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getItemCode() {
    return itemCode;
  }

  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }


  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }


  public double getPlannedPrice() {
    return plannedPrice;
  }

  public void setPlannedPrice(double plannedPrice) {
    this.plannedPrice = plannedPrice;
  }


  public String getSpecifications() {
    return specifications;
  }

  public void setSpecifications(String specifications) {
    this.specifications = specifications;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getMeasurementUnit() {
    return measurementUnit;
  }

  public void setMeasurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public Integer getOperatorId() {
    return operatorId;
  }

  public void setOperatorId(Integer operatorId) {
    this.operatorId = operatorId;
  }


  public Integer getOperationUnitId() {
    return operationUnitId;
  }

  public void setOperationUnitId(Integer operationUnitId) {
    this.operationUnitId = operationUnitId;
  }


  public java.sql.Date getOperationTime() {
    return operationTime;
  }

  public void setOperationTime(java.sql.Date operationTime) {
    this.operationTime = operationTime;
  }


  public Integer getInvalidateJobInt() {
    return invalidateJobInt;
  }

  public void setInvalidateJobInt(Integer invalidateJobInt) {
    this.invalidateJobInt = invalidateJobInt;
  }


  public Integer getInvalidateName() {
    return invalidateName;
  }

  public void setInvalidateName(Integer invalidateName) {
    this.invalidateName = invalidateName;
  }


  public java.sql.Date getInvalidateTime() {
    return invalidateTime;
  }

  public void setInvalidateTime(java.sql.Date invalidateTime) {
    this.invalidateTime = invalidateTime;
  }

}
