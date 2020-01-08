package com.xr.bos;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.xr.bos.controller")
@MapperScan("com.xr.bos.mapper")
@SpringBootApplication
public class BosApplication {

    public static void main(String[] args) {
        SpringApplication.run(BosApplication.class, args);
    }

}
