package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class Control {

    @GetMapping
    public Object get(){
        return new String[]{
                "Car1",
                "Car2",
                "Car3"
        };
    }

}
