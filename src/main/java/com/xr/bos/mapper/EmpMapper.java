package com.xr.bos.mapper;

import com.xr.bos.pojo.SyEmp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
public interface EmpMapper {

    /**
     * 登入
     * @param
     * @param
     * @return
     */
    @Select("select * from sy_emp where EmpName = #{empName} and Pwd = #{pwd}")
    SyEmp LoginEmp(SyEmp syEmp);
}
