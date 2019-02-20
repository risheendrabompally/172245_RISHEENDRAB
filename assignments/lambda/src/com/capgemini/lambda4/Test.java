package com.capgemini.lambada4;
import java.util.ArrayList;
import java.util.List;
public class Test {

	public static void main(String[] args) {
		
		List<String> l=new ArrayList<String>();
		l.add("ven");
		l.add("ky");
		l.add("ambati");
		l.add("veni");

		l.removeIf(oddwords ->(oddwords.length()%4!=0));
		l.forEach(words -> System.out.println(words));
			}
	}


