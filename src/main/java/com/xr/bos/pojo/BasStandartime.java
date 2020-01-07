package com.xr.bos.pojo;


public class BasStandartime {

  private Integer id;
  private String timeName;
  private Integer subordinateUnit;
  private java.sql.Date workingTime;
  private java.sql.Date closingTime;
  private java.sql.Date saturdayWorkingTime;
  private java.sql.Date saturdayClosingTime;
  private java.sql.Date sundayWorkingTime;
  private java.sql.Date sundayClosingTime;
  private String stats;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getTimeName() {
    return timeName;
  }

  public void setTimeName(String timeName) {
    this.timeName = timeName;
  }


  public Integer getSubordinateUnit() {
    return subordinateUnit;
  }

  public void setSubordinateUnit(Integer subordinateUnit) {
    this.subordinateUnit = subordinateUnit;
  }


  public java.sql.Date getWorkingTime() {
    return workingTime;
  }

  public void setWorkingTime(java.sql.Date workingTime) {
    this.workingTime = workingTime;
  }


  public java.sql.Date getClosingTime() {
    return closingTime;
  }

  public void setClosingTime(java.sql.Date closingTime) {
    this.closingTime = closingTime;
  }


  public java.sql.Date getSaturdayWorkingTime() {
    return saturdayWorkingTime;
  }

  public void setSaturdayWorkingTime(java.sql.Date saturdayWorkingTime) {
    this.saturdayWorkingTime = saturdayWorkingTime;
  }


  public java.sql.Date getSaturdayClosingTime() {
    return saturdayClosingTime;
  }

  public void setSaturdayClosingTime(java.sql.Date saturdayClosingTime) {
    this.saturdayClosingTime = saturdayClosingTime;
  }


  public java.sql.Date getSundayWorkingTime() {
    return sundayWorkingTime;
  }

  public void setSundayWorkingTime(java.sql.Date sundayWorkingTime) {
    this.sundayWorkingTime = sundayWorkingTime;
  }


  public java.sql.Date getSundayClosingTime() {
    return sundayClosingTime;
  }

  public void setSundayClosingTime(java.sql.Date sundayClosingTime) {
    this.sundayClosingTime = sundayClosingTime;
  }


  public String getStats() {
    return stats;
  }

  public void setStats(String stats) {
    this.stats = stats;
  }

}
