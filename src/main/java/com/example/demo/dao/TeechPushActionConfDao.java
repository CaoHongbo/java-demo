package com.example.demo.dao;

import com.example.demo.source.TeechPushActionConf;
import com.example.demo.source.TeechPushActionConfExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TeechPushActionConfDao {
    long countByExample(TeechPushActionConfExample example);

    int deleteByExample(TeechPushActionConfExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TeechPushActionConf record);

    int insertSelective(TeechPushActionConf record);

    List<TeechPushActionConf> selectByExample(TeechPushActionConfExample example);

    TeechPushActionConf selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TeechPushActionConf record, @Param("example") TeechPushActionConfExample example);

    int updateByExample(@Param("record") TeechPushActionConf record, @Param("example") TeechPushActionConfExample example);

    int updateByPrimaryKeySelective(TeechPushActionConf record);

    int updateByPrimaryKey(TeechPushActionConf record);

    @Select("select * from teech_push_action_conf limit #{page}, #{pageSize}")
        // @Select("select * from teech_push_action_conf limit #{teechPushActionConf.page}, #{teechPushActionConf.pageSize}")
    List<TeechPushActionConf> selectTPAC(
        @Param("teechPushActionConf") TeechPushActionConf teechPushActionConf,
        @Param("page") int page,
        @Param("pageSize") int pageSize);

    // TODO SelectProvider

}