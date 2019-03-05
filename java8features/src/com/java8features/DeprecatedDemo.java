package com.java8features;

public class DeprecatedDemo {
		   /* @deprecated This field is replaced by 
		    * MAX_NUM field
		    */
		   @Deprecated
		   int num=10;
			
		   final int MAX_NUM=10;
		    
		   /* @deprecated As of release 1.5, replaced 
		    * by myMsg2(String msg, String msg2)
		    */
		   @Deprecated
		   public void myMsg(){
		       System.out.println("This method is marked as deprecated");
		       System.out.println(num++);
		   }
		   
		   public static void main(String a[]){      
		    	DeprecatedDemo obj = new DeprecatedDemo();
		        obj.myMsg();
		        System.out.println(obj.MAX_NUM);
		   }
		}