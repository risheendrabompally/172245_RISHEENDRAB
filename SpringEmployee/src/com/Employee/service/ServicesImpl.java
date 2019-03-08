package com.Employee.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Employee.DAO.EmpDaoImp;

public class ServicesImpl implements Services {
	//ApplicationContext c=new ClassPathXmlApplicationContext("employee.xml");
	 //EmpDaoImp d=(EmpDaoImp)c.getBean("edao");
	EmpDaoImp ed=new EmpDaoImp();
	@Override
	public boolean addEmp(Emp e) throws Exception {
		
		ed.insert(e);
		System.out.println("in service");
		throw new Exception("employee not addedd successfully");
		
	}

	@Override
	public List<Emp> getEmp(Emp e) {
		return ed.employee(e);
		
	}

	@Override
	public boolean updateEmpSal(Emp e) {
	  ed.update(e);
		return true;
	}

	@Override
	public String getMaxSal() {
		List<Emp> l=ed.getAll();
		Double maxSal=l.stream().map(e->e.getSal()).max((x,y)->x.compareTo(y)).get();
		System.out.println(maxSal);
		return null;
	}

	@Override
	public boolean deleteEmp(Emp e) {
		ed.delete(e);
		return true;
	}

	@Override
	public boolean getWithoutComm() {
		List<Emp> l=ed.getAll();
		 List<String> result = l.stream() .filter(line ->line.getComm()==0).map(e->e.geteName()).collect(Collectors.toList());
		 result.forEach(emp -> System.out.println(emp));	                         
		return true;
	}
	
}
