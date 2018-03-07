package com.hpit.sb.environment;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class MyEnvironment implements EnvironmentAware{
	@Value("${spring.datasource.url}")
	private String jdbcUrl;
	
	private Logger logger = Logger.getLogger(getClass());
	
	@Override
	public void setEnvironment(Environment environment) {
		logger.info("springel表达式获取的值："+jdbcUrl);
		
		logger.info("JAVA_HOME"+environment.getProperty("JAVA_HOME"));
		
		logger.info("spring.datasource.url:"+environment.getProperty("spring.datasource.url"));
		
		RelaxedPropertyResolver propertyResolver = new RelaxedPropertyResolver(environment,"Spring.datasource.");
		logger.info("通过前缀获取的url:"+propertyResolver.getProperty("url"));
		logger.info("通过前缀获取的driverClassName:"+propertyResolver.getProperty("driverClassName"));
	}

}
