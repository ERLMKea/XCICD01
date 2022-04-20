package com.example.xcicd01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyContoller2 {

    @RequestMapping("/")
    public String getIndex(Model model) {
        return "index.html";
    }

}
