package com.testApp.demoApp.service;

import org.springframework.stereotype.Service;
import org.springframework.core.env.Environment;
@Service
public class TestService {
    private final String email;

    public TestService(Environment env){
        this.email = env.getRequiredProperty("application.email");
    }
}