package com.Employee.service;

import java.util.List;

public interface Services {
	
	public boolean addEmp(Emp e) throws Exception;
	public List<Emp> getEmp(Emp e);
	public boolean updateEmpSal(Emp e);
	boolean getWithoutComm();
	boolean deleteEmp(Emp e);
	String getMaxSal();
	
}
