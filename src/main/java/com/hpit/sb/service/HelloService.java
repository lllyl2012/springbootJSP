package com.hpit.sb.service;

import org.springframework.stereotype.Service;

@Service("helloService")
public class HelloService {
	public String sayHello(){
		return "hellox";
	}
}
