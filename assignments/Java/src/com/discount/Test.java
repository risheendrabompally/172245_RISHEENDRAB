package com.discount;

	import java.sql.Date;
	import java.util.Scanner;

	public class Test extends Discount
	{
	static String ch;

		public Test(String name,  String date) 
		{
			super(name, date);
			
		}
		public void m1(String ch)
		{
			
			if(memberType.equals("no"))
			{
				isMember(ch);
				System.out.println(memberType);
				serviceDiscountRate(memberType);
			}
			else if(memberType.equals("yes"))
			{
				Scanner sc1=new Scanner(System.in);
				System.out.println("OK pls enter your membership type ");
				memberType=sc1.next();
					serviceDiscountRate(memberType);	
				
			}
		}

		public static void main(String[] args)
		{
			
			
			Test t=new Test("Risheendra","06-01-1997");
			Customer c=new Customer();
			
			t.serviceExpense=2000;
			t.productExpense=500;
			System.out.println("ServiceExpense="+serviceExpense);
			System.out.println("ProductExpense="+productExpense);
			System.out.println("\n");
			int Total=(int) (serviceExpense+productExpense);
			System.out.println("Total cost(serviceExpense+productExpense) is="+Total);
			System.out.println("\n");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("DO YOU HAVE ANY MEMBERSHIP");
			memberType=sc.next();
		
			t.m1(memberType);
			
		t.productDiscountRate(memberType);
		float Total1=(float) (discount+discount1);
		System.out.println("\n");
		System.out.println("AFTER ALL DISCOUNTS YOU HAVE TO PAY ="+Total1);
			}
		}