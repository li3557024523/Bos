package com.xr.bos.pojo;


public class DisDispatchhistory {

  private Integer id;
  private Integer dispatchSequence;
  private Integer transferredUnit;
  private Integer operatorId;
  private Integer operationUnitId;
  private java.sql.Date operationTime;
  private String remark;
  private String status;
  private String reason;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getDispatchSequence() {
    return dispatchSequence;
  }

  public void setDispatchSequence(Integer dispatchSequence) {
    this.dispatchSequence = dispatchSequence;
  }


  public Integer getTransferredUnit() {
    return transferredUnit;
  }

  public void setTransferredUnit(Integer transferredUnit) {
    this.transferredUnit = transferredUnit;
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


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

}
