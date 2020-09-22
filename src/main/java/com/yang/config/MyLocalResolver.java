package com.yang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocalResolver implements LocaleResolver {
    //解析请求
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        //获取请求中的参数链接
        String language = httpServletRequest.getParameter("l");
        Locale locale = Locale.getDefault(); //默认的,如果没有就使用默认的
        //如果请求的携带了国际化的参数
        if(!StringUtils.isEmpty(language)){
            //zh_CN
            String[] s = language.split("_");
            //国家，地区
            locale = new Locale(s[0], s[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
