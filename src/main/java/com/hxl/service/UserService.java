package com.hxl.service;

import com.hxl.entity.User;

public interface UserService {

    User login(String name,String pwd);

    int register(User user);
}
