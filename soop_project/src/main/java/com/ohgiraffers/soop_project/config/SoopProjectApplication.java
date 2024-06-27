package com.ohgiraffers.soop_project.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ohgiraffers.soop_project")
@MapperScan(basePackages = "com.ohgiraffers.soop_project.dashboard.model.dao")
public class SoopProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(SoopProjectApplication.class, args);
    }
}