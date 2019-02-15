package com.java;

public class Account  {
	private int id;
	private Customer1 customer;
	private double balance;
	
		
		public Account(int id, Customer1 customer,double balance) 
		{
			this.id = id;
			this.customer = customer;
			this.balance = balance;	
		}

		@Override
		public String toString() 
		{
			return "Account [Id=" + id + ", Customer=" + customer + ", Balance=" + balance + "]";
		}

		public int getId()
		{
			return id;
		}

		public Customer1 getCustomer() 
		{
			return customer;
		}

		public double getBalance()
		{
			return balance;
		}

		public void setBalance(double balance) 
		{
			this.balance = balance;
		}
		
	   public double deposit( double amount) 
	   {
		   balance=amount+=balance;
		   System.out.println("Amount credited "+balance);
		   return amount+=balance;	
	   }
	   public double withdraw( double amount) 
	   {
		   if(balance >= amount) 
		   {
			   balance=balance-amount;
			   System.out.println("Amount deducted "+balance);
		   }
		   else
		   {
			   System.out.println("Insufficient Balance");
			  
		   }
		   return balance;
	   
	}
	}
