package com.yang.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.Nullable;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    private String uuid;
    private String name;
    private String content;
    private Date date;
    public Message(String uuid,String name,String content){
        this.uuid = uuid;
        this.name=name;
        this.content=content;
    }

}
