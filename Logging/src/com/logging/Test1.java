package com.logging;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

public class Test1 {
	
	static Logger logger=(Logger) LoggerFactory.getLogger(Test.class);

	public static void main(String[] args) {
		
		logger.info("hello");
		
		int result=sum(987,789);
		System.out.println("987 + 789 =" +result);
	
	}

	private static int sum(int i, int j) {
		
		return  i+j;
	}

}
