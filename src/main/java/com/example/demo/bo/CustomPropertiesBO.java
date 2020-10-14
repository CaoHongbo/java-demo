package com.example.demo.bo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@ConfigurationProperties("test")
@Component
@Data
@PropertySource("classpath:test.properties")
public class CustomPropertiesBO {
    private Integer randomInt;
    private Integer randomIntMax;
    private Integer randomIntMiddle;
    private Long randomLong;
    private String randomValue;
    private String randomUuid;
}
