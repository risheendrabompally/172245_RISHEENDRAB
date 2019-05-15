package com.annotations;

public class MyAnnotation {

	public void Display() 
    { 
        System.out.println("Base display()"); 
    } 
      
	public static void main(String[] args) {
		     
		     
		MyAnnotation t1 = new Derived(); 
		         t1.Display(); 
		     }      
}
		class Derived extends MyAnnotation 
		{ 
		     @Override
		     public void Display() 
		     { 
		         System.out.println("Derived display()"); 
		     } 
		} 