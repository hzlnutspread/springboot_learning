package com.sugondesecorn.Project1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


// Tells the program that this will be your primary REST API controller
// Sending get/post requests etc
@RestController
public class TestController {

    @Value("${testController.message}")
    private String testMessage;

// Request mapping maps HTTP requests to handler methods for RestControllers like this one
// The "/" is the default end point for this get request method
    @RequestMapping(value = "/bing", method = RequestMethod.GET)
    public String helloWorld () {
        return "Welcome to this Spring boot test project";
    }

    @GetMapping("/")
    public String byeWorld() {
        return testMessage;
    }
}
