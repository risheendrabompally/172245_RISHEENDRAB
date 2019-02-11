package com.discount;
import java.util.Date;

	public class Discount extends Visit
	{
		
		double serviceDiscountPremium=0.2;
		double serviceDiscountGold=0.15;
		double serviceDiscountSilver=0.1;
		double productDiscountPremium=0.1;
		double productDiscountGold=0.1;
		double productDiscountSilver=0.1;
		static double discount;
		static double discount1;
		
		public Discount(String name, String date) 
		{
			super(name,date);
			
		}
		public double serviceDiscountRate(String memberType)
		{
			
			
			if(memberType.equals("Premium"))
			{
				System.out.println("\n");
				System.out.println("Welcome " +name);
				System.out.println("You are PREMIUM member now...");
				
				System.out.println("YOUR SERVICE DISCOUNT % FOR YOUR MEMBERSHIP IS="+serviceDiscountPremium);
				
				discount=  (serviceExpense-(serviceExpense*serviceDiscountPremium));
				System.out.println("YOUR SERVICE DISCOUNT IN RUPEES IS="+serviceExpense*serviceDiscountPremium);
				System.out.println("\n");
			}
			else if(memberType.equals("Gold"))
			{
				System.out.println("\n");
				System.out.println("Welcome " +name);
				System.out.println("You are GOLD member now...");
				
				System.out.println("YOUR SERVICE DISCOUNT % FOR YOUR MEMBERSHIP IS="+serviceDiscountGold);
				
				discount=  (serviceExpense-(serviceExpense*serviceDiscountGold));
			
				System.out.println("YOUR SERVICE DISCOUNT IN RUPEES IS="+serviceExpense*serviceDiscountGold);
				System.out.println("\n");
			}
			
			else if(memberType.equals("Silver"))
			{
				System.out.println("\n");
				System.out.println("Welcome " +name);
				System.out.println("You are SILVER member now...");
				
				System.out.println("YOUR SERVICE DISCOUNT % FOR YOUR MEMBERSHIP IS="+serviceDiscountSilver);
				
				discount=  (serviceExpense-(serviceExpense*serviceDiscountSilver));
				System.out.println("YOUR SERVICE DISCOUNT IN RUPEES IS="+serviceExpense*serviceDiscountSilver);
				System.out.println("\n");
			}
		
			else 
			{
				
				System.out.println("Please enter correct Membership from below(Gold-Premium-Silver)");
			}
			return discount;
			
		}
		public double productDiscountRate(String memberype)
		{
			if(memberType.equals("Premium"))
			{
				discount1=  (productExpense - (productExpense*productDiscountPremium));
				System.out.println("YOUR PRODUCT DISCOUNT % FOR YOUR MEMBERSHIP IS="+productDiscountPremium);

				System.out.println("YOUR PRODUCT DISCOUNT IN RUPEES IS="+productExpense*productDiscountPremium);
			}
			
			else if(memberType.equals("Gold"))
			{
				discount1=  (productExpense - (productExpense*productDiscountGold));
			
				System.out.println("YOUR PRODUCT DISCOUNT % FOR YOUR MEMBERSHIP IS="+productDiscountGold);

				System.out.println("YOUR PRODUCT DISCOUNT IN RUPEES IS="+productExpense*productDiscountGold);
			}
			
			else if(memberType.equals("Silver"))
			{
				discount1=  (productExpense - (productExpense*productDiscountSilver));
				System.out.println("YOUR PRODUCT DISCOUNT % FOR YOUR MEMBERSHIP IS="+productDiscountSilver);

				System.out.println("YOUR PRODUCT DISCOUNT IN RUPEES IS="+productExpense*productDiscountSilver);
			}
			/*else
			{
				System.out.println("You Are Not A Menbership Person Pls Take Membership First");
			}*/
			return discount;
		}
		
	}

