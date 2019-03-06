package com.Employee.service;

import java.util.List;

public interface Services {
	
	public boolean addEmp(Emp e);
	public List<Emp> getEmp(Emp e);
	public boolean updateEmpSal(Emp e);
}
