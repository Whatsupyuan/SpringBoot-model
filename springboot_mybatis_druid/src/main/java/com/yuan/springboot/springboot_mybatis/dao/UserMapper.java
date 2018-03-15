package com.yuan.springboot.springboot_mybatis.dao;

import com.yuan.springboot.springboot_mybatis.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {
    List<User> select() ;
}
