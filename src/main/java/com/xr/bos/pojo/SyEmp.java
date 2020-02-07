package com.xr.bos.pojo;


public class SyEmp {

  private Integer id;
  private String empName;
  private String empNo;
  private String pwd;
  private String queryPwd;
  private Integer roleId;
  private Integer empUnit;
  private String remark;
  private String disabled;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }


  public String getEmpNo() {
    return empNo;
  }

  public void setEmpNo(String empNo) {
    this.empNo = empNo;
  }


  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }


  public String getQueryPwd() {
    return queryPwd;
  }

  public void setQueryPwd(String queryPwd) {
    this.queryPwd = queryPwd;
  }


  public Integer getRoleId() {
    return roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }


  public Integer getEmpUnit() {
    return empUnit;
  }

  public void setEmpUnit(Integer empUnit) {
    this.empUnit = empUnit;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public String getDisabled() {
    return disabled;
  }

  public void setDisabled(String disabled) {
    this.disabled = disabled;
  }

  @Override
  public String toString() {
    return "SyEmp{" +
            "id=" + id +
            ", empName='" + empName + '\'' +
            ", empNo='" + empNo + '\'' +
            ", pwd='" + pwd + '\'' +
            ", queryPwd='" + queryPwd + '\'' +
            ", roleId=" + roleId +
            ", empUnit=" + empUnit +
            ", remark='" + remark + '\'' +
            ", disabled='" + disabled + '\'' +
            '}';
  }
}
