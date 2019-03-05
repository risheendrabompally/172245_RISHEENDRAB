package com.practice.triangle;

public class Triangle{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
		
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	
	public Triangle() {
		super();
	}
	
	public Triangle(Point pointA, Point pointB, Point pointC) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}
	
	public void draw() {
		System.out.println("pointA: ("+ getPointA().getX() + "," + getPointA().getY()+ ")");
		System.out.println("pointB: ("+ getPointB().getX() + "," + getPointB().getY()+ ")");
		System.out.println("pointC: ("+ getPointC().getX() + "," + getPointC().getY()+ ")");
	}
	
}
