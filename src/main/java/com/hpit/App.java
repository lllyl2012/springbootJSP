package com.hpit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

import com.hpit.sb.properties.MyConfig;

@SpringBootApplication
@ServletComponentScan
@EnableConfigurationProperties(MyConfig.class)
public class App {
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
