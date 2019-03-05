package com.exc;

import java.util.Date;

public class DiscountMain {

	public static void main(String[] args) {
	
			Customer c1=new Customer("mounika");
			c1.setmember(true);
			c1.setmemberType("Silver");
			
			Visit v=new Visit(c1, new Date());
			v.setProductexpense(3000);
			v.setSeriviceexpense(3000);
			
			System.out.println(v.getTotalExpense());	

	}

}
