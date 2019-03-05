package com.practice.triangle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext c=new ClassPathXmlApplicationContext("spring1.xml"); 
	    Triangle tr=(Triangle)c.getBean("Triangle");    
	    tr.draw();
	}

}
