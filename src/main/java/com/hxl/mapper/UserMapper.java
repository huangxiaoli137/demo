package com.hxl.mapper;

import com.hxl.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * UserDao继承基类
 */
@Repository
public interface UserMapper extends Mapper<User> {

    User login(@Param("name")String name,@Param("pwd") String pwd);
}