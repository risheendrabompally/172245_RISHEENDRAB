package com.first;

public class ArithmeticOperations  {

	public static void main(String[] args) {

		Operations op=(a,b)->
		{
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a%b);
		};
		op.opr(5, 9);
	}
}
