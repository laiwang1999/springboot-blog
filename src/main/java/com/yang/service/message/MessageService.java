package com.yang.service.message;

import com.yang.pojo.Message;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MessageService {
    //查找所有留言
    List<Message> selectMessage();

    //添加留言信息
    int addMessage(Message message);

    //删除留言信息
    int deleteMessage(int id);

    Message selectMessageByName(String name);
}
