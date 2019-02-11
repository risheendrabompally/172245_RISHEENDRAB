package com.second;

public class Student {
	String name;
	String address;
	int numCourses=0;
	String[] courses = {"c","c++","java"};
	int[] grades= {18,28,24};
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private String getAddress() {
		return address;
	}
	private void setAddress(String address) {
		this.address = address;
	}
	private int getNumCourses() {
		return numCourses;
	}
	private void setNumCourses(int numCourses) {
		this.numCourses = numCourses;
	}
	private String[] getCourses() {
		return courses;
	}
	private void setCourses(String[] courses) {
		this.courses = courses;
	}
	private int[] getGrades() {
		return grades;
	}
	private void setGrades(int[] grades) {
		this.grades = grades;
	}
	public Student(String name, String address)
	{
		this.name=name;
		this.address=address;
	}
	public Student() {
	
	}
	public String toString()
	{
		return name +" "+ address;
		
	}
	public void addCourseGrade()
	{
		for(int i=0; i<courses.length;i++)
		{
			System.out.println("course:" + courses[i] +"grade:"+ grades[i]);
		}
	}
	public void printGrades()
	{  
		this.grades=grades;
		this.courses=courses;
		for(int i=0;i<grades.length;i++)
			System.out.println("name:" +name +"course:" + courses[i] +"grade:"+ grades[i]);
	}
	public void getAverageGrade()
	{
		int avgg=0;
	for(int i=0;i<grades.length;i++)
	{
		avgg=avgg+grades[i];
		
	}
	System.out.println(avgg/3);
	}
	public static void main(String args[])
	{
		Student s = new Student();
		s.toString();
		s.addCourseGrade();
		s.printGrades();
		s.getAverageGrade();
		
		
	}
}

