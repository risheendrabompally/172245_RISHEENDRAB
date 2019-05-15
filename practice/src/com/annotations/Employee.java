package com.annotations;

public class Employee {

	private String ename;
	public String id;
	private int sal;
	public Employee(String ename, String id, int sal) {
		super();
		this.ename = ename;
		this.id = id;
		this.sal = sal;
	}
	public Employee() {
		
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", id=" + id + ", sal=" + sal + "]";
	}

}
