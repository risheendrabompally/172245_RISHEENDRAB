package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

 
	public static void main(String[] args) {
		Resource resource=new ClassPathResource("spring.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource); 
	    
	    Student stu=(Student)factory.getBean("studentbean");    
	    stu.show();  
	}
}