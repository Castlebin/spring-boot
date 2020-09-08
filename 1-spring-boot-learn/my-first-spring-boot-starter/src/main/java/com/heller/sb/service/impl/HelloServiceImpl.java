package com.heller.sb.service.impl;

import org.springframework.stereotype.Component;

import com.heller.sb.service.HelloService;

@Component
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		return "Hello, " + name;
	}

}
