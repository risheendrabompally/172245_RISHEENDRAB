package com.example.domain;

public class Employee {
	private int employeeId;
	private String employeeName;
	private String employeeSSN;
	private double employeeSalary;
	  
  public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeSSN() {
		return employeeSSN;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}
	void raiseSalary(double increase)
	{
		
	}
  public Employee(int employeeId, String employeeName, String employeeSSN, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSSN = employeeSSN;
		this.employeeSalary = employeeSalary;
	}
}
