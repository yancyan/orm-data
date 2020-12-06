package com.orm.controller;

import com.orm.dao.jpa.UserRepository;
import com.orm.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DemoController {


    @GetMapping("/test")
    public String test() {
        return "test. return.. test deploy docker.";
    }

    @Resource
    private UserRepository userRepository;

    @GetMapping("/insert")
    public String insert() {
        User u = new User();
        u.setAge(12L);
        u.setName("testInsert");
        userRepository.save(u);
        return "insert end.";
    }
}
