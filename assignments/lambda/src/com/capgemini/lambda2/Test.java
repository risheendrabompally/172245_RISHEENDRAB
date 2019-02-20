package com.capgemini.lambada2;

public class Test {
	public static void main(String[] args) {
		Order recipt = (Orderprice,OrdersStatus)->{
				if(Orderprice > 10000 && OrdersStatus =="Accepted" )
					return "Accepted";
				
		 		else 
					return "NULL";
				
					
		};
		System.out.println("Order Status is"+recipt.orderstatus(1231456789, "Accepted"));
	}
}
