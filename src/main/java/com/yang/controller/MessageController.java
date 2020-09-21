package com.yang.controller;

import com.yang.pojo.Message;
import com.yang.service.message.MessageServiceImpl;
import com.yang.utils.UUIDUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MessageController {
    @Autowired
    MessageServiceImpl messageService;

    @GetMapping("/message/show")
    public String showMessage(Model model){
        List<Message> messages = messageService.selectMessage();
        model.addAttribute("messages",messages);
        model.addAttribute("message",true);
        return "message/leacots";
    }
    @PostMapping("/message/add")
    public String addMessage(Model model,
                             @Param("name") String name,
                             @Param("content") String content){
        Message message = new Message(UUIDUtils.getUUID(),name,content);
        messageService.addMessage(message);
        model.addAttribute("message",true);
        return "redirect:/message/show";
    }
}
