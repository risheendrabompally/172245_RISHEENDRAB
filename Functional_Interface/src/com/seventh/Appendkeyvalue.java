package com.seventh;

import java.util.Map;
import java.util.TreeMap;

public class Appendkeyvalue {

	public static void main(String[] args) {
		Map<String, Integer> mp=new TreeMap<>();
		mp.put("one", 1);
		mp.put("two", 2);
		mp.put("three", 3);
		mp.put("four", 4);
		StringBuilder s=new StringBuilder();
		mp.forEach((key, value) -> s.append(key + value));
		System.out.println(s);

	}

}
