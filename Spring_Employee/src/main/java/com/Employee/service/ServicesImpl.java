package com.Employee.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.Employee.DAO.EmpDao;
import com.Employee.DAO.EmpDaoImp;

public class ServicesImpl implements Services {
	ApplicationContext c=new ClassPathXmlApplicationContext("employee.xml");
	 EmpDao d=(EmpDao)c.getBean("edao");

	@Override
	public boolean addEmp(Emp e) {
		EmpDaoImp ed=new EmpDaoImp();
		ed.insert(e);
		return true;
	}

	@Override
	public List<Emp> getEmp(Emp e) {
		return d.employee(e);	
	}

	@Override
	public boolean updateEmpSal(Emp e) {
	  d.update(e);
	  System.out.println("updated");
		return true;
	}

	@Override
	public String getMaxSal() {
		List<Emp> l=d.getAll();
		Double maxSal=l.stream().map(e->e.getSal()).max((x,y)->x.compareTo(y)).get();
		System.out.println(maxSal);
		return null;
	}

	@Override
	public boolean deleteEmp(Emp e) {
		d.delete(e);
		return true;
	}

	@Override
	public boolean getWithoutComm() {
		List<Emp> l=d.getAll();
		 List<String> result = l.stream() .filter(line ->line.getComm()==0).map(e->e.geteName()).collect(Collectors.toList());
		 result.forEach(emp -> System.out.println(emp));	                         
		return true;
	}
	
}
