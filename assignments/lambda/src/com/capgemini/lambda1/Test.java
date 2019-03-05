package com.capgemini.lambada1;

public class Test {
	public static void main(String[] args) {
		calcator add = (a,b) -> a+b;
		System.out.println("The addition is ----------->"+add.operation(6,3));
		calcator sub = (a,b) -> a-b;
		System.out.println("The substraction is ------------>"+sub.operation(7,2));
		calcator multiplication = (a,b) -> a*b;
		System.out.println("The multiplication is ----------->"+multiplication.operation(12,9));
		calcator division = (a,b) -> a/b;
		System.out.println("The division is ------------->"+division.operation(8,2));
	}
}

	