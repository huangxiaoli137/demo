package com.hxl.service.impl;

import com.hxl.mapper.UserMapper;
import com.hxl.entity.User;
import com.hxl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class    UserServiceImpl implements UserService {

    @Autowired
    public UserMapper userMapper;

    @Override
    public User login(String name, String pwd) {
        return userMapper.login(name, pwd);
    }

    @Override
    public int register(User user) {

        return userMapper.insert(user);
    }


}
