package com.xr.bos.controller;

import com.xr.bos.mapper.Sor_StorageMapper;
import com.xr.bos.mapper.Sy_EmpMapper;
import com.xr.bos.pojo.SorStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@ResponseBody
public class TestController {
    @Autowired
    public Sy_EmpMapper sy;
    @Autowired
    public Sor_StorageMapper Ss;
    String b;
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

    @RequestMapping(value = "/pop",method = RequestMethod.GET, produces="application/json;charset=utf-8")
    public String add(){

      List<SorStorage> list=Ss.query_Sor_Storage();
        System.out.println(list.get(0).getSyEmp().getEmpName());
      //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        return list.get(0).toString() ;
    }
}
