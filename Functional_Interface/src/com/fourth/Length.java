package com.fourth;

import java.util.ArrayList;

public interface Length {
	
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		list.add("rishi");
		list.add("madhu");
		list.add("manisha");
		list.add("seshu");
		list.add("niharika");
		list.add("kukapilla");
		list.add("ram");
		System.out.println("------before------");
		list.forEach(System.out::println);
		System.out.println("------after------");
		list.removeIf(s->s.length()%2!=0);
		list.forEach(System.out::println);
	}
	
}
