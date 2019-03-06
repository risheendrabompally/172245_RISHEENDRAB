package com.Employee.service;

import java.util.List;

import com.Employee.DAO.EmpDaoImp;

public class ServicesImpl implements Services {

	@Override
	public boolean addEmp(Emp e) {
		EmpDaoImp ed=new EmpDaoImp();
		ed.insert(e);
		return true;
	}

	@Override
	public List<Emp> getEmp(Emp e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateEmpSal(Emp e) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
