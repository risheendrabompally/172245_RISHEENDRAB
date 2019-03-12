package com.IMDB.DAO;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.IMDB.model.Loginuser;


public class LoginDAOimpl implements LoginDAO {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
		
	public void setDataSource(DataSource dataSource) {
			this.dataSource = dataSource;
	}

	public Loginuser check(Loginuser user)
	{

		String sql = "select * from users where username='" + user.getUsername() + "' and password='" + user.getPassword()+ "'";
		 List<Loginuser> users = jdbcTemplate.query(sql, new UserMapper());
		return users.size() > 0 ? users.get(0) : null;		
		
		/*
		 * Connection con; PreparedStatement ps; ResultSet rs; try { con =
		 * dataSource.getConnection(); ps = con.prepareStatement(sql); rs =
		 * ps.executeQuery(sql); String dname=user.getUsername(); String
		 * dpwd=user.getPassword(); while(rs.next()) {
		 * if(user.getUsername().equals(name) && user.getPassword().equals(dpwd)) {
		 * return true; } } } catch (SQLException e) { e.printStackTrace(); } return
		 * false;
		 */	
	}

}
