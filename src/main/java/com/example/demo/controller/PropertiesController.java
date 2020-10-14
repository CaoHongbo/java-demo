package com.example.demo.controller;

import com.example.demo.bo.CustomPropertiesBO;
import com.example.demo.bo.PropertiesBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 通过@Value使用自定义属性
 * @Author sgl
 * @Date 2018-04-27 14:41
 */
@RestController
public class PropertiesController {
    /**
     * 通过${}获取application.properties里的自定义属性
     */
    @Value("${pocket.name}")
    private String name;

    @Value("${pocket.age}")
    private Integer age;

    @Value("${pocket.address}")
    private String address;

    @Autowired
    private PropertiesBO propertiesBO;
    @Autowired
    private CustomPropertiesBO customPropertiesBO;

    @GetMapping("/value")
    public String value() {
        return "大家好，我的名字是" + name + "，我今年" + age + "岁了，我在" + address+"工作！";
    }

    @GetMapping("/property")
    public String property() {
        return "大家好，我的名字是" + propertiesBO.getName() + "，我今年" + propertiesBO.getAge() +
            "岁了，我在" + propertiesBO.getAddress()
            +"工作！";
    }

    @GetMapping("/custom")
    public CustomPropertiesBO custom() {
        return customPropertiesBO;
    }
}