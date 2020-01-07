package com.xr.bos.pojo;


public class DisPropagandatask {

  private Integer id;
  private String outline;
  private java.sql.Date releaseTime;
  private java.sql.Date failureTime;
  private String status;
  private String content;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getOutline() {
    return outline;
  }

  public void setOutline(String outline) {
    this.outline = outline;
  }


  public java.sql.Date getReleaseTime() {
    return releaseTime;
  }

  public void setReleaseTime(java.sql.Date releaseTime) {
    this.releaseTime = releaseTime;
  }


  public java.sql.Date getFailureTime() {
    return failureTime;
  }

  public void setFailureTime(java.sql.Date failureTime) {
    this.failureTime = failureTime;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

}
