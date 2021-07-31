package com.testApp.demoApp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;

import lombok.Data;

import com.testApp.demoApp.service.TestService;

@RestController
@RequestMapping(path="/api/test", produces = MediaType.APPLICATION_JSON_VALUE)
public class TestController {
    private final TestService testService;
    private String hello;
    public TestController(TestService testService){
        this.testService=testService;
    }
    @PostMapping
    public DTOAnswer hello(String test) {
        setHello(test);
        DTOAnswer answer = new DTOAnswer();
        answer.setMessage(this.hello);
        return answer;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    @Data
    private class DTOAnswer{
        private String message;
    }
}