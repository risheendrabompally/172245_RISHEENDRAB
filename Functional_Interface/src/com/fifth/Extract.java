package com.fifth;

import java.util.ArrayList;

public class Extract {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		StringBuilder s=new StringBuilder();
		list.forEach(m->s.append(m.charAt(0)));
		System.out.println(s);
			
		};
	}

