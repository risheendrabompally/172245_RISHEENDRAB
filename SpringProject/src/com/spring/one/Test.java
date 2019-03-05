package com.spring.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext c=new ClassPathXmlApplicationContext("Spring2.xml"); 
	    Customer cust=(Customer)c.getBean("Customer");    
	    cust.display();
	}
}
