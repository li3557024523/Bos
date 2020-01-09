package com.xr.bos.controller;


import com.xr.bos.pojo.SyEmp;
import com.xr.bos.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("/go")
    public ModelAndView loginEmp(SyEmp syEmp){
        System.out.println(syEmp);
        SyEmp emp = empService.LoginEmp(syEmp);
        System.out.println(emp);
        ModelAndView mv = new ModelAndView();
        mv.addObject("emp",emp);
        mv.setViewName("pages/main.html");
        return mv;
    }
}
