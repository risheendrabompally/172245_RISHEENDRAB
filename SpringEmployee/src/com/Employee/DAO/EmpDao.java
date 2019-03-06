package com.Employee.DAO;

import java.util.List;

import com.Employee.service.Emp;

public interface EmpDao {
	
	public List<Emp> getAll();
	public boolean insert(Emp e);
	public boolean delete(Emp e);
	public boolean update(Emp e);

}
