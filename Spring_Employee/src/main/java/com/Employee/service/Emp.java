package com.Employee.service;

public class Emp {
	
	private int empNo;
	private String eName;
	private String job;
	private int mgr;
	private double sal;
	private double comm;
	private int deptNo;
	
	public Emp() {
		super();
	}

	public Emp(int empNo, String eName, String job, int mgr, double sal, double comm, int deptNo) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		this.job = job;
		this.mgr = mgr;
		this.sal = sal;
		this.comm = comm;
		this.deptNo = deptNo;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	
}
