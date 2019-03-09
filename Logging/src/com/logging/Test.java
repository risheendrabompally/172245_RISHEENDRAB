package com.logging;

import java.util.logging.Level;

public class Test {
	
	public static void main(String[] args) {
	
	try {
		Logging mylog = new Logging("log.txt");
		 mylog.logger.severe("Severe");
		 mylog.logger.info("Info");
		mylog.logger.warning("Warning");
		mylog.logger.config("Config");
		mylog.logger.fine("fine");
		mylog.logger.finest("finest");
		
		  
	}catch(Exception e) {
		
	}
	}
}
