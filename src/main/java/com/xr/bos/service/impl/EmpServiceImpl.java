package com.xr.bos.service.impl;

import com.xr.bos.mapper.EmpMapper;
import com.xr.bos.pojo.SyEmp;
import com.xr.bos.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public SyEmp LoginEmp(SyEmp syEmp) {
        return empMapper.LoginEmp(syEmp);
    }
}
