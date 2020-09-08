package com.heller.sbdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/sayHello")
	public String sayHello(String name) {
		return "Hello, " + name;
	}

}
