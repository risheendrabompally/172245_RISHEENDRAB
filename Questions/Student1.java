package student.java;

public class Student1 {
	private String name;
	private String address;
	private int numCourses=0;
	private String courses[]={};
	private int grades[]= {};
	private static final int MAX_COURSES=30;
	
	public Student1(String name,String address) {
		this.name=name;
		this.address=address;
		this.courses=new String[30];
		this.grades=new int[30];
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public String  setAddress(String address)
	{
		this.address=address;
		return address;
	}
	public String toString()
	{
		return "Student1[name="+name+" address="+address+"]";
	}
	public  void  addcoursegrade(String course,int grade) {
		this.courses[numCourses]=course;
		this.grades[numCourses]=grade;
		numCourses++;
		
	}
	public void  printGrades()
	{
		System.out.println(name);
		for(int i=0;i<numCourses;i++) {
			System.out.println(courses[i]+":"+grades[i]);
			
			}
	}
		public double getAveragegrades()
		{
		int sum=0;
		for(int i=0;i<numCourses;++i) {
			sum=sum+grades[i];
			
		}
		return sum/numCourses;
		
		}
	}
	