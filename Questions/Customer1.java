package com.java;

public class Customer1 {
	private int id;
	private String name;
	private char gender;
	private int discount;
	public Customer1(int id, String name,int discount) {
		super();
		this.id = id;
		this.name = name;
		this.discount = discount;
	}
       public int  getid() {
    	   return id;
       }
       public String getname() {
    	   return name;
       }
       public char getgender() {
    	   return gender;
       }
	@Override
	public String toString() {
		return "Customer1 [id=" + id + ", name=" + name + ", gender=" + gender + ", discount=" + discount + "]";
	}
       
	