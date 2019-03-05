package com.java;

public class CustomerMain {

	public static void main(String[] args) {
		Customer1 c = new Customer1(102,"mounika",'f');
		Account a1 = new Account(102,c,6746);
		System.out.println("Details of customer :");
		System.out.println(a1);
		a1.deposit(789098.67);
		a1.withdraw(4235.87);
		a1.withdraw(8288.87);


	}

}
