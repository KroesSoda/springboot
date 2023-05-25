package com.soda.app.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @GetMapping({"/sample","/sam"})
    public String Sample(){
        return "Hello Spring Boot";
    }
}
