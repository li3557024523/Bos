package com.xr.bos.pojo;


public class SorCheckbounddetails {

  private Integer id;
  private Integer cargoCount;
  private double weight;
  private double volume;
  private String cargoType;
  private String direction;
  private Integer storagePerson;
  private java.sql.Date storageDate;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getCargoCount() {
    return cargoCount;
  }

  public void setCargoCount(Integer cargoCount) {
    this.cargoCount = cargoCount;
  }


  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }


  public double getVolume() {
    return volume;
  }

  public void setVolume(double volume) {
    this.volume = volume;
  }


  public String getCargoType() {
    return cargoType;
  }

  public void setCargoType(String cargoType) {
    this.cargoType = cargoType;
  }


  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }


  public Integer getStoragePerson() {
    return storagePerson;
  }

  public void setStoragePerson(Integer storagePerson) {
    this.storagePerson = storagePerson;
  }


  public java.sql.Date getStorageDate() {
    return storageDate;
  }

  public void setStorageDate(java.sql.Date storageDate) {
    this.storageDate = storageDate;
  }

}
