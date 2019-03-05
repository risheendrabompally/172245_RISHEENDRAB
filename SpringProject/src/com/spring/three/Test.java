package com.spring.three;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("Spring4.xml"); 
		BankAccountServiceImpl ser=(BankAccountServiceImpl)c.getBean("details");    
	    ser.();

	}
}
