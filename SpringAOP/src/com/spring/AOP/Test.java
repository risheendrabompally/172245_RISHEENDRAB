package com.spring.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.AOP.service.Shape;

public class Test {

	public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
	Shape s=(Shape) ac.getBean("Shape");
	s.getCircle();//.setName("circle A");	 
	//System.out.println(s.getCircle().getName());
	}

}
