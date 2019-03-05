package com.spring.one;

public class Customer {
	String customerId;
	String customerName;
	String customerContact;
	Address customerAddress;
	
	public Customer() {
		super();
	}

	public Customer(String customerId, String customerName, String customerContact, Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}	
	
	public void display() {
		System.out.println("customer Id:" + getCustomerId());
		System.out.println("customer name:" + getCustomerName());
		System.out.println("customer contact:" + getCustomerContact());
		
		System.out.println("customer address:" + getCustomerAddress().getStreet());
		System.out.println("customer address:" + getCustomerAddress().getCity());
		System.out.println("customer address:" + getCustomerAddress().getState());
		System.out.println("customer address:" + getCustomerAddress().getZip());
		System.out.println("customer address:" + getCustomerAddress().getCountry());
		
	}
		
}
