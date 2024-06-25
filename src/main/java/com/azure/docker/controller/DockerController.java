package com.azure.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @GetMapping("/")
    public String welcomeMessage(){
        return "Hello From WebApp Docker !";
    }
}
