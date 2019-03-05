package com.spring.eight;
	
	import org.springframework.beans.factory.DisposableBean;
	import org.springframework.beans.factory.InitializingBean;


	public class Square implements InitializingBean,DisposableBean {
		private Points pointA;
		private Points pointB;
		private Points pointC;
		private Points pointD;

		public Points getPointA() {
			return pointA;
		}

		public void setPointA(Points pointA) {
			this.pointA = pointA;
		}

		public Points getPointB() {
			return pointB;
		}

		public void setPointB(Points pointB) {
			this.pointB = pointB;
		}

		public Points getPointC() {
			return pointC;
		}

		public void setPointC(Points pointC) {
			this.pointC = pointC;
		}

		public Points getPointD() {
			return pointD;
		}

		public void setPointD(Points pointD) {
			this.pointD = pointD;
		}
		
		public void draw()
		{
		System.out.println("Point A=("+ getPointA().getX()+", "+getPointA().getY()+")");
		System.out.println("Point B=("+ getPointB().getX()+", "+getPointB().getY()+")");
		System.out.println("Point C=("+ getPointC().getX()+", "+getPointC().getY()+")");
		System.out.println("Point D=("+ getPointD().getX()+", "+getPointD().getY()+")");

		}

		@Override
		public void afterPropertiesSet() throws Exception {
			System.out.println("intializing beans init method called  ");
			
		}

		@Override
		public void destroy() throws Exception {
			System.out.println("DisposableBean destroy method is called  ");
			
		}
		
		public void myInit()
		{
			System.out.println("my init method called ");
		}
		
		public void cleanup()
		{
			System.out.println("cleanup method called ");
		}

	}
