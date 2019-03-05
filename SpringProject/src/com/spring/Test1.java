package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
        
		ApplicationContext c=new ClassPathXmlApplicationContext("spring.xml"); 
	    Student stu=(Student)c.getBean("studentbean");    
	    stu.show();
	}

}
