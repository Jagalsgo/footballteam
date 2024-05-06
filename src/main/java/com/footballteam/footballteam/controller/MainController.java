package com.footballteam.footballteam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class MainController {

    @GetMapping("/")
    public String main(){
        return "Main Controller";
    }

}
