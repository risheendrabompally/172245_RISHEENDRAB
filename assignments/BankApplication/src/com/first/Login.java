package com.first;
import java.util.HashMap;
import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	HashMap<String,String>unamePass=new HashMap<String,String>();
	unamePass.put("user1", "pasword1");
	unamePass.put("user2", "password2");
	unamePass.put("user3", "password3");
	System.out.println("Enter your username");
	String user=sc.next();
	System.out.println("Enter password");
	String pass=sc.next();
	
	String password=unamePass.get(user);
	
	
	if(pass.equals(password)) {
		System.out.println("login successfull");
	}
	else
		System.out.println("Invalid userid or pass");
	
}
}
