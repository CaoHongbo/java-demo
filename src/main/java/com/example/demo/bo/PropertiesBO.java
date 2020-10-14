package com.example.demo.bo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description 由Spring根据ConfigurationProperties自动注入属性的值
 * @Author sgl
 * @Date 2018-04-27 15:29
 */
@Component
@Data
@ConfigurationProperties(prefix = "pocket")
public class PropertiesBO {
    private String name;
    private Integer age;
    private String address;
}