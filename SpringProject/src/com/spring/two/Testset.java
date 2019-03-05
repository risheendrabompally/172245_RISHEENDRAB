package com.spring.two;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testset {
	
public static void main(String[] args) {
		
		ApplicationContext c=new ClassPathXmlApplicationContext("Springthree.xml");
		Questionsset q=(Questionsset) c.getBean("questions");
		q.display();
	}

}
