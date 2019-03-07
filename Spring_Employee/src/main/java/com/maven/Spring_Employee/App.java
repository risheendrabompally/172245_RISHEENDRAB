package com.maven.Spring_Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Employee.DAO.EmpDao;
import com.Employee.DAO.EmpDaoImp;
import com.Employee.service.Emp;
import com.Employee.service.Services;
import com.Employee.service.ServicesImpl;

public class App 
{
	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("employee.xml");
		//EmpDao d=(EmpDao)c.getBean("edao");
		
		Emp e=new Emp();
        e.setEmpNo(1545);
        e.seteName("dxsfg");
        e.setJob("analst");
        e.setMgr(1254);
        e.setSal(68000.00);
        e.setComm(0.00);
        e.setDeptNo(52);
       // d.insert(e);
       // d.delete(e);
       // System.out.println("orderby" + d.OrderBy(e));
       // System.out.println("groupby" + d.GroupBy(e));
        
        Services ser=(Services)c.getBean("edao"); 
        
       //ser.updateEmpSal(e);
        
       ser.getMaxSal();
        
        //ser.getWithoutComm();
         
//        List<Emp> list= ser.getEmp(e);
//     
//       for(Emp e1:list)
//         {
//       	 System.out.println(e1.geteName());
//         }      
	}

}
