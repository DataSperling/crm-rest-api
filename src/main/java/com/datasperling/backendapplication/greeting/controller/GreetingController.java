package com.datasperling.backendapplication.greeting.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* @return: String to return to uri localhost:8080/hello as test for MVC controller
 */
@RestController
public class GreetingController {

    // default for RequestMapping is to map to get, must specify mapping to other requests
    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello";
    }
}
