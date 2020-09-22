package com.yang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8082/algorithm/list")
                .allowCredentials(true)
                .allowedMethods("GET","POST","DELETE","PUT","PATCH")
                .allowedHeaders("*");
    }

    //开启国际化
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocalResolver();
    }


}
