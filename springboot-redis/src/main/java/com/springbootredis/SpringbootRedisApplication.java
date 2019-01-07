package com.springbootredis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan(basePackages = "com.springbootredis.*")       //加载@Service @Control注解类
@MapperScan(value = "com.springbootredis.dao")  //mybatis 需要扫描mapper接口
@EnableWebMvc                   //启用mvc
@EnableTransactionManagement    //启用事务管理
@EnableCaching                  //开启SpringBoot中的缓存
public class SpringbootRedisApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootRedisApplication.class, args);
    }

}

