package com.collections;
import java.util.Iterator;
import java.util.TreeSet;

public class BankAccountSet {
	
	public static void main(String args[])
	{
	TreeSet<SavingsAccount> ts=new TreeSet<SavingsAccount>();
	SavingsAccount s1=new SavingsAccount(10000.00,12345678,"Risheendra",true);
	SavingsAccount s2=new SavingsAccount(12000.00,12345679,"Saikiran",false);
	SavingsAccount s3=new SavingsAccount(14000.00,12345670,"Gopi",true);
	SavingsAccount s4=new SavingsAccount(16000.00,12345671,"Saiteja",true);
	SavingsAccount s5=new SavingsAccount(18000.00,12345672,"Nikhil",false);
	ts.add(s1);
	ts.add(s2);
	ts.add(s3);
	ts.add(s4);
	ts.add(s5);
	 Iterator itr=ts.iterator();
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next());
	 }
}
}