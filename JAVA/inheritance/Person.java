package com.inheritance;

public class Person {
	
	String name;
	String address;
		
   public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

   Person(String name, String address)
   {
	   this.name=name;
	   this.address=address;
   }
    public String toString()
    {
		return name+"("+")"+address;
    }  
}
