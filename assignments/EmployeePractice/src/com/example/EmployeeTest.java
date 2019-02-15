package com.example;

import com.example.domain.Admin;
import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Engineer;
import com.example.domain.Manager;

public class EmployeeTest {
	EmployeeTest et= new EmployeeTest();
	
	public void printEmployee(Engineer e)
	{
		System.out.println(e.getEmployeeId());
		
	}
	
	public static void main(String[] args) {
     	Engineer eg=new Engineer(101,"Jane Smith","012-34-5678",120_345.27);
     	Manager m=new Manager(207,"Barbara Johnson","054-12-2367",109_501.36,"US Marketing");
        Admin a=new Admin(304,"Bill Monroe","108-23-6509",75_002.34);
        Director d = new Director(12,"Susan Wheeler","099-45-2340",120-567.36,"Global Marketing",1_000_000.00); 
        Employee e = new Employee(101,"Jane Smith","012-34-5678",120345.27);
	}
}
