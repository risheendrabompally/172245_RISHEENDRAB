package com.collections;

public class SavingsAccount implements Comparable< SavingsAccount> {
	
	double acc_balance;
	int acc_ID;
	String accountHoldername;
	boolean isSalaryAccount;
	
	public SavingsAccount(double acc_balance, int acc_ID, String accountHoldername, boolean isSalaryAccount) {
		super();
		this.acc_balance = acc_balance;
		this.acc_ID = acc_ID;
		this.accountHoldername = accountHoldername;
		this.isSalaryAccount = isSalaryAccount;
	}
	
	public double getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	public int getAcc_ID() {
		return acc_ID;
	}
	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}
	public String getAccountHoldername() {
		return accountHoldername;
	}
	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}
	public boolean getIsSalaryAccount() {
		return isSalaryAccount;
	}
	public void setIsSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	
	public double withdraw(double amount )
	{
		if(amount<acc_balance)
		{
			acc_balance=acc_balance-amount;
		}
		else
		{
			System.out.println("Insufficient funds");
		}
		return acc_balance;
	}
	
	public double deposit(double amount)
	{
		acc_balance=acc_balance+amount;
		return acc_balance;	
	}

	@Override
	public String toString() {
		return "SavingsAccount [acc_balance=" + acc_balance + ", acc_ID=" + acc_ID + ", accountHoldername="
				+ accountHoldername + ", isSalaryAccount=" + isSalaryAccount + "]";
	}

	@Override
	public int compareTo(SavingsAccount ts) {
		// TODO Auto-generated method stub
		return this.getAcc_ID()-ts.getAcc_ID();
	}
	
}
