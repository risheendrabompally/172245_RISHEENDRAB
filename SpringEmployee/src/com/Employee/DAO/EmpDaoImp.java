package com.Employee.DAO;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmpDaoImp implements EmpDao {

	private JdbcTemplate jdbcTemplate;
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public void getAll() {
		
		
	}

	@Override
	public void insert() {
		
		
	}

	@Override
	public void delete() {
		
		
	}

	@Override
	public void orderBy() {
	
		
	}

	@Override
	public void groupBy() {
		
		
	}

	@Override
	public void update() {
		
		
	}
	
}
