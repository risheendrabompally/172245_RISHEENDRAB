package com.spring.AOP.service;

import com.spring.AOP.model.Circle;
import com.spring.AOP.model.Triangle;

public class FactoryService {

		public Object getBean(String beanType) {
			if(beanType.equals("sh")) return new ShapeProxy();
			if(beanType.equals("circle")) return new Circle();
			if(beanType.equals("triangle")) return new Triangle();
			return null;


}
}