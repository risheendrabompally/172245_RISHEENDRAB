package com.customer_account;

public class Customer {
	int ID;
	String name;
	char gender;
	int discount;
	
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	Customer(int ID,String name,int discount)
	{
		this.ID=ID;
		this.name=name;
		this.discount=discount;
	}
	
	public String toString()
	{
		return name+"("+ID+")";
		
	}

}
