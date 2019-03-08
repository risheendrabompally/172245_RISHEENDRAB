package com.spring.AOP.service;

import com.spring.AOP.model.Circle;

public class ShapeProxy extends Shape {
		public Circle getCircle() {
			return super.getCircle();
		}
	}
