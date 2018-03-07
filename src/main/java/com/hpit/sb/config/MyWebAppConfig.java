package com.hpit.sb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.hpit.sb.interceptors.MyInterceptor1;
@Configuration
public class MyWebAppConfig extends WebMvcConfigurerAdapter{

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new MyInterceptor1()).addPathPatterns("/**");
//		registry.addInterceptor(new MyInterceptor2()).addPathPatterns("/**");
		//排除路径
//		registry.addInterceptor(new MyInterceptor1()).addPathPatterns("/**").excludePathPatterns("/hello");
		super.addInterceptors(registry);
	}
	
}
