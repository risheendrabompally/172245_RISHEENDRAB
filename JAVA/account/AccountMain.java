package com.account;

public class AccountMain {

	public static void main(String[] args) {
		Account ac=new Account();
		ac.setId("538");
		ac.setName("risheendra");
		ac.setBalance(10000);
		ac.credit();
		ac.debit();
		ac.transferTo();
		ac.toString();
	}

}
