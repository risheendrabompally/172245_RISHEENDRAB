package com.Employee.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpVal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c=new ClassPathXmlApplicationContext("employee.xml");
		Emp e=new Emp();
        e.setEmpNo(1113);
//        e.seteName("Raja");
//        e.setJob("ceo");
//        e.setMgr(0);
         e.setSal(29999);
//        e.setComm(0);
//        e.setDeptNo(20);
        
       // EmployeeDaoImpl d=(EmployeeDaoImpl)c.getBean("edao");
       // d.insert(e);
       // d.delete(e);
      ServicesImpl ser=new ServicesImpl();
      ser.updateEmpSal(e);
//         List<Employee> list= ser.getEmp(e);
//        
//         for(Employee e1:list)
//         {
//        	 System.out.println(e1);
//         }
	}

}
