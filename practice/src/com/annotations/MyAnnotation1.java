package com.annotations;

public class MyAnnotation1 {
	
	@interface MyAnnotation{  
		
		int value1() default 1;  
		String value2() default " ";  
		String value3() default "xyz";  
		}  

	
		@MyAnnotation
		
	public static void main(String[] args) {

			MyAnnotation1 m1=new MyAnnotation1();
			System.out.println(m1.value1());
		
		

	}

}
