package com.account;

import java.util.Scanner;
public class Account {
 
 String id;
 String name;
 int balance;
 
 public String getId() {
  return id;
 }
 public void setId(String id) {
  this.id = id;
 }
 public String getName() {
  return name;
 }
 public void setName(String name) {
  this.name = name;
 }
 public int getBalance() {
  return balance;
 }
 public void setBalance(int balance) {
  this.balance = balance;
 }
 
 public int credit()
 {
  System.out.println("enter amount");
  Scanner sc=new Scanner(System.in);
  int amount = sc.nextInt();  
  System.out.println("add amount to balance and return balance");
  balance=amount+balance;
 
  System.out.println(balance);
  return balance;
 }
    public int debit()
    {
     System.out.println("enter amount");
  @SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
  int amount = sc.nextInt();  
     if(amount<=balance)
     {
      System.out.println("substract amount from balance");
      balance=balance-amount;
      System.out.println(balance);
     
      
     }
     else
     {
      System.out.println("amount exceeded balance");
     }
      return balance;
     }
    public int transferTo()
    {
     System.out.println("enter amount");
  @SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
  int amount = sc.nextInt();  
     if(amount<=balance)
     {
      
      System.out.println(amount);
     
      
     }
     else
     {
      System.out.println("amount exceeded balance");
     } 
  return amount;
     
    }
    public String toString()
    { 
       return id+" "+name+" "+balance;  
}
	public void setId(int i) {
		// TODO Auto-generated method stub
		
	}
}