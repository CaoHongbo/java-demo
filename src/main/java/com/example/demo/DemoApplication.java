package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * TODO
 * 1. 外部配置
 */


/**
 * 说明：
 *
 * @SpringBootApplication等价于@SpringBootConfiguration、@EnableAutoConfiguration和@ComponentScan这三个注解。
 * @SpringBootApplication开启了spring的组件扫描和自动配置功能
 */
@SpringBootApplication
@MapperScan("com.example.demo.dao") // 扫描 Mapper
//@EnableTransactionManagement // 开启事务
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
