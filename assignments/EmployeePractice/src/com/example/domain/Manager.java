package com.example.domain;

public class Manager extends Employee{
	String deptName;

 public String getDeptName() {
		return deptName;
	}

 public Manager(int employeeId, String employeeName, String employeeSSN, double employeeSalary, String deptName) {
		super(employeeId, employeeName, employeeSSN, employeeSalary);
		this.deptName=deptName;
	}
	
	
	
}