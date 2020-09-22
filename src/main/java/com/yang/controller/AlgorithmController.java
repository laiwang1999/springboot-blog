package com.yang.controller;

import com.yang.pojo.Algorithm;
import com.yang.service.algorithm.AlgorithmService;
import com.yang.service.algorithm.AlgorithmServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AlgorithmController {
    @Autowired
    AlgorithmServiceImpl algorithmService;
    @GetMapping({"/algorithm","/"})
    public String getAlgorithmList(Model model) {
        List<Algorithm> algorithms = algorithmService.selectAllAlgorithm();
        model.addAttribute("algorithms", algorithms);
        //标题active作用
        model.addAttribute("algorithmPage",true);
        //面包屑active作用
        model.addAttribute("articlePage",true);
        return "article/algorithm/algorithmList";
    }
    @ResponseBody
    @GetMapping("/algorithm/list")
    public List<Algorithm> getAlgorithmList(){
        return algorithmService.selectAllAlgorithm();
    }
}
