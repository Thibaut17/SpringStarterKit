package com.testApp.demoApp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@RestController
@Data
public class HelloController {
	private String hello;
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/helloworld")
	public String sayHello() {
		return "Swagger Hello World";
	}
	
	@PostMapping
	public String hello(String test) {
		setHello(test);
		return this.hello;
	}
}
