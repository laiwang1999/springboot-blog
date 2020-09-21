package com.yang.service.algorithm;

import com.yang.mapper.AlgorithmMapper;
import com.yang.pojo.Algorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlgorithmServiceImpl implements AlgorithmService {
    @Autowired
    AlgorithmMapper mapper;

    @Override
    public List<Algorithm> selectAllAlgorithm() {
        return mapper.selectAllAlgorithm();
    }

    @Override
    public Algorithm selectAlgorithmByTitle(String title) {
        return mapper.selectAlgorithmByTitle(title);
    }

    @Override
    public int addAlgorithm(Algorithm algorithm) {
        return mapper.addAlgorithm(algorithm);
    }

    @Override
    public int updateAlgorithm(Algorithm algorithm) {
        return mapper.updateAlgorithm(algorithm);
    }

    @Override
    public int deleteAlgorithm(int id) {
        return mapper.deleteAlgorithm(id);
    }
}
