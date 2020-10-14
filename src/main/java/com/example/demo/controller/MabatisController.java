package com.example.demo.controller;

import com.example.demo.bo.CustomPropertiesBO;

import com.example.demo.dao.TeechPushActionConfDao;
import com.example.demo.source.TeechPushActionConf;
import com.example.demo.source.TeechPushActionConfExample;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MabatisController {

    @Autowired
    private TeechPushActionConfDao teechPushActionConfDao;

    @GetMapping("/select/by/id")
    public List<TeechPushActionConf> custom() {
        TeechPushActionConfExample example = new TeechPushActionConfExample();
        example.setOrderByClause("id desc limit 0,5");
//        return teechPushActionConfDao.selectByExample(example);
        return teechPushActionConfDao.selectTPAC(new TeechPushActionConf(), 0, 5);
    }
}
