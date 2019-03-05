package com.spring.two;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext c=new ClassPathXmlApplicationContext("Spring3.xml");
		Questions q=(Questions) c.getBean("questions");
		q.display();
	}
}
