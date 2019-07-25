package com.hand.pyh.springboot.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.driver-class-name}")
    private String driver;
    @Value("${spring.datasource.password}")
    private String user_pwd;

    @RequestMapping("/say_hello")
    public String sayHello(){
        String data = "当前连接数据库信息:" + "\n连接地址:"  + url + "\n 驱动名称:" +
                driver +"\n 用户名:" + username + "\n 密码:" + user_pwd;
        return "welcome to use this app !!! \n" + data;
    }
}
