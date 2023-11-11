package com.example.skycastdemo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();

        // 添加 XML 消息转换器
        restTemplate.getMessageConverters().add(new MappingJackson2XmlHttpMessageConverter());

        return restTemplate;
    }
}


