package com.yang.mapper;

import com.yang.pojo.Algorithm;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface AlgorithmMapper {
    //查找所有文章
    @Select("select * from algorithm_article order by createTime desc ;")
    List<Algorithm> selectAllAlgorithm();

    //根据名称查找算法文章
    @Select("select * from algorithm_article where title = #{title};")
    Algorithm selectAlgorithmByTitle(@Param("title") String title);

    //添加算法文章
    @Insert("insert into algorithm_article (uuid, title, content) values (#{id}, #{title}, #{content});")
    int addAlgorithm(Algorithm algorithm);

    //更新算法文章
    @Update("update algorithm_article set title=#{title}, content=#{content} where uuid = #{id};")
    int updateAlgorithm(Algorithm algorithm);

    //删除算法文章
    @Delete("delete from algorithm_article where uuid = #{id};")
    int deleteAlgorithm(@Param("id") int id);
}
