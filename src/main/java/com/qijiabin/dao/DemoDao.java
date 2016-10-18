package com.qijiabin.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.qijiabin.entity.Demo;

/**
 * ========================================================
 * 日 期：2016年10月18日 上午10:29:36
 * 版 本：1.0.0
 * 类说明：使用JdbcTemplate操作数据库.
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
@Repository
public class DemoDao {
   
    @Resource
    private JdbcTemplate jdbcTemplate;
   
    /**
     * 通过id获取demo对象.
     * @param id
     * @return
     */
    public Demo getById(long id){
       String sql = "select *from Demo where id=?";
       RowMapper<Demo> rowMapper = new BeanPropertyRowMapper<Demo>(Demo.class);
       return jdbcTemplate.queryForObject(sql, rowMapper,id);
    }
   
}
