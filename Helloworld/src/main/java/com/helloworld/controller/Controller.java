package com.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	

    @GetMapping("/")
    public String home(){
        return "Hello World!";
    }
	
}
