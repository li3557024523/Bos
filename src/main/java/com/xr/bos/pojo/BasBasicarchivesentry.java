package com.xr.bos.pojo;


public class BasBasicarchivesentry {

  private Integer id;
  private String name;
  private Integer parentId;
  private String mnemonicCode;
  private String available;
  private String remarks;
  private Integer operatorId;
  private Integer operationUnitId;
  private java.sql.Date operationTime;
  private String stats;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Integer getParentId() {
    return parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }


  public String getMnemonicCode() {
    return mnemonicCode;
  }

  public void setMnemonicCode(String mnemonicCode) {
    this.mnemonicCode = mnemonicCode;
  }


  public String getAvailable() {
    return available;
  }

  public void setAvailable(String available) {
    this.available = available;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
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


  public String getStats() {
    return stats;
  }

  public void setStats(String stats) {
    this.stats = stats;
  }

}
