package student.java;
import java.lang.NullPointerException;
public class Student2 {

	public static void main(String[] args) {
	Student1 s1=new Student1("mounika","Andhra pradesh");
	
	
    s1.addcoursegrade("java", 60);
	s1.addcoursegrade("c", 70);
	s1.addcoursegrade("oracle",75);
	s1.printGrades();
	System.out.println("the average grade is "+s1.getAveragegrades());
	System.out.println(s1.toString());
	
	

	}

}
