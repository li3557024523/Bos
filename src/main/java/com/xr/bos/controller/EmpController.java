package com.xr.bos.controller;


import com.xr.bos.pojo.SyEmp;
import com.xr.bos.service.EmpService;
import com.xr.bos.util.Yzm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Random;

@RestController
public class EmpController {
    @Autowired
    private EmpService empService;

    @Autowired
    private Yzm yzm;


    @RequestMapping("/go")
    public ModelAndView loginEmp(SyEmp syEmp) throws IOException {
        ModelAndView mv = new ModelAndView();
            System.out.println(syEmp);
            SyEmp emp = empService.LoginEmp(syEmp);
            if (emp != null){
                System.out.println(emp);
            mv.addObject("emp",emp);
            mv.setViewName("pages/main.html");
            return mv;
        }else {
                mv.setViewName("pages/login.html");
                return mv;
            }
    }

    @RequestMapping("/yzcode")
    public void  invalidYzcode() throws IOException{

        HttpServletRequest request = null;
        HttpServletResponse response = null;
        //1.要取得用户输入在文本框中的值
        String code=(String)request.getParameter("c");
        //2.要取验证码中的值
        HttpSession session =request.getSession();
        String s=(String)session.getAttribute("s");
        PrintWriter out = response.getWriter();
        if(code.equalsIgnoreCase(s)){
            out.print(1);
        }else{
            out.print(2);
        }
        out.close();
    }



    @RequestMapping("/Code")
    private void imageToCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 创建一张图片
        int width = 115;
        int height = 40;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        // 创建一支画笔
        Graphics2D graphics = image.createGraphics();
        // 给画笔添加颜色
        graphics.setColor(Color.orange);
        // 填充矩形
        graphics.fillRect(0, 0, width, height);

        String str = yzm.getString();
        HttpSession session = request.getSession();
        // 将字符串存入session
        session.setAttribute("yzm", str);

        Random random = new Random();
        // 根据验证码长度随机画干扰线(颜色随机，位置随机，长度随机)
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            Font font = new Font("微软雅黑", Font.BOLD, 22);
            graphics.setFont(font);
            Color color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
            graphics.setColor(color);
            graphics.drawString(String.valueOf(c), 20 + i * 15, 20);
            int x1 = random.nextInt(width);
            int y1 = random.nextInt(height);
            int x2 = random.nextInt(width);
            int y2 = random.nextInt(height);
            graphics.drawLine(x1, y1, x2, y2);
        }
        // 把图像刷到BufferedImage对象中
        graphics.dispose();
        // 将图像写入 File，并指定图片格式
        ImageIO.write(image, "jpg", response.getOutputStream());
        }
    }

