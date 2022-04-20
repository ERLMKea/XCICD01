package com.example.xcicd01.controller;

import com.example.xcicd01.model.MyUser;
import com.example.xcicd01.repository.MyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    MyUserRepository myUserRepository;

    @GetMapping("/info")
    public List<MyUser> getUsers(){
        return myUserRepository.findAll();
    }

}
