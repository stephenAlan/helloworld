package com.stephen.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by stephen on 2021-02-04 16:16 .
 * Description:
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("hello")
    public String hello() {
        return "hello world port: " + serverPort;
    }


}
