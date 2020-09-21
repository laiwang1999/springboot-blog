package com.yang.pojo;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Algorithm {
    public int id;
    public String title;
    public String content;
    public String type;
    public Date createTime;
}
