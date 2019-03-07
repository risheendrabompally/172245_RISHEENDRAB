package com.spring.AOP.service;

import com.spring.AOP.aspect.Loggable;
import com.spring.AOP.model.Circle;
import com.spring.AOP.model.Triangle;

public class Shape {
	
	private Circle circle;
	private Triangle triangle;
	@Loggable 
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	
	
	

}
