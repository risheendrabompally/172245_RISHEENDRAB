package com.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NewsMain {

	public static void main(String[] args) {
		
		News n = new News(1,"rish","rishi","budget");
		News n1 = new News(2,"madh","madhu","war");
		News n2 = new News(1,"rish","seshu","dchamh");
		News n3 = new News(3,"kuabc","ram","oisvo");
		News n4 = new News(4,"kjbc","rishi","budget");
		News n5 = new News(2,"oirj","ram","owqopowq");
		News n6 = new News(4,"fnbf","seshu","ukbwqc");
		News n7 = new News(6,"ohewn","madhu","budget");
		News n8 = new News(2,"jerg","rishi","olicwqi");
		News n9 = new News(1,"pmlasbc","rishi","bwqcij");		
		
		ArrayList<News> List=new ArrayList<News>();
		
		List.add(n);
		List.add(n1);
		List.add(n2);
		List.add(n3);
		List.add(n4);
		List.add(n5);
		List.add(n6);
		List.add(n7);
		List.add(n8);
		List.add(n9);
		
		/*System.out.println("----------news id with maximum comments----------");
		
		List<News> l2 = List.stream()
				.filter(s->s.)*/
		
		
		
		
		System.out.println("----------no. of times word budget in news----------");
		
		List<News> l1= List.stream()
				.filter(s->s.getComment()=="budget")
				.sorted(Comparator.comparing(News::getComment))
				.collect(Collectors.toList());
		l1.forEach(e->System.out.println(e.getComment()));
		
		System.out.println("----------user posted maximum number of comments----------");
		
		List<News> l2= List.stream().filter(s->s.getCommentByUser())
				.sorted()
	}
}
