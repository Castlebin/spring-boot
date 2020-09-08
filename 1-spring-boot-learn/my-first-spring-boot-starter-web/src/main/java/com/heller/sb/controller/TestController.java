package com.heller.sb.controller;

import com.heller.sb.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	private HelloService helloService;

	@RequestMapping("/sayHello")
	public String sayHello(String name) {
		return helloService.sayHello(name);
	}

}
