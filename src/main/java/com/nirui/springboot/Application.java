package com.nirui.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement//开启事务管理
//SpringBootServletInitializer打war包
@MapperScan("com.nirui.springboot.mapper")
public class Application extends SpringBootServletInitializer{
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(Application.class);
//    }
}
