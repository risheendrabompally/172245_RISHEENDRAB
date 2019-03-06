package com.Employee.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.Employee.service.Emp;

public class EmpDaoImp implements EmpDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Emp> getAll() {
		String sql="select * from emp";
		return jdbcTemplate.query( sql, new EmployeeMapper());
	}
		

	@Override
	public boolean insert(Emp e) {
		String query="insert into emp values(?,?,?,?,?,?,?)";  
		return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
		    @Override  
		    public Boolean doInPreparedStatement(PreparedStatement ps)  
		            throws SQLException, DataAccessException {  
		            
		        ps.setInt(1,e.getEmpNo());  
		        ps.setString(2,e.geteName());  
		        ps.setString(3,e.getJob());  
		        ps.setInt(4, e.getMgr());
		        ps.setDouble(5,e.getSal());
		        ps.setDouble(6,e.getComm());
		        ps.setInt(7, e.getDeptNo());
		        System.out.println("values inserted"); 
		        return ps.execute();  
		    }          
		    });
	}

	@Override
	public boolean delete(Emp e) {
		String SQL = "delete from emp where empno = "+e.getEmpNo();
	      this.jdbcTemplate.update(SQL);
	      System.out.println("Deleted Record with ID = " + e.getEmpNo());
		return true;
	}

	@Override
	public boolean update(Emp e) {
		String updateQuery = "update emp set sal = ? where empno = ?";
		this.jdbcTemplate.update(updateQuery, e.getSal(), e.getEmpNo());
	return true;
	}
	
	@Override
	public List<Emp> employee(Emp e) {
		String sql="select * from emp where empno="+e.getEmpNo();
		return this.jdbcTemplate.query( sql, new EmployeeMapper());
		
	}

	@Override
	public List<Emp> OrderBy(Emp e) {
		String sql="select * from emp ORDER BY empno";
		return this.jdbcTemplate.query( sql, new EmployeeMapper());
	}

	@Override
	public List<Emp> GroupBy(Emp e) {
		
		String sql="select * from emp GROUP BY empno";
		return this.jdbcTemplate.query( sql, new EmployeeMapper());
	}
	
	
}
	
	