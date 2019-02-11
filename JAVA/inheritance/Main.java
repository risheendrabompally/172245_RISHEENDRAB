package com.inheritance;

public class Main {

	public static void main(String[] args) {
		Person p = new Person("Risheendra","Telangana");
		Student s = new Student("Seshu","AndhraPradesh");
		Teacher t = new Teacher("Gopi","Karnataka");
		System.out.println(t.addCourse("Maths"));
		System.out.println(s.addCourseGrade("Hindi",96));
		System.out.println(p.toString());
		
		
	}

}
