package com.hxl.controller;

import com.hxl.entity.User;
import com.hxl.service.UserService;

import com.hxl.util.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping(value = "/")
    public RespBean login(@RequestParam(name = "name") String name,
                          @RequestParam(name="pwd") String pwd){

        User user=userService.login(name, pwd);
        if (user!=null){
            return RespBean.success("登陆成功!",user);
        }else{
            return RespBean.error("登录失败!");
        }
    }

    @PostMapping(value = "/register")
    public RespBean register(@RequestParam(name = "loginName") String loginName,
                             @RequestParam(name = "userName") String userName,
                             @RequestParam(name = "password") String password,
                             @RequestParam(name = "sex") int sex,
                             @RequestParam(name = "identityCode")String identityCode,
                             @RequestParam(name = "email")  String email,
                             @RequestParam(name = "mobile")  String mobile) {
        User user = new User();
        user.setLoginname(loginName);
        user.setUsername(userName);
        user.setPassword(password);
        user.setSex(sex);
        user.setIdentitycode(identityCode);
        user.setEmail(email);
        user.setMobile(mobile);
        int use = userService.register(user);
        if (use>=1){
            return RespBean.success("注册成功！",use);
        }else{
            return RespBean.error("注册失败!");
        }
    }

}
