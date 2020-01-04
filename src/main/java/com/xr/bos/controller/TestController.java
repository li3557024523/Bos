package com.xr.bos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
    @RequestMapping("/test")
    public ModelAndView test() {
        ModelAndView mv = new ModelAndView();
        String a = "你🐎真好康！！！";
        mv.addObject("test", a);
        mv.setViewName("pages/login.html");
        return mv;
    }
}
