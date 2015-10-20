package com.core.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4JTestMain {

	static final Logger logger = Logger.getLogger(Log4JTestMain.class);

	public static void main(String[] args) {

		PropertyConfigurator.configure("log4j.properties");

		logger.info("Sample info message");
		logger.debug("Sample debug message");
		logger.warn("Sample warn message");
		logger.error("Sample error message");
		logger.fatal("Sample fatal message");

	}

}