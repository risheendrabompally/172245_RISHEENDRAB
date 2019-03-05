package com.discount;
import java.util.Scanner;

public class Customer 
{
	public String name; 
	static String memberType;
	static boolean ismember = false;
	
	public Customer() 
	{
		super();
	}

	public Customer(String name) 
	{
		super();
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getMemberType()
	{
		return memberType;
	}
	
	public void setMemberType(String memberType)
    {
		this.memberType = memberType;
	}
	
	public void setMember(boolean member)
	{
		this.ismember = member;
	}
	
	public String isMember(String ch)
	{	
			System.out.println("Sorry,Please take any membership first.");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your membership like 1.Gold    2.Silver   3.Premium");
			return memberType=sc.next();		
	}
	
	public String toString() 
	{
		return "Customer [name=" + name + ", memberType=" + memberType + ", member=" + ismember + "]";
	}
	
}

																								