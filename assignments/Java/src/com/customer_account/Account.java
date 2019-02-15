package com.customer_account;

import java.util.Scanner;

public class Account {
	int ID;
	Customer customer;
	double Balance=0.0;
	double amount=5000;
	
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		this.ID = iD;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		this.Balance = balance;
	}

	/*public String getCustomerName()
	{
		return name;
	}*/
	
	void deposit()
	{
		System.out.println("Add amount to balance? Enter amount:"+ amount);
		Balance=Balance+amount;
		System.out.println(Balance);
	}
	
	public double Withdraw()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount to withdraw");
		amount=sc.nextInt();
		if(Balance>amount)
		{
			Balance=Balance-amount;
			System.out.println("Remaining amount is"+ Balance);
		return Balance;
		}
		else
		{
			System.out.println("amount requested exceeds current balance!");
		}
		return Balance;
	}
	Account(int ID,Customer customer,double Balance)
	{
		this.ID=ID;
		this.customer=customer;
		this.Balance=Balance;
		
	}
	
	Account(int ID,Customer customer)
	{
		
	}
	
	public String toString() {
		return "Account [ID=" + ID + ", customer=" + customer + "," + String.format("%.2f", Balance)+ "]";
	}	
	
}
