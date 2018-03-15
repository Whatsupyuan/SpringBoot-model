package com.yuan.springboot.springboot_mybatis.collection;

import com.yuan.springboot.springboot_mybatis.dao.UserMapper;
import com.yuan.springboot.springboot_mybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private UserMapper userMapper ;

    @RequestMapping("/hello")
    public String getString() {
        return "Model";
    }

    @RequestMapping("/getUser")
    public List<User> getUser(){
        return userMapper.select() ;
    }


}
