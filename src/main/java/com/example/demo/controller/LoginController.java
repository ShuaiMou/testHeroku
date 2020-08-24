package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Saul
 * @Date: 24/8/20 10:52
 * @Description:
 */
@RestController
public class LoginController {

    @GetMapping("/login")
    public String login(String name){
        return name + " login successfully";
    }
}
