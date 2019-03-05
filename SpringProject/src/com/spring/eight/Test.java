package com.spring.eight;
	
	import org.springframework.context.support.AbstractApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;



	public class Test {

		public static void main(String[] args) {
			AbstractApplicationContext context=new ClassPathXmlApplicationContext("Spring8.xml");
			context.registerShutdownHook();
			Square s=(Square) context.getBean("square");
			s.draw();
		}
	}

