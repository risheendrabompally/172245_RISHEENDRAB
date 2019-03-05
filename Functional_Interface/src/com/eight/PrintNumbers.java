package com.eight;

import java.util.ArrayList;

public class PrintNumbers {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(27);
		al.add(5);
		al.add(10);
		al.add(75);
		
		Thread t= new Thread()
		{
		public void run() {
			al.forEach(System.out::println);
		}
		};
		
		t.start();
			
	}

}
