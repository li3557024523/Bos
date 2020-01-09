package com.xr.bos.controller;

import com.xr.bos.mapper.Sy_EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
    @Autowired
    public Sy_EmpMapper sy;
    @RequestMapping("/test")
    public ModelAndView test() {
        ModelAndView mv = new ModelAndView();
        String a = "你🐎真好康！！！";
        String aa = "随便";
        mv.addObject("test", a);
        mv.setViewName("pages/login.html");
        return mv;
    }
    @RequestMapping("/index")
    public String ad(){
        System.out.println(sy.queryOne(1).toString());
        return sy.queryOne(1).toString();
    }
}
