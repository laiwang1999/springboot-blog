package com.yang.service.message;

import com.yang.mapper.MessageMapper;
import com.yang.pojo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MessageServiceImpl implements MessageService{
    @Autowired
    MessageMapper mapper;
    @Override
    public List<Message> selectMessage() {
        return mapper.selectMessage();
    }

    @Override
    public int addMessage(Message message) {
        return mapper.addMessage(message);
    }

    @Override
    public int deleteMessage(int id) {
        return mapper.deleteMessage(id);
    }

    @Override
    public Message selectMessageByName(String name) {
        return mapper.selectMessageByName(name);
    }
}
