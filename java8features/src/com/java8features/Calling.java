package com.java8features;

public class Calling implements I1,I2 {
	
	@Override
	public void display1() {
		// TODO Auto-generated method stub
		I1.super.display1();
		I2.super.display1();
	}

	public static void main(String[] args) {
		I2 i=new Calling();
		Calling d=new Calling ();
		d.display1();
		i.display1();
	}

	

}
