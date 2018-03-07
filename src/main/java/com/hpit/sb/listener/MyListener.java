package com.hpit.sb.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.log4j.Logger;

@WebListener
public class MyListener implements ServletContextListener {
	private Logger logger = Logger.getLogger(getClass());

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		logger.info("contextDestroyed");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		logger.info("contextInitialized");
	}

}
