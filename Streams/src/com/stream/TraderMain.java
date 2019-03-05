package com.stream;

import java.util.ArrayList;
import java.util.List;

public class TraderMain {

	public static void main(String[] args) {
		
		Trader t=new Trader("rishi", "hyderabad");
		Trader t1=new Trader("ram", "pune");
		Trader t2=new Trader("seshu", "indore");
		Trader t3=new Trader("madhu", "pune");
		Trader t4=new Trader("niharika", "vijayawada");
		
		List<Trader> List= new ArrayList<Trader>();
		
		List.add(t);
		List.add(t1);
		List.add(t2);
		List.add(t3);
		List.add(t4);
		
		List<String> l1=List.stream()
	}

}
