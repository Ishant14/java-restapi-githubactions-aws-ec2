package com.ishant.awslambda;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class Hello {

    @GetMapping(value = "/v1/data")
    public String sayHelloWorld() {
        return "Hello Awesome People";
    }
}
