package com.discount;

	import java.util.Date;

	public class Visit extends Customer
	{
		Customer Customer;
		static double serviceExpense; 
		static double productExpense; 
		String date;
		
		public Visit(String name,String date)
		{
			this.name=name;
			this.date=date;
		}
		
		public String getName() {
			return name;
		}
		
		public void setServiceExpense(double serviceExpense) 
		{
			this.serviceExpense = serviceExpense;
		}
		
		public double getServiceExpense() 
		{
			return serviceExpense;
		}

		public void setProductExpense(double productExpense)
		{
			this.productExpense = productExpense;
		}
		
		public double getProductExpense()
		{
			return productExpense;
		}


		public void getTotalExpense() 
		{
			double totalExpense = serviceExpense + productExpense;
			System.out.println("Welcome to "+name);
			System.out.println("Total Expenses= "+totalExpense);
			
		}
		
		
		
}