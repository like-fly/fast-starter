package com.twowin.admin.controller;

import com.twowin.admin.entity.User;
import com.twowin.admin.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ckl on 2017/12/1.
 */
@RestController
public class GreetingController {

    @Autowired
    private JdbcTemplate template;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private SqlSession session;

    @RequestMapping("user-count")
    public Long userCount() {
        return template.queryForObject("select count(*) from user", Long.class);
    }

    @RequestMapping("users")
    public List<User> users() {
        return userMapper.selectUsers();
    }

    @RequestMapping("user")
    public User user(int id) {
        return userMapper.selectUserById(id);
    }

}
