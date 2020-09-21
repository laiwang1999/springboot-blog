package com.yang.service.algorithm;

import com.yang.pojo.Algorithm;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AlgorithmService {
    //查找所有算法文章
    List<Algorithm> selectAllAlgorithm();
    //根据名称查找算法文章
    Algorithm selectAlgorithmByTitle(String title);
    //添加算法文章
    int addAlgorithm(Algorithm algorithm);
    //更新算法文章
    int updateAlgorithm(Algorithm algorithm);
    //删除算法文章
    int deleteAlgorithm(int id);
}
