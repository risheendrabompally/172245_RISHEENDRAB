package com.exc;

import java.util.Date;

public class Visit {
	 Customer name;
	 Date date;
	 double seriviceexpense;
	 double productexpense;
	
	 
	 public Visit(Customer name,Date date) {
		 this.name=name;
		 this.date=date;
	 }
   

	public Customer getName() {
		return name;
	}


	public void setName(Customer name) {
		this.name = name;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public double getSeriviceexpense() {
		return seriviceexpense;
	}


	public void setSeriviceexpense(double seriviceexpense) {
		this.seriviceexpense = seriviceexpense;
	}


	public double getProductexpense() {
		return productexpense;
	}


	public void setProductexpense(double productexpense) {
		this.productexpense = productexpense;
	}
	public double getTotalExpense() {
		 double TotalExpense = seriviceexpense+productexpense;
		 return TotalExpense;
	}


	@Override
	public String toString() {
		return "Visit [seriviceexpense=" + seriviceexpense + ", productexpense=" + productexpense +"]";
	}

		
	}
	
	