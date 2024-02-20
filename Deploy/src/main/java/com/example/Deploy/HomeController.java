package com.example.Deploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Value("${devName}")
    private String devName;
    @GetMapping
    public String getHello(){
        return "Hello " + devName;
    }
}
