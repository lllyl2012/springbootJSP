package com.hpit.sb.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hpit.App;
import com.hpit.sb.service.HelloService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={App.class})
public class TestHelloService {
	@Autowired
	private HelloService helloService;
	
	@Test
	public void testSayHello(){
		helloService.sayHello();
	}
}
