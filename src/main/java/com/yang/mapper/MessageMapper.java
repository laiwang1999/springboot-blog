package com.yang.mapper;

import com.yang.pojo.Message;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface MessageMapper {
    //查找所有留言
    List<Message> selectMessage();
    //添加留言信息
    int addMessage(Message message);
    //删除留言信息
    int deleteMessage(@Param("uuid") int id);
    Message selectMessageByName(@Param("name") String name);
}
