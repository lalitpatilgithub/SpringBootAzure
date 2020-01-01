package com.springbootexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {


    @RequestMapping("/sampleURL")
    public String myMethod(){
        return "Azure with Spring Boot";
    }
}
