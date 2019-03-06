package com.Employee.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.Employee.service.Emp;

public class EmployeeMapper implements RowMapper<Emp> {
	
	@Override
    public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
        Emp employee = new Emp();
        employee.setEmpNo(rs.getInt("empnum"));
        employee.seteName(rs.getString("ename"));
        employee.setJob(rs.getString("job"));
        employee.setMgr(rs.getString("mgr"));
      //employee.setHiredate(rs.getDate("hiredate"));
        employee.setSal(rs.getInt("sal"));
     employee.setComm(rs.getInt("comm"));
      employee.setDeptNo(rs.getInt("deptno"));
        return employee;
    }

}
