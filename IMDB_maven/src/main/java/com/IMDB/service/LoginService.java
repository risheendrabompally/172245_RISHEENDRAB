package com.IMDB.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.IMDB.model.Loginuser;

public class LoginService 
{
	 @Autowired
	  JdbcTemplate jdbcTemplate;

	
	public boolean check(Loginuser user)
	{
		
		String sql = "select * from users where username='" + user.getUsername()+ "' and password='" + user.getPassword()
	    + "'";
		
		
		
		   
		return false;
		
	}

}
