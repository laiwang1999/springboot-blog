package com.yang.controller;

import com.yang.pojo.Java;
import com.yang.service.javaDevelopment.JavaDevelopmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class JavaDevelopmentController {
    @Autowired
    JavaDevelopmentServiceImpl service;
    @GetMapping("/javaList")
    public String javaList(Model model){
        List<Java> javaList = service.selectAllJavaDevelopment();
        model.addAttribute("javaList",javaList);
        //面包屑active作用
        model.addAttribute("javaPage",true);
        //标题active作用
        model.addAttribute("articlePage",true);
        return "article/JavaDevelopment/javaDevelopmentList";
    }

}
