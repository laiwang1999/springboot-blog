package com.yang.service.javaDevelopment;

import com.yang.mapper.JavaDevelopmentMapper;
import com.yang.pojo.Java;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JavaDevelopmentServiceImpl implements JavaDevelopmentService{
    @Autowired
    JavaDevelopmentMapper javaDevelopmentMapper;
    @Override
    public List<Java> selectAllJavaDevelopment() {
        return javaDevelopmentMapper.selectAllJavaDevelopment();
    }
}
