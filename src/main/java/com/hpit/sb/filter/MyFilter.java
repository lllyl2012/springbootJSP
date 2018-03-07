package com.hpit.sb.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.apache.log4j.Logger;
import org.springframework.boot.autoconfigure.web.ResourceProperties.Chain;

@WebFilter(urlPatterns="/*",filterName="myFilter")
public class MyFilter implements Filter{
	private Logger logger = Logger.getLogger(getClass());
	
	@Override
	public void destroy() {
		logger.info("destroy()");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		logger.info("doFilter()");
		logger.info("before filter");
		chain.doFilter(request, response);
		logger.info("after filter");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		logger.info("init()");
	}
	
}
