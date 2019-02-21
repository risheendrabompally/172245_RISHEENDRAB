package com.sixth;

import java.util.ArrayList;

public class Replace {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println("------before------");
		list.forEach(System.out::println);
		list.replaceAll(s->s.toUpperCase());
		System.out.println("------after------");
		list.forEach(System.out::println);
	}

}
