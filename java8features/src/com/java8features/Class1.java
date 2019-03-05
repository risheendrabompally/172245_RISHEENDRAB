package com.java8features;

public class Class1 {
	@SuppressWarnings(value = { })
	@Deprecated
	public void deprecatedMethod() {
		System.out.println("deprecated method");
	}
	public static void main(String[] args) {
		
		Class1 c1=new Class1();
		c1.deprecatedMethod();

		
	}

}
