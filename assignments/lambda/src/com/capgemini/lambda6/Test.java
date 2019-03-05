package com.capgemini.lambada6;
import java.util.ArrayList;
public class Test {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("venky");
		list.add("revanth");
		list.replaceAll(s->s.toUpperCase());
		System.out.println(list);
		

	}
}
