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
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Emp> getAll() {
		String sql="select * from emp";
		return this.jdbcTemplate.query( sql, new EmployeeMapper());
	}
		

	@Override
	public boolean insert(Emp e) {
		String query="insert into emp values(?,?,?,?,?,?,?)";
		  System.out.println("in insert1");  
		return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
		    @Override  
		    public Boolean doInPreparedStatement(PreparedStatement ps)  
		            throws SQLException, DataAccessException {  
		            System.out.println("in insert");  
		        ps.setInt(1,e.getEmpNo());  
		        ps.setString(2,e.geteName());  
		        ps.setString(3,e.getJob());  
		        ps.setString(4, e.getMgr());
		        ps.setDouble(5,e.getSal());
		        ps.setDouble(6,e.getComm());
		        ps.setInt(7, e.getDeptNo());
		        return ps.execute();  
		    }          
		    });
	}

	@Override
	public boolean delete(Emp e) {
		String SQL = "delete from emp where empnum = "+e.getEmpNo();
	      this.jdbcTemplate.update(SQL);
	      System.out.println("Deleted Record with ID = " + e.getEmpNo());
		return true;
	}

	@Override
	public boolean update(Emp e) {
		String updateQuery = "update emp set sal = ? where empnum = ?";
		this.jdbcTemplate.update(updateQuery, e.getSal(), e.getEmpNo());
	return true;
	}
	
	@Override
	public List<Emp> employee(Emp e) {
		String sql="select * from emp where empnum="+e.getEmpid();
		return this.jdbcTemplate.query( sql, new EmployeeMapper());
		
	}
}
	
	