package com.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fruitmain {

	public static void main(String[] args) {
		Fruit f= new Fruit("mango",25,20,"yellow");
		Fruit f1= new Fruit("apple",73,50,"red");
		Fruit f2= new Fruit("banana",16,5,"yellow");
		Fruit f3= new Fruit("strawberry",150,10,"pink");
		
		ArrayList<Fruit> List=new ArrayList<Fruit>();
		List.add(f);
		List.add(f1);
		List.add(f2);
		List.add(f3);
		
		System.out.println("----------fruits with less than 100 calories----------");
		
		List<String> l1  = List.stream()
				.filter(s->s.getCalories()<100)
				.sorted(Comparator.comparing(Fruit::getCalories).reversed())
				.map(Fruit::getName)
				.collect(Collectors.toList());
		l1.forEach(System.out::println);
		
		System.out.println("----------color wise list of fruits----------");
		
		List<Fruit> l2= List.stream()
				.sorted(Comparator.comparing(Fruit::getName))
				.collect(Collectors.toList());
		l2.forEach(e->System.out.println(e.getName() +"	"+ e.getColor()));
		
		System.out.println("----------red color fruit----------");
		
		List<Fruit> l3= List.stream()
				.filter(s->s.getColor()=="red")
				.sorted(Comparator.comparing(Fruit::getPrice))
				.collect(Collectors.toList());
		l3.forEach(e->System.out.println(e.getName() +"	"+ e.getColor()));
	}
}
