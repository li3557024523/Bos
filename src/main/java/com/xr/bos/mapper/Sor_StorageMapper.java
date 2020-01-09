package com.xr.bos.mapper;

import com.xr.bos.pojo.SorStorage;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Sor_StorageMapper {
    @Select("select * from Sor_Storage")
    @Results(id = "sor_storagemapper",value = {
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "uid",column = "uid"),
            @Result(property = "money",column = "money"),
            //配置用户查询的方式 column代表的传入的字段，一对一查询用one select 代表使用的方法的全限定名， fetchType表示查询的方式为立即加载还是懒加载
            @Result(property = "user",column = "uid",one = @One(select = "com.example.dao.UserDao.findById",fetchType = FetchType.EAGER))
    })
    List<SorStorage> query_Sor_Storage();
}
