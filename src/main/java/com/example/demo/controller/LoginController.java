package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: Saul
 * @Date: 24/8/20 10:52
 * @Description:
 */
@Controller
public class LoginController {

    @GetMapping("/login")
    @ResponseBody
    public String login(String name){
        return name + " login successfully";
    }

    @GetMapping("/hello")
    ResponseEntity<String> hello() {
        return new ResponseEntity<>("Hello World!", HttpStatus.BAD_REQUEST);
    }

}
