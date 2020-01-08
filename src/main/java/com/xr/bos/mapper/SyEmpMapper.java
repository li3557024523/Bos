package com.xr.bos.mapper;

import com.xr.bos.pojo.SyEmp;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface SyEmpMapper {
    @Select("select * from Sy_Emp where id=#{id}")
     SyEmp queryOne(int id);

}
