package com.org.zyy.common;

import java.io.FileNotFoundException;

import org.junit.runners.model.InitializationError;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

public class JUnit4ClassRunner extends SpringJUnit4ClassRunner {
	
	static {
		try {
			Log4jConfigurer.initLogging("classpath:log4j.properties");
		} catch (FileNotFoundException ex) {
			System.err.println("log4j-error-message:Cannot Initialize log4j.properties!Can't find the file path!.................");
		}
	}

	public JUnit4ClassRunner(Class<?> clazz) throws InitializationError {
		super(clazz);
		// TODO Auto-generated constructor stub
	}

}
