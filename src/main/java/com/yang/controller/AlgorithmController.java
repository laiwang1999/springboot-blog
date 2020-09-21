package com.yang.controller;

import com.yang.pojo.Algorithm;
import com.yang.service.algorithm.AlgorithmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AlgorithmController {
    @Autowired
    AlgorithmService algorithmService;

    @GetMapping({"/","/index"})
    public String getAlgorithmList(Model model) {
        List<Algorithm> algorithms = algorithmService.selectAllAlgorithm();
        model.addAttribute("algorithms", algorithms);
        //标题active作用
        model.addAttribute("algorithm",true);
        //面包屑active作用
        model.addAttribute("article",true);
        return "algorithm/algorithmList";
    }

}
