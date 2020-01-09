package com.xr.bos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
    @RequestMapping("/login")
    public ModelAndView test() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("pages/login.html");
        return mv;
    }
}
