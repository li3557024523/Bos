package com.xr.bos.pojo;


public class BasBasicarchives {

  private Integer id;
  private String name;
  private String grade;
  private Integer operatorId;
  private Integer operationUnitId;
  private String remarks;
  private java.sql.Date operationTime;


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


  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
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


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }


  public java.sql.Date getOperationTime() {
    return operationTime;
  }

  public void setOperationTime(java.sql.Date operationTime) {
    this.operationTime = operationTime;
  }

}
