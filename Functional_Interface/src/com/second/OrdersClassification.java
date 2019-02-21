package com.second;

public class OrdersClassification {

	public static void main(String[] args) {
		
		Orders ord=(val,status)->{
			if(val>10000 && status=="Accepted"||status=="Completed")
			{
				System.out.println(val+"	"+status);
			}
		};
		ord.value(1000,"Rejected");
		ord.value(11000,"Accepted");
		ord.value(19000,"Rejected");
		ord.value(5000,"Accepted");
		ord.value(17500,"Completed");
	}
}
